package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l13 f128972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f128973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f128974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCreateContactUI f128975g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(r45.l13 l13Var, java.lang.String str, int i17, com.tencent.mm.plugin.finder.ui.FinderCreateContactUI finderCreateContactUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f128972d = l13Var;
        this.f128973e = str;
        this.f128974f = i17;
        this.f128975g = finderCreateContactUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.ui.c3(this.f128972d, this.f128973e, this.f128974f, this.f128975g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.ui.c3 c3Var = (com.tencent.mm.plugin.finder.ui.c3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String string = this.f128972d.getString(3);
        if (string != null) {
            java.lang.String a17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1.a(this.f128973e, this.f128974f);
            if (a17.length() > 0) {
                com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.U1.put(a17, string);
            }
        }
        com.tencent.mm.plugin.finder.ui.a3 a3Var = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1;
        this.f128975g.g7(string);
        return jz5.f0.f302826a;
    }
}
