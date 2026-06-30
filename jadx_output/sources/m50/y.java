package m50;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m50.z f323523d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m50.z zVar) {
        super(1);
        this.f323523d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectOnlyUIC", "SelectConfirmAction usernameList:" + c0Var.f446282b + ": ");
            android.content.Intent putExtra = new android.content.Intent().putExtra("Select_Conv_User", kz5.n0.g0(c0Var.f446282b, ",", null, null, 0, null, null, 62, null));
            kotlin.jvm.internal.o.f(putExtra, "putExtra(...)");
            m50.z zVar = this.f323523d;
            zVar.getActivity().setResult(-1, putExtra);
            zVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
