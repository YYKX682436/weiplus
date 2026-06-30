package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class lq implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f161304d;

    public lq(java.lang.ref.WeakReference weakUic) {
        kotlin.jvm.internal.o.g(weakUic, "weakUic");
        this.f161304d = weakUic;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xj.m mVar = (xj.m) obj;
        com.tencent.mm.plugin.setting.ui.setting.tq tqVar = (com.tencent.mm.plugin.setting.ui.setting.tq) this.f161304d.get();
        if (tqVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.YuanBaoAvatarUIC", "prefetchAdInfo callback: UIC already released, skip");
        } else {
            tqVar.f161587d = mVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prefetchAdInfo: result aid=");
            sb6.append(mVar != null ? mVar.f454753a : null);
            sb6.append(", hintText=");
            sb6.append(mVar != null ? mVar.f454754b : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.YuanBaoAvatarUIC", sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
