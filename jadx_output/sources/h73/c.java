package h73;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f279488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, long j17) {
        super(1);
        this.f279487d = str;
        this.f279488e = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle it = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String key = this.f279487d;
        kotlin.jvm.internal.o.g(key, "key");
        it.putLong(key, this.f279488e);
        return jz5.f0.f302826a;
    }
}
