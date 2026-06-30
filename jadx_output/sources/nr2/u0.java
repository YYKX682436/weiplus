package nr2;

/* loaded from: classes8.dex */
public final class u0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f339313d;

    /* renamed from: e, reason: collision with root package name */
    public az2.f f339314e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f339315f;

    /* renamed from: g, reason: collision with root package name */
    public nr2.m f339316g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f339317h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f339318i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Set f339319m;

    /* renamed from: n, reason: collision with root package name */
    public final l75.q0 f339320n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339313d = "";
        this.f339319m = new java.util.LinkedHashSet();
        this.f339320n = new nr2.m0(this);
    }

    public final void O6(android.view.View view, java.lang.String str) {
        boolean z17;
        kotlin.jvm.internal.o.g(view, "view");
        nr2.m mVar = this.f339316g;
        if (mVar == null) {
            return;
        }
        int i17 = mVar.i();
        long l17 = mVar.l();
        java.lang.String o17 = mVar.o();
        boolean p17 = mVar.p();
        boolean q17 = mVar.q();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z18 = false;
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17 || i17 <= 0 || l17 == 0) {
            return;
        }
        cu2.g0 g0Var = cu2.g0.f222404a;
        java.lang.Long l18 = (java.lang.Long) cu2.g0.f222405b.get(java.lang.Long.valueOf(l17));
        if (l18 != null && android.os.SystemClock.elapsedRealtime() - l18.longValue() > com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            z18 = true;
        }
        if (z18) {
            android.content.Context context = view.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = view.getContext().getString(com.tencent.mm.R.string.lq8);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "collectionWaiting");
            return;
        }
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        if (kotlin.jvm.internal.o.b(o17, xy2.c.e(context2))) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "is author");
            return;
        }
        if (g0Var.b(l17) == null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new nr2.o0(this, view, i17, l17, o17, p17, q17, str, null), 3, null);
            return;
        }
        android.content.Context context3 = view.getContext();
        int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context3);
        e4Var2.f211776c = mVar.p() ? view.getContext().getString(com.tencent.mm.R.string.lq6) : view.getContext().getString(com.tencent.mm.R.string.mgy);
        e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var2.c();
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPayUIC", "collectionDuplicate");
    }

    public final java.lang.Object P6(android.content.Context context, byte[] bArr, java.lang.String str, int i17, int i18, boolean z17, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue;
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = nVar;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        pr4.l lVar = new pr4.l(i17, (androidx.fragment.app.FragmentActivity) context, new nr2.p0(z17, h0Var), new nr2.q0(h0Var), new nr2.r0(h0Var));
        lVar.f358025f = pr4.k.f358017e;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        lVar.f358026g = bArr;
        java.lang.String string = context.getString(z17 ? com.tencent.mm.R.string.lq9 : com.tencent.mm.R.string.mgz);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        lVar.f358027h = string;
        java.lang.String string2 = context.getString(z17 ? com.tencent.mm.R.string.lqc : com.tencent.mm.R.string.f491343mh1);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        lVar.f358028i = string2;
        lVar.f358029j = i18;
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.m7p);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        lVar.f358032m = string3;
        java.lang.String string4 = context.getString(com.tencent.mm.R.string.m9s);
        kotlin.jvm.internal.o.f(string4, "getString(...)");
        lVar.f358033n = string4;
        if (z17) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_COURSE_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            booleanValue = ((java.lang.Boolean) m17).booleanValue();
        } else {
            java.lang.Object m18 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_DRAMA_PAY_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m18, "null cannot be cast to non-null type kotlin.Boolean");
            booleanValue = ((java.lang.Boolean) m18).booleanValue();
        }
        lVar.f358034o = booleanValue;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.getString(com.tencent.mm.R.string.emb));
        sb6.append("<_wc_custom_link_ href=\"https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/je7sPQCSulh7U9KS\">");
        sb6.append(context.getString(z17 ? com.tencent.mm.R.string.f491322lq4 : com.tencent.mm.R.string.mgx));
        sb6.append("</_wc_custom_link_>");
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        lVar.f358035p = sb7;
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).getClass();
        new ls4.u(lVar).f();
        java.lang.Object a17 = nVar.a();
        pz5.a aVar = pz5.a.f359186d;
        return a17;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(10:43|44|45|46|47|48|49|50|51|(1:53)(1:54))|19|20|21|(2:23|24)(5:25|(1:27)(1:33)|(1:29)|30|(1:32)(1:11))))|64|6|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q6(r45.qt2 r32, int r33, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.u0.Q6(r45.qt2, int, long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:(2:10|11)(2:13|14))(4:15|16|17|18))(10:43|44|45|46|47|48|49|50|51|(1:53)(1:54))|19|20|21|(2:23|24)(5:25|(1:27)(1:33)|(1:29)|30|(1:32)(1:11))))|64|6|(0)(0)|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a7, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R6(r45.qt2 r32, int r33, long r34, java.lang.String r36, java.lang.String r37, java.lang.String r38, kotlin.coroutines.Continuation r39) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.u0.R6(r45.qt2, int, long, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        long longExtra = getIntent().getLongExtra("paid_collection_feed_id", 0L);
        if (longExtra != 0) {
            this.f339313d = pm0.v.u(longExtra);
        }
        this.f339318i = getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false);
        byte[] byteArrayExtra = getContext().getIntent().getByteArrayExtra("paid_collection_info");
        if (byteArrayExtra != null) {
            com.tencent.mm.protobuf.f parseFrom = new r45.do2().parseFrom(byteArrayExtra);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderPaidCollectionInfo");
            this.f339316g = new nr2.m((r45.do2) parseFrom);
        }
        this.f339317h = getIntent().getBooleanExtra("paid_collection_drawer_mode", false);
        ((com.tencent.mm.plugin.finder.storage.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).getValue()).add(this.f339320n);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f339319m.clear();
        ((com.tencent.mm.plugin.finder.storage.bb0) ((jz5.n) ((c61.l7) i95.n0.c(c61.l7.class)).G).getValue()).remove(this.f339320n);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f339313d = "";
        this.f339319m = new java.util.LinkedHashSet();
        this.f339320n = new nr2.m0(this);
    }
}
