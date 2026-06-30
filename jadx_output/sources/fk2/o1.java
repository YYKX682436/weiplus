package fk2;

/* loaded from: classes3.dex */
public final class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.p1 f263443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263444e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f263445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.f0 f263446g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263447h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dk2.ia f263448i;

    public o1(fk2.p1 p1Var, bm2.h1 h1Var, android.widget.RelativeLayout relativeLayout, com.tencent.mm.pluginsdk.ui.span.f0 f0Var, android.content.Context context, dk2.ia iaVar) {
        this.f263443d = p1Var;
        this.f263444e = h1Var;
        this.f263445f = relativeLayout;
        this.f263446g = f0Var;
        this.f263447h = context;
        this.f263448i = iaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int f17 = this.f263443d.f445240a.f();
        bm2.h1 h1Var = this.f263444e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) h1Var.itemView.findViewById(com.tencent.mm.R.id.rlw);
        int width = viewGroup != null ? viewGroup.getWidth() : 0;
        android.widget.RelativeLayout relativeLayout = this.f263445f;
        int paddingLeft = (f17 - (relativeLayout.getPaddingLeft() + relativeLayout.getPaddingRight())) - width;
        int i17 = fk2.p1.f263451n;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = h1Var.f21927e;
        java.lang.String string = this.f263447h.getResources().getString(com.tencent.mm.R.string.egq);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        fk2.n1 n1Var = new fk2.n1(this.f263448i);
        int paddingLeft2 = (paddingLeft - mMNeat7extView.getPaddingLeft()) - mMNeat7extView.getPaddingRight();
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView2 = new com.tencent.mm.ui.widget.MMNeat7extView(mMNeat7extView.getContext());
        mMNeat7extView2.l(0, mMNeat7extView.getTextSize());
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = this.f263446g;
        int length = f0Var.length();
        int i18 = 0;
        java.lang.CharSequence charSequence = f0Var;
        while (i18 <= length) {
            int i19 = (i18 + length) / 2;
            java.lang.CharSequence subSequence = f0Var.subSequence(0, i19);
            mMNeat7extView2.b(subSequence);
            if (((com.tencent.neattextview.textview.layout.NeatLayout) mMNeat7extView2.i(paddingLeft2, Integer.MAX_VALUE)).L <= 3) {
                i18 = i19 + 1;
                charSequence = subSequence;
            } else {
                length = i19 - 1;
            }
        }
        if (charSequence.length() >= f0Var.length()) {
            mMNeat7extView.b(f0Var);
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence);
        int max = java.lang.Math.max(spannableStringBuilder.length() - string.length(), 0);
        spannableStringBuilder.replace(max, java.lang.Math.min(spannableStringBuilder.length(), string.length() + max), (java.lang.CharSequence) string);
        spannableStringBuilder.setSpan(new fk2.m1(mMNeat7extView, n1Var, f0Var), max, string.length() + max, 17);
        mMNeat7extView.b(spannableStringBuilder);
    }
}
