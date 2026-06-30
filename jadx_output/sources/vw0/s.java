package vw0;

/* loaded from: classes5.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView f440810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.p f440811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.base.MJID f440812f;

    public s(com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView, dx0.p pVar, com.tencent.maas.base.MJID mjid) {
        this.f440810d = setContentDescView;
        this.f440811e = pVar;
        this.f440812f = mjid;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pw0.i segmentAdapter;
        java.lang.Object obj;
        pw0.i segmentAdapter2;
        pw0.i segmentAdapter3;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.text.subviews.SetContentDescView setContentDescView = this.f440810d;
        segmentAdapter = setContentDescView.getSegmentAdapter();
        java.util.Iterator it = segmentAdapter.f275970d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((vv0.n) obj).f440398a, this.f440812f)) {
                    break;
                }
            }
        }
        vv0.n nVar = (vv0.n) obj;
        segmentAdapter2 = setContentDescView.getSegmentAdapter();
        int c07 = kz5.n0.c0(segmentAdapter2.f275970d, nVar);
        if (c07 == -1 || nVar == null) {
            return;
        }
        segmentAdapter3 = setContentDescView.getSegmentAdapter();
        segmentAdapter3.x(c07, vv0.n.a(nVar, null, this.f440811e, 0, false, false, 29, null));
    }
}
