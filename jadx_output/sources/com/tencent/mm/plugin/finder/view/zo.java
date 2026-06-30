package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f133482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f133483e;

    public zo(android.view.View view, com.tencent.mm.plugin.finder.view.cp cpVar) {
        this.f133482d = view;
        this.f133483e = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.ui.widget.MMEditText mMEditText;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f133482d;
        if (view2 != null && (mMEditText = (com.tencent.mm.ui.widget.MMEditText) view2.findViewById(com.tencent.mm.R.id.f483784c14)) != null) {
            mMEditText.clearFocus();
            android.content.Context context = view2.getContext();
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity != null) {
                mMActivity.hideVKB(mMEditText);
            }
        }
        view2.postDelayed(new com.tencent.mm.plugin.finder.view.yo(this.f133483e), 300L);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
