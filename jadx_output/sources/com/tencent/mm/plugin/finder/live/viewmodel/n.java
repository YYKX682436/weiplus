package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class n extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f117259d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f117260e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f117261f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f117262g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117262g = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("DESC");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f117262g = stringExtra;
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.mcm);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = getActivity().findViewById(com.tencent.mm.R.id.icr);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117259d = (com.tencent.mm.ui.widget.MMEditText) findViewById2;
        android.view.View findViewById3 = getActivity().findViewById(com.tencent.mm.R.id.kht);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117260e = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = getActivity().findViewById(com.tencent.mm.R.id.egr);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f117261f = findViewById4;
        android.widget.LinearLayout linearLayout = this.f117260e;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("btnContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f117259d;
        if (mMEditText == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        mMEditText.setHint(zl2.q4.f473933a.n());
        com.tencent.mm.ui.widget.MMEditText mMEditText2 = this.f117259d;
        if (mMEditText2 == null) {
            kotlin.jvm.internal.o.o("descTv");
            throw null;
        }
        mMEditText2.setText(this.f117262g);
        android.view.View view = this.f117261f;
        if (view != null) {
            view.post(new com.tencent.mm.plugin.finder.live.viewmodel.m(this, layoutParams2));
        } else {
            kotlin.jvm.internal.o.o("optionRoot");
            throw null;
        }
    }
}
