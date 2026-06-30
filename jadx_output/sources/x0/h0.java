package x0;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f450895d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.util.Collection collection) {
        super(1);
        this.f450895d = collection;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.retainAll(this.f450895d));
    }
}
