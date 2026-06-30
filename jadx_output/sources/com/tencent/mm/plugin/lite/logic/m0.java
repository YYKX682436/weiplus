package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes8.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f144011a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.ArrayList f144012b = new java.util.ArrayList();

    public static void a(java.lang.String str, boolean z17, int i17, com.tencent.mm.plugin.lite.logic.l0 l0Var) {
        java.lang.String str2;
        android.net.NetworkInfo activeNetworkInfo;
        int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
        ((v60.u) ((w60.i) i95.n0.c(w60.i.class))).getClass();
        com.tencent.mm.modelbase.o b17 = com.tencent.mm.modelsimple.j0.b(str, 0);
        r45.r83 r83Var = (r45.r83) b17.f70710a.f70684a;
        r83Var.f384610d = 2;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        r83Var.f384615i = du5Var;
        r83Var.f384618o = i17;
        r83Var.f384619p = "";
        r83Var.f384622s = 0;
        r83Var.f384624u = 0;
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("connectivity");
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 1) {
                str2 = "WIFI";
            } else if (activeNetworkInfo.getExtraInfo() != null) {
                str2 = activeNetworkInfo.getExtraInfo().toLowerCase();
            }
            r83Var.f384625v = str2;
            r83Var.f384628y = currentTimeMillis;
            r83Var.f384629z = "";
            r83Var.A = 0;
            r45.du5 du5Var2 = new r45.du5();
            du5Var2.f372756d = "";
            du5Var2.f372757e = true;
            r83Var.f384612f = du5Var2;
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(f144011a);
            r83Var.B = cu5Var;
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(b17, new com.tencent.mm.plugin.lite.logic.j0(l0Var, (r45.r83) b17.f70710a.f70684a, z17));
        }
        str2 = "no";
        r83Var.f384625v = str2;
        r83Var.f384628y = currentTimeMillis;
        r83Var.f384629z = "";
        r83Var.A = 0;
        r45.du5 du5Var22 = new r45.du5();
        du5Var22.f372756d = "";
        du5Var22.f372757e = true;
        r83Var.f384612f = du5Var22;
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(f144011a);
        r83Var.B = cu5Var2;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(b17, new com.tencent.mm.plugin.lite.logic.j0(l0Var, (r45.r83) b17.f70710a.f70684a, z17));
    }
}
