package qe5;

/* loaded from: classes9.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.o f362132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qe5.o oVar) {
        super(0);
        this.f362132d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Long.valueOf(this.f362132d.getIntent().getLongExtra("app_msg_id", -1L));
    }
}
