package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class dq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f131924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.gq f131925e;

    public dq(android.view.View view, com.tencent.mm.plugin.finder.view.gq gqVar) {
        this.f131924d = view;
        this.f131925e = gqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.EditText editText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f131924d;
        if (view2 != null && (editText = (android.widget.EditText) view2.findViewById(com.tencent.mm.R.id.f483784c14)) != null) {
            hc2.o.a(editText, true);
            editText.clearFocus();
            android.content.Context context = view2.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.hideVKB(editText);
            }
        }
        view2.postDelayed(new com.tencent.mm.plugin.finder.view.cq(this.f131925e), 300L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/LiveChargeInputCoinValueBottomPage$getView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
