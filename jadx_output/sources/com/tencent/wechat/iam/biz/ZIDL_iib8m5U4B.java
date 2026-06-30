package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
class ZIDL_iib8m5U4B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.iam.biz.v {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.iam.biz.w f217733a;

    private native void ZIDL_AX(long j17, long j18, byte[] bArr);

    private native void ZIDL_CI(long j17, byte[] bArr);

    private native void ZIDL_DX(long j17, long j18, boolean z17, boolean z18);

    private native void ZIDL_EX(long j17, long j18);

    private native void ZIDL_FX(long j17, long j18, byte[] bArr);

    private native void ZIDL_GX(long j17, long j18);

    private native void ZIDL_JX(long j17, long j18, boolean z17, boolean z18);

    @Override // com.tencent.wechat.iam.biz.v
    public void E(long j17, java.lang.String str) {
        ZIDL_FX(this.nativeHandler, j17, str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    public void Q1(long j17) {
        ZIDL_GX(this.nativeHandler, j17);
    }

    public void R1(long j17, boolean z17, boolean z18) {
        ZIDL_JX(this.nativeHandler, j17, z17, z18);
    }

    public void S1(long j17, boolean z17, boolean z18) {
        ZIDL_DX(this.nativeHandler, j17, z17, z18);
    }

    @Override // com.tencent.wechat.iam.biz.v
    public void Z0(long j17) {
        ZIDL_EX(this.nativeHandler, j17);
    }

    public void ZIDL_AV(long j17, byte[] bArr) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        com.tencent.wechat.iam.biz.r rVar = (com.tencent.wechat.iam.biz.r) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.iam.biz.r.f217774f, bArr);
        ((yw.u3) wVar).getClass();
        com.tencent.mars.xlog.Log.w("IamBizCppToNativeManagerImpl", "sendMessageAsync: " + j17 + ", " + rVar + ", no use in Android");
    }

    public byte[] ZIDL_B(byte[] bArr) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        com.tencent.wechat.iam.biz.r rVar = (com.tencent.wechat.iam.biz.r) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.iam.biz.r.f217774f, bArr);
        ((yw.u3) wVar).getClass();
        com.tencent.mars.xlog.Log.w("IamBizCppToNativeManagerImpl", "syncSendMessage: " + rVar + ", no use in Android");
        return new com.tencent.wechat.iam.biz.r().toByteArrayOrNull();
    }

    public void ZIDL_DV(long j17) {
        yw.u3 u3Var = (yw.u3) this.f217733a;
        u3Var.getClass();
        com.tencent.mars.xlog.Log.i("IamBizCppToNativeManagerImpl", "getMeTabOpenStateAsync: " + j17);
        tk.o oVar = (tk.o) i95.n0.c(tk.o.class);
        com.tencent.wechat.iam.biz.v vVar = u3Var.f466479a;
        if (vVar != null) {
            ox.g gVar = (ox.g) oVar;
            ((com.tencent.wechat.iam.biz.ZIDL_iib8m5U4B) vVar).S1(j17, gVar.fj(), gVar.mj());
        }
    }

    public void ZIDL_EV(long j17, byte[] bArr) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        com.tencent.wechat.mm.biz.j2 j2Var = (com.tencent.wechat.mm.biz.j2) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.mm.biz.j2.f218218o, bArr);
        yw.u3 u3Var = (yw.u3) wVar;
        u3Var.getClass();
        com.tencent.mars.xlog.Log.i("IamBizCppToNativeManagerImpl", "notifyBizPublishResultAsync, " + j2Var);
        ((ku5.t0) ku5.t0.f312615d).q(new yw.t3(u3Var, j17));
    }

    public void ZIDL_FV(long j17, int i17, byte[] bArr, int i18) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yw.u3 u3Var = (yw.u3) wVar;
        u3Var.getClass();
        ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Zi(i17, str, i18, new yw.s3(u3Var, j17));
    }

    public void ZIDL_GV(long j17, int i17, byte[] bArr, int i18) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        yw.u3 u3Var = (yw.u3) wVar;
        u3Var.getClass();
        ((ur1.s) ((rm.b0) i95.n0.c(rm.b0.class))).Ai(i17, str, i18);
        com.tencent.wechat.iam.biz.v vVar = u3Var.f466479a;
        if (vVar != null) {
            ((com.tencent.wechat.iam.biz.ZIDL_iib8m5U4B) vVar).Q1(j17);
        }
    }

    public byte[] ZIDL_H(byte[] bArr) {
        java.lang.String str;
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((yw.u3) wVar).getClass();
        java.lang.String str3 = "";
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
                    com.tencent.mars.xlog.Log.i("IamBizCppToNativeManagerImpl", "getEditorWXFilePath: success, localPath: " + str2 + ", wxFilePath: " + wi6);
                    if (wi6 != null) {
                        str3 = wi6;
                    }
                }
                com.tencent.mars.xlog.Log.w("IamBizCppToNativeManagerImpl", "getEditorWXFilePath: file not exist or not file, path: ".concat(str2));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("IamBizCppToNativeManagerImpl", "getEditorWXFilePath: error, localPath: ".concat(str2), e17);
            }
        }
        return str3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_I(byte[] bArr) {
        com.tencent.wechat.iam.biz.w wVar = this.f217733a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((yw.u3) wVar).getClass();
        java.lang.String str2 = "";
        if (!(str.length() == 0)) {
            try {
                java.lang.String Ai = ((com.tencent.mm.plugin.appbrand.jsapi.file.b) ((ft.x3) i95.n0.c(ft.x3.class))).Ai("wx0b2ec076ec39c786", str);
                com.tencent.mars.xlog.Log.i("IamBizCppToNativeManagerImpl", "getEditorLocalPath: success, wxFilePath: " + str + ", localPath: " + Ai);
                if (Ai != null) {
                    str2 = Ai;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("IamBizCppToNativeManagerImpl", "getEditorLocalPath: error, wxFilePath: ".concat(str), e17);
            }
        }
        return str2.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public void ZIDL_JV(long j17) {
        yw.u3 u3Var = (yw.u3) this.f217733a;
        u3Var.getClass();
        rm.b0 b0Var = (rm.b0) i95.n0.c(rm.b0.class);
        com.tencent.mars.xlog.Log.i("IamBizCppToNativeManagerImpl", "getDraftStateAsync: " + j17);
        com.tencent.wechat.iam.biz.v vVar = u3Var.f466479a;
        if (vVar != null) {
            kotlin.jvm.internal.o.d(b0Var);
            tk.s[] sVarArr = tk.s.f419870d;
            ((com.tencent.wechat.iam.biz.ZIDL_iib8m5U4B) vVar).R1(j17, rm.b0.c3(b0Var, 1, "", 1, null, 8, null), rm.b0.c3(b0Var, 2, "", 1, null, 8, null));
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.iam.biz.w wVar = (com.tencent.wechat.iam.biz.w) obj;
        this.f217733a = wVar;
        ((yw.u3) wVar).f466479a = this;
    }
}
