package sc3;

/* loaded from: classes7.dex */
public final class r0 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406529a;

    public r0(sc3.k1 k1Var) {
        this.f406529a = k1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        this.f406529a.onCreated();
    }
}
