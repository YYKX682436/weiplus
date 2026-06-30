package com.unionpay;

/* loaded from: classes13.dex */
public final class y implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220733a;

    public y(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220733a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        java.lang.String b17 = com.unionpay.utils.UPUtils.b(this.f220733a, str);
        if (gVar != null) {
            ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("0", ya.b.SUCCESS, b17));
        }
    }
}
