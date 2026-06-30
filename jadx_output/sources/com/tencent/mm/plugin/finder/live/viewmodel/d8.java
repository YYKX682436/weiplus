package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class d8 extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ebw;
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
        ((android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.rbw)).setText(getIntent().getStringExtra("FinderLiveSimpleResultUIC.KEY_WORDING"));
        android.widget.TextView textView = (android.widget.TextView) getRootView().findViewById(com.tencent.mm.R.id.b2z);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(getActivity().getColor(com.tencent.mm.R.color.abt));
        gradientDrawable.setCornerRadius(pm0.v.S(8));
        textView.setBackground(gradientDrawable);
        textView.setOnClickListener(new com.tencent.mm.plugin.finder.live.viewmodel.c8(this));
    }
}
