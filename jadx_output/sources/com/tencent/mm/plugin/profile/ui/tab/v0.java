package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q11.b f154618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.w0 f154619e;

    public v0(com.tencent.mm.plugin.profile.ui.tab.w0 w0Var, q11.b bVar) {
        this.f154619e = w0Var;
        this.f154618d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.profile.ui.tab.w0 w0Var = this.f154619e;
        int i17 = w0Var.f154678a;
        com.tencent.mm.plugin.profile.ui.tab.m0 m0Var = w0Var.f154680c;
        if (i17 != m0Var.S) {
            return;
        }
        q11.b bVar = this.f154618d;
        if (bVar == null || bVar.f359531a != 0 || (bitmap = bVar.f359534d) == null) {
            m0Var.f154456h.setMMTitle(w0Var.f154679b);
            com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizHeaderController", "Avatar load failed, fallback to text title: " + w0Var.f154679b);
            return;
        }
        java.lang.String str = w0Var.f154679b;
        com.tencent.mm.ui.MMActivity mMActivity = m0Var.f154456h;
        f3.i iVar = new f3.i(mMActivity.getResources(), bitmap);
        iVar.b(true);
        int dimensionPixelSize = mMActivity.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        iVar.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        al5.w wVar = new al5.w(iVar, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("  " + str);
        spannableString.setSpan(wVar, 0, 1, 33);
        w0Var.f154680c.f154456h.setMMTitle(spannableString);
    }
}
