package fg2;

/* loaded from: classes10.dex */
public final class j0 implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.RoundCornerConstraintLayout f262098a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.ImageView f262099b;

    /* renamed from: c, reason: collision with root package name */
    public final fg2.r1 f262100c;

    /* renamed from: d, reason: collision with root package name */
    public final fg2.v f262101d;

    /* renamed from: e, reason: collision with root package name */
    public final fg2.a0 f262102e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f262103f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f262104g;

    /* renamed from: h, reason: collision with root package name */
    public final fg2.r0 f262105h;

    /* renamed from: i, reason: collision with root package name */
    public final fg2.c1 f262106i;

    /* renamed from: j, reason: collision with root package name */
    public final fg2.s0 f262107j;

    /* renamed from: k, reason: collision with root package name */
    public final fg2.w1 f262108k;

    public j0(com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout, android.widget.ImageView imageView, fg2.r1 r1Var, fg2.v vVar, fg2.a0 a0Var, android.widget.FrameLayout frameLayout, android.widget.TextView textView, fg2.r0 r0Var, fg2.c1 c1Var, com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout2, fg2.s0 s0Var, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, fg2.w1 w1Var) {
        this.f262098a = roundCornerConstraintLayout;
        this.f262099b = imageView;
        this.f262100c = r1Var;
        this.f262101d = vVar;
        this.f262102e = a0Var;
        this.f262103f = frameLayout;
        this.f262104g = textView;
        this.f262105h = r0Var;
        this.f262106i = c1Var;
        this.f262107j = s0Var;
        this.f262108k = w1Var;
    }

    public static fg2.j0 a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.aum, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.g9c;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.tencent.mm.R.id.g9c);
        if (imageView != null) {
            i17 = com.tencent.mm.R.id.eop;
            android.view.View a17 = x4.b.a(inflate, com.tencent.mm.R.id.eop);
            if (a17 != null) {
                fg2.r1 a18 = fg2.r1.a(a17);
                i17 = com.tencent.mm.R.id.f484711f85;
                android.view.View a19 = x4.b.a(inflate, com.tencent.mm.R.id.f484711f85);
                if (a19 != null) {
                    fg2.v a27 = fg2.v.a(a19);
                    i17 = com.tencent.mm.R.id.f8q;
                    android.view.View a28 = x4.b.a(inflate, com.tencent.mm.R.id.f8q);
                    if (a28 != null) {
                        fg2.a0 a29 = fg2.a0.a(a28);
                        i17 = com.tencent.mm.R.id.f_i;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.tencent.mm.R.id.f_i);
                        if (frameLayout != null) {
                            i17 = com.tencent.mm.R.id.fa_;
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fa_);
                            if (textView != null) {
                                i17 = com.tencent.mm.R.id.fak;
                                android.view.View a37 = x4.b.a(inflate, com.tencent.mm.R.id.fak);
                                if (a37 != null) {
                                    fg2.r0 a38 = fg2.r0.a(a37);
                                    i17 = com.tencent.mm.R.id.fal;
                                    android.view.View a39 = x4.b.a(inflate, com.tencent.mm.R.id.fal);
                                    if (a39 != null) {
                                        fg2.c1 a47 = fg2.c1.a(a39);
                                        com.tencent.mm.ui.widget.RoundCornerConstraintLayout roundCornerConstraintLayout = (com.tencent.mm.ui.widget.RoundCornerConstraintLayout) inflate;
                                        i17 = com.tencent.mm.R.id.qrl;
                                        android.view.View a48 = x4.b.a(inflate, com.tencent.mm.R.id.qrl);
                                        if (a48 != null) {
                                            fg2.s0 a49 = fg2.s0.a(a48);
                                            i17 = com.tencent.mm.R.id.fm8;
                                            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) x4.b.a(inflate, com.tencent.mm.R.id.fm8);
                                            if (constraintLayout != null) {
                                                i17 = com.tencent.mm.R.id.fqg;
                                                android.view.View a57 = x4.b.a(inflate, com.tencent.mm.R.id.fqg);
                                                if (a57 != null) {
                                                    return new fg2.j0(roundCornerConstraintLayout, imageView, a18, a27, a29, frameLayout, textView, a38, a47, roundCornerConstraintLayout, a49, constraintLayout, fg2.w1.a(a57));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f262098a;
    }
}
