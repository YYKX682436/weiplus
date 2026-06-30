package im2;

/* loaded from: classes2.dex */
public final class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.f7 f292310d;

    public e7(im2.f7 f7Var) {
        this.f292310d = f7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        boolean z17;
        long j17;
        long j18;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse2;
        com.tencent.mars.xlog.Log.i("FinderLiveWatchCountDownUIC", "notify nearby requestRefresh : " + im2.f7.f292325m);
        if (im2.f7.f292325m != 0) {
            ys5.f fVar = (ys5.f) i95.n0.c(ys5.f.class);
            long j19 = im2.f7.f292325m;
            boolean z18 = this.f292310d.f292330f;
            sq2.g gVar = (sq2.g) fVar;
            gVar.getClass();
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str2 = a52.a.f1584l;
            com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "requestRefresh " + j19 + " isFromRed: " + z18 + " isEventRegist: " + gVar.f411351f + " scene: " + str2);
            gVar.f411350e = j19;
            gVar.f411352g = z18;
            if (gVar.f411351f) {
                str = str2;
                z17 = z18;
                com.tencent.mm.autogen.events.FinderNearbyRefreshEvent finderNearbyRefreshEvent = new com.tencent.mm.autogen.events.FinderNearbyRefreshEvent();
                j17 = j19;
                finderNearbyRefreshEvent.f54310g.f7612a = j17;
                finderNearbyRefreshEvent.e();
            } else {
                nq2.d dVar = nq2.d.f338980a;
                r45.dd2 dd2Var = new r45.dd2();
                dd2Var.set(0, 88890);
                pq2.e c17 = dVar.c(dd2Var);
                if (c17 != null) {
                    if (c17.f357585n != pq2.a.f357574h) {
                        az2.w wVar = c17.f357581g;
                        if (!(wVar != null && wVar.f16157a == 0 && wVar.f16158b == 0)) {
                            com.tencent.mars.xlog.Log.i(c17.f357578d, "fetchRelatedRecommendList getLoadingState: " + c17.f357585n);
                        }
                    }
                    int integer = c17.f357589p.getInteger(0) + 1005000 + c17.f357588o;
                    int integer2 = c17.f357589p.getInteger(0) + 1001;
                    java.lang.String str3 = c17.f357578d;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchRelatedRecommendList relatedObjectId: ");
                    sb6.append(j19);
                    sb6.append(" lastBuffer = ");
                    az2.w wVar2 = c17.f357581g;
                    sb6.append((wVar2 == null || (iResponse2 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar2.f16160d) == null) ? null : iResponse2.getLastBuffer());
                    com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                    r45.dd2 dd2Var2 = c17.f357589p;
                    az2.w wVar3 = c17.f357581g;
                    str = str2;
                    z17 = z18;
                    j18 = j19;
                    c17.j(new cp2.l(16, dd2Var2, (wVar3 == null || (iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar3.f16160d) == null) ? null : iResponse.getLastBuffer(), integer, integer2, c17.f357588o, null, 0, j19, null, 0, 1728, null), null);
                    j17 = j18;
                }
                str = str2;
                z17 = z18;
                j18 = j19;
                j17 = j18;
            }
            if (kotlin.jvm.internal.o.b(str, "135") || z17) {
                com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent finderNewEntranceNotifyInsertEvent = new com.tencent.mm.autogen.events.FinderNewEntranceNotifyInsertEvent();
                finderNewEntranceNotifyInsertEvent.f54311g.f7705a = j17;
                finderNewEntranceNotifyInsertEvent.e();
            }
        }
    }
}
