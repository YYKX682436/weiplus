package qt2;

/* loaded from: classes2.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.u f366607d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qt2.u uVar) {
        super(0);
        this.f366607d = uVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f366607d.getIntent().getBooleanExtra("allow_pull_top", false));
    }
}
