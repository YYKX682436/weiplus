package o50;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o50.j f343061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o50.j jVar) {
        super(0);
        this.f343061d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f343061d.getIntent().getBooleanExtra("ForwardParams_EnableContentClick", true));
    }
}
