package g93;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g93.j f269773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g93.j jVar) {
        super(0);
        this.f269773d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f269773d.getIntent().getBooleanExtra("key_canSelectOpenIM", false));
    }
}
