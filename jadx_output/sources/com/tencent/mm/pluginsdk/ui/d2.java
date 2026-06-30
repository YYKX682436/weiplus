package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class d2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText f190780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView f190781e;

    public d2(com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView, com.tencent.mm.pluginsdk.ui.MMPhoneNumberEditText mMPhoneNumberEditText) {
        this.f190781e = profileEditPhoneNumberView;
        this.f190780d = mMPhoneNumberEditText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.pluginsdk.ui.ProfileEditPhoneNumberView profileEditPhoneNumberView = this.f190781e;
        profileEditPhoneNumberView.f189804e = "";
        profileEditPhoneNumberView.f189809m.b();
        profileEditPhoneNumberView.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < profileEditPhoneNumberView.f189807h.getChildCount(); i18++) {
            android.view.View childAt = profileEditPhoneNumberView.f189807h.getChildAt(i18);
            if (childAt.findViewById(com.tencent.mm.R.id.kuc) == this.f190780d) {
                arrayList.add(childAt);
            }
        }
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            profileEditPhoneNumberView.f189807h.removeView((android.view.View) arrayList.get(i19));
        }
        profileEditPhoneNumberView.f189807h.getChildAt(r6.getChildCount() - 1).requestFocus();
        if (profileEditPhoneNumberView.f189807h.getChildCount() <= 5) {
            profileEditPhoneNumberView.g();
        }
    }
}
