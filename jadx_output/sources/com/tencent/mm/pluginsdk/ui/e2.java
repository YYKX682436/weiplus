package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class e2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f190792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f190793e;

    public e2(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView, android.view.View view) {
        this.f190793e = profileEditPhoneNumberView;
        this.f190792d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f190793e;
        profileEditPhoneNumberView.f189807h.removeView(this.f190792d);
        profileEditPhoneNumberView.g();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
