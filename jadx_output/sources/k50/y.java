package k50;

/* loaded from: classes.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k50.z f304269d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(k50.z zVar) {
        super(0);
        this.f304269d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f304269d.getIntent().getLongExtra("KEY_START_TIME", c01.id.c()));
    }
}
