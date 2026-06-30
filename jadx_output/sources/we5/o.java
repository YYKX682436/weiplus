package we5;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f445362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f445363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ we5.v f445364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f445365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f445366h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f445367i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ rd5.d f445368m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f445369n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445370o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f445371p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yb5.d dVar, com.tencent.mm.storage.f9 f9Var, we5.v vVar, boolean z17, boolean z18, boolean z19, rd5.d dVar2, android.os.Bundle bundle, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2) {
        super(1);
        this.f445362d = dVar;
        this.f445363e = f9Var;
        this.f445364f = vVar;
        this.f445365g = z17;
        this.f445366h = z18;
        this.f445367i = z19;
        this.f445368m = dVar2;
        this.f445369n = bundle;
        this.f445370o = h0Var;
        this.f445371p = h0Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        int i17;
        android.widget.TextView autoTranslationText;
        com.tencent.mm.ui.chatting.viewitems.ao it = (com.tencent.mm.ui.chatting.viewitems.ao) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.LinearLayout linearLayout = it.f203394q;
        yb5.d ui6 = this.f445362d;
        if (linearLayout != null && (autoTranslationText = it.f203395r) != null) {
            we5.e eVar = we5.v.f445393x;
            kotlin.jvm.internal.o.f(autoTranslationText, "autoTranslationText");
            com.tencent.mm.storage.f9 f9Var = this.f445363e;
            android.app.Activity g17 = ui6.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            eVar.a(ui6, linearLayout, autoTranslationText, f9Var, g17);
        }
        we5.v vVar = this.f445364f;
        vVar.getClass();
        boolean z17 = this.f445365g;
        com.tencent.mm.storage.f9 f9Var2 = this.f445363e;
        if (z17 || this.f445366h || this.f445367i) {
            it.f203379b.setTag(com.tencent.mm.R.id.nwp, java.lang.Boolean.FALSE);
            it.f203379b.setOnTouchListener(it.f203387j);
            it.f203379b.setOnLongClickListener(vVar.u(vVar.f204055s));
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = it.f203379b;
            if (vVar.f204056t == null) {
                vVar.f204056t = new com.tencent.mm.ui.chatting.viewitems.zn(vVar.f204055s);
            }
            mMNeat7extView.setOnClickListener(vVar.f204056t);
        } else {
            int i18 = c01.ia.i(f9Var2);
            if (i18 <= 0 || i18 >= wl5.y.o(it.f203379b).length()) {
                i18 = 0;
            }
            com.tencent.mm.ui.chatting.viewitems.q0 u17 = vVar.u(vVar.f204055s);
            wl5.v x17 = vVar.x(u17);
            wl5.x xVar = it.f203386i;
            if (xVar != null) {
                xVar.c();
            }
            int[] iArr = new int[2];
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = it.f203379b;
            if (mMNeat7extView2 != null) {
                mMNeat7extView2.getLocationInWindow(iArr);
                int i19 = iArr[0];
                if (i19 == 0) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    it.f203379b.getGlobalVisibleRect(rect);
                    i19 = rect.left;
                }
                i17 = i19;
            } else {
                i17 = 0;
            }
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = it.f203379b;
            rl5.r rVar = it.f203385h;
            if (vVar.f204056t == null) {
                vVar.f204056t = new com.tencent.mm.ui.chatting.viewitems.zn(vVar.f204055s);
            }
            wl5.o oVar = new wl5.o(mMNeat7extView3, rVar, x17, vVar.f204056t, it.f203387j);
            oVar.f447123g = com.tencent.mm.R.color.a3y;
            oVar.f447124h = 18;
            oVar.f447122f = com.tencent.mm.R.color.f478860j6;
            if (i17 != 0) {
                oVar.a(i17 + com.tencent.mm.ui.zk.e(it.f203379b.getContext(), com.tencent.mm.R.dimen.f479688cn));
            }
            wl5.x xVar2 = new wl5.x(oVar);
            it.f203386i = xVar2;
            it.f203388k = new com.tencent.mm.ui.chatting.viewitems.wn(xVar2);
            xVar2.f447159d = new com.tencent.mm.ui.chatting.viewitems.hn(vVar);
            java.util.ArrayList arrayList = it.f203389l;
            if (arrayList.size() > 0) {
                java.util.ArrayList arrayList2 = it.f203386i.f447172q;
                arrayList2.clear();
                arrayList2.addAll(arrayList);
            }
            u17.f205293h = new com.tencent.mm.ui.chatting.viewitems.in(vVar, it);
            wl5.x xVar3 = it.f203386i;
            xVar3.C = i18;
            xVar3.Y = it.f203388k;
        }
        it.f203379b.setOnDoubleClickListener(vVar);
        it.f203379b.setTextListener(new com.tencent.mm.ui.chatting.viewitems.jn(vVar, it));
        android.os.Bundle bundle = this.f445369n;
        java.lang.String str2 = (java.lang.String) this.f445370o.f310123d;
        com.tencent.mm.ui.chatting.viewitems.io ioVar = (com.tencent.mm.ui.chatting.viewitems.io) this.f445371p.f310123d;
        rd5.d dVar = this.f445368m;
        com.tencent.mm.storage.f9 f9Var3 = dVar.f394254d.f445300b;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) && ioVar == com.tencent.mm.ui.chatting.viewitems.io.NoTransform) {
            com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate = it.f203382e;
            if (chattingItemTranslate != null) {
                chattingItemTranslate.setVisibility(8);
            }
            str = null;
        } else {
            if (it.f203382e == null) {
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate2 = (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) it.f203381d.inflate();
                it.f203382e = chattingItemTranslate2;
                chattingItemTranslate2.c();
            }
            str = null;
            it.f203382e.e(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).rj(it.f203379b.getContext(), str2, (int) it.f203379b.getTextSize(), 1, bundle, vVar.d0(f9Var3)), ioVar, f9Var3.getMsgId());
            it.f203382e.setBrandWording(com.tencent.mm.sdk.platformtools.t8.K0(f9Var3.U0()) ? vVar.f204055s.s().getString(com.tencent.mm.R.string.jxn) : f9Var3.U0());
            com.tencent.mm.ui.chatting.viewitems.q0 u18 = vVar.u(vVar.f204055s);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mm.ui.chatting.viewitems.go goVar = new com.tencent.mm.ui.chatting.viewitems.go(dVar, vVar.f204055s.D(), it, null);
                goVar.R = 2;
                it.f203382e.getContentView().setTag(goVar);
                com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate chattingItemTranslate3 = it.f203382e;
                if (vVar.f204056t == null) {
                    vVar.f204056t = new com.tencent.mm.ui.chatting.viewitems.zn(vVar.f204055s);
                }
                chattingItemTranslate3.setOnClickListener(vVar.f204056t);
                it.f203382e.setOnDoubleClickListener(vVar);
                it.f203382e.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) vVar.f204055s.f460708c.a(sb5.z.class))).B1);
                it.f203382e.setOnLongClickListener(vVar.u(vVar.f204055s));
                it.f203382e.setVisibility(0);
                if (it.f203390m == null) {
                    yb5.d dVar2 = vVar.f204055s;
                    com.tencent.mm.ui.chatting.viewitems.bo.e(dVar2, it, f9Var3, u18, vVar.x(vVar.u(dVar2)));
                }
            }
        }
        java.lang.String j17 = f9Var2 != null ? f9Var2.j() : str;
        kotlin.jvm.internal.o.g(ui6, "ui");
        java.lang.String x18 = ui6.x();
        if (f9Var2 == null || j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemTextFrom", "requestAutoTranslate talker is null or msg is null!");
        } else {
            go.d dVar3 = go.d.f273696a;
            if (dVar3.c(x18) == 2 && f9Var2.A0() == 0 && !f9Var2.i2() && com.tencent.mm.plugin.record.ui.l2.c(j17)) {
                if (!go.d.f273698c.containsKey(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                    dVar3.f(f9Var2);
                }
            }
        }
        java.lang.String str3 = f9Var2.G;
        if ((str3 == null ? "" : str3).contains("msg_wording")) {
            android.view.ViewStub viewStub = it.f203398u;
            if (viewStub != null) {
                if (it.f203399v == null) {
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) viewStub.inflate();
                    it.f203399v = linearLayout2;
                    it.f203400w = (android.widget.TextView) linearLayout2.findViewById(com.tencent.mm.R.id.sq6);
                }
                if (it.f203400w == null) {
                    android.widget.LinearLayout linearLayout3 = it.f203399v;
                    if (linearLayout3 != null) {
                        linearLayout3.setVisibility(8);
                    }
                } else {
                    c01.ea w17 = c01.w9.w(str3);
                    if (w17 == null || !w17.f37165x || com.tencent.mm.sdk.platformtools.t8.K0(w17.f37166y)) {
                        it.f203399v.setVisibility(8);
                    } else {
                        it.f203400w.setText(w17.f37166y);
                        it.f203399v.setVisibility(0);
                    }
                }
            }
        } else {
            android.widget.LinearLayout linearLayout4 = it.f203399v;
            if (linearLayout4 != null) {
                linearLayout4.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
