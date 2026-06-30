package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class h1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f208767d = null;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f208768e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f208769f;

    public h1(android.content.Context context, java.lang.String str) {
        this.f208768e = context;
        this.f208769f = str;
    }

    public final void a(java.util.List list, java.lang.String[] strArr) {
        for (java.lang.String str : strArr) {
            if (str.length() > 0 && str.substring(str.length() - 1, str.length()).matches("[_0-9a-zA-Z]$")) {
                list.add(str);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AtSomeOneHelper", "[onTextChanged]");
        java.lang.String valueOf = java.lang.String.valueOf(charSequence);
        java.lang.String substring = valueOf.substring(i17, i19 + i17);
        boolean z17 = false;
        if (i17 >= 0 && valueOf.length() > i17) {
            if (i17 != 0 && valueOf.substring(i17 - 1, i17).matches("[_0-9a-zA-Z]$")) {
                if (this.f208767d == null) {
                    this.f208767d = new java.util.LinkedList();
                    a(this.f208767d, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getStringArray(com.tencent.mm.R.array.f478013a0));
                    a(this.f208767d, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getStringArray(com.tencent.mm.R.array.f478014a1));
                }
                java.lang.String substring2 = valueOf.substring(0, i17);
                java.util.Iterator it = this.f208767d.iterator();
                while (it.hasNext()) {
                    if (substring2.endsWith((java.lang.String) it.next())) {
                    }
                }
            }
            z17 = true;
            break;
        }
        if (z17 && "@".equals(substring)) {
            ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
            java.util.List m17 = c01.v1.m(this.f208769f);
            com.tencent.mm.ui.i1.f208893c = i17 + 1;
            com.tencent.mm.ui.i1.f208896f = true;
            rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
            android.content.Context context = this.f208768e;
            android.content.Intent wi6 = ((qd0.u0) g1Var).wi((android.app.Activity) context, context.getResources().getString(com.tencent.mm.R.string.i3q), this.f208769f, m17, "");
            wi6.putExtra("showSource", 1);
            wi6.putExtra("key_result_receiver", new com.tencent.mm.ui.AtSomeOneResultReceiver(com.tencent.mm.sdk.platformtools.n3.createFreeHandler(android.os.Looper.getMainLooper())));
            bh5.c cVar = new bh5.c();
            cVar.f20922a.f20924a = context;
            cVar.d(wi6);
            cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            cVar.h(229);
        }
    }
}
