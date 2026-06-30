package fj5;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wi5.c0 f263242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fj5.e f263243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(wi5.c0 c0Var, fj5.e eVar) {
        super(0);
        this.f263242d = c0Var;
        this.f263243e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wi5.c0 c0Var = this.f263242d;
        if (!c0Var.f446282b.isEmpty()) {
            java.lang.String str = (java.lang.String) kz5.n0.X(c0Var.f446282b);
            com.tencent.mars.xlog.Log.i("MicroMsg.Forward.ClawBotReturnUIC", "ClawBot selected: " + str);
            fj5.e eVar = this.f263243e;
            eVar.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            eVar.getActivity().setResult(-1, intent);
            eVar.getActivity().finish();
        }
        return jz5.f0.f302826a;
    }
}
