package vd2;

/* loaded from: classes3.dex */
public final class x3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f436000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f436001e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f436002f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveUninterestedEvent f436003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f436004h;

    public x3(java.util.ArrayList arrayList, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback, kotlin.jvm.internal.f0 f0Var, com.tencent.mm.autogen.events.FinderLiveUninterestedEvent finderLiveUninterestedEvent, long j17) {
        this.f436000d = arrayList;
        this.f436001e = finderLiveViewCallback;
        this.f436002f = f0Var;
        this.f436003g = finderLiveUninterestedEvent;
        this.f436004h = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f436000d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            com.tencent.mm.live.api.LiveConfig b17 = ((km2.t) it.next()).b();
            if (b17 != null && b17.f68549s == this.f436004h) {
                break;
            } else {
                i17++;
            }
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f436001e;
        if (i17 >= 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                km2.m mVar = ((km2.t) it6.next()).f309222d;
                if (mVar != null) {
                    arrayList2.add(mVar);
                }
            }
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.j(finderLiveViewCallback, i17, new java.util.ArrayList(arrayList2));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "FinderLiveUninterestedEvent: newCurIndex=" + i17 + ", curIndex=" + this.f436002f.f310116d);
        if (this.f436003g.f54301g.f6671b) {
            com.tencent.mm.ui.MMActivity mMActivity = finderLiveViewCallback.f111484f;
            db5.t7.i(mMActivity, mMActivity.getResources().getString(com.tencent.mm.R.string.f491805ea5), com.tencent.mm.R.raw.icons_filled_done);
        }
    }
}
