package fo5;

/* loaded from: classes11.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f264967d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(fo5.r0 r0Var) {
        super(0);
        this.f264967d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ro5.b bVar = this.f264967d.f265097p;
        if (bVar != null) {
            return java.lang.Boolean.valueOf(bVar.isCameraOn());
        }
        kotlin.jvm.internal.o.o("renderController");
        throw null;
    }
}
