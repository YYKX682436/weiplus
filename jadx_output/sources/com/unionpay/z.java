package com.unionpay;

/* loaded from: classes13.dex */
public final class z implements com.unionpay.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.UPPayWapActivity f220734a;

    public z(com.unionpay.UPPayWapActivity uPPayWapActivity) {
        this.f220734a = uPPayWapActivity;
    }

    @Override // com.unionpay.f
    public final void a(java.lang.String str, com.unionpay.g gVar) {
        com.unionpay.UPPayWapActivity uPPayWapActivity = this.f220734a;
        if (uPPayWapActivity != null) {
            android.content.SharedPreferences.Editor edit = uPPayWapActivity.getSharedPreferences("UnionPayPluginEx.pref", 0).edit();
            edit.remove(str);
            edit.commit();
        }
        if (gVar != null) {
            ((com.unionpay.d) gVar).a(com.unionpay.UPPayWapActivity.L6("0", ya.b.SUCCESS, null));
        }
    }
}
