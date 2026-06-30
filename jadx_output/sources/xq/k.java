package xq;

/* loaded from: classes15.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f455985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f455986e;

    public k(xq.m mVar, com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView) {
        this.f455985d = mVar;
        this.f455986e = mMAnimateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f455985d;
        com.tencent.mm.plugin.gif.u uVar = mVar.f455997i;
        if (uVar != null) {
            uVar.f142190d = false;
        }
        this.f455986e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200L).withEndAction(new xq.j(mVar));
    }
}
