package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.r01 f135254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.q4 f135255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(r45.r01 r01Var, com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f135254d = r01Var;
        this.f135255e = q4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.n4(this.f135254d, this.f135255e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.viewmodel.component.n4 n4Var = (com.tencent.mm.plugin.finder.viewmodel.component.n4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f135254d.getCustom(1);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        com.tencent.mm.plugin.finder.viewmodel.component.q4 q4Var = this.f135255e;
        q4Var.getIntent().putExtra("finder_username", str);
        g92.b.f269769e.z0(q4Var.getContext(), str);
        az2.f fVar = q4Var.f135659e;
        if (fVar != null) {
            fVar.b();
        }
        com.tencent.mm.ui.widget.dialog.y1 y1Var = q4Var.f135658d;
        if (y1Var != null) {
            y1Var.r(true);
        }
        q4Var.S6();
        return jz5.f0.f302826a;
    }
}
