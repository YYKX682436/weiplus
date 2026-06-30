package qe5;

/* loaded from: classes9.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.o f362144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(qe5.o oVar) {
        super(0);
        this.f362144d = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f362144d.getIntent().getStringExtra("msg_talker");
    }
}
