package vd2;

@j95.b
/* loaded from: classes3.dex */
public final class f1 extends i95.w implements ss5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f435725d = "Finder.FinderEnterLiveFeatureService";

    public jz5.l Ai(java.util.ArrayList data, so2.j5 clickFeed) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(clickFeed, "clickFeed");
        return zl2.l.f473865a.d(data, clickFeed, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Bi(android.content.Context context, android.content.Intent intent, java.lang.String anchorUserName, im5.b bVar, java.lang.Object finderLiveBundle, ss5.d0 d0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(finderLiveBundle, "finderLiveBundle");
        if ((anchorUserName.length() == 0) == true || !(finderLiveBundle instanceof dk2.x4)) {
            com.tencent.mars.xlog.Log.w(this.f435725d, "enterLiveC2 anchorUserName is empty");
            return;
        }
        dk2.x4 x4Var = (dk2.x4) finderLiveBundle;
        r45.ta4 ta4Var = x4Var.B;
        if (ta4Var == null) {
            ta4Var = new r45.ta4();
        }
        x4Var.B = ta4Var;
        java.util.LinkedList list = ta4Var.getList(20);
        if (list != null) {
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, "EnterLive");
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            list.add(qa4Var);
        }
        if (intent == null) {
            intent = new android.content.Intent();
        }
        android.content.Intent intent2 = intent;
        pq5.g l17 = new ek2.y0(anchorUserName, null, 2, 0 == true ? 1 : 0).l();
        l17.f(bVar);
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.K(new vd2.b1(d0Var, context, this, intent2, finderLiveBundle));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void Di(android.content.Context context, android.content.Intent intent, java.lang.String anchorUserName, im5.b bVar, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(enterLiveParams, "enterLiveParams");
        if (anchorUserName.length() == 0) {
            com.tencent.mars.xlog.Log.w(this.f435725d, "enterLiveC1 anchorUserName is empty");
            return;
        }
        zl2.l lVar = zl2.l.f473865a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveC1");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        pq5.g l17 = new ek2.y0(anchorUserName, null, 2, 0 == true ? 1 : 0).l();
        if (bVar != null) {
            l17.f(bVar);
        }
        l17.K(new vd2.z0(d0Var, context, this, intent2, enterLiveParams, intent));
    }

    public void Ni(android.content.Context context, android.content.Intent intent, java.util.List feedList, int i17, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        r45.nw1 liveInfo;
        java.lang.String string;
        int i18 = i17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedList, "feedList");
        kotlin.jvm.internal.o.g(enterLiveParams, "enterLiveParams");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(feedList);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(arrayList, i18);
        boolean isEmpty = arrayList.isEmpty();
        java.lang.String str = this.f435725d;
        if (isEmpty || arrayList.size() < i18 || finderObject == null) {
            com.tencent.mars.xlog.Log.i(str, "feeds size:" + arrayList.size() + ", curPos:" + i18);
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enterLiveA feeds size:");
        sb6.append(arrayList.size());
        sb6.append(", curPos:");
        sb6.append(i18);
        sb6.append(", feedId:");
        sb6.append(pm0.v.u(finderObject.getId()));
        sb6.append(", liveId:");
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        int i19 = 0;
        sb6.append(pm0.v.u(liveInfo2 != null ? liveInfo2.getLong(0) : 0L));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            arrayList.clear();
            arrayList.add(finderObject);
            if (sl2.h.f409251a.c(context, finderObject)) {
                return;
            } else {
                i18 = 0;
            }
        }
        zl2.l lVar = zl2.l.f473865a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveA");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        java.lang.String username = finderObject.getUsername();
        int i27 = 8;
        if (!(username == null || username.length() == 0) && kotlin.jvm.internal.o.b(finderObject.getUsername(), xy2.c.e(context))) {
            com.tencent.mars.xlog.Log.i(str, "enterLiveA anchor");
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            if (liveInfo3 != null) {
                intent2.putExtra("KEY_PARAMS_SOURCE_TYPE", liveInfo3.getInteger(12));
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long id6 = finderObject.getId();
            r45.nw1 liveInfo4 = finderObject.getLiveInfo();
            java.lang.Long valueOf = java.lang.Long.valueOf(liveInfo4 != null ? liveInfo4.getLong(0) : 0L);
            java.lang.String objectNonceId = finderObject.getObjectNonceId();
            java.lang.String str2 = objectNonceId == null ? "" : objectNonceId;
            java.lang.String string2 = enterLiveParams.getString(0);
            java.lang.String str3 = string2 == null ? "" : string2;
            java.lang.String sessionBuffer = finderObject.getSessionBuffer();
            r45.y74 y74Var = (r45.y74) enterLiveParams.getCustom(6);
            ((com.tencent.mm.feature.finder.live.v4) w0Var).oj(intent2, context, id6, valueOf, str2, "", str3, sessionBuffer, (y74Var == null || (string = y74Var.getString(8)) == null) ? "" : string);
            return;
        }
        com.tencent.mm.plugin.finder.report.q5 q5Var = new com.tencent.mm.plugin.finder.report.q5();
        q5Var.f125268a = java.lang.System.currentTimeMillis();
        q5Var.f125273f = false;
        com.tencent.mm.plugin.finder.report.r5.f125336b = q5Var;
        com.tencent.mm.plugin.finder.report.q1.f125258d = null;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 0L;
        com.tencent.mm.plugin.finder.report.q1.f125259e = false;
        com.tencent.mm.plugin.finder.report.q1.f125261g = true;
        com.tencent.mm.plugin.finder.report.p1 p1Var = new com.tencent.mm.plugin.finder.report.p1();
        p1Var.f125230a = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.finder.report.q1.f125258d = p1Var;
        com.tencent.mm.plugin.finder.report.q1.f125256b = 1L;
        com.tencent.mm.plugin.finder.report.q1.f125257c = 1L;
        p1Var.f125231b = 0L;
        p1Var.f125232c = 0L;
        p1Var.f125233d = 0L;
        p1Var.f125234e = 0L;
        p1Var.f125235f = 0L;
        s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) kz5.n0.a0(arrayList, i18);
        if (finderObject2 != null && (liveInfo = finderObject2.getLiveInfo()) != null) {
            r8 = liveInfo.getLong(0);
        }
        ((com.tencent.mm.feature.finder.live.v4) w0Var2).Bk(r8);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (java.lang.Object obj : arrayList) {
            int i28 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            int i29 = i27;
            com.tencent.mm.live.api.LiveConfig c17 = zl2.l.c(lVar, (com.tencent.mm.protocal.protobuf.FinderObject) obj, 0, false, 6, null);
            if (i19 == i18) {
                if (c17.f68546p0 == null) {
                    c17.f68546p0 = new r45.v74();
                }
                r45.v74 v74Var = c17.f68546p0;
                if (v74Var != null) {
                    v74Var.set(2, (r45.u74) enterLiveParams.getCustom(i29));
                }
            }
            arrayList2.add(c17);
            i19 = i28;
            i27 = i29;
        }
        Ui(i18, arrayList2, enterLiveParams, intent2, finderObject, d0Var, context);
    }

    public void Ri(android.content.Context context, android.content.Intent intent, r45.m84 feedInfo, boolean z17, r45.wk0 enterLiveParams, ss5.d0 d0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(feedInfo, "feedInfo");
        kotlin.jvm.internal.o.g(enterLiveParams, "enterLiveParams");
        if (feedInfo.getLong(0) == 0) {
            com.tencent.mars.xlog.Log.i(this.f435725d, "enterLiveB params invalid, feedInfo.objectId:" + feedInfo.getLong(0) + ", feedInfo.liveId:" + feedInfo.getLong(1));
            return;
        }
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", "LiveFeedInfo.logInfo enterLiveB, objectId: " + pm0.v.u(feedInfo.getLong(0)) + ", liveId: " + pm0.v.u(feedInfo.getLong(1)) + ", nonceId: " + feedInfo.getString(2) + ", anchorUsername: " + feedInfo.getString(3) + ", desc: " + feedInfo.getString(5) + ", sessionBuffer: " + feedInfo.getString(4) + ", ");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveFeedInfo.logInfo enterLiveB, backupLiveInfo : ");
        r45.nw1 nw1Var = (r45.nw1) feedInfo.getCustom(6);
        sb6.append(nw1Var != null ? nw1Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
        zl2.l lVar = zl2.l.f473865a;
        lVar.f(enterLiveParams);
        lVar.g(enterLiveParams, "enterLiveB");
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, kotlinx.coroutines.a1.UNDISPATCHED, new vd2.x0(intent, feedInfo, isTeenMode, context, this, d0Var, enterLiveParams, null), 1, null);
    }

    public final void Ui(int i17, java.util.List list, r45.wk0 wk0Var, android.content.Intent intent, com.tencent.mm.protocal.protobuf.FinderObject finderObject, ss5.d0 d0Var, android.content.Context context) {
        r45.nw1 liveInfo;
        zl2.l lVar = zl2.l.f473865a;
        dk2.x4 a17 = lVar.a(wk0Var);
        a17.f234315i = i17;
        long j17 = 0;
        a17.A = finderObject != null ? finderObject.getId() : 0L;
        a17.f234318l.addAll(list);
        if (finderObject != null && (liveInfo = finderObject.getLiveInfo()) != null) {
            j17 = liveInfo.getLong(0);
        }
        lVar.e(a17, i17, j17, intent);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String string = wk0Var.getString(0);
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = wk0Var.getString(1);
        int N8 = c61.zb.N8(zbVar, context, a17, str, string2 == null ? "" : string2, intent, wk0Var.getBoolean(2), null, 64, null);
        if (N8 == 0) {
            if (d0Var != null) {
                d0Var.a();
            }
        } else if (d0Var != null) {
            d0Var.onFailed(N8);
        }
    }

    public boolean wi(android.content.Context context, boolean z17) {
        boolean z18 = !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        if (!z18 && z17 && context != null) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(context);
        }
        return z18;
    }
}
