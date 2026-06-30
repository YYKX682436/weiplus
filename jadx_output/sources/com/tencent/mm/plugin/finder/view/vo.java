package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class vo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMEditText f133265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.cp f133266e;

    public vo(com.tencent.mm.ui.widget.MMEditText mMEditText, com.tencent.mm.plugin.finder.view.cp cpVar) {
        this.f133265d = mMEditText;
        this.f133266e = cpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.isEnabled()) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f133265d;
            if (mMEditText.getText().toString().length() > 0) {
                ((com.tencent.mm.plugin.finder.view.so) this.f133266e.f131793e).d(java.lang.Integer.parseInt(mMEditText.getText().toString()));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/GameTeamInputCoinValueBottomPage$getView$1$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
