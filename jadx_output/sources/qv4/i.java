package qv4;

/* loaded from: classes12.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qv4.j f366979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ su4.p0 f366980e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qv4.j jVar, su4.p0 p0Var) {
        super(0);
        this.f366979d = jVar;
        this.f366980e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rv4.w wVar = (rv4.w) ((jz5.n) this.f366979d.f366984i).getValue();
        su4.p0 p0Var = this.f366980e;
        androidx.appcompat.app.AppCompatActivity activity = p0Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new qv4.r0(wVar, (com.tencent.mm.ui.MMActivity) activity, p0Var);
    }
}
