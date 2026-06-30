package kr3;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.t f311410d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(kr3.t tVar) {
        super(0);
        this.f311410d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f311410d.getIntent().getIntExtra("scroll_to", 0));
    }
}
