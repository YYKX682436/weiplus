package sq2;

@j95.b
/* loaded from: classes2.dex */
public final class g extends i95.w implements ys5.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse f411349d;

    /* renamed from: e, reason: collision with root package name */
    public long f411350e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f411351f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f411352g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f411353h = "";

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f411354i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f411355m;

    /* renamed from: n, reason: collision with root package name */
    public long f411356n;

    /* JADX WARN: Removed duplicated region for block: B:100:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Ai(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq2.g.Ai(java.lang.String):boolean");
    }

    public boolean Bi() {
        r45.wo1 wo1Var;
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("FinderLiveEntrance");
        java.lang.Long l17 = null;
        r45.xs2 xs2Var = L0 != null ? L0.N : null;
        cq2.q qVar = cq2.q.f221428a;
        if (xs2Var != null && (wo1Var = (r45.wo1) xs2Var.getCustom(30)) != null) {
            l17 = java.lang.Long.valueOf(wo1Var.getLong(1));
        }
        boolean z17 = l17 != null && pm0.v.A(l17.longValue(), (long) 1) && pm0.v.A(l17.longValue(), (long) 128);
        com.tencent.mars.xlog.Log.i("NewSquarePreloadUtil", "isEnablePredict: isEnableRedDotPredict=" + z17 + " preloadControlFlag=" + l17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreloadImmediately enablePreloadImmediately=");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", sb6.toString());
        return z17;
    }

    public void Di() {
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse;
        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse2;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f1584l;
        com.tencent.mars.xlog.Log.i("NearbyRefreshServiceImp", "notifyDataChange " + this.f411349d + " objectId: " + this.f411350e + " scene: " + str);
        com.tencent.mm.protobuf.g gVar = null;
        if (this.f411352g && this.f411349d == null) {
            nq2.d dVar = nq2.d.f338980a;
            r45.dd2 dd2Var = new r45.dd2();
            dd2Var.set(0, 88890);
            pq2.e c17 = dVar.c(dd2Var);
            if (c17 != null) {
                if (c17.f357593t == null) {
                    com.tencent.mars.xlog.Log.e(c17.f357578d, "appendRelatedRecommendList relatedRecommendResponse = null");
                } else {
                    az2.w wVar = c17.f357581g;
                    java.util.List incrementList = (wVar == null || (iResponse2 = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar.f16160d) == null) ? null : iResponse2.getIncrementList();
                    java.util.ArrayList arrayList = incrementList instanceof java.util.ArrayList ? (java.util.ArrayList) incrementList : null;
                    cp2.m mVar = c17.f357593t;
                    java.util.List<so2.j5> incrementList2 = mVar != null ? mVar.getIncrementList() : null;
                    if (arrayList == null || incrementList2 == null) {
                        com.tencent.mars.xlog.Log.e(c17.f357578d, "appendRelatedRecommendList list = null");
                    } else {
                        com.tencent.mars.xlog.Log.i(c17.f357578d, "dataList:\n " + hc2.o0.p(arrayList) + " \n newList: \n " + hc2.o0.p(incrementList2));
                        java.util.Iterator it = arrayList.iterator();
                        int i17 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i17 = -1;
                                break;
                            }
                            so2.j5 j5Var = (so2.j5) it.next();
                            if ((j5Var instanceof so2.h4) && kotlin.jvm.internal.o.b(((so2.h4) j5Var).f410400d.getString(1), com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.h6n))) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                        if (!(valueOf.intValue() != -1)) {
                            valueOf = null;
                        }
                        int intValue = valueOf != null ? valueOf.intValue() : 0;
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        for (so2.j5 j5Var2 : incrementList2) {
                            java.util.Iterator it6 = arrayList.iterator();
                            int i18 = 0;
                            while (true) {
                                if (!it6.hasNext()) {
                                    i18 = -1;
                                    break;
                                } else if (((so2.j5) it6.next()).d(j5Var2) == 0) {
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                            if (!(valueOf2.intValue() == -1)) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                valueOf2.intValue();
                                linkedList.add(j5Var2);
                            }
                        }
                        az2.w wVar2 = c17.f357581g;
                        com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse3 = wVar2 != null ? (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar2.f16160d : null;
                        if (iResponse3 != null) {
                            cp2.m mVar2 = c17.f357593t;
                            iResponse3.setLastBuffer(mVar2 != null ? mVar2.getLastBuffer() : null);
                        }
                        java.lang.String str2 = c17.f357578d;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mergeInsertData startIndex = ");
                        sb6.append(intValue);
                        sb6.append(", incrementSize: ");
                        sb6.append(linkedList.size());
                        sb6.append(" lastBuffer = ");
                        az2.w wVar3 = c17.f357581g;
                        if (wVar3 != null && (iResponse = (com.tencent.mm.plugin.finder.feed.model.internal.IResponse) wVar3.f16160d) != null) {
                            gVar = iResponse.getLastBuffer();
                        }
                        sb6.append(gVar);
                        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                        arrayList.addAll(intValue + 1, linkedList);
                    }
                }
            }
        } else if (this.f411349d != null) {
            com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent finderNearbyDataUpdateEvent = new com.tencent.mm.autogen.events.FinderNearbyDataUpdateEvent();
            com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse4 = this.f411349d;
            am.oc ocVar = finderNearbyDataUpdateEvent.f54309g;
            ocVar.f7522c = iResponse4;
            ocVar.f7520a = this.f411350e;
            ocVar.f7521b = this.f411352g;
            finderNearbyDataUpdateEvent.e();
            this.f411349d = null;
        }
        if (kotlin.jvm.internal.o.b(str, "135") || this.f411352g) {
            com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent finderNewSquareDataUpdateEvent = new com.tencent.mm.autogen.events.FinderNewSquareDataUpdateEvent();
            long j17 = this.f411350e;
            am.rc rcVar = finderNewSquareDataUpdateEvent.f54312g;
            rcVar.f7805a = j17;
            rcVar.f7806b = this.f411352g;
            finderNewSquareDataUpdateEvent.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x01a3, code lost:
    
        if (r14 != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01b6, code lost:
    
        if (r6.i() != false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0321 A[EDGE_INSN: B:375:0x0321->B:376:0x0321 BREAK  A[LOOP:1: B:366:0x0301->B:393:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:393:? A[LOOP:1: B:366:0x0301->B:393:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0911  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void wi(ys5.e r50, float r51, ws5.h r52) {
        /*
            Method dump skipped, instructions count: 2798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sq2.g.wi(ys5.e, float, ws5.h):void");
    }
}
