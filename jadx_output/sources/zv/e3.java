package zv;

/* loaded from: classes.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f475959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(long j17) {
        super(1);
        this.f475959d = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent start = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(start, "$this$start");
        start.putExtra(ya.b.SOURCE, (int) this.f475959d);
        return jz5.f0.f302826a;
    }
}
