package com.tencent.wechat.aff.favorites;

/* loaded from: classes8.dex */
class ZIDL_jqzaE9_PB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.favorites.s f216727a;

    private native void ZIDL_BX(long j17, long j18, byte[] bArr);

    private native void ZIDL_FX(long j17, long j18, byte[] bArr);

    private native void ZIDL_GX(long j17, long j18, int i17, java.lang.String str);

    private native void ZIDL_IX(long j17, long j18, int i17, java.lang.String str);

    public java.lang.String ZIDL_A() {
        ((u72.a) this.f216727a).getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("favorite");
        if (c17 == null) {
            c17 = "";
        }
        if (c17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FavoritesNativeUtilImpl", "getRootPath: failed");
        }
        java.lang.String b17 = com.tencent.mm.vfs.x6.b(c17, true);
        kotlin.jvm.internal.o.f(b17, "exportExternalPath(...)");
        return b17;
    }

    public void ZIDL_BV(long j17) {
        this.f216727a.getClass();
    }

    public java.lang.String ZIDL_C(java.lang.String str) {
        ((u72.a) this.f216727a).getClass();
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String e17 = c01.a2.e(str);
        kotlin.jvm.internal.o.f(e17, "getDisplayName(...)");
        return e17;
    }

    public java.lang.String ZIDL_D() {
        ((u72.a) this.f216727a).getClass();
        java.lang.String k17 = gm0.j1.b().k();
        kotlin.jvm.internal.o.f(k17, "getUserName(...)");
        return k17;
    }

    public long ZIDL_E() {
        ((u72.a) this.f216727a).getClass();
        return gm0.j1.b().h();
    }

    public void ZIDL_FV(long j17, byte[] bArr) {
        com.tencent.wechat.aff.favorites.s sVar = this.f216727a;
        com.tencent.wechat.aff.favorites.m mVar = (com.tencent.wechat.aff.favorites.m) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(com.tencent.wechat.aff.favorites.m.f216832i, bArr);
        ((u72.a) sVar).getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadMessageAsync: ");
        sb6.append(j17);
        sb6.append(", ");
        sb6.append(mVar != null ? mVar.b() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavoritesNativeUtilImpl", sb6.toString());
    }

    public void ZIDL_GV(long j17, long j18, java.lang.String str, boolean z17, java.lang.String str2, int[] iArr) {
        com.tencent.wechat.aff.favorites.s sVar = this.f216727a;
        com.tencent.wechat.zidl2.ZidlUtil.intArrayToList(iArr);
        sVar.getClass();
    }

    public java.lang.String ZIDL_H(byte[] bArr) {
        com.tencent.wechat.aff.favorites.s sVar = this.f216727a;
        sVar.getClass();
        return "";
    }

    public void ZIDL_IV(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, long j18) {
        this.f216727a.getClass();
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.favorites.s sVar = (com.tencent.wechat.aff.favorites.s) obj;
        this.f216727a = sVar;
        sVar.getClass();
    }
}
