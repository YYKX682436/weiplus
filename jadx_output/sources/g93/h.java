package g93;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f269779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g93.j jVar) {
        super(0);
        this.f269779d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        g93.j jVar = this.f269779d;
        return java.lang.Integer.valueOf(jVar.getIntent().getIntExtra("Select_Conv_Type", jVar.f269781d));
    }
}
