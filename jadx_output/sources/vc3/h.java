package vc3;

/* loaded from: classes7.dex */
public final class h implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f435263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f435264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cl.j1 f435265c;

    public h(kotlin.jvm.internal.f0 f0Var, java.util.ArrayList arrayList, cl.j1 j1Var) {
        this.f435263a = f0Var;
        this.f435264b = arrayList;
        this.f435265c = j1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        cl.j1 j1Var;
        java.lang.String str = (java.lang.String) obj;
        kotlin.jvm.internal.f0 f0Var = this.f435263a;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        if (i17 != this.f435264b.size() || (j1Var = this.f435265c) == null) {
            return;
        }
        j1Var.a(str, new cl.k1());
    }
}
