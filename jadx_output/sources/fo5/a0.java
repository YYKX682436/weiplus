package fo5;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f264950d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(fo5.r0 r0Var) {
        super(0);
        this.f264950d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ro5.b bVar = this.f264950d.f265097p;
        if (bVar != null) {
            return java.lang.Boolean.valueOf(bVar.isCameraOn());
        }
        kotlin.jvm.internal.o.o("renderController");
        throw null;
    }
}
