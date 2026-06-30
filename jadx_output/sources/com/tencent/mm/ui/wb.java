package com.tencent.mm.ui;

/* loaded from: classes3.dex */
public final class wb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMBottomButtonList f211219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f211220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f211221f;

    public wb(com.tencent.mm.ui.MMBottomButtonList mMBottomButtonList, yz5.l lVar, android.widget.Button button) {
        this.f211219d = mMBottomButtonList;
        this.f211220e = lVar;
        this.f211221f = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f211219d.f196898q) {
            yj0.a.h(this, "com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            this.f211220e.invoke(this.f211221f);
            yj0.a.h(this, "com/tencent/mm/ui/MMBottomButtonList$addBottomButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
