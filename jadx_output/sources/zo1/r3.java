package zo1;

/* loaded from: classes5.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo1.v f474758d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(wo1.v vVar) {
        super(1);
        this.f474758d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String auxIndex = ((p13.y) obj).f351187e;
        kotlin.jvm.internal.o.f(auxIndex, "auxIndex");
        return java.lang.Boolean.valueOf(!this.f474758d.contains(auxIndex));
    }
}
