package mx0;

/* loaded from: classes5.dex */
public final class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.j3 f332042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332043e;

    public i3(mx0.j3 j3Var, java.lang.String str) {
        this.f332042d = j3Var;
        this.f332043e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mx0.j3 j3Var = this.f332042d;
        android.view.View view = j3Var.f331814d;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.TextView");
        ((android.widget.TextView) j3Var.f331814d).setText(this.f332043e);
    }
}
