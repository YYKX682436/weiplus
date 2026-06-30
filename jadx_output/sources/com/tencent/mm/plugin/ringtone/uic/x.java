package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b0 f158533e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.i f158534f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f158535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.ringtone.uic.b0 b0Var, vx3.i iVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158532d = u3Var;
        this.f158533e = b0Var;
        this.f158534f = iVar;
        this.f158535g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.x(this.f158532d, this.f158533e, this.f158534f, this.f158535g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f158532d;
        if (u3Var != null) {
            u3Var.hide();
        }
        com.tencent.mm.plugin.ringtone.uic.b0 b0Var = this.f158533e;
        db5.t7.h(b0Var.getActivity(), b0Var.getActivity().getResources().getString(com.tencent.mm.R.string.bor));
        jz5.f0 f0Var = jz5.f0.f302826a;
        vx3.i iVar = this.f158534f;
        if (iVar == null) {
            return f0Var;
        }
        boolean z17 = (iVar.f441301r == null || iVar.i().f257604b == null || !co4.c.b(iVar.i())) ? false : true;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.d3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.d3.class)).P6(iVar, this.f158535g, z17);
        return f0Var;
    }
}
