package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class p3 extends jk3.v {
    public static final com.tencent.mm.pluginsdk.ui.tools.p3 C = new com.tencent.mm.pluginsdk.ui.tools.p3();
    public int A;
    public boolean B;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f191831x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f191832y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f191833z;

    public p3() {
        super(null);
        this.f191831x = "";
        this.f191832y = "";
        this.f191833z = "";
        this.A = 0;
        this.B = false;
    }

    public static java.lang.String c0(java.lang.String str) {
        try {
            int lastIndexOf = str.lastIndexOf(47) + 1;
            if (lastIndexOf < 0 || lastIndexOf == str.length()) {
                lastIndexOf = 0;
            }
            return str.substring(lastIndexOf, str.length());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "get file name error " + e17.getMessage());
            return " ";
        }
    }

    @Override // jk3.v, jk3.b
    public void C(boolean z17, int i17) {
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onMenuFloatBallSelected, enter float ball");
            l(null, true);
            com.tencent.mm.sdk.platformtools.v5.b(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f493669l73);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent("com.tencent.QQBrowser.action.sdk.document.receiver");
            intent.setPackage("com.tencent.mtt");
            intent.putExtra("key_reader_sdk_window_close", true);
            try {
                context.sendBroadcast(intent);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "closeQb() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        return super.U(i17, this.B);
    }

    public void d0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, r45.w60 w60Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", "onCreate, filePath:%s fileExt:%s fileName:%s sence:%s", str, str2, str3, java.lang.Integer.valueOf(i17));
        y(4, com.tencent.mm.plugin.multitask.s0.c(str));
        this.f191831x = str;
        this.f191832y = str2;
        this.f191833z = str3;
        if (android.text.TextUtils.isEmpty(str3)) {
            this.f191833z = c0(str);
        }
        this.B = false;
        this.A = i17;
        b0(w60Var);
        r45.qs0 qs0Var = new r45.qs0();
        qs0Var.set(0, java.lang.Boolean.FALSE);
        qs0Var.set(1, str);
        qs0Var.set(2, str2);
        qs0Var.set(7, java.lang.Long.valueOf(com.tencent.mm.vfs.w6.k(str)));
        qs0Var.set(5, java.lang.Integer.valueOf(java.lang.Integer.valueOf(i17).intValue()));
        try {
            this.f300077a.field_data = qs0Var.toByteArray();
            J();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FilesFloatBall.FilesMultiTaskHelper", e17, "", new java.lang.Object[0]);
        }
        this.f300077a.v0().set(4, this.f191832y);
        this.f300077a.v0().set(1, this.f191833z);
        J();
    }

    @Override // jk3.b
    public long n() {
        return 1500L;
    }

    @Override // jk3.b
    public boolean x() {
        return false;
    }
}
