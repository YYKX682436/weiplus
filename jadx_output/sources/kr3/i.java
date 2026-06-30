package kr3;

/* loaded from: classes8.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.j f311386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(kr3.j jVar) {
        super(0);
        this.f311386d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f311386d.getIntent().getBooleanExtra("view_only", false));
    }
}
