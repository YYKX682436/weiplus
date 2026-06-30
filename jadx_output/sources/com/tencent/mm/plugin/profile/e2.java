package com.tencent.mm.plugin.profile;

/* loaded from: classes.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f153459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f153460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(android.content.Intent intent, com.tencent.mm.storage.z3 z3Var) {
        super(1);
        this.f153459d = intent;
        this.f153460e = z3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String phone = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(phone, "phone");
        com.tencent.mm.plugin.profile.d2 d2Var = new com.tencent.mm.plugin.profile.d2(this.f153459d, this.f153460e, phone);
        android.text.SpannableString spannableString = new android.text.SpannableString(phone);
        spannableString.setSpan(d2Var, 0, phone.length(), 17);
        return spannableString;
    }
}
