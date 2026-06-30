package vd2;

/* loaded from: classes3.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent f435977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f435978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent finderLiveSwipeToNextEvent, com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f435977d = finderLiveSwipeToNextEvent;
        this.f435978e = finderLiveViewCallback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.n nVar;
        java.util.ArrayList arrayList;
        int i17;
        km2.n nVar2;
        com.tencent.mars.xlog.Log.w("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: event feedId " + this.f435977d.f54298g.f6346a + " hint " + this.f435977d.f54298g.f6347b);
        long j17 = this.f435977d.f54298g.f6346a;
        androidx.recyclerview.widget.f2 adapter = this.f435978e.f111492q.getAdapter();
        java.lang.Integer num = null;
        num = null;
        vd2.s1 s1Var = adapter instanceof vd2.s1 ? (vd2.s1) adapter : null;
        if (s1Var != null && (nVar = s1Var.f435902e) != null && (arrayList = nVar.f309153e) != null) {
            com.tencent.mm.autogen.events.FinderLiveSwipeToNextEvent finderLiveSwipeToNextEvent = this.f435977d;
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f435978e;
            synchronized (arrayList) {
                java.util.Iterator it = arrayList.iterator();
                int i18 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    com.tencent.mm.live.api.LiveConfig b17 = ((km2.t) it.next()).b();
                    if ((b17 != null && b17.f68549s == j17) == true) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
                if (i17 != -1) {
                    if (i17 >= arrayList.size()) {
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: finish directly");
                        gk2.e eVar = gk2.e.f272471n;
                        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
                        if (c1Var != null) {
                            c1Var.O1 = false;
                        }
                        java.lang.String str = finderLiveSwipeToNextEvent.f54298g.f6347b;
                        kotlin.jvm.internal.o.d(str);
                        java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
                        if (str2 != null) {
                            db5.t7.g(finderLiveViewCallback.f111492q.getContext(), str2);
                        }
                        finderLiveViewCallback.f111484f.finish();
                    } else {
                        if (finderLiveViewCallback.f111486h != null && (nVar2 = dk2.ef.H) != null) {
                            num = java.lang.Integer.valueOf(nVar2.d());
                        }
                        java.lang.Integer num2 = num;
                        if (num2 != null && num2.intValue() == i17) {
                            finderLiveViewCallback.z(i17 + 1, 400);
                            finderLiveViewCallback.f111492q.postDelayed(new vd2.v3(arrayList, finderLiveViewCallback, i17, finderLiveSwipeToNextEvent, j17), 450L);
                            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: remove feedId=" + j17 + ", curIndex=" + i17 + ", flowCurPos=" + num2 + ", hint=" + finderLiveSwipeToNextEvent.f54298g.f6347b);
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.Iterator it6 = arrayList.iterator();
                        while (it6.hasNext()) {
                            km2.m mVar = ((km2.t) it6.next()).f309222d;
                            if (mVar != null) {
                                arrayList2.add(mVar);
                            }
                        }
                        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback.j(finderLiveViewCallback, i17, new java.util.ArrayList(arrayList2));
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "LiveSwipeToNextListener: remove feedId=" + j17 + ", curIndex=" + i17 + ", flowCurPos=" + num2 + ", hint=" + finderLiveSwipeToNextEvent.f54298g.f6347b);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
