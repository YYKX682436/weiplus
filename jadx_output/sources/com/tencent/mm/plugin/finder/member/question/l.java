package com.tencent.mm.plugin.finder.member.question;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.question.s f121331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121333f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.member.question.s sVar, in5.s0 s0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f121331d = sVar;
        this.f121332e = s0Var;
        this.f121333f = baseFinderFeed;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f121332e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.member.question.s sVar = this.f121331d;
        java.lang.String str = sVar.f121345e;
        int i17 = sVar.f121346f.f107514f;
        sVar.c(context, this.f121333f, str, i17 == 5 || i17 == 6 || i17 == 7 ? 104 : 0);
        return jz5.f0.f302826a;
    }
}
