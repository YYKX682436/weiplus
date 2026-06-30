package dq2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f242361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.Throwable th6) {
        super(0);
        this.f242361d = th6;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String stackTraceString = android.util.Log.getStackTraceString(this.f242361d);
        kotlin.jvm.internal.o.f(stackTraceString, "getStackTraceString(...)");
        return stackTraceString;
    }
}
