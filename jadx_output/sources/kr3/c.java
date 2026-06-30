package kr3;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.j f311344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kr3.j jVar) {
        super(0);
        this.f311344d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Integer.valueOf(this.f311344d.getIntent().getIntExtra("scroll_to", 0));
    }
}
