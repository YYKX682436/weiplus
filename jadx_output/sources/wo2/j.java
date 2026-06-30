package wo2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f448080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f448081e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448082f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f448083g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup viewGroup, r45.nw1 nw1Var, java.lang.String str, long j17) {
        super(1);
        this.f448080d = viewGroup;
        this.f448081e = nw1Var;
        this.f448082f = str;
        this.f448083g = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        rp2.a config = (rp2.a) obj;
        kotlin.jvm.internal.o.g(config, "$this$config");
        android.view.ViewGroup viewGroup = this.f448080d;
        kotlin.jvm.internal.o.g(viewGroup, "<set-?>");
        config.f398567a = viewGroup;
        r45.nw1 nw1Var = this.f448081e;
        config.f398571e = nw1Var;
        java.lang.String string = nw1Var != null ? nw1Var.getString(3) : null;
        if (string == null) {
            string = "";
        }
        config.f398568b = string;
        java.lang.String str = this.f448082f;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        config.f398569c = str;
        config.f398570d = this.f448083g;
        return jz5.f0.f302826a;
    }
}
