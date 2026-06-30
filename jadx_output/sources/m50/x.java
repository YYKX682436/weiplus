package m50;

/* loaded from: classes.dex */
public abstract class x extends wm3.a {

    /* renamed from: r, reason: collision with root package name */
    public static final m50.a f323511r = new m50.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f323512d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f323513e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f323514f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f323515g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f323516h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f323517i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f323518m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f323519n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f323520o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f323521p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f323522q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f323512d = jz5.h.b(new m50.w(this));
        this.f323513e = new java.util.ArrayList();
        this.f323516h = jz5.h.b(new m50.p(this));
        this.f323517i = jz5.h.b(new m50.b(this));
        this.f323518m = jz5.h.b(new m50.o(this));
        this.f323519n = jz5.h.b(new m50.q(this));
        this.f323520o = jz5.h.b(new m50.d(this));
        this.f323521p = jz5.h.b(new m50.t(this));
        this.f323522q = jz5.h.b(new m50.e(this));
    }

    public static final void T6(m50.x xVar, xi5.e eVar, int i17, yz5.a aVar) {
        xVar.getClass();
        if (!(j62.e.g().c(new com.tencent.mm.repairer.config.forward.RepairerConfigForwardToOtherAppsRename()) == 1)) {
            aVar.invoke();
            return;
        }
        boolean z17 = eVar.f454741b == 1;
        java.lang.String string = z17 ? xVar.getContext().getString(com.tencent.mm.R.string.n48) : xVar.getContext().getString(com.tencent.mm.R.string.n4j);
        kotlin.jvm.internal.o.d(string);
        java.lang.String string2 = xVar.getContext().getString(com.tencent.mm.R.string.g_7, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wecom_popup", "view_exp", kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), i17), kz5.b1.e(new jz5.l("share_type", 14))), 32337);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("app_jump_wegov_popup", "view_exp", kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(xVar.c7(), xVar.g7(), i17), kz5.b1.e(new jz5.l("share_type", 15))), 32337);
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(xVar.getActivity());
        u1Var.g(string2);
        u1Var.n(xVar.getContext().getString(com.tencent.mm.R.string.o79));
        u1Var.j(xVar.getContext().getString(com.tencent.mm.R.string.f490347sg));
        u1Var.l(new m50.u(z17, xVar, i17, aVar));
        u1Var.i(new m50.v(z17, xVar, i17));
        u1Var.q(false);
    }

    public boolean U6() {
        return true;
    }

    public abstract co.a V6();

    public java.lang.String W6() {
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X6(java.util.List r26) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m50.x.X6(java.util.List):void");
    }

    public final void Y6(boolean z17, boolean z18, java.lang.String str) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.B3(new xi5.b(null, null, null, java.lang.Boolean.valueOf(z17), str, z18, 7, null));
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SendMsgUsernames", this.f323513e);
        getActivity().setResult(-1, intent);
        getActivity().finish();
    }

    public final ot0.q Z6() {
        return (ot0.q) ((jz5.n) this.f323517i).getValue();
    }

    public final int a7() {
        return ((java.lang.Number) ((jz5.n) this.f323522q).getValue()).intValue();
    }

    public int b7() {
        return 0;
    }

    public final co.a c7() {
        return (co.a) ((jz5.n) this.f323518m).getValue();
    }

    public final java.lang.String d7() {
        return (java.lang.String) ((jz5.n) this.f323516h).getValue();
    }

    public final com.tencent.mm.storage.f9 e7() {
        return (com.tencent.mm.storage.f9) ((jz5.n) this.f323519n).getValue();
    }

    public final java.lang.Class f7() {
        ek5.b bVar;
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        co.a model = c7();
        ((dk5.y) a0Var).getClass();
        kotlin.jvm.internal.o.g(model, "model");
        java.util.Iterator it = ek5.g.f253690a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            }
            bVar = (ek5.b) it.next();
            if (kotlin.jvm.internal.o.b(model.getClass(), bVar.h())) {
                break;
            }
        }
        java.lang.Class f17 = bVar != null ? bVar.f() : null;
        kotlin.jvm.internal.o.e(f17, "null cannot be cast to non-null type java.lang.Class<out com.tencent.mm.feature.forward.preview.BaseForwardMsgPreviewUIC<MODEL of com.tencent.mm.feature.forward.entry.BaseForwardUIC>>");
        return f17;
    }

    public final int g7() {
        return ((java.lang.Number) ((jz5.n) this.f323521p).getValue()).intValue();
    }

    public void h7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleClawBotForward: clawUserName is null or empty, talker=");
            co.a c76 = c7();
            sb6.append(c76.getString(c76.f43702d + 1));
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseForwardUIC", sb6.toString());
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        X6(arrayList);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("handleClawBotForward: toUser=");
        sb7.append(str);
        sb7.append(", talker=");
        co.a c77 = c7();
        sb7.append(c77.getString(c77.f43702d + 1));
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseForwardUIC", sb7.toString());
    }

    public void i7() {
        xj.m mVar;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        rd0.k1 k1Var = (rd0.k1) i95.n0.c(rd0.k1.class);
        jt.c0 c0Var = (jt.c0) i95.n0.c(jt.c0.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ((com.tencent.mm.ui.chatting.fd) k1Var).getClass();
        if (com.tencent.mm.ui.chatting.hd.k()) {
            arrayList.add(k50.o0.f304243d);
        }
        if (com.tencent.mm.ui.chatting.hd.j()) {
            arrayList.add(k50.o0.f304244e);
        }
        ((ht.w) c0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.h4.f189337a.a(context)) {
            arrayList.add(k50.o0.f304245f);
        }
        k50.g0.f304214a.c(arrayList, k50.l0.f304238d);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            linkedHashMap.put((k50.o0) next, java.lang.Integer.valueOf(i18));
            i17 = i18;
        }
        java.lang.Integer num = (java.lang.Integer) linkedHashMap.get(k50.o0.f304243d);
        if (num != null) {
            java.util.Map m17 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(num.intValue()))));
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWecomBtnExp: " + m17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wecom_btn", "view_exp", m17, 32337);
        }
        java.lang.Integer num2 = (java.lang.Integer) linkedHashMap.get(k50.o0.f304244e);
        if (num2 != null) {
            java.util.Map m18 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(num2.intValue()))));
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherWeGovBtnExp: " + m18);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_wegov_btn", "view_exp", m18, 32337);
        }
        java.lang.Integer num3 = (java.lang.Integer) linkedHashMap.get(k50.o0.f304245f);
        if (num3 != null) {
            int intValue = num3.intValue();
            com.tencent.mm.ui.chatting.component.zp zpVar = ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).f363278t;
            if (zpVar != null && !zpVar.f200402c && (mVar = zpVar.f200400a) != null) {
                zpVar.f200402c = true;
                zpVar.f200401b = mVar;
                ((wj.j0) ((xj.i) ((jz5.n) zpVar.f200404e).getValue())).mj(mVar.f454753a, wj.w0.f446541d, null);
            }
            java.util.Map m19 = kz5.c1.m(com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(c7(), g7(), a7()), kz5.b1.e(new jz5.l("forward_other_app_index", java.lang.Integer.valueOf(intValue))));
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardReportHelper", "reportForwardOtherYuanBaoBtnExp: " + m19);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_other_yuanbao_btn", "view_exp", m19, 32337);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("forward_to_other_app_page_sheet", "view_exp", com.tencent.mm.ui.mvvm.uic.conversation.recent.e.f209294a.a(c7(), g7(), a7()), 32337);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT", ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).ij());
        pf5.j0.a(intent, k50.y0.class);
        bh5.c cVar = new bh5.c();
        cVar.d(intent);
        cVar.f20922a.f20924a = getContext();
        cVar.f(false);
        cVar.e(true);
        cVar.a(com.tencent.mm.ui.container.MMCommonActivity.class.getName());
        cVar.b(com.tencent.mm.ui.halfscreen.MMHalfScreenMaxHeightDialogFragment.class);
        cVar.i(new m50.i(this));
    }

    public abstract boolean k7(xi5.e eVar);

    public void l7() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseForwardUIC", "handleYuanBaoForward called in non-MM process, abort");
            return;
        }
        com.tencent.mm.storage.f9 e76 = e7();
        if (e76 == null) {
            com.tencent.mm.ui.widget.dialog.f fVar = new com.tencent.mm.ui.widget.dialog.f(0L, 1, null);
            kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
            fVar.b(getContext(), getContext().getString(com.tencent.mm.R.string.pag), true, 0, new m50.k(c0Var, kotlinx.coroutines.l.d(getLifecycleScope(), null, null, new m50.n(this, fVar, c0Var, null), 3, null)));
        } else {
            boolean z17 = g7() == 1;
            co.a c76 = c7();
            ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).fj(getContext(), kz5.b0.c(e76), ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().q(c76.getString(c76.f43702d + 1)), z17, new m50.j(this));
        }
    }

    public boolean m7() {
        return getIntent().getBooleanExtra("ForwardParams_EnableContentClick", true);
    }

    public void n7() {
    }

    public void o7(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        wi5.n0 n0Var;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null && (n0Var = (wi5.n0) stateCenter2.getState()) != null) {
            n0Var.f446324t = c7();
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.L2(getActivity(), new m50.s(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((qg5.z2) ((ct.j3) i95.n0.c(ct.j3.class))).cj();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (this.f323515g) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finish_by_forward_to_wework", true);
            getActivity().setResult(0, intent);
            getActivity().finish();
        }
    }

    public java.lang.String p7() {
        return null;
    }
}
