package tk4;

/* loaded from: classes5.dex */
public final class b0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tk4.c0 f419961a;

    public b0(tk4.c0 c0Var) {
        this.f419961a = c0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f419961a.a(true);
        super.handleMessage(msg);
    }
}
