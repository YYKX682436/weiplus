package sc3;

/* loaded from: classes7.dex */
public final class r implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f406528b;

    public r(sc3.k1 k1Var, int i17) {
        this.f406527a = k1Var;
        this.f406528b = i17;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f406527a.H0().F2(this.f406528b, (java.lang.String) obj);
    }
}
