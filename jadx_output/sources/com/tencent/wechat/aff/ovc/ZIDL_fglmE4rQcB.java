package com.tencent.wechat.aff.ovc;

/* loaded from: classes11.dex */
class ZIDL_fglmE4rQcB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ovc.l {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ovc.m f217463a;

    private native void ZIDL_BX(long j17, long j18);

    private native void ZIDL_CX(long j17, long j18);

    private native void ZIDL_EI(long j17);

    @Override // com.tencent.wechat.aff.ovc.l
    public void H() {
        ZIDL_EI(this.nativeHandler);
    }

    public void ZIDL_BV(long j17, java.lang.String[] strArr, java.lang.String scene) {
        com.tencent.wechat.aff.ovc.m mVar = this.f217463a;
        java.util.ArrayList<java.lang.String> usernames = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(strArr);
        h41.y0 y0Var = (h41.y0) mVar;
        y0Var.getClass();
        kotlin.jvm.internal.o.g(usernames, "usernames");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (y0Var.f278901j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "show: already released");
            com.tencent.wechat.aff.ovc.l lVar = y0Var.f278894a;
            if (lVar != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmE4rQcB) lVar).c(j17);
                return;
            }
            return;
        }
        if (y0Var.f278895b != null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "show: already shown");
            com.tencent.wechat.aff.ovc.l lVar2 = y0Var.f278894a;
            if (lVar2 != null) {
                ((com.tencent.wechat.aff.ovc.ZIDL_fglmE4rQcB) lVar2).c(j17);
                return;
            }
            return;
        }
        y0Var.f278896c = j17;
        kotlinx.coroutines.r2 r2Var = y0Var.f278900i;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        y0Var.f278900i = kotlinx.coroutines.l.d(y0Var.f278898g, null, null, new h41.w0(y0Var, scene, usernames, null), 3, null);
    }

    public void ZIDL_CV(long j17) {
        h41.y0 y0Var = (h41.y0) this.f217463a;
        kotlinx.coroutines.l.d(y0Var.f278898g, null, null, new h41.v0(y0Var, j17, null), 3, null);
    }

    public void ZIDL_D(java.lang.String[] strArr, java.lang.String scene) {
        com.tencent.wechat.aff.ovc.m mVar = this.f217463a;
        java.util.ArrayList<java.lang.String> usernames = com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(strArr);
        h41.y0 y0Var = (h41.y0) mVar;
        y0Var.getClass();
        kotlin.jvm.internal.o.g(usernames, "usernames");
        kotlin.jvm.internal.o.g(scene, "scene");
        if (y0Var.f278901j) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCSelectContactUI", "updateContacts: already released");
        } else {
            kotlinx.coroutines.l.d(y0Var.f278898g, null, null, new h41.x0(y0Var, usernames, scene, null), 3, null);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ovc.m mVar = (com.tencent.wechat.aff.ovc.m) obj;
        this.f217463a = mVar;
        ((h41.y0) mVar).f278894a = this;
    }

    @Override // com.tencent.wechat.aff.ovc.l
    public void b(long j17) {
        ZIDL_CX(this.nativeHandler, j17);
    }

    @Override // com.tencent.wechat.aff.ovc.l
    public void c(long j17) {
        ZIDL_BX(this.nativeHandler, j17);
    }
}
