package ze5;

/* loaded from: classes9.dex */
public class ia extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: n, reason: collision with root package name */
    public static final android.util.SparseArray f472007n = new android.util.SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.Map f472008o = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView f472009b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f472010c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f472011d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMPinProgressBtn f472012e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f472013f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f472014g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f472015h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f472016i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.LinearLayout f472017j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f472018k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f472019l;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f472020m;

    public static boolean b() {
        return ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).aj();
    }

    public static z01.j0 c(z01.j0 j0Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar, android.content.Context context) {
        android.graphics.Bitmap b37;
        int i17;
        int i18;
        float f17;
        int i19;
        ot0.m1 m1Var;
        boolean z17 = f9Var.A0() != 1;
        j0Var.f469066g = f9Var.P0() == 5;
        j0Var.f469065f = f9Var.A0() == 1;
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        if (h17 == null) {
            h17 = new t21.v2();
        }
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
        ot0.m1 m1Var2 = null;
        if (f9Var.M2()) {
            ot0.q v17 = ot0.q.v(f9Var.U1());
            java.lang.String b17 = tv.a.b(v17.f348734z);
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b37 = m11.b1.Di().b3(b17, i65.a.g(context), context, com.tencent.mm.R.drawable.bzt);
            if (b37 == null) {
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(dVar);
                n11.a b18 = n11.a.b();
                java.lang.String str = v17.f348734z;
                o11.f fVar = new o11.f();
                fVar.f342082f = b17;
                fVar.f342078b = true;
                b18.d(str, fVar.a(), new ze5.fa(weakReference));
            }
            ot0.f fVar2 = (ot0.f) v17.y(ot0.f.class);
            if (fVar2 != null && (m1Var = fVar2.f348465l) != null) {
                h17.f415015m = m1Var.f373344i;
                m1Var2 = m1Var;
            }
        } else {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            b37 = m11.b1.Di().b3(tj6, i65.a.g(context), context, com.tencent.mm.R.drawable.bzt);
        }
        if (b37 == null) {
            int b19 = i65.a.b(context, 85);
            int h18 = i65.a.h(context, com.tencent.mm.R.dimen.f479593a3);
            if (f9Var.M2() && m1Var2 != null && (i17 = m1Var2.f373345m) > 0 && (i18 = m1Var2.f373346n) > 0) {
                if (i17 >= i18) {
                    b19 = i65.a.b(context, 150);
                    f17 = m1Var2.f373346n;
                    i19 = m1Var2.f373345m;
                } else {
                    b19 = i65.a.b(context, 150);
                    f17 = m1Var2.f373345m;
                    i19 = m1Var2.f373346n;
                }
                h18 = (int) ((f17 / i19) * b19);
            }
            j0Var.f469063d = com.tencent.mm.sdk.platformtools.x.s(com.tencent.mm.sdk.platformtools.x.q(context.getResources().getColor(com.tencent.mm.R.color.f479219t7), b19, h18), com.tencent.mm.R.drawable.bzt, b19, h18);
        } else {
            j0Var.f469063d = b37;
        }
        j0Var.f469068i = h17.f415008f;
        j0Var.f469069m = h17.f415015m;
        j0Var.f469067h = h17.f415011i;
        j0Var.f469070n = h17.k();
        if (!z17) {
            j0Var.f469075s = ai3.a.a(h17.f415016n);
            j0Var.f469077u = t21.d3.n(h17);
            j0Var.f469076t = t21.d3.v(f9Var.z0());
            if (j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoSendTranscodeProgress()) == 1 ? ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(h17.d()) : false) {
                j0Var.f469078v = true;
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
                float cj6 = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).cj(msgIdTalker);
                msgIdTalker.toString();
                j0Var.f469079w = cj6;
            }
        } else if (b()) {
            fk4.k a17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(f9Var.getMsgId());
            if (a17 != null ? a17.i() : false) {
                z01.i0 i0Var = j0Var.f469074r;
                i0Var.f469054d = true;
                i0Var.f469057g = z01.h0.f469048e;
                int m17 = t21.d3.m(h17);
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoItemHolder", "refresh origin video progress : " + m17);
                j0Var.f469074r.f469058h = m17;
            } else {
                com.tencent.mm.ui.chatting.gallery.p pVar = com.tencent.mm.ui.chatting.gallery.p.f201254a;
                fk4.k kVar = (fk4.k) com.tencent.mm.ui.chatting.gallery.p.f201255b.get(java.lang.Long.valueOf(f9Var.getMsgId()));
                if (kVar != null ? kVar.i() : false) {
                    z01.i0 i0Var2 = j0Var.f469074r;
                    i0Var2.f469054d = true;
                    i0Var2.f469057g = z01.h0.f469049f;
                    int g17 = t21.d3.g(h17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VideoItemHolder", "refresh video progress : " + g17);
                    j0Var.f469074r.f469058h = g17;
                } else {
                    j0Var.f469074r.f469054d = false;
                }
            }
        } else {
            j0Var.f469071o = com.tencent.mm.ui.chatting.gallery.l.f201163a.a(f9Var.getMsgId()) != null;
        }
        return j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0396  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.tencent.mm.ui.chatting.viewitems.a0 r24, ze5.ia r25, rd5.d r26, boolean r27, com.tencent.mm.ui.chatting.adapter.q r28, yb5.d r29, int r30, android.view.View.OnLongClickListener r31) {
        /*
            Method dump skipped, instructions count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.ia.d(com.tencent.mm.ui.chatting.viewitems.a0, ze5.ia, rd5.d, boolean, com.tencent.mm.ui.chatting.adapter.q, yb5.d, int, android.view.View$OnLongClickListener):void");
    }

    public static void e(yb5.d dVar, ze5.ia iaVar, boolean z17) {
        com.tencent.mm.pluginsdk.ui.i0 i0Var = ((com.tencent.mm.ui.chatting.component.v2) ((sb5.e) dVar.f460708c.a(sb5.e.class))).f200111m;
        if (i0Var == null || !i0Var.f190870e) {
            iaVar.f472015h.setBackgroundResource(com.tencent.mm.R.drawable.f481242o8);
            iaVar.f472013f.setTextColor(i65.a.d(dVar.g(), com.tencent.mm.R.color.BW_0_Alpha_0_3));
        } else {
            iaVar.f472015h.setBackgroundResource(com.tencent.mm.R.drawable.f481243o9);
            iaVar.f472013f.setTextColor(i65.a.d(dVar.g(), com.tencent.mm.R.color.BW_0_Alpha_0_5));
        }
        iaVar.f472015h.getViewTreeObserver().addOnPreDrawListener(new ze5.ha(iaVar, z17));
    }

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view, boolean z17) {
        super.create(view);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.f472010c = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bkq);
        this.f472011d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483695br0);
        this.f472012e = (com.tencent.mm.ui.widget.MMPinProgressBtn) view.findViewById(com.tencent.mm.R.id.bku);
        this.f472013f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brj);
        this.f472014g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bri);
        this.f472015h = view.findViewById(com.tencent.mm.R.id.brh);
        this.f472016i = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.oy_);
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f472017j = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483679sr2);
        this.f472018k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483681sr4);
        this.f472019l = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.f483680sr3);
        this.f472009b = (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingVideoMvvmView) view.findViewById(com.tencent.mm.R.id.srv);
        this.f472020m = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485998ui2);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.otv);
        q31.n T6 = ((io.a0) ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi()).T6(null);
        android.view.View a17 = ((io.t) T6).a(view.getContext());
        viewGroup.addView(a17);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) a17.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        a17.setLayoutParams(layoutParams);
        if (z17) {
            layoutParams.gravity = 3;
        } else {
            layoutParams.gravity = 5;
        }
        lf5.g.a(a17, true, z17);
        setQuoteView(T6);
        return this;
    }
}
