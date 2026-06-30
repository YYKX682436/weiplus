package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
class ZIDL_noC7D3fbnB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.iam.finder_box.j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.iam.finder_box.k f217826a;

    private native void ZIDL_AX(long j17, long j18, byte[] bArr);

    private native void ZIDL_CI(long j17, byte[] bArr);

    private native void ZIDL_DX(long j17, long j18, boolean z17, boolean z18);

    private native void ZIDL_EX(long j17, long j18, byte[] bArr);

    private native void ZIDL_FX(long j17, long j18);

    private native void ZIDL_IX(long j17, long j18, boolean z17, boolean z18);

    @Override // com.tencent.wechat.iam.finder_box.j
    public void E(long j17, java.lang.String str) {
        ZIDL_EX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void Q1(long j17) {
        ZIDL_FX(this.nativeHandler, j17);
    }

    public void R1(long j17, boolean z17, boolean z18) {
        ZIDL_IX(this.nativeHandler, j17, z17, z18);
    }

    public void S1(long j17, boolean z17, boolean z18) {
        ZIDL_DX(this.nativeHandler, j17, z17, z18);
    }

    public void ZIDL_AV(long j17, byte[] bArr) {
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        com.tencent.wechat.iam.finder_box.f fVar = (com.tencent.wechat.iam.finder_box.f) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.iam.finder_box.f.f217833f, bArr);
        ((a50.g1) kVar).getClass();
        com.tencent.mars.xlog.Log.w("BoxIamBizCppToNativeManagerImpl", "sendMessageAsync: " + j17 + ", " + fVar + ", no use in Android");
    }

    public byte[] ZIDL_B(byte[] bArr) {
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        com.tencent.wechat.iam.finder_box.f fVar = (com.tencent.wechat.iam.finder_box.f) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.iam.finder_box.f.f217833f, bArr);
        ((a50.g1) kVar).getClass();
        com.tencent.mars.xlog.Log.w("BoxIamBizCppToNativeManagerImpl", "syncSendMessage: " + fVar + ", no use in Android");
        return new com.tencent.wechat.iam.finder_box.f().toByteArrayOrNull();
    }

    public void ZIDL_DV(long j17) {
        a50.g1 g1Var = (a50.g1) this.f217826a;
        g1Var.getClass();
        com.tencent.mars.xlog.Log.i("BoxIamBizCppToNativeManagerImpl", "getMeTabOpenStateAsync: " + j17);
        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
        com.tencent.wechat.iam.finder_box.j jVar = g1Var.f1487a;
        if (jVar != null) {
            ox.g gVar = (ox.g) oVar;
            ((com.tencent.wechat.iam.finder_box.ZIDL_noC7D3fbnB) jVar).S1(j17, gVar.fj(), gVar.mj());
        }
    }

    public void ZIDL_EV(long j17, int i17, byte[] bArr) {
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.g1 g1Var = (a50.g1) kVar;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ur1.s) b0Var).Vi(i17, str, 1, new a50.f1(g1Var, j17));
    }

    public void ZIDL_FV(long j17, int i17, byte[] bArr) {
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        a50.g1 g1Var = (a50.g1) kVar;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        ((ur1.s) b0Var).Ai(i17, str, 1);
        com.tencent.wechat.iam.finder_box.j jVar = g1Var.f1487a;
        if (jVar != null) {
            ((com.tencent.wechat.iam.finder_box.ZIDL_noC7D3fbnB) jVar).Q1(j17);
        }
    }

    public byte[] ZIDL_G(byte[] bArr) {
        java.lang.String str;
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((a50.g1) kVar).getClass();
        java.lang.String str3 = null;
        if (!(str2.length() == 0)) {
            try {
                ft.x3 x3Var = (ft.x3) i95.n0.c(ft.x3.class);
                com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2));
                if (r6Var.m() && r6Var.A()) {
                    java.lang.String name = r6Var.getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    if (r26.n0.B(name, ".", false)) {
                        java.lang.String name2 = r6Var.getName();
                        kotlin.jvm.internal.o.f(name2, "getName(...)");
                        str = r26.n0.p0(name2, ".", name2);
                    } else {
                        str = "";
                    }
                    java.lang.String wi6 = ((com.tencent.mm.plugin.appbrand.jsapi.file.b) x3Var).wi("wx0b2ec076ec39c786", r6Var, str, true);
                    com.tencent.mars.xlog.Log.i("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: success, localPath: " + str2 + ", wxFilePath: " + wi6);
                    str3 = wi6;
                }
                com.tencent.mars.xlog.Log.w("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: file not exist or not file, path: ".concat(str2));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("BoxIamBizCppToNativeManagerImpl", "getEditorWXFilePath: error, localPath: ".concat(str2), e17);
            }
        }
        return str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_H(byte[] bArr) {
        com.tencent.wechat.iam.finder_box.k kVar = this.f217826a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((a50.g1) kVar).getClass();
        java.lang.String str2 = null;
        if (!(str.length() == 0)) {
            try {
                java.lang.String Ai = ((com.tencent.mm.plugin.appbrand.jsapi.file.b) ((ft.x3) i95.n0.c(ft.x3.class))).Ai("wx0b2ec076ec39c786", str);
                com.tencent.mars.xlog.Log.i("BoxIamBizCppToNativeManagerImpl", "getEditorLocalPath: success, wxFilePath: " + str + ", localPath: " + Ai);
                str2 = Ai;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("BoxIamBizCppToNativeManagerImpl", "getEditorLocalPath: error, wxFilePath: ".concat(str), e17);
            }
        }
        return str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_IV(long j17) {
        a50.g1 g1Var = (a50.g1) this.f217826a;
        g1Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        com.tencent.wechat.iam.finder_box.j jVar = g1Var.f1487a;
        if (jVar != null) {
            kotlin.jvm.internal.o.d(b0Var);
            tk.s[] sVarArr = tk.s.f419870d;
            ((com.tencent.wechat.iam.finder_box.ZIDL_noC7D3fbnB) jVar).R1(j17, rm.b0.c3(b0Var, 1, "", 1, null, 8, null), rm.b0.c3(b0Var, 2, "", 1, null, 8, null));
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.iam.finder_box.k kVar = (com.tencent.wechat.iam.finder_box.k) obj;
        this.f217826a = kVar;
        ((a50.g1) kVar).f1487a = this;
    }
}
