package ze5;

/* loaded from: classes9.dex */
public final class n7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f472109e;

    public n7(com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f472108d = f9Var;
        this.f472109e = dVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f472108d;
        f9Var.unsetOmittedFailResend();
        pt0.f0.f358209b1.s(f9Var.Q0(), f9Var.getMsgId(), f9Var);
        ((com.tencent.mm.ui.chatting.component.yg) ((sb5.c1) this.f472109e.f460708c.a(sb5.c1.class))).m0(f9Var);
    }
}
