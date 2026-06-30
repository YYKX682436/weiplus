package fj5;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fj5.i f263247d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(fj5.i iVar) {
        super(1);
        this.f263247d = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        wi5.c0 c0Var = (wi5.c0) state.a(wi5.c0.class);
        if (c0Var != null) {
            fj5.i iVar = this.f263247d;
            iVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            iVar.getActivity().setResult(-1, intent);
            iVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
