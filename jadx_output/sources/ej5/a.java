package ej5;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej5.b f253394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ej5.b bVar) {
        super(1);
        this.f253394d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        ej5.b bVar = this.f253394d;
        if (dVar != null && (dVar instanceof wi5.b)) {
            com.tencent.mars.xlog.Log.i("BackUpProcessResultUIC", "onCreate: ClickCancelMenuAction");
            bVar.getActivity().setResult(0, bVar.getIntent());
            bVar.getActivity().finish();
        }
        j75.d dVar2 = state.f298066d;
        if (dVar2 != null && (dVar2 instanceof wi5.c0)) {
            wi5.c0 c0Var = (wi5.c0) dVar2;
            com.tencent.mars.xlog.Log.i("BackUpProcessResultUIC", "onCreate: SelectConfirmAction  usernameList.size:" + c0Var.f446282b.size());
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(c0Var.f446282b, ","));
            bVar.getActivity().setResult(-1, intent);
            bVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
