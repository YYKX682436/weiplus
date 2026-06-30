package com.unionpay;

/* loaded from: classes13.dex */
public final class a0 implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220698a;

    public a0(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220698a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        boolean parseBoolean = java.lang.Boolean.parseBoolean(str);
        android.view.View view = this.f220698a.f220672m;
        if (view != null) {
            int i17 = parseBoolean ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/unionpay/UPPayWapActivity", "a", "(Lcom/unionpay/UPPayWapActivity;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (gVar != null) {
            ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("0", ya.b.SUCCESS, null));
        }
    }
}
