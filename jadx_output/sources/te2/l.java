package te2;

/* loaded from: classes3.dex */
public final class l implements te2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418179d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f418180e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f418181f;

    /* renamed from: g, reason: collision with root package name */
    public final qo0.c f418182g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.k0 f418183h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f418184i;

    /* renamed from: m, reason: collision with root package name */
    public kotlinx.coroutines.r2 f418185m;

    /* renamed from: n, reason: collision with root package name */
    public te2.b f418186n;

    /* renamed from: o, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f418187o;

    public l(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.view.k0 basePluginLayout) {
        kotlin.jvm.internal.o.g(viewRoot, "viewRoot");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(basePluginLayout, "basePluginLayout");
        this.f418179d = viewRoot;
        this.f418180e = context;
        this.f418181f = liveData;
        this.f418182g = statusMonitor;
        this.f418183h = basePluginLayout;
        this.f418184i = kotlinx.coroutines.z0.b();
        this.f418187o = kotlinx.coroutines.z0.b();
    }

    public static final void c(te2.l lVar, java.lang.String str, int i17, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mm.plugin.finder.live.util.o1 o1Var;
        lVar.getClass();
        dk2.u7 u7Var = dk2.u7.f234181a;
        ce2.i e17 = u7Var.e(str);
        boolean g17 = u7Var.g(e17);
        if (e17 == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg giftInfo is null,giftId:" + str + ",cnt:" + i17 + ",comboId:" + str2);
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.cj1 cj1Var = new r45.cj1();
        cj1Var.set(0, e17.field_rewardProductId);
        cj1Var.set(3, e17.c1());
        ch1Var.set(4, com.tencent.mm.protobuf.g.b(cj1Var.toByteArray()));
        r45.xn1 xn1Var = new r45.xn1();
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        java.util.LinkedList linkedList = null;
        java.util.LinkedList linkedList2 = c1Var != null ? c1Var.f328812h : null;
        if (linkedList2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : linkedList2) {
                if (((r45.yl1) obj).getInteger(0) != 4) {
                    arrayList.add(obj);
                }
            }
            linkedList = new java.util.LinkedList(arrayList);
        }
        xn1Var.set(11, linkedList);
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(0, r4Var.m0(lVar.f418181f));
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20009);
        com.tencent.mm.plugin.finder.live.util.l1 l1Var = new com.tencent.mm.plugin.finder.live.util.l1(ch1Var);
        l1Var.f115593h = str2;
        l1Var.f115594i = i17;
        l1Var.f115590e = i17 > 1 ? g17 ? com.tencent.mm.plugin.finder.live.util.m1.f115619d : com.tencent.mm.plugin.finder.live.util.m1.f115621f : g17 ? com.tencent.mm.plugin.finder.live.util.m1.f115620e : com.tencent.mm.plugin.finder.live.util.m1.f115622g;
        mm2.c1 c1Var2 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var2 == null || (str3 = c1Var2.f328852o) == null) {
            str3 = "";
        }
        l1Var.f115601s = str3;
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addLocalGiftMsg local add GiftShowInfo:" + l1Var);
        mm2.c1 c1Var3 = (mm2.c1) efVar.i(mm2.c1.class);
        if (c1Var3 == null || (o1Var = c1Var3.f328806g) == null) {
            return;
        }
        ((com.tencent.mm.plugin.finder.live.util.j1) o1Var).g(l1Var);
    }

    public static final void f(te2.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        java.lang.String str3;
        r45.kv1 kv1Var;
        java.util.List list;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment giftId:" + str + " comboCount:" + i17 + ",comboId:" + str2);
        if ((str == null || str.length() == 0) || i17 <= 0) {
            return;
        }
        if (str2 == null || str2.length() == 0) {
            return;
        }
        r45.ch1 ch1Var = new r45.ch1();
        r45.xn1 xn1Var = new r45.xn1();
        zl2.r4 r4Var = zl2.r4.f473950a;
        xn1Var.set(0, r4Var.m0(lVar.f418181f));
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        xn1Var.set(11, c1Var != null ? c1Var.f328812h : null);
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        ch1Var.set(13, xn1Var);
        ch1Var.set(1, 20013);
        dk2.j5 j5Var = new dk2.j5(ch1Var);
        j5Var.f233641d = true;
        r45.yh1 yh1Var = new r45.yh1();
        yh1Var.set(0, str);
        yh1Var.set(4, str2);
        yh1Var.set(3, java.lang.Integer.valueOf(i17));
        ce2.i e17 = dk2.u7.f234181a.e(str);
        yh1Var.set(1, e17 != null ? e17.c1() : null);
        j5Var.f233640c = yh1Var;
        mm2.x4 x4Var = (mm2.x4) efVar.i(mm2.x4.class);
        if (x4Var != null && (list = x4Var.f329528f) != null) {
            list.add(j5Var);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftBubblePresenter", "#addSelfGiftToComment comboCount:" + i17 + ",comboId:" + str2 + ",username:" + j5Var.a());
        no0.h.f338720a.a();
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = j5Var.k();
        r45.yh1 yh1Var2 = j5Var.f233640c;
        if (yh1Var2 == null || (kv1Var = (r45.kv1) yh1Var2.getCustom(1)) == null || (str3 = kv1Var.getString(8)) == null) {
            str3 = "";
        }
        objArr[1] = str3;
        objArr[2] = java.lang.String.valueOf(i17);
        java.lang.String string = lVar.f418180e.getString(com.tencent.mm.R.string.d_w, objArr);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        lVar.f418179d.announceForAccessibility(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if ((((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3713c4).getValue()).r()).intValue() == 1 ? true : r1.f328770i) == true) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.l.g():void");
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        te2.b callback = (te2.b) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f418186n = callback;
        ((te2.o) callback).f418265h = new te2.c(this);
    }

    @Override // fs2.a
    public void onDetach() {
        te2.b bVar = this.f418186n;
        if (bVar != null) {
            ((te2.o) bVar).a();
        }
        kotlinx.coroutines.r2 r2Var = this.f418185m;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
