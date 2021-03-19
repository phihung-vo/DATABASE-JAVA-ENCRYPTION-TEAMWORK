package atweb_csdl;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Home extends javax.swing.JFrame {
    
    
    private final Connection cn = ConnectDB.SQLConnect();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private int state_add_sv = -1, state_edit_sv = -1, state_add_diem = -1, state_edit_diem = -1;
    private static String tenNV;
    private static String matKhauNV;
    private boolean trueNV_Lop = true;
    private String maSVHienTai;
    private boolean addSv = false, editSv = false, addDiem = false, editDiem = false;
    private String maLopTmp;
    Vector<NhanVien> nv = new Vector<>();
    public static String getTenNV() {
        return tenNV;
    }
    public static String getMatKhauNV() {
        return matKhauNV;
    }
    
    private void initTextFieldSV (){
        txtNewMasv.setText(null);
        txtNewName.setText(null);
        txtNewAddress.setText(null);
        jdcNewBirth.setDateFormatString(null);
        txtNewMalopSv.setText(null);
        txtNewUsn.setText(null);
        txtNewPass.setText(null);       
    }
    
    public Home(){}
    public Home(String tenNV,String matKhau) {
        initComponents();
        Home.tenNV = tenNV;
        Home.matKhauNV = matKhau;       
        txtTenDn.setText(tenNV);
        initTables();
        showLopList();
    }
    
    private void initTables(){                               
        jpnQllop.setVisible(true);
        jpnQlsv.setVisible(false);
        jpnQldiem.setVisible(false);
        jTableLop.setRowHeight(25);
        jTableSv.setRowHeight(25);
        jTableDiem.setRowHeight(25);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnMenu = new javax.swing.JPanel();
        jpn1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jpn2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpn3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jpn4 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jpn5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtTenDn = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jpnCenter = new javax.swing.JPanel();
        jpnQllop = new javax.swing.JPanel();
        jpnSearchLop = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSearchLop = new javax.swing.JTextField();
        jtbSearchLop = new javax.swing.JToggleButton();
        jpnTableLop = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLop = new javax.swing.JTable();
        jpnUser = new javax.swing.JPanel();
        jpnQlsv = new javax.swing.JPanel();
        jpnUpdateSv = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNewMasv = new javax.swing.JTextField();
        txtNewName = new javax.swing.JTextField();
        txtNewAddress = new javax.swing.JTextField();
        txtNewMalopSv = new javax.swing.JTextField();
        txtNewUsn = new javax.swing.JTextField();
        txtNewPass = new javax.swing.JTextField();
        jtbSaveSv = new javax.swing.JToggleButton();
        jtbStopUpdatingSv = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jdcNewBirth = new com.toedter.calendar.JDateChooser();
        jpnTableSv = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSv = new javax.swing.JTable();
        jpnSearchSv = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtSearchSv = new javax.swing.JTextField();
        jtbAddSv = new javax.swing.JToggleButton();
        jtbDelSv = new javax.swing.JToggleButton();
        jtbEditSv = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jtbSearchSv = new javax.swing.JToggleButton();
        jButton_xemDiem = new javax.swing.JButton();
        jpnUser1 = new javax.swing.JPanel();
        jpnQldiem = new javax.swing.JPanel();
        jpnSearchDiem = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtSearchHp = new javax.swing.JTextField();
        jtbSearchHp = new javax.swing.JToggleButton();
        jtbAddDiem = new javax.swing.JToggleButton();
        jtbEditDiem = new javax.swing.JToggleButton();
        jtbDelDiem = new javax.swing.JToggleButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jpnTableDiem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableDiem = new javax.swing.JTable();
        jpnUpdateDiem = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        cbxDsHocphan = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtDiemHocPhan = new javax.swing.JTextField();
        jtbSaveDiem = new javax.swing.JToggleButton();
        jtbStopSavingDiem = new javax.swing.JToggleButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jpnUser2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quan Ly Sinh Vien");

        jpnHeader.setBackground(new java.awt.Color(0, 0, 255));
        jpnHeader.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jpnHeaderLayout = new javax.swing.GroupLayout(jpnHeader);
        jpnHeader.setLayout(jpnHeaderLayout);
        jpnHeaderLayout.setHorizontalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderLayout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel1)
                .addContainerGap(512, Short.MAX_VALUE))
        );
        jpnHeaderLayout.setVerticalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHeaderLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));

        jpn1.setBackground(new java.awt.Color(255, 255, 255));
        jpn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExit(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("DANH SÁCH  LỚP HỌC");

        javax.swing.GroupLayout jpn1Layout = new javax.swing.GroupLayout(jpn1);
        jpn1.setLayout(jpn1Layout);
        jpn1Layout.setHorizontalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn1Layout.setVerticalGroup(
            jpn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jpn2.setBackground(new java.awt.Color(255, 255, 255));
        jpn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExit(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("QUẢN LÝ SINH VIÊN");

        javax.swing.GroupLayout jpn2Layout = new javax.swing.GroupLayout(jpn2);
        jpn2.setLayout(jpn2Layout);
        jpn2Layout.setHorizontalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
        );
        jpn2Layout.setVerticalGroup(
            jpn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jpn3.setBackground(new java.awt.Color(255, 255, 255));
        jpn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExit(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("QUẢN LÝ ĐIỂM");

        javax.swing.GroupLayout jpn3Layout = new javax.swing.GroupLayout(jpn3);
        jpn3.setLayout(jpn3Layout);
        jpn3Layout.setHorizontalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn3Layout.setVerticalGroup(
            jpn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        jpn4.setBackground(new java.awt.Color(255, 255, 255));
        jpn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExit(evt);
            }
        });

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setText("QUẢN LÝ LỚP HỌC");

        javax.swing.GroupLayout jpn4Layout = new javax.swing.GroupLayout(jpn4);
        jpn4.setLayout(jpn4Layout);
        jpn4Layout.setHorizontalGroup(
            jpn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn4Layout.setVerticalGroup(
            jpn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        jpn5.setBackground(new java.awt.Color(255, 255, 255));
        jpn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMouseClick(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MenuMouseEnter(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MenuMouseExit(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 153, 255));
        jLabel28.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jpn5Layout = new javax.swing.GroupLayout(jpn5);
        jpn5.setLayout(jpn5Layout);
        jpn5Layout.setHorizontalGroup(
            jpn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpn5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpn5Layout.setVerticalGroup(
            jpn5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Tài khoản:");

        txtTenDn.setForeground(new java.awt.Color(255, 153, 51));
        txtTenDn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(txtTenDn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenDn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpn5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jpn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jpn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jpn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jpn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jpnSearchLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelLopMouseClick(evt);
            }
        });

        jLabel13.setText("Tìm Lớp NHANH theo Mã Lớp hoặc Tên Lớp");

        jtbSearchLop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jtbSearchLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchLopMouseClick(evt);
            }
        });

        javax.swing.GroupLayout jpnSearchLopLayout = new javax.swing.GroupLayout(jpnSearchLop);
        jpnSearchLop.setLayout(jpnSearchLopLayout);
        jpnSearchLopLayout.setHorizontalGroup(
            jpnSearchLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSearchLopLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchLop, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtbSearchLop, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(498, Short.MAX_VALUE))
        );
        jpnSearchLopLayout.setVerticalGroup(
            jpnSearchLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSearchLopLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(jpnSearchLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbSearchLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearchLop)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jTableLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ LỚP", "TÊN LỚP", "TÊN NHÂN VIÊN", "SỈ SỐ"
            }
        ));
        jTableLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRowTableLop(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLop);

        javax.swing.GroupLayout jpnTableLopLayout = new javax.swing.GroupLayout(jpnTableLop);
        jpnTableLop.setLayout(jpnTableLopLayout);
        jpnTableLopLayout.setHorizontalGroup(
            jpnTableLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jpnTableLopLayout.setVerticalGroup(
            jpnTableLopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jpnUserLayout = new javax.swing.GroupLayout(jpnUser);
        jpnUser.setLayout(jpnUserLayout);
        jpnUserLayout.setHorizontalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnUserLayout.setVerticalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnQllopLayout = new javax.swing.GroupLayout(jpnQllop);
        jpnQllop.setLayout(jpnQllopLayout);
        jpnQllopLayout.setHorizontalGroup(
            jpnQllopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQllopLayout.createSequentialGroup()
                .addGroup(jpnQllopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnSearchLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTableLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jpnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQllopLayout.setVerticalGroup(
            jpnQllopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQllopLayout.createSequentialGroup()
                .addGroup(jpnQllopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnSearchLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jpnTableLop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("MASV");

        jLabel6.setText("HỌ TÊN");

        jLabel7.setText("NGÀY SINH");

        jLabel8.setText("ĐỊA CHỈ");

        jLabel9.setText("MÃ LỚP");

        jLabel10.setText("TÊN ĐĂNG NHẬP");

        jLabel11.setText("MẬT KHẨU");

        jtbSaveSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jtbSaveSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveNewSvMouseClick(evt);
            }
        });

        jtbStopUpdatingSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        jtbStopUpdatingSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopSavingSv(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Lưu");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Hủy");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpnUpdateSvLayout = new javax.swing.GroupLayout(jpnUpdateSv);
        jpnUpdateSv.setLayout(jpnUpdateSvLayout);
        jpnUpdateSvLayout.setHorizontalGroup(
            jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUpdateSvLayout.createSequentialGroup()
                .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnUpdateSvLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(txtNewMasv)
                            .addComponent(txtNewName)
                            .addComponent(jLabel7)
                            .addComponent(txtNewAddress)
                            .addComponent(txtNewMalopSv)
                            .addComponent(txtNewUsn)
                            .addComponent(txtNewPass)
                            .addComponent(jdcNewBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                    .addGroup(jpnUpdateSvLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtbSaveSv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtbStopUpdatingSv, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnUpdateSvLayout.setVerticalGroup(
            jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUpdateSvLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewMasv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdcNewBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewMalopSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewUsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNewPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbSaveSv)
                    .addComponent(jtbStopUpdatingSv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnUpdateSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(11, 11, 11))
        );

        jTableSv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MASV", "HỌ TÊN", "NGÀY SINH", "ĐỊA CHỈ", "TÊN LOGIN", "MẬT KHẨU"
            }
        ));
        jTableSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clickRowTableSv(evt);
            }
        });
        jScrollPane2.setViewportView(jTableSv);

        javax.swing.GroupLayout jpnTableSvLayout = new javax.swing.GroupLayout(jpnTableSv);
        jpnTableSv.setLayout(jpnTableSvLayout);
        jpnTableSvLayout.setHorizontalGroup(
            jpnTableSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 783, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jpnTableSvLayout.setVerticalGroup(
            jpnTableSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        jLabel12.setText("Nhập Mã lớp hoặc Tên lớp");

        jtbAddSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jtbAddSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddSvMouseClick(evt);
            }
        });

        jtbDelSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        jtbDelSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelSvMouseClick(evt);
            }
        });

        jtbEditSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jtbEditSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditSvMouseClick(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Thêm");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Xóa");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Sửa");

        jtbSearchSv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        jtbSearchSv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchSinhVienMuoseClick(evt);
            }
        });

        jButton_xemDiem.setText("Xem Điểm");
        jButton_xemDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_xemDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnSearchSvLayout = new javax.swing.GroupLayout(jpnSearchSv);
        jpnSearchSv.setLayout(jpnSearchSvLayout);
        jpnSearchSvLayout.setHorizontalGroup(
            jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSearchSvLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchSv, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtbSearchSv, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton_xemDiem)
                .addGap(28, 28, 28)
                .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbAddSv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbDelSv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbEditSv, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jpnSearchSvLayout.setVerticalGroup(
            jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSearchSvLayout.createSequentialGroup()
                .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnSearchSvLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtbDelSv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtbEditSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtbAddSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)))
                    .addGroup(jpnSearchSvLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jpnSearchSvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtbSearchSv, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchSv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_xemDiem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnUser1Layout = new javax.swing.GroupLayout(jpnUser1);
        jpnUser1.setLayout(jpnUser1Layout);
        jpnUser1Layout.setHorizontalGroup(
            jpnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );
        jpnUser1Layout.setVerticalGroup(
            jpnUser1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnQlsvLayout = new javax.swing.GroupLayout(jpnQlsv);
        jpnQlsv.setLayout(jpnQlsvLayout);
        jpnQlsvLayout.setHorizontalGroup(
            jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQlsvLayout.createSequentialGroup()
                .addGroup(jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnTableSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnSearchSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnUser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnUpdateSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jpnQlsvLayout.setVerticalGroup(
            jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQlsvLayout.createSequentialGroup()
                .addGroup(jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnSearchSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnUser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jpnQlsvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnTableSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnUpdateSv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jpnSearchDiem.setPreferredSize(new java.awt.Dimension(737, 103));

        jLabel14.setText("Nhập Mã sinh viên");

        jtbSearchHp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        jtbAddDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        jtbAddDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDiemMouseClick(evt);
            }
        });

        jtbEditDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/del.png"))); // NOI18N
        jtbEditDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditDiemMouseClick(evt);
            }
        });

        jtbDelDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        jtbDelDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDelDiemMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Thêm");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Sửa");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Xóa");

        javax.swing.GroupLayout jpnSearchDiemLayout = new javax.swing.GroupLayout(jpnSearchDiem);
        jpnSearchDiem.setLayout(jpnSearchDiemLayout);
        jpnSearchDiemLayout.setHorizontalGroup(
            jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSearchDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearchHp, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtbSearchHp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbAddDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbEditDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbDelDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnSearchDiemLayout.setVerticalGroup(
            jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSearchDiemLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbSearchHp)
                    .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchHp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSearchDiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbEditDiem)
                    .addComponent(jtbDelDiem)
                    .addComponent(jtbAddDiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnSearchDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22))
                .addGap(19, 19, 19))
        );

        jTableDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ HỌC PHẦN", "TÊN HỌC PHẦN", "ĐIỂM"
            }
        ));
        jScrollPane3.setViewportView(jTableDiem);

        javax.swing.GroupLayout jpnTableDiemLayout = new javax.swing.GroupLayout(jpnTableDiem);
        jpnTableDiem.setLayout(jpnTableDiemLayout);
        jpnTableDiemLayout.setHorizontalGroup(
            jpnTableDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        jpnTableDiemLayout.setVerticalGroup(
            jpnTableDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel23.setText("Chọn học phần cần nhập điểm");

        cbxDsHocphan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cbxDsHocphan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel24.setText("Nhập điểm");

        txtDiemHocPhan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jtbSaveDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        jtbSaveDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveNewDiemMouseClick(evt);
            }
        });

        jtbStopSavingDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stop.png"))); // NOI18N
        jtbStopSavingDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopSavingDiem(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Lưu");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Hủy");

        javax.swing.GroupLayout jpnUpdateDiemLayout = new javax.swing.GroupLayout(jpnUpdateDiem);
        jpnUpdateDiem.setLayout(jpnUpdateDiemLayout);
        jpnUpdateDiemLayout.setHorizontalGroup(
            jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUpdateDiemLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtDiemHocPhan, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cbxDsHocphan, javax.swing.GroupLayout.Alignment.LEADING, 0, 232, Short.MAX_VALUE))
                    .addGroup(jpnUpdateDiemLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtbSaveDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtbStopSavingDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jpnUpdateDiemLayout.setVerticalGroup(
            jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUpdateDiemLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxDsHocphan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDiemHocPhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbSaveDiem)
                    .addComponent(jtbStopSavingDiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnUpdateDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnUser2Layout = new javax.swing.GroupLayout(jpnUser2);
        jpnUser2.setLayout(jpnUser2Layout);
        jpnUser2Layout.setHorizontalGroup(
            jpnUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        jpnUser2Layout.setVerticalGroup(
            jpnUser2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnQldiemLayout = new javax.swing.GroupLayout(jpnQldiem);
        jpnQldiem.setLayout(jpnQldiemLayout);
        jpnQldiemLayout.setHorizontalGroup(
            jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQldiemLayout.createSequentialGroup()
                .addGroup(jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnSearchDiem, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                    .addComponent(jpnTableDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jpnUpdateDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jpnQldiemLayout.setVerticalGroup(
            jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQldiemLayout.createSequentialGroup()
                .addGroup(jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnSearchDiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jpnQldiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnUpdateDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnTableDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jpnCenterLayout = new javax.swing.GroupLayout(jpnCenter);
        jpnCenter.setLayout(jpnCenterLayout);
        jpnCenterLayout.setHorizontalGroup(
            jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1082, Short.MAX_VALUE)
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQllop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQlsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQldiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnCenterLayout.setVerticalGroup(
            jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQllop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQlsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpnQldiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddSvMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddSvMouseClick
        if(this.trueNV_Lop){
            initTextFieldSV();
            addSv = true;
            editSv = false;
            state_add_sv++;
            if(state_add_sv%2==0){
                jpnUpdateSv.setVisible(true);
            }else{
                jpnUpdateSv.setVisible(false);
            }                         
            txtNewMasv.setText(getMasvNext());
            txtNewMasv.setEnabled(false);
        }           
    }//GEN-LAST:event_AddSvMouseClick

    private void AddDiemMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDiemMouseClick
        if(this.trueNV_Lop){
            state_edit_diem = -1;
            state_add_diem++;
            addDiem = true;
            editDiem = false;
            if(state_add_diem%2==0){
                jpnUpdateDiem.setVisible(true);
                loadHocPhan();
            }else{
                jpnUpdateDiem.setVisible(false);
            }
        }                               
    }//GEN-LAST:event_AddDiemMouseClick

    private void StopSavingSv(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopSavingSv
        state_add_sv = -1;
        jpnUpdateSv.setVisible(false);        
    }//GEN-LAST:event_StopSavingSv

    private void StopSavingDiem(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopSavingDiem
        state_add_diem = -1;
        jpnUpdateDiem.setVisible(false);        
    }//GEN-LAST:event_StopSavingDiem

    private void SaveNewSvMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveNewSvMouseClick
        String maLop = txtNewMalopSv.getText().trim().toUpperCase();
        String masv = txtNewMasv.getText().trim().toUpperCase();
        String hoTen = txtNewName.getText().trim().toUpperCase();
        String diaChi = txtNewAddress.getText().trim().toUpperCase();
        Date  ngaySinh = jdcNewBirth.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String ngaySinhStr = dateFormat.format(ngaySinh);
        String tenDN = txtNewUsn.getText();
        String matKhau = txtNewPass.getText();
        
        String sql = null;
        if(addSv==true){
            //Them moi sinh vien
            initTextFieldSV();
            sql  = "EXEC SP_INS_PUBLIC_ENCRYPT_SINHVIEN "
                + "'"+maLop+"','"+masv+"','"+hoTen+"',"
                       +"'"+ngaySinhStr+"','"+diaChi+"','"+tenDN+"',"
                       +"'"+new Services().getSHAHash(matKhau, "MD5") +"'"; 
            
            if(checkMalopTonTai(maLop) == true){
                if(ktDungNV_Lop(Home.tenNV, maLop) == true){
                    if(checkTonTaiMasv(masv, false) == true){
                        //masv trung
                        JOptionPane.showMessageDialog(rootPane, "Mã sinh viên " + masv + " đã tồn tại!");
                    }else{
                        if(checkTonTaiTendnSV(tenDN, false) == true){
                            //tendn trung
                            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập " + tenDN + " đã tồn tại!");
                        }else{                
                            try{ 
                                ps = cn.prepareStatement(sql);
                                rs = ps.executeQuery();
                            }catch(SQLException e){
                                System.out.println("Error 'SaveNewSvMouseClick' func on Home");
                                System.out.println(e.getMessage());
                            }
                            showSvList(maLopTmp);
                        }
                    }
                }else{
                    //NV k ddc them sv lop nay
                    JOptionPane.showMessageDialog(rootPane, "Nhân viên " + Home.tenNV + " không được thêm sinh viên vào lớp này!");
                }
            }else{
                //malop k ton tai
                JOptionPane.showMessageDialog(rootPane, "Mã lớp không tồn tại!");
            }
            txtNewMasv.setText(getMasvNext());
            txtNewMasv.setEnabled(false);
        }
        
        if(editSv==true){
            if(matKhau.equals("")){
                sql = "EXEC SP_UPDATE_PUBLIC_ENCRYPT_SINHVIEN_NONEPASS"
                + "'"+maLop+"','"+masv+"','"+hoTen+"',"
                    +"'"+ngaySinhStr+"','"+diaChi+"','"+tenDN+"'";
            }
            else {
                sql = "EXEC SP_UPDATE_PUBLIC_ENCRYPT_SINHVIEN "
                + "'"+maLop+"','"+masv+"','"+hoTen+"',"
                    +"'"+ngaySinhStr+"','"+diaChi+"','"+tenDN+"',"
                    +"'"+new Services().getSHAHash(matKhau, "MD5") +"'"; 
            }
            
            if(checkMalopTonTai(maLop) == true){
                if(ktDungNV_Lop(Home.tenNV, maLop) == true){
                    if(checkTonTaiMasv(masv, true) == false){
                        //masv trung
                        JOptionPane.showMessageDialog(rootPane, "Sinh viên khác đã có Mã sinh viên " + masv + "!");
                    }else{
                        if(checkTonTaiTendnSV(tenDN, true) == false){
                            //tendn trung
                            JOptionPane.showMessageDialog(rootPane, "Sinh viên khác đã có Tên đăng nhập " + tenDN + "!");
                        }else{                        
                            try{ 
                                ps = cn.prepareStatement(sql);
                                rs = ps.executeQuery();
                            }catch(SQLException e){
                                System.out.println("Error 'SaveNewSvMouseClick' func on Home");
                                System.out.println(e.getMessage());
                            }
                            showSvList(maLopTmp);
                        }
                    }
                }else{
                    //NV k ddc them sv lop nay
                    JOptionPane.showMessageDialog(rootPane, "Nhân viên " + Home.tenNV + " không được thêm sinh viên vào lớp này!");
                }
            }else{
                //malop k ton tai
                JOptionPane.showMessageDialog(rootPane, "Mã lớp không tồn tại!");
            }
        }                               
    }//GEN-LAST:event_SaveNewSvMouseClick

    private void SaveNewDiemMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveNewDiemMouseClick
        if(addDiem == true){
            String maHp = getMaMHP(cbxDsHocphan.getSelectedItem().toString());      
            String sql = " SP_INS_PUBLIC_BANGDIEM '" + maHp + "','" + 
                    this.maSVHienTai + "','" 
                    + new RSAGenerator(this.tenNV, this.matKhauNV).encrypt(txtDiemHocPhan.getText()) + "' ";
            System.out.println(sql);
            try{
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
        if(editDiem == true){
            DefaultTableModel model = (DefaultTableModel)jTableDiem.getModel();
            String s = (String) model.getValueAt(jTableDiem.getSelectedRow(), 0);
            String diem = (String) model.getValueAt(jTableDiem.getSelectedRow(), 2);
            String sql = "EXEC SP_UPDATE_PUBLIC_ENCRYPT_BANGDIEM '"+s+"','"+this.maSVHienTai
                        +"','"+new RSAGenerator(Home.tenNV, Home.matKhauNV).encrypt(diem)+"'";
            try {
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }            
        }
        loadHocPhan();
    }//GEN-LAST:event_SaveNewDiemMouseClick

    private void clickRowTableLop(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRowTableLop
        DefaultTableModel model = (DefaultTableModel)jTableLop.getModel();
        String s = (String) model.getValueAt(jTableLop.getSelectedRow(), 0);
        maLopTmp = s;
        jpnQllop.setVisible(false);
        jpnQlsv.setVisible(true);
        state_add_sv = -1;
        jpnUpdateSv.setVisible(false);
        jpnQldiem.setVisible(false);
        ktDungNV_Lop(getMaNVFromDatabase(this.tenNV ), s);
        showSvList(s);
    }//GEN-LAST:event_clickRowTableLop

    private void clickRowTableSv(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clickRowTableSv
//        DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
//        String s = (String) model.getValueAt(jTableSv.getSelectedRow(), 0);
//        
//        jpnQllop.setVisible(false);
//        jpnQlsv.setVisible(false);
//        state_add_sv = -1;
//        jpnUpdateDiem.setVisible(false);
//        jpnQldiem.setVisible(true);
//        this.maSVHienTai = s;
//        showDiemList(s);
    }//GEN-LAST:event_clickRowTableSv

    private void jtbDelDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDelDiemMouseClicked
         //TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)jTableDiem.getModel();
        String maHP =String.valueOf((String)model.getValueAt(jTableDiem.getSelectedRow(), 0));
        String sql = "SP_DEL_PUBLIC_ENCRYPT_BANGDIEM '"+maHP + "','"+this.maSVHienTai+"'";
        System.out.println(sql); 
        try {
            this.ps = cn.prepareStatement(sql);
            this.rs = ps.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jtbDelDiemMouseClicked

    private void EditDiemMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditDiemMouseClick
        // TODO add your handling code here:
        if(this.trueNV_Lop){
            state_add_diem = -1;
            state_edit_diem++;
            addDiem = false;
            editDiem = true;
            if(state_edit_diem%2==0){                
                if(jTableDiem.getModel().getRowCount() > 0){
                    if(jTableDiem.getSelectedRow() >= 0){
                        jpnUpdateDiem.setVisible(true);
                        DefaultTableModel model = (DefaultTableModel)jTableDiem.getModel();                        
                        cbxDsHocphan.setName((String) model.getValueAt(jTableDiem.getSelectedRow(), 1));
                        txtDiemHocPhan.setText(String.valueOf(model.getValueAt(jTableDiem.getSelectedRow(), 2)));                       
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn học phần cần chỉnh sửa!");
                    }
                }                
            }else{
                jpnUpdateDiem.setVisible(false);
            }
        }        
        
    }//GEN-LAST:event_EditDiemMouseClick

     private void jtbEditSvMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
       if(this.trueNV_Lop){
               addSv = false;
               state_add_sv++;
               if(state_add_sv%2==0){
                   jpnUpdateSv.setVisible(true);
               }else{
                   jpnUpdateSv.setVisible(false);
               }
           
        DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
            String maLop = null ;
            
        String maSV = String.valueOf( model.getValueAt(jTableSv.getSelectedRow(), 0));
        String hoTen = String.valueOf( model.getValueAt(jTableSv.getSelectedRow(), 1));
        String ngaySinh = String.valueOf( model.getValueAt(jTableSv.getSelectedRow(), 2));
        String diaChi = String.valueOf( model.getValueAt(jTableSv.getSelectedRow(), 3));
        String tenLogin = String.valueOf( model.getValueAt(jTableSv.getSelectedRow(), 4));
        Date date = null;   
        try { 
                date=new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
                
           } catch (ParseException ex) {
               System.out.println(ex.getMessage());
           }
        txtNewMasv.setText(maSV);
        txtNewName.setText(hoTen);
        txtNewMalopSv.setText(getMaLopByTenNV(this.tenNV));
        txtNewAddress.setText(diaChi);
        jdcNewBirth.setDateFormatString(ngaySinh.toString());
        txtNewUsn.setText(tenLogin);
        jdcNewBirth.setDate(date);
        txtNewMalopSv.disable();
          
        
       }
        
                
        
    }           
     
    private void DelLopMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelLopMouseClick
        
    }//GEN-LAST:event_DelLopMouseClick

    private void MenuMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseClick
        if(evt.getSource() == jpn1){
            jpnQllop.setVisible(true);
            jpnQlsv.setVisible(false);
            jpnQldiem.setVisible(false);
        }
        if(evt.getSource() == jpn2){
            jpnQllop.setVisible(false);
            showSvList(getMaLopByTenNV(tenNV));
            jpnQlsv.setVisible(true);
            jpnQldiem.setVisible(false);
            state_add_sv = -1;
            jpnUpdateSv.setVisible(false);
        }
        if(evt.getSource() == jpn3){
            jpnQllop.setVisible(false);
            jpnQlsv.setVisible(false);
            jpnQldiem.setVisible(true);
            
            state_add_diem = -1;
            jpnUpdateDiem.setVisible(false);
        }
        if(evt.getSource() == jpn4){
            dispose();
            FormQLLop qLL = new FormQLLop(nv,getMaNVFromDatabase(tenNV));
            qLL.setVisible(true);
        }
        if(evt.getSource() == jpn5){
            if(getMaNVFromDatabase(tenNV).equals("NV01")){
                dispose();
                StaffCenter staff = new StaffCenter();
                staff.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "Chỉ có Hiệu Trưởng/Phó Hiệu Trưởng mới\nđượcthao tác trực tiếp nhân viên!");
            }
        }
    }//GEN-LAST:event_MenuMouseClick

    private void MenuMouseExit(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseExit
        if(evt.getSource() == jpn1){
            jpn1.setBackground(new Color(255, 255, 255));
        }
        if(evt.getSource() == jpn2){
            jpn2.setBackground(new Color(255, 255, 255));
        }
        if(evt.getSource() == jpn3){
            jpn3.setBackground(new Color(255, 255, 255));
        }
        if(evt.getSource() == jpn4){
            jpn4.setBackground(new Color(255, 255, 255));
        }
        if(evt.getSource() == jpn5){
            jpn5.setBackground(new Color(255, 255, 255));
        }
    }//GEN-LAST:event_MenuMouseExit

    private void MenuMouseEnter(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMouseEnter
        if(evt.getSource() == jpn1){
            jpn1.setBackground(new Color(240, 240, 240));
        }
        if(evt.getSource() == jpn2){
            jpn2.setBackground(new Color(240, 240, 240));
        }
        if(evt.getSource() == jpn3){
            jpn3.setBackground(new Color(240, 240, 240));
        }
        if(evt.getSource() == jpn4){
            jpn4.setBackground(new Color(240, 240, 240));
        }
        if(evt.getSource() == jpn5){
            jpn5.setBackground(new Color(240, 240, 240));
        }
    }//GEN-LAST:event_MenuMouseEnter

    private void LogoutMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClick
        dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_LogoutMouseClick

    private void jButton_xemDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_xemDiemActionPerformed
                
        if(this.trueNV_Lop){
            if(jTableSv.getModel().getRowCount()>0){
                if(jTableSv.getSelectedRow() >= 0){
                    DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
                    String s = (String) model.getValueAt(jTableSv.getSelectedRow(), 0);
                    if(!s.equals("") || !s.equals("null")){
                        jpnQllop.setVisible(false);
                        jpnQlsv.setVisible(false);
                        state_add_sv = -1;            
                        jpnQldiem.setVisible(true);
                        jpnUpdateDiem.setVisible(false);
                        this.maSVHienTai = s;
                        showDiemList(s);
                    }
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn Sinh viên cần xem điểm!");
                }
            }
        }
        
    }//GEN-LAST:event_jButton_xemDiemActionPerformed

    private void SearchLopMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchLopMouseClick
        ArrayList<Lop> lopList = getLopList();
        jTableLop.setModel(new DefaultTableModel(null, new String[]{"MÃ LỚP","TÊN LỚP","TÊN NHÂN VIÊN","SỈ SỐ"}));
        DefaultTableModel model = (DefaultTableModel)jTableLop.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<lopList.size();i++){
            if(lopList.get(i).getMalop().contains(txtSearchLop.getText().trim().toUpperCase()) == true){
                row[0] = lopList.get(i).getMalop();
                row[1] = lopList.get(i).getTenlop();
                row[2] = lopList.get(i).getTennv();
                row[3] = lopList.get(i).getSlsv();
                model.addRow(row);
            }            
        }
    }//GEN-LAST:event_SearchLopMouseClick

    private void SearchSinhVienMuoseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchSinhVienMuoseClick
        ArrayList<Sinhvien> sinhvienList = getSvList(txtSearchSv.getText().trim());
        jTableSv.setModel(new DefaultTableModel(null, new String[]{"MASV","HỌ TÊN","NGÀY SINH","ĐỊA CHỈ","TÊN LOGIN","MẬT KHẨU"}));
        DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<sinhvienList.size();i++){
            row[0] = sinhvienList.get(i).getMasv();
            row[1] = sinhvienList.get(i).getHoten();
            row[2] = sinhvienList.get(i).getNgaysinh();
            row[3] = sinhvienList.get(i).getDiachi();
            row[4] = sinhvienList.get(i).getTenDnSv();
            row[5] = sinhvienList.get(i).getMatkhau();
            model.addRow(row);
        }
    }//GEN-LAST:event_SearchSinhVienMuoseClick

    private void DelSvMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelSvMouseClick
        jpnUpdateSv.setVisible(false);
        state_add_sv = -1;
        String maSV = null;
        if(this.trueNV_Lop == true){           
            if(jTableSv.getModel().getRowCount()>0){
                if(jTableSv.getSelectedRow() >= 0){
                    DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
                    maSV = String.valueOf(model.getValueAt(jTableSv.getSelectedRow(), 0));
                    if(!maSV.equals("") || !maSV.equals("null")){
                        try{
                            String sql = "EXEC SP_DEL_PUBLIC_ENCRYPT_SINHVIEN '"+maSV+"'";
                            ps = cn.prepareStatement(sql);
                            rs = ps.executeQuery();
                        } catch (SQLException ex) {
                            System.out.println("Error 'DelSvMouseClick' func on Home");
                            System.out.println(ex.getMessage());
                        } 
                        showSvList(maLopTmp);
                    } 
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sinh viên cần xóa!");
                }                                        
            }                                                                     
        }else{
            JOptionPane.showMessageDialog(rootPane, "Sinh viên " + maSV + " không thuộc sự quản lý của giáo viên " + tenNV);
        }        
    }//GEN-LAST:event_DelSvMouseClick

    private void EditSvMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditSvMouseClick
        if(this.trueNV_Lop){
            initTextFieldSV();
            editSv = true;
            addSv = false;
            state_edit_sv++;
            if(state_edit_sv%2==0){
                if(jTableSv.getModel().getRowCount()>0){
                    if(jTableSv.getSelectedRow() >= 0){
                        DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
                        String maSV = String.valueOf(model.getValueAt(jTableSv.getSelectedRow(), 0));
                        if(!maSV.equals("") || !maSV.equals("null")){
                            jpnUpdateSv.setVisible(true);
                            try{
                                String sql = "SELECT * FROM SINHVIEN WHERE MASV = '"+maSV+"'";
                                ps = cn.prepareStatement(sql);                                
                                rs = ps.executeQuery();
                                if(rs.next()){
                                    txtNewMasv.setText(rs.getString("MASV"));
                                    txtNewName.setText(rs.getString("HOTEN"));
                                    jdcNewBirth.setDate(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("NGAYSINH")));
                                    txtNewAddress.setText(rs.getString("DIACHI"));
                                    txtNewMalopSv.setText(rs.getString("MALOP"));
                                    txtNewUsn.setText(rs.getString("TENDN"));                                  
                                }
                            } catch (SQLException | ParseException ex) {
                                System.out.println("Error 'DelSvMouseClick' func on Home");
                                System.out.println(ex.getMessage());
                            }
                            showSvList(maLopTmp);
                        } 
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn sinh viên cần sửa!");
                    }
                }                
            }else{
                jpnUpdateSv.setVisible(false);
            }
        } 
    }//GEN-LAST:event_EditSvMouseClick
    
    
    public boolean validateInput(int key){
        if(key == 1){
            if(txtNewMasv.getText().equals("") || txtNewName.getText().equals("") || jdcNewBirth.getDate().equals("")||
                txtNewAddress.getText().equals("") || txtNewMalopSv.getText().equals("") || txtNewUsn.getText().equals("") || txtNewPass.getText().equals("")){
                return false;
            }
        }
        if(key == 2){
            if(cbxDsHocphan.getSelectedItem().equals("") || txtDiemHocPhan.getText().equals("")){
                return false;
            }
        }
        return true;
    }    
    
    public ArrayList<Lop> getLopList(){
        ArrayList<Lop> lopList = new ArrayList<>();
        String sql = "SELECT DISTINCT LP.MALOP, LP.TENLOP, NV.HOTEN, (SELECT DISTINCT COUNT(MALOP) FROM SINHVIEN SV WHERE LP.MALOP = SV.MALOP) AS SLSV "
                + "FROM NHANVIEN NV, LOP LP, SINHVIEN SV WHERE NV.MANV = LP.MANV";
        
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Lop lop;
            while(rs.next()){
                lop = new Lop(rs.getString("MALOP"), rs.getString("TENLOP"), rs.getString("HOTEN"), rs.getInt("SLSV"));
                lopList.add(lop);
            }
        }catch(SQLException e){
            System.out.println("Loi table LOP");
            System.out.println(e.getMessage());
        }
        return lopList;
    }    
    
    private void showLopList(){
        ArrayList<Lop> lopList = getLopList();
        DefaultTableModel model = (DefaultTableModel)jTableLop.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<lopList.size();i++){
            row[0] = lopList.get(i).getMalop();
            row[1] = lopList.get(i).getTenlop();
            row[2] = lopList.get(i).getTennv();
            row[3] = lopList.get(i).getSlsv();
            model.addRow(row);
        }
    }
            
    public ArrayList<Sinhvien> getSvList(String malop){        
        ArrayList<Sinhvien> sinhvienList = new ArrayList<>();
        String sql = "SELECT SV.MASV, SV.HOTEN, SV.NGAYSINH, SV.DIACHI, SV.TENDN, SV.MATKHAU "
                    + "FROM SINHVIEN SV, LOP LP "
                    + "WHERE SV.MALOP = LP.MALOP AND SV.MALOP = '" + malop + "'";
        
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Sinhvien sv;
            while(rs.next()){
                sv = new Sinhvien(rs.getString("MASV"), rs.getString("HOTEN"), rs.getString("NGAYSINH"), rs.getString("DIACHI"), rs.getString("TENDN"), rs.getString("MATKHAU"));
                sinhvienList.add(sv);
            }
        }catch(SQLException e){
            System.out.println("Loi table SINHVIEN");
            System.out.println(e.getMessage());
        }
        return sinhvienList;
    }
    
    public void showSvList(String malop){
        ArrayList<Sinhvien> sinhvienList = getSvList(malop);
        jTableSv.setModel(new DefaultTableModel(null, new String[]{"MASV","HỌ TÊN","NGÀY SINH","ĐỊA CHỈ","TÊN LOGIN","MẬT KHẨU"}));
        DefaultTableModel model = (DefaultTableModel)jTableSv.getModel();
        Object[] row = new Object[6];
        for(int i=0;i<sinhvienList.size();i++){
            row[0] = sinhvienList.get(i).getMasv();
            row[1] = sinhvienList.get(i).getHoten();
            row[2] = sinhvienList.get(i).getNgaysinh();
            row[3] = sinhvienList.get(i).getDiachi();
            row[4] = sinhvienList.get(i).getTenDnSv();
            row[5] = sinhvienList.get(i).getMatkhau();
            model.addRow(row);
        }
    }               
    
    public ArrayList<Diem> getDiemList(String masv){
        ArrayList<Diem> diemList = new ArrayList<>();
        String sql = "EXEC SP_SEL_ENCRYPT_BANGDIEM '" + masv + "'";
        System.out.println(this.tenNV+this.matKhauNV);
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            Diem diem;
            while(rs.next()){System.out.println(rs.getString("DIEMTHI"));
                diem = new Diem(rs.getString("MAHP"), rs.getString("TENHP"), 
                        Float.parseFloat(new RSAGenerator(this.tenNV,this.matKhauNV).decrypt( rs.getString("DIEMTHI"))));
                diemList.add(diem);
            }
        }catch(SQLException e){
            System.out.println("Loi table DIEM");
            System.out.println(e.getMessage());
        }
        return diemList;
    }
    
    public void showDiemList(String masv){
        ArrayList<Diem> diemList = getDiemList(masv);
        jTableDiem.setModel(new DefaultTableModel(null, new String[]{"MÃ HỌC PHẦN","TÊN HỌC PHẦN","ĐIỂM"}));
        DefaultTableModel model = (DefaultTableModel)jTableDiem.getModel();
        Object[] row = new Object[3];
        for(int i=0;i<diemList.size();i++){
            row[0] = diemList.get(i).getMahp();
            row[1] = diemList.get(i).getTenhp();
            row[2] = diemList.get(i).getDiemthi();
            model.addRow(row);
        }
    }
    
    public void loadHocPhan(){
        cbxDsHocphan.removeAllItems();
        String sql = " SELECT TENHP FROM HOCPHAN ";
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cbxDsHocphan.addItem(rs.getString("TENHP"));
            }
        }catch(SQLException e){
            System.out.println("Loi load HOCPHAN vao Combobox");
            System.out.println(e.getMessage());
        }
    }
    
    
    public String getMaMHP(String tenHP){
        cbxDsHocphan.removeAllItems();
        String sql = " SELECT MAHP FROM HOCPHAN WHERE TENHP =  '"+tenHP+"'";System.out.println(sql);
        String maHP = null;
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                maHP = rs.getString("MAHP");
                        
            }
        }catch(SQLException e){
            System.out.println("Loi load HOCPHAN vao Combobox");
            System.out.println(e.getMessage());
        }
        return maHP;
    }     
    
    public String getMaNVFromDatabase(String tenNV){
       
           String sql = "SELECT MANV FROM NHANVIEN WHERE TENDN ='"+this.tenNV+"'";
           
           String maNV = null;
        try {
           try {
               ps = cn.prepareStatement(sql);
               rs = ps.executeQuery();
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
           while(rs.next()){
               try {
                   maNV = rs.getString("MANV");
               } catch (SQLException ex) {
                   System.out.println(ex.getMessage());
               }
               
           }
           return maNV;
       } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        return maNV;
    }
   
    public  boolean ktDungNV_Lop(String tenDN,String MaLop){
        String sql = "SELECT DISTINCT NV.MANV " +
                    "FROM NHANVIEN NV, LOP LP " +
                    "WHERE NV.TENDN = '"+ tenDN +"' AND NV.MANV = LP.MANV AND LP.MALOP = '"+MaLop+"'";
               
        try {
            ps = cn.prepareStatement(sql); 
            rs = ps.executeQuery();
            if(rs.next()){
                this.trueNV_Lop = true;
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        return false;
    }
    
    public String get_Manv_Of_Lop(String tenDN, String MaLop){
        String maNV = null;
        String sql = "SELECT DISTINCT NV.MANV " +
                    "FROM NHANVIEN NV, LOP LP " +
                    "WHERE NV.MANV = LP.MANV AND NV.TENDN = '" + tenDN + "'";
               
        try {
            ps = cn.prepareStatement(sql); 
            rs = ps.executeQuery();
            if(rs.next()){
                this.trueNV_Lop = true;
                maNV = rs.getString("MANV");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }        
        return maNV;
    }
    
    public String getMaLopFromDB(String maSV) throws SQLException{
        String sql = "SELECT MALOP FROM SINHVIEN WHERE MASV = '"+maSV+"'";
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        String maLop = null;
        while(rs.next()){
            maLop =  rs.getString("MALOP");
        }
        return maLop;
    }
    
    public String getMatKhauFromDB(String maSV) throws SQLException{
        String sql = "SELECT MATKHAU FROM SINHVIEN WHERE MASV = '"+maSV+"'";
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        String maLop = null;
        while(rs.next()){
            maLop =  rs.getString("MATKHAU");
        }
        return maLop;
    }
    
    public boolean checkTonTaiMasv(String maSV, boolean ngoaile){
        if(ngoaile == false){
            maSV = maSV.trim().toUpperCase();
            String sql = "SELECT MASV FROM SINHVIEN WHERE MASV = '" + maSV + "'";
            try{
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                    return true;
                }
            }catch(SQLException ex){
                System.out.println("Error 'checkMasvTonTai' func on Home");
                System.out.println(ex.getMessage());
            }
        }
        if(ngoaile == true){
            maSV = maSV.trim().toUpperCase();
            String sql = "SELECT MASV FROM SINHVIEN EXCEPT SELECT MASV FROM SINHVIEN WHERE MASV = '" + maSV + "'";
            try{
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                    return true;
                }
            }catch(SQLException ex){
                System.out.println("Error 'checkMasvTonTai' func on Home");
                System.out.println(ex.getMessage());
            }            
        }
        return false;
    }
    
    public boolean checkTonTaiTendnSV(String tenDN, boolean ngoaile){
        if(ngoaile == false){
            tenDN = tenDN.trim();
            String sql = "SELECT TENDN FROM SINHVIEN WHERE TENDN = '"+tenDN+"'";
            try {
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                    return true;
                }
            } catch (SQLException ex) {
                System.out.println("Error 'checkTonTaiTenDN' func on Home");
                System.out.println(ex.getMessage());
            }
        }
        if(ngoaile == true){
            tenDN = tenDN.trim();
            String sql = "SELECT TENDN FROM SINHVIEN EXCEPT SELECT TENDN FROM SINHVIEN WHERE TENDN = '"+tenDN+"'";
            try {
                ps = cn.prepareStatement(sql);
                rs = ps.executeQuery();
                if(rs.next()){
                    return true;
                }
            } catch (SQLException ex) {
                System.out.println("Error 'checkTonTaiTenDN' func on Home");
                System.out.println(ex.getMessage());
            }
        }
        return false;
    }
    
    public String getMaLopByTenNV(String tenNV){
        String sql = "SELECT LOP.MALOP FROM LOP,NHANVIEN WHERE LOP.MANV = NHANVIEN.MANV AND "
                + " NHANVIEN.TENDN = '"+this.tenNV+"'";
                
        try {
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        String maLop = null;
        try {
            while(rs.next()){
                maLop = rs.getString("MALOP");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }         
        return maLop;             
    } 
    
    public boolean checkMalopTonTai(String maLop){
        maLop = maLop.trim().toUpperCase();
        String sql = "SELECT MALOP FROM LOP WHERE MALOP = '" + maLop + "'";
        try{
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        }catch(SQLException ex){
            System.out.println("Erroe 'checkMalopTonTai' func on Home");
            System.out.println(ex.getMessage());
        }
        return false;
    }        
        
    public String getMasvNext(){
        String masv_next = null;
        String sql = "SELECT dbo.FN_GETMASV_NEXT() AS MASV_NEXT";
        try{                                
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()) masv_next = rs.getString("MASV_NEXT");
        }catch(SQLException ex){
            System.out.println("Error 'AddSvMouseClick' func on Home");
            System.out.println(ex.getMessage());
        }
        return masv_next;
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JComboBox<String> cbxDsHocphan;
    private javax.swing.JButton jButton_xemDiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableDiem;
    private javax.swing.JTable jTableLop;
    private javax.swing.JTable jTableSv;
    private com.toedter.calendar.JDateChooser jdcNewBirth;
    private javax.swing.JPanel jpn1;
    private javax.swing.JPanel jpn2;
    private javax.swing.JPanel jpn3;
    private javax.swing.JPanel jpn4;
    private javax.swing.JPanel jpn5;
    private javax.swing.JPanel jpnCenter;
    private javax.swing.JPanel jpnHeader;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQldiem;
    private javax.swing.JPanel jpnQllop;
    private javax.swing.JPanel jpnQlsv;
    private javax.swing.JPanel jpnSearchDiem;
    private javax.swing.JPanel jpnSearchLop;
    private javax.swing.JPanel jpnSearchSv;
    private javax.swing.JPanel jpnTableDiem;
    private javax.swing.JPanel jpnTableLop;
    private javax.swing.JPanel jpnTableSv;
    private javax.swing.JPanel jpnUpdateDiem;
    private javax.swing.JPanel jpnUpdateSv;
    private javax.swing.JPanel jpnUser;
    private javax.swing.JPanel jpnUser1;
    private javax.swing.JPanel jpnUser2;
    private javax.swing.JToggleButton jtbAddDiem;
    private javax.swing.JToggleButton jtbAddSv;
    private javax.swing.JToggleButton jtbDelDiem;
    private javax.swing.JToggleButton jtbDelSv;
    private javax.swing.JToggleButton jtbEditDiem;
    private javax.swing.JToggleButton jtbEditSv;
    private javax.swing.JToggleButton jtbSaveDiem;
    private javax.swing.JToggleButton jtbSaveSv;
    private javax.swing.JToggleButton jtbSearchHp;
    private javax.swing.JToggleButton jtbSearchLop;
    private javax.swing.JToggleButton jtbSearchSv;
    private javax.swing.JToggleButton jtbStopSavingDiem;
    private javax.swing.JToggleButton jtbStopUpdatingSv;
    private javax.swing.JTextField txtDiemHocPhan;
    private javax.swing.JTextField txtNewAddress;
    private javax.swing.JTextField txtNewMalopSv;
    private javax.swing.JTextField txtNewMasv;
    private javax.swing.JTextField txtNewName;
    private javax.swing.JTextField txtNewPass;
    private javax.swing.JTextField txtNewUsn;
    private javax.swing.JTextField txtSearchHp;
    private javax.swing.JTextField txtSearchLop;
    private javax.swing.JTextField txtSearchSv;
    private javax.swing.JLabel txtTenDn;
    // End of variables declaration//GEN-END:variables
}
