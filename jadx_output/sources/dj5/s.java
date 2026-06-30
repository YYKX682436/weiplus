package dj5;

/* loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233092d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dj5.b0 b0Var) {
        super(0);
        this.f233092d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(this.f233092d.getIntent().getBooleanExtra("addGroupManager", false));
    }
}
