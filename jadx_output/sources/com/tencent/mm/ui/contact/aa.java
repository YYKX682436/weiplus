package com.tencent.mm.ui.contact;

/* loaded from: classes9.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SelectContactUI f206595e;

    public aa(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, java.lang.String str) {
        this.f206595e = selectContactUI;
        this.f206594d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f206594d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = this.f206595e;
        if (K0) {
            str = selectContactUI.getString(com.tencent.mm.R.string.htw);
        }
        db5.e1.y(selectContactUI, str, "", selectContactUI.getString(com.tencent.mm.R.string.l_e), new com.tencent.mm.ui.contact.z9(this));
    }
}
