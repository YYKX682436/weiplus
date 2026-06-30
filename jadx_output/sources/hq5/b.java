package hq5;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq5.f f283218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hq5.f fVar) {
        super(0);
        this.f283218d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f283218d.getIntent().getStringExtra("KErrorText");
    }
}
