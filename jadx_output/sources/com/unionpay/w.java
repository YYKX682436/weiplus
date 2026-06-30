package com.unionpay;

/* loaded from: classes13.dex */
public final class w implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220731a;

    public w(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220731a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        java.lang.String a17 = com.unionpay.a.a(this.f220731a, true, "0");
        if (gVar != null) {
            ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("0", ya.b.SUCCESS, a17));
        }
    }
}
