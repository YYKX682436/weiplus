package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206691d;

    public ea(com.tencent.mm.ui.contact.SelectContactUI selectContactUI) {
        this.f206691d = selectContactUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206691d;
        int height = selectContactUI.f206551p0.getHeight();
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) selectContactUI.f206446d.getLayoutParams();
        marginLayoutParams.bottomMargin = height;
        selectContactUI.f206446d.setLayoutParams(marginLayoutParams);
    }
}
