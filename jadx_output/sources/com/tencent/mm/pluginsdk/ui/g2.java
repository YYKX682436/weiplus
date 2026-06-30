package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f190837d;

    public g2(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView) {
        this.f190837d = profileEditPhoneNumberView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f190837d.c(null, false, true);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/ProfileEditPhoneNumberView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
