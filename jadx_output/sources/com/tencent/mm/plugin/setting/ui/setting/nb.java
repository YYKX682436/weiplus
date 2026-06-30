package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class nb extends wm3.a implements al5.e0 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f161355d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f161356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161356e = jz5.h.b(new com.tencent.mm.plugin.setting.ui.setting.mb(this));
    }

    @Override // al5.e0
    public void J2(boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailEditUIC", "keyboard show " + z17 + ", keyboardHeight " + i17);
        if (!z17) {
            android.view.ViewGroup.LayoutParams layoutParams = T6().d().getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479657bu);
            layoutParams2.topMargin = 0;
            T6().d().setLayoutParams(layoutParams2);
            T6().c().setPadding(T6().c().getPaddingLeft(), T6().c().getPaddingTop(), T6().c().getPaddingRight(), 0);
            T6().e().scrollBy(0, 0);
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = T6().d().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams4 = (android.widget.LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.bottomMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        layoutParams4.topMargin = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        T6().d().setLayoutParams(layoutParams4);
        T6().c().setPadding(T6().c().getPaddingLeft(), T6().c().getPaddingTop(), T6().c().getPaddingRight(), i17);
        int height = T6().e().getHeight();
        T6().c().requestLayout();
        T6().c().post(new com.tencent.mm.plugin.setting.ui.setting.lb(this, height));
    }

    public final em.x3 T6() {
        return (em.x3) ((jz5.n) this.f161356e).getValue();
    }

    public final void U6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            T6().b().setVisibility(8);
        } else {
            T6().b().setVisibility(0);
            T6().b().setText(str);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enl;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("");
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 != null) {
            P62.setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P63 = P6();
        if (P63 != null) {
            P63.setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ib(this), com.tencent.mm.R.raw.xmark_regular);
        }
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        java.lang.Integer num = l17 instanceof java.lang.Integer ? (java.lang.Integer) l17 : null;
        this.f161355d = (num == null || (num.intValue() & 2) == 0) ? false : true;
        em.x3 T6 = T6();
        if (T6.f254927c == null) {
            T6.f254927c = (android.widget.TextView) T6.f254925a.findViewById(com.tencent.mm.R.id.t7e);
        }
        T6.f254927c.setText(getString(this.f161355d ? com.tencent.mm.R.string.f493035oh5 : com.tencent.mm.R.string.ogy));
        getActivity().getWindow().setSoftInputMode(4);
        T6().c().e(this);
        com.tencent.mm.ui.base.MMClearEditText a17 = T6().a();
        a17.requestFocus();
        a17.setText(getIntent().getStringExtra("change_bind_email"));
        a17.addTextChangedListener(new com.tencent.mm.plugin.setting.ui.setting.jb(this));
        T6().d().setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.kb(this));
    }
}
