package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class r2 extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f203071b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f203072c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f203073d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f203074e;

    /* renamed from: f, reason: collision with root package name */
    public int f203075f;

    /* renamed from: g, reason: collision with root package name */
    public int f203076g;

    /* renamed from: h, reason: collision with root package name */
    public int f203077h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.view.q2 f203078i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View.OnClickListener f203079j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f203071b = context;
        this.f203075f = 5;
        this.f203078i = com.tencent.mm.ui.chatting.view.q2.f203060e;
        setContentView(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cbs, (android.view.ViewGroup) null));
        setOutsideTouchable(true);
        setFocusable(true);
        android.view.View findViewById = getContentView().findViewById(com.tencent.mm.R.id.ovk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f203072c = findViewById;
        android.view.View findViewById2 = getContentView().findViewById(com.tencent.mm.R.id.jge);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f203073d = findViewById2;
        getContentView().setOnClickListener(new com.tencent.mm.ui.chatting.view.p2(this));
    }

    public final void a(android.view.View anchor) {
        int i17;
        kotlin.jvm.internal.o.g(anchor, "anchor");
        if (!this.f203074e) {
            getContentView().measure(0, 0);
            this.f203074e = true;
        }
        int measuredWidth = getContentView().getMeasuredWidth();
        int measuredHeight = getContentView().getMeasuredHeight();
        int[] iArr = new int[2];
        anchor.getLocationInWindow(iArr);
        int width = iArr[0] + ((anchor.getWidth() - measuredWidth) / 2);
        int i18 = iArr[1] - measuredHeight;
        android.graphics.Point h17 = com.tencent.mm.ui.bk.h(this.f203071b);
        int i19 = h17.x;
        int i27 = h17.y;
        int i28 = this.f203075f;
        int i29 = (i19 - i28) - measuredWidth;
        int i37 = i28 + 0;
        if (width <= i29 && width < i37) {
            width = i37;
        }
        android.view.View view = this.f203072c;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.view.View view2 = this.f203073d;
        android.view.ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((android.widget.RelativeLayout.LayoutParams) layoutParams).setMarginStart(((iArr[0] + (anchor.getWidth() / 2)) - width) - (view.getMeasuredWidth() / 2));
        if (i18 <= this.f203077h) {
            com.tencent.mm.ui.chatting.view.q2 q2Var = this.f203078i;
            com.tencent.mm.ui.chatting.view.q2 q2Var2 = com.tencent.mm.ui.chatting.view.q2.f203059d;
            if (q2Var != q2Var2) {
                float f17 = 180;
                getContentView().setRotation(getContentView().getRotation() + f17);
                view2.setRotation(view2.getRotation() + f17);
                this.f203078i = q2Var2;
            }
            i17 = i18 + this.f203076g + measuredHeight + anchor.getHeight();
        } else {
            com.tencent.mm.ui.chatting.view.q2 q2Var3 = this.f203078i;
            com.tencent.mm.ui.chatting.view.q2 q2Var4 = com.tencent.mm.ui.chatting.view.q2.f203060e;
            if (q2Var3 != q2Var4) {
                float f18 = 180;
                getContentView().setRotation(getContentView().getRotation() + f18);
                view2.setRotation(view2.getRotation() + f18);
                this.f203078i = q2Var4;
            }
            i17 = i18 - this.f203076g;
        }
        setAnimationStyle(com.tencent.mm.R.style.f494105ec);
        showAtLocation(anchor, 0, width, i17);
        kotlin.jvm.internal.o.f(java.lang.String.format("popX:%s, popY:%s, sw:%s, sh:%s, pw:%s, ph:%s", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(measuredWidth), java.lang.Integer.valueOf(measuredHeight)}, 6)), "format(...)");
    }
}
