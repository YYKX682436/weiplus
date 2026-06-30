package f0;

/* loaded from: classes5.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f258257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(yz5.l lVar) {
        super(2);
        this.f258257d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        f0.z zVar = (f0.z) obj;
        ((java.lang.Number) obj2).intValue();
        kotlin.jvm.internal.o.g(zVar, "$this$null");
        return new f0.d(((f0.d) this.f258257d.invoke(zVar)).f258040a);
    }
}
