package xq;

/* loaded from: classes15.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f455987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f455988e;

    public l(xq.m mVar, com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView) {
        this.f455987d = mVar;
        this.f455988e = mMAnimateView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f455987d;
        com.tencent.mm.plugin.gif.u uVar = mVar.f455997i;
        if (uVar != null) {
            uVar.d();
        }
        com.tencent.mm.plugin.gif.u uVar2 = mVar.f455997i;
        if (uVar2 != null) {
            uVar2.P = new xq.k(mVar, this.f455988e);
        }
    }
}
