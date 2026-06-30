package q01;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f359312d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17) {
        super(1);
        this.f359312d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.Map.Entry it = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((q01.l) it.getValue()).f359301d < this.f359312d);
    }
}
