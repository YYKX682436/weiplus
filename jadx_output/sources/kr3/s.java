package kr3;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr3.t f311472d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(kr3.t tVar) {
        super(0);
        this.f311472d = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f311472d.getIntent().getBooleanExtra("view_only", false));
    }
}
