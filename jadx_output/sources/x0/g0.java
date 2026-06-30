package x0;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f450891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f450892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, java.util.Collection collection) {
        super(1);
        this.f450891d = i17;
        this.f450892e = collection;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.addAll(this.f450891d, this.f450892e));
    }
}
