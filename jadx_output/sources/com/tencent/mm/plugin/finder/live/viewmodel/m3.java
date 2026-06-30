package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public abstract class m3 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f117240d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f117241e;

    /* renamed from: f, reason: collision with root package name */
    public int f117242f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f117243g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f117244h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.EditText f117245i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f117246m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f117247n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f117248o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117240d = "";
        this.f117241e = "";
        this.f117243g = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.e3(this, activity));
        this.f117244h = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.d3(this));
        this.f117247n = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.l3(this, activity));
        this.f117248o = jz5.h.b(new com.tencent.mm.plugin.finder.live.viewmodel.c3(this, activity));
    }

    public abstract java.lang.Object T6(kotlin.coroutines.Continuation continuation);

    public abstract java.lang.Object U6(kotlin.coroutines.Continuation continuation);

    public final void V6(java.lang.String errorWording) {
        kotlin.jvm.internal.o.g(errorWording, "errorWording");
        jz5.g gVar = this.f117243g;
        java.lang.Object value = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((android.widget.TextView) value).setText(errorWording);
        java.lang.Object value2 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value2, "getValue(...)");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat((android.widget.TextView) value2, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        java.lang.Object value3 = ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.f(value3, "getValue(...)");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat((android.widget.TextView) value3, "alpha", 1.0f, 0.0f);
        ofFloat2.setDuration(300L);
        ofFloat2.setStartDelay(3000L);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2);
        animatorSet.start();
    }

    public final void W6() {
        boolean z17 = false;
        if (this.f117240d.length() == 11) {
            if (this.f117241e.length() > 0) {
                z17 = true;
            }
        }
        java.lang.Object value = ((jz5.n) this.f117248o).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        textView.setEnabled(z17);
        textView.setTextColor(getActivity().getColor(z17 ? com.tencent.mm.R.color.abs : com.tencent.mm.R.color.f478520a84));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(getActivity().getColor(z17 ? com.tencent.mm.R.color.f478502m : com.tencent.mm.R.color.abt));
        gradientDrawable.setCornerRadius(pm0.v.S(8));
        textView.setBackground(gradientDrawable);
    }

    public final void X6() {
        boolean z17 = this.f117240d.length() == 11 && this.f117242f == 0;
        java.lang.Object value = ((jz5.n) this.f117247n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.widget.TextView textView = (android.widget.TextView) value;
        textView.setText(this.f117242f == 0 ? getActivity().getString(com.tencent.mm.R.string.otg) : getActivity().getString(com.tencent.mm.R.string.oth, java.lang.Integer.valueOf(this.f117242f)));
        textView.setEnabled(z17);
        textView.setTextColor(getActivity().getColor(z17 ? com.tencent.mm.R.color.abw : com.tencent.mm.R.color.f478520a84));
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(getActivity().getColor(com.tencent.mm.R.color.abt));
        gradientDrawable.setCornerRadius(pm0.v.S(6));
        textView.setBackground(gradientDrawable);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488958eb3;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.setMMTitle((java.lang.CharSequence) "");
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity2 = activity2 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity2 : null;
        if (mMActivity2 != null) {
            mMActivity2.setBackGroundColorResource(com.tencent.mm.R.color.f478491c);
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity3 = activity3 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity3 : null;
        if (mMActivity3 != null) {
            mMActivity3.setActionbarColor(getActivity().getColor(com.tencent.mm.R.color.f478491c));
        }
        androidx.appcompat.app.AppCompatActivity activity4 = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity4 = activity4 instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity4 : null;
        if (mMActivity4 != null) {
            mMActivity4.hideActionbarLine();
        }
        android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.ku_);
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        kotlin.jvm.internal.o.d(editText);
        editText.addTextChangedListener(new com.tencent.mm.plugin.finder.live.viewmodel.g3(this));
        kotlin.jvm.internal.o.f(findViewById, "also(...)");
        this.f117245i = (android.widget.EditText) findViewById;
        android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.v6x);
        android.widget.EditText editText2 = (android.widget.EditText) findViewById2;
        kotlin.jvm.internal.o.d(editText2);
        editText2.addTextChangedListener(new com.tencent.mm.plugin.finder.live.viewmodel.h3(this));
        kotlin.jvm.internal.o.f(findViewById2, "also(...)");
        this.f117246m = (android.widget.EditText) findViewById2;
        getRootView().findViewById(com.tencent.mm.R.id.cg7).setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.f3(this));
        X6();
        W6();
    }
}
