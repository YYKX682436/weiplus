package com.tencent.mm.ui;

/* loaded from: classes.dex */
public class ya implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f212580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f212581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f212582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f212583g;

    public ya(com.tencent.mm.ui.ga gaVar, boolean z17, java.lang.String str, java.lang.String str2) {
        this.f212583g = gaVar;
        this.f212580d = z17;
        this.f212581e = str;
        this.f212582f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.ga gaVar = this.f212583g;
        android.view.View view = gaVar.f208640e;
        int i17 = this.f212580d ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMActivityController$4", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = gaVar.f208672u.getString(com.tencent.mm.R.string.f492297fz3);
        java.lang.String str = this.f212581e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = gaVar.f208672u.getString(com.tencent.mm.R.string.f491052bq2);
        }
        if (this.f212582f != null) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str + string);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(-10119449), str.length(), str.length() + string.length(), 33);
            gaVar.f208642f.setText(spannableString);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMActivityController", "summerdiz url is null 2");
            gaVar.f208642f.setText(str);
        }
        gaVar.f208640e.invalidate();
        gaVar.f208644g.invalidate();
    }
}
