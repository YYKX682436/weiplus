package cp2;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(1);
        this.f220947d = nearbyLiveItemConvertFactory;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.ui.MMActivity mMActivity;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (!z17) {
            ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
            mMActivity = this.f220947d.baseContext;
            ((wo2.k) gVar).Bi(mMActivity, new android.content.Intent());
        }
        return jz5.f0.f302826a;
    }
}
