package ds2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cs2.p f242902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(cs2.p pVar) {
        super(1);
        this.f242902d = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        kotlin.jvm.internal.o.g(it, "it");
        cs2.p pVar = this.f242902d;
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.f222092i2, pVar.f222092i2) && it.f241805x == pVar.f241805x && it.V1 == pVar.V1);
    }
}
