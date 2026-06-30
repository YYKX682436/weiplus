package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class v2 extends androidx.recyclerview.widget.k3 {
    public static final /* synthetic */ int B = 0;
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f125925d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125926e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125927f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f125928g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f125929h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f125930i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f125931m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f125932n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f125933o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f125934p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f125935q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f125936r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f125937s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.ViewGroup f125938t;

    /* renamed from: u, reason: collision with root package name */
    public final int f125939u;

    /* renamed from: v, reason: collision with root package name */
    public final int f125940v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f125941w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f125942x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f125943y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f125944z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.view.View itemView, boolean z17, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        super(itemView);
        z17 = (i17 & 2) != 0 ? true : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        z19 = (i17 & 8) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f125925d = z17;
        this.f125926e = z18;
        this.f125927f = z19;
        this.f125928g = "Finder.MixSearchContactItemHolder";
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.d1y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f125929h = findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.a_4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f125930i = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f125931m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.gbd);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f125932n = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.hcq);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f125933o = (android.view.ViewGroup) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.l7x);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f125934p = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.cub);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f125935q = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.cuc);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f125936r = (android.widget.TextView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.a86);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f125937s = (android.widget.ImageView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.ffc);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById10;
        this.f125938t = viewGroup;
        this.f125939u = itemView.getResources().getColor(com.tencent.mm.R.color.Blue_100);
        this.f125940v = itemView.getResources().getColor(com.tencent.mm.R.color.Brand_100);
        this.f125941w = itemView.getResources().getDrawable(com.tencent.mm.R.drawable.ac_);
        this.f125942x = itemView.getResources().getDrawable(com.tencent.mm.R.drawable.ac9);
        this.f125943y = itemView.getResources().getDrawable(com.tencent.mm.R.drawable.acb);
        this.f125944z = itemView.getResources().getDrawable(com.tencent.mm.R.drawable.aca);
        this.A = 1;
        viewGroup.post(new com.tencent.mm.plugin.finder.search.s2(this));
    }

    public final void i(java.lang.String str, java.lang.String str2) {
        android.widget.TextView textView = this.f125935q;
        textView.setVisibility(0);
        this.f125936r.setVisibility(8);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                textView.setVisibility(8);
                return;
            } else {
                textView.setText(r26.i0.t(str2, "\n", " ", false));
                this.A++;
                return;
            }
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        java.lang.String t17 = r26.i0.t(str, "\n", " ", false);
        java.lang.String format = java.lang.String.format("#%06X", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(16777215 & textView.getCurrentTextColor())}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        if (this.f125925d) {
            format = "";
        }
        android.text.Spanned c17 = l4Var.c(t17, format);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.n(context, c17, textSize));
        this.A++;
    }

    public final void j(boolean z17, int i17) {
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int i18 = (z17 || i17 > 0) ? 0 : 8;
        android.widget.TextView textView = this.f125932n;
        textView.setVisibility(i18);
        boolean z18 = this.f125926e;
        if (z17) {
            textView.setText(this.itemView.getResources().getString(com.tencent.mm.R.string.f492274fw4));
            int i19 = this.f125939u;
            if (z18) {
                textView.setTextColor(i19);
                drawable2 = this.f125942x;
            } else {
                textView.setTextColor(i19);
                drawable2 = this.f125941w;
            }
            textView.setBackground(drawable2);
            return;
        }
        if (i17 > 0) {
            textView.setText(this.itemView.getResources().getString(com.tencent.mm.R.string.f2t, com.tencent.mm.plugin.finder.assist.w2.o(i17, false)));
            int i27 = this.f125940v;
            if (z18) {
                textView.setTextColor(i27);
                drawable = this.f125944z;
            } else {
                textView.setTextColor(i27);
                drawable = this.f125943y;
            }
            textView.setBackground(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0422  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.plugin.finder.storage.y90, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(r45.mu2 r35, android.view.View.OnClickListener r36, android.view.View.OnLongClickListener r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 1185
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.search.v2.k(r45.mu2, android.view.View$OnClickListener, android.view.View$OnLongClickListener, boolean):void");
    }
}
