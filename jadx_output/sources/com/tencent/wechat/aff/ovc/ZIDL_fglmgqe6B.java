package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_fglmgqe6B extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.h {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.i f217467a;

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_DX(long j17, long j18);

    private native void ZIDL_FI(long j17, java.lang.String str, boolean z17);

    private native void ZIDL_GI(long j17);

    @Override // com.tencent.wechat.aff.ovc.h
    public void H() {
        ZIDL_GI(this.nativeHandler);
    }

    @Override // com.tencent.wechat.aff.ovc.h
    public void K1(java.lang.String str, boolean z17) {
        ZIDL_FI(this.nativeHandler, str, z17);
    }

    public boolean ZIDL_B(java.lang.String username) {
        h41.o0 o0Var = (h41.o0) this.f217467a;
        o0Var.getClass();
        kotlin.jvm.internal.o.g(username, "username");
        return !o0Var.f278845k && kotlin.jvm.internal.o.b(o0Var.f278840d, username);
    }

    public void ZIDL_CV(long j17, java.lang.String str, java.lang.String str2) {
        h41.o0 o0Var = (h41.o0) this.f217467a;
        o0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCMsgUI", "showAsync called: taskId=" + j17 + ", username=" + str + ", preInput=" + str2);
        if (o0Var.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "showAsync: already released");
            com.tencent.wechat.aff.ovc.h hVar = o0Var.f278837a;
            if (hVar != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmgqe6B) hVar).c(j17);
                return;
            }
            return;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "showAsync: username is empty");
            com.tencent.wechat.aff.ovc.h hVar2 = o0Var.f278837a;
            if (hVar2 != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmgqe6B) hVar2).c(j17);
                return;
            }
            return;
        }
        if (o0Var.f278838b != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "showAsync: already shown");
            com.tencent.wechat.aff.ovc.h hVar3 = o0Var.f278837a;
            if (hVar3 != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmgqe6B) hVar3).c(j17);
                return;
            }
            return;
        }
        o0Var.f278839c = j17;
        o0Var.f278840d = str;
        kotlinx.coroutines.r2 r2Var = o0Var.f278844j;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        o0Var.f278844j = kotlinx.coroutines.l.d(o0Var.f278842h, null, null, new h41.n0(o0Var, str, null), 3, null);
    }

    public void ZIDL_DV(long j17) {
        h41.o0 o0Var = (h41.o0) this.f217467a;
        kotlinx.coroutines.l.d(o0Var.f278842h, null, null, new h41.l0(o0Var, j17, null), 3, null);
    }

    public void ZIDL_E(java.lang.String username, java.lang.String str) {
        h41.o0 o0Var = (h41.o0) this.f217467a;
        if (o0Var.f278845k) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "setEditingText: already released");
            return;
        }
        boolean z17 = false;
        if ((username == null || username.length() == 0) || str == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "setEditingText: invalid params");
            return;
        }
        kotlin.jvm.internal.o.g(username, "username");
        if (!o0Var.f278845k && kotlin.jvm.internal.o.b(o0Var.f278840d, username)) {
            z17 = true;
        }
        if (z17) {
            kotlinx.coroutines.l.d(o0Var.f278842h, null, null, new h41.m0(o0Var, str, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OVCMsgUI", "setEditingText: not verify " + username + ' ' + o0Var.f278840d);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.i iVar = (com.tencent.wechat.aff.ovc.i) obj;
        this.f217467a = iVar;
        ((h41.o0) iVar).f278837a = this;
    }

    @Override // com.tencent.wechat.aff.ovc.h
    public void b(long j17) {
        ZIDL_DX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.h
    public void c(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }
}
