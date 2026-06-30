package yr3;

/* loaded from: classes11.dex */
public final class k0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final wr3.t0 f464894d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f464895e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f464896f;

    /* renamed from: g, reason: collision with root package name */
    public final int f464897g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f464898h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f464899i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f464900m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f464901n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f464902o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f464903p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f464904q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f464905r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f464906s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f464907t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMNeat7extView f464908u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f464909v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f464910w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(wr3.t0 adapter, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f464894d = adapter;
        this.f464895e = "FeaturedMsgSingleTextViewHolder";
        this.f464896f = adapter.f448879m;
        this.f464897g = 5;
        this.f464898h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cb9);
        this.f464899i = (android.widget.ImageView) itemView.findViewById(com.tencent.mm.R.id.syb);
        this.f464900m = itemView.findViewById(com.tencent.mm.R.id.f483878cb1);
        this.f464901n = itemView.findViewById(com.tencent.mm.R.id.t_g);
        this.f464902o = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.t_m);
        this.f464903p = itemView.findViewById(com.tencent.mm.R.id.t_s);
        this.f464904q = itemView.findViewById(com.tencent.mm.R.id.syc);
        this.f464905r = itemView.findViewById(com.tencent.mm.R.id.cbi);
        this.f464906s = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.cbk);
        this.f464907t = (com.tencent.mm.ui.widget.MMNeat7extView) itemView.findViewById(com.tencent.mm.R.id.rds);
        this.f464908u = (com.tencent.mm.ui.widget.MMNeat7extView) itemView.findViewById(com.tencent.mm.R.id.aro);
        this.f464909v = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.arp);
        this.f464910w = itemView.findViewById(com.tencent.mm.R.id.f486223uo2);
    }

    public final void i(java.lang.String str, r45.s5 s5Var, java.lang.String str2, wr3.n0 n0Var, boolean z17, int i17) {
        int i18;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = this.f464908u;
        android.text.SpannableString nj6 = ((ke0.e) xVar).nj(mMNeat7extView2.getContext(), str, (int) mMNeat7extView2.getTextSize());
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        android.content.Context context = this.f464896f;
        android.text.SpannableString i19 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
        mMNeat7extView2.setMaxLines(Integer.MAX_VALUE);
        mMNeat7extView2.b(nj6);
        mMNeat7extView2.setSpacingAdd(i65.a.b(context, 5));
        boolean z18 = str2 == null || str2.length() == 0;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView3 = this.f464907t;
        if (z18) {
            mMNeat7extView3.setVisibility(8);
            mMNeat7extView2.setMinHeight(i65.a.b(context, 70));
        } else {
            mMNeat7extView3.setVisibility(0);
            mMNeat7extView3.b(i19);
            mMNeat7extView3.getPaint().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            mMNeat7extView3.getPaint().setStrokeWidth(0.8f);
            mMNeat7extView2.setMinHeight(0);
        }
        int B = i65.a.B(context) - i65.a.b(context, 72);
        ks5.a i27 = mMNeat7extView2.i(B, Integer.MAX_VALUE);
        ks5.a i28 = mMNeat7extView3.i(B, Integer.MAX_VALUE);
        int i29 = i27 != null ? ((com.tencent.neattextview.textview.layout.NeatLayout) i27).L : 0;
        int i37 = i28 != null ? ((com.tencent.neattextview.textview.layout.NeatLayout) i28).L : 0;
        int i38 = i29 + i37;
        android.widget.TextView textView = this.f464909v;
        int i39 = this.f464897g;
        if (i38 > i39) {
            mMNeat7extView2.setMaxLines(i39 - i37);
            textView.setVisibility(0);
            textView.setText(com.tencent.mm.R.string.m79);
            if (s5Var.f385509d.f390791e == 1 || s5Var.f385514i == null) {
                i18 = i38;
                mMNeat7extView = mMNeat7extView3;
                neatTextView = mMNeat7extView2;
            } else {
                yr3.w wVar = yr3.w.f465059a;
                android.content.Context context2 = this.f464896f;
                wr3.t0 t0Var = this.f464894d;
                kotlin.jvm.internal.o.d(textView);
                java.lang.Object obj = s5Var.f385514i.f382754e.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                r45.l5 BaseInfo = s5Var.f385514i.f382753d;
                kotlin.jvm.internal.o.f(BaseInfo, "BaseInfo");
                i18 = i38;
                mMNeat7extView = mMNeat7extView3;
                neatTextView = mMNeat7extView2;
                wVar.j(context2, t0Var, textView, s5Var, (r45.o5) obj, BaseInfo, (r29 & 64) != 0 ? 0 : getPosition(), n0Var, z17, i17, (r29 & 1024) != 0 ? sr3.a.f411829e : null, (r29 & 2048) != 0 ? false : false);
            }
        } else {
            i18 = i38;
            mMNeat7extView = mMNeat7extView3;
            neatTextView = mMNeat7extView2;
            neatTextView.setMaxLines(Integer.MAX_VALUE);
            textView.setVisibility(8);
        }
        android.view.ViewGroup.LayoutParams layoutParams = neatTextView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = mMNeat7extView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
        int i47 = i18 <= 2 ? 17 : 19;
        layoutParams2.gravity = i47;
        layoutParams4.gravity = i47;
        neatTextView.setLayoutParams(layoutParams2);
        com.tencent.neattextview.textview.view.NeatTextView neatTextView2 = mMNeat7extView;
        neatTextView2.setLayoutParams(layoutParams4);
        neatTextView.setTextGravity(i47);
        neatTextView2.setTextGravity(i47);
    }
}
