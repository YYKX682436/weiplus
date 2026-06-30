package q0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f359225d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.Collection collection) {
        super(1);
        this.f359225d = collection;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(this.f359225d.contains(obj));
    }
}
