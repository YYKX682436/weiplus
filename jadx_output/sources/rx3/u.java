package rx3;

/* loaded from: classes10.dex */
public final class u extends rx3.s {

    /* renamed from: e, reason: collision with root package name */
    public long f401062e;

    /* renamed from: f, reason: collision with root package name */
    public long f401063f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401064g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f401065h = -1;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f401066i = "";

    @Override // rx3.i
    public java.lang.Object a(int i17, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        return kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new rx3.t(this, i17, null), continuation);
    }

    public final void e(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f401066i = value;
        this.f401065h = -1;
        this.f401064g = true;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f401063f = java.lang.System.currentTimeMillis();
        ((java.util.ArrayList) this.f401055a).clear();
    }
}
