package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class bb extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f123560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f123561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123562f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f123563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f123564h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f123565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb(android.text.SpannableString spannableString, int i17, int i18, java.lang.StringBuilder sb6, com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        super(3);
        this.f123560d = spannableString;
        this.f123561e = i17;
        this.f123562f = i18;
        this.f123563g = sb6;
        this.f123564h = obVar;
        this.f123565i = b2Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String nickname = (java.lang.String) obj3;
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f123560d.setSpan(new com.tencent.mm.plugin.finder.view.yl(nickname, this.f123561e, this.f123562f, false, false, new com.tencent.mm.plugin.finder.profile.uic.ab(this.f123564h, this.f123565i), 16, null), intValue, intValue2, 17);
        this.f123563g.append(nickname.concat("|"));
        return jz5.f0.f302826a;
    }
}
