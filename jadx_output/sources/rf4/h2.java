package rf4;

/* loaded from: classes4.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f395060a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f395061b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f395062c;

    /* renamed from: d, reason: collision with root package name */
    public int f395063d;

    /* renamed from: e, reason: collision with root package name */
    public final long f395064e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f395065f;

    public h2(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f395060a = view;
        this.f395064e = android.view.ViewConfiguration.getDoubleTapTimeout();
        this.f395065f = new rf4.g2(this);
    }

    public final void a() {
        yz5.l lVar;
        int i17 = this.f395063d;
        android.view.View view = this.f395060a;
        if (i17 == 1) {
            yz5.l lVar2 = this.f395061b;
            if (lVar2 != null) {
                lVar2.invoke(view);
            }
        } else if (i17 == 2 && (lVar = this.f395062c) != null) {
            lVar.invoke(view);
        }
        this.f395063d = 0;
    }
}
