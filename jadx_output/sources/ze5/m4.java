package ze5;

/* loaded from: classes9.dex */
public final class m4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472088e;

    public m4(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472087d = f9Var;
        this.f472088e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f472087d;
        f9Var.unsetOmittedFailResend();
        pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
        ((com.tencent.mm.ui.chatting.component.j0) ((sb5.h) this.f472088e.f460708c.a(sb5.h.class))).m0(f9Var);
    }
}
