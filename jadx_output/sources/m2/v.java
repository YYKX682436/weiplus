package m2;

/* loaded from: classes13.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.o f322946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f322947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f322948h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.tooling.ComposeViewAdapter f322949i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.lang.String str2, n0.o oVar, java.lang.Class cls, int i17, androidx.compose.ui.tooling.ComposeViewAdapter composeViewAdapter) {
        super(0);
        this.f322944d = str;
        this.f322945e = str2;
        this.f322946f = oVar;
        this.f322947g = cls;
        this.f322948h = i17;
        this.f322949i = composeViewAdapter;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Throwable cause;
        try {
            m2.a.f322901a.d(this.f322944d, this.f322945e, this.f322946f, java.util.Arrays.copyOf(m2.h0.a(this.f322947g, this.f322948h), 0));
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            java.lang.Throwable th7 = th6;
            while ((th7 instanceof java.lang.ReflectiveOperationException) && (cause = th7.getCause()) != null) {
                th7 = cause;
            }
            m2.i0 i0Var = this.f322949i.f10842n;
            i0Var.getClass();
            synchronized (i0Var.f322923b) {
                i0Var.f322922a = th7;
                throw th6;
            }
        }
    }
}
