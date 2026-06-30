package ee5;

/* loaded from: classes9.dex */
public final class r2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.t2 f252032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f252033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f252034f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f252035g;

    public r2(ee5.t2 t2Var, int i17, java.util.Set set, com.tencent.mm.storage.f9 f9Var) {
        this.f252032d = t2Var;
        this.f252033e = i17;
        this.f252034f = set;
        this.f252035g = f9Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ee5.t2 t2Var = this.f252032d;
        com.tencent.mars.xlog.Log.i(t2Var.f252048d, "delete message");
        de5.a.f229396a.c(19, this.f252033e);
        com.tencent.mm.ui.chatting.i3.a(t2Var.getActivity(), this.f252034f, new ee5.q2(this.f252035g, t2Var));
    }
}
