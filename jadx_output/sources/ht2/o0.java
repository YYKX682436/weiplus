package ht2;

/* loaded from: classes2.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.o f284872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284873e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f284874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f284876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f284877i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f284878m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284879n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(jz5.o oVar, ht2.y0 y0Var, android.widget.LinearLayout linearLayout, java.lang.String str, android.view.ViewGroup viewGroup, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, zy2.r6 r6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284872d = oVar;
        this.f284873e = y0Var;
        this.f284874f = linearLayout;
        this.f284875g = str;
        this.f284876h = viewGroup;
        this.f284877i = c0Var;
        this.f284878m = c0Var2;
        this.f284879n = r6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ht2.o0(this.f284872d, this.f284873e, this.f284874f, this.f284875g, this.f284876h, this.f284877i, this.f284878m, this.f284879n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ht2.o0 o0Var = (ht2.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.o oVar = this.f284872d;
        if (((java.lang.Boolean) oVar.f302841d).booleanValue()) {
            java.lang.String str = (java.lang.String) oVar.f302842e;
            java.util.regex.Pattern pattern = ht2.y0.f284936g;
            ht2.y0 y0Var = this.f284873e;
            y0Var.getClass();
            android.widget.LinearLayout linearLayout = this.f284874f;
            android.content.Context context = linearLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            android.widget.TextView textView = null;
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context, null);
            int dimension = (int) linearLayout.getContext().getResources().getDimension(com.tencent.mm.R.dimen.by);
            mMPAGView.setRepeatCount(1);
            mMPAGView.setProgress(0.0d);
            mMPAGView.o(((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.Z0().r()).booleanValue());
            mMPAGView.setPath(str);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
            layoutParams.gravity = 17;
            mMPAGView.setLayoutParams(layoutParams);
            linearLayout.addView(mMPAGView);
            y0Var.getClass();
            java.lang.String str2 = this.f284875g;
            if (!(str2 == null || str2.length() == 0)) {
                textView = new android.widget.TextView(linearLayout.getContext());
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.topMargin = linearLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479672c9);
                textView.setGravity(17);
                textView.setLayoutParams(marginLayoutParams);
                textView.setShadowLayer(20.0f, 0.0f, 12.0f, linearLayout.getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
                textView.setText(str2);
                textView.setTextSize(1, i65.a.q(linearLayout.getContext()) * 17.0f);
                textView.setTextColor(linearLayout.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
                textView.setLineSpacing(textView.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479648bn), 1.0f);
                int f17 = i65.a.f(textView.getContext(), com.tencent.mm.R.dimen.f479704cz);
                textView.setPadding(f17, textView.getPaddingTop(), f17, textView.getPaddingBottom());
                linearLayout.addView(textView);
            }
            kotlin.jvm.internal.c0 c0Var = this.f284877i;
            kotlin.jvm.internal.c0 c0Var2 = this.f284878m;
            android.view.ViewGroup viewGroup = this.f284876h;
            ht2.m0 m0Var = new ht2.m0(c0Var, linearLayout, c0Var2, viewGroup);
            y0Var.getClass();
            mMPAGView.a(new ht2.r0(m0Var));
            mMPAGView.g();
            if (textView != null) {
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f284879n.f477558i;
                boolean z17 = finderObject != null && com.tencent.mm.plugin.finder.storage.FinderItem.Companion.e(finderObject);
                ht2.n0 n0Var = new ht2.n0(c0Var2, linearLayout, c0Var, viewGroup);
                y0Var.getClass();
                android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(textView, "alpha", 0.0f, 1.0f);
                ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                ofFloat.setDuration(300L);
                ofFloat.addListener(new ht2.t0(y0Var, z17, n0Var));
                ofFloat.start();
            }
            viewGroup.addView(linearLayout);
        }
        return jz5.f0.f302826a;
    }
}
