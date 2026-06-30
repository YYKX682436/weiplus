package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class j4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.l13 f134806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f134808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f134809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(r45.l13 l13Var, java.lang.String str, int i17, com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134806d = l13Var;
        this.f134807e = str;
        this.f134808f = i17;
        this.f134809g = q4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.j4(this.f134806d, this.f134807e, this.f134808f, this.f134809g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.j4 j4Var = (com.tencent.mm.plugin.finder.viewmodel.component.j4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String string = this.f134806d.getString(3);
        if (string != null) {
            java.lang.String a17 = com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.H1.a(this.f134807e, this.f134808f);
            if (a17.length() > 0) {
                com.tencent.mm.plugin.finder.ui.FinderCreateContactUI.U1.put(a17, string);
            }
            this.f134809g.Y6(string);
        }
        return jz5.f0.f302826a;
    }
}
