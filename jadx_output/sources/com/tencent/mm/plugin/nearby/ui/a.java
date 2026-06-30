package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView f152123d;

    public a(com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView bindMobileOrQQHeaderView) {
        this.f152123d = bindMobileOrQQHeaderView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.nearby.ui.BindMobileOrQQHeaderView bindMobileOrQQHeaderView = this.f152123d;
        intent.setClass(bindMobileOrQQHeaderView.getContext(), com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class);
        intent.putExtra("key_upload_scene", 7);
        com.tencent.mm.ui.MMWizardActivity.X6(bindMobileOrQQHeaderView.getContext(), intent);
        yj0.a.h(this, "com/tencent/mm/plugin/nearby/ui/BindMobileOrQQHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
