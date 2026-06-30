package com.tencent.mm.plugin.transvoice.ui;

/* loaded from: classes5.dex */
public final class e extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f175419f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f175420g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f175421h;

    /* renamed from: i, reason: collision with root package name */
    public int f175422i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f175423m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f175424n;

    /* renamed from: o, reason: collision with root package name */
    public android.support.design.widget.MMBottomSheetBehavior f175425o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f175426p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.transvoice.ui.a f175427q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494620rt);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175422i = 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f175423m = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f175424n = arrayList2;
        C(1);
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("VoiceInputLanguageSupportType", 1);
        if (!com.tencent.mm.sdk.platformtools.m2.j()) {
            if (com.tencent.mm.sdk.platformtools.m2.d().equals("en")) {
                arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_1));
                arrayList.add(4);
                arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_2));
                arrayList.add(1);
                if ((b17 & 2) != 0) {
                    arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_0));
                    arrayList.add(2);
                    return;
                }
                return;
            }
            return;
        }
        arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_2));
        arrayList.add(1);
        if ((b17 & 2) != 0) {
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_0));
            arrayList.add(2);
        }
        if ((b17 & 4) != 0) {
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_1));
            arrayList.add(4);
        }
        if ((b17 & 8) != 0) {
            arrayList2.add(getContext().getString(com.tencent.mm.R.string.g_3));
            arrayList.add(8);
        }
    }

    public final void D() {
        android.widget.LinearLayout linearLayout = this.f175421h;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        int i17 = 0;
        for (java.lang.Object obj : this.f175423m) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            int intValue = ((java.lang.Number) obj).intValue();
            android.view.View inflate = getLayoutInflater().inflate(com.tencent.mm.R.layout.bne, (android.view.ViewGroup) null);
            kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate;
            ((android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.hsw)).setText((java.lang.CharSequence) this.f175424n.get(i17));
            android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.hsv);
            int i19 = intValue == this.f175422i ? 0 : 4;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/transvoice/ui/LanguageChoiceDialog", "updateSelectedType", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            frameLayout.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.d(this, intValue));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            android.widget.LinearLayout linearLayout2 = this.f175421h;
            if (linearLayout2 != null) {
                linearLayout2.addView(frameLayout, layoutParams);
            }
            i17 = i18;
        }
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        this.f175419f = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bnd, (android.view.ViewGroup) null, false);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        android.view.View view = this.f175419f;
        kotlin.jvm.internal.o.d(view);
        setContentView(view, layoutParams);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.setLayout(-1, -1);
            window.setSoftInputMode(34);
            window.setDimAmount(0.5f);
            window.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View view2 = this.f175419f;
        if (view2 != null) {
            this.f175420g = (android.widget.ImageView) view2.findViewById(com.tencent.mm.R.id.bzn);
            this.f175421h = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.hst);
        }
        android.widget.ImageView imageView = this.f175420g;
        if (imageView != null) {
            imageView.setOnClickListener(new com.tencent.mm.plugin.transvoice.ui.b(this));
        }
        android.view.View view3 = this.f175419f;
        android.support.design.widget.MMBottomSheetBehavior A = android.support.design.widget.MMBottomSheetBehavior.A(view3 != null ? view3.findViewById(com.tencent.mm.R.id.lj7) : null);
        this.f175425o = A;
        if (A != null) {
            A.f8899w = new com.tencent.mm.plugin.transvoice.ui.c(this);
        }
        D();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        android.support.design.widget.MMBottomSheetBehavior mMBottomSheetBehavior = this.f175425o;
        if (mMBottomSheetBehavior == null) {
            return;
        }
        mMBottomSheetBehavior.C(3);
    }
}
