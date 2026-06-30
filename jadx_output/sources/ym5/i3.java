package ym5;

/* loaded from: classes15.dex */
public class i3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.j3 f463384d;

    public i3(ym5.j3 j3Var) {
        this.f463384d = j3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ym5.j3 j3Var = this.f463384d;
        j3Var.f463406t.W.run();
        com.tencent.mm.view.PhotoView photoView = j3Var.f463406t;
        photoView.W = null;
        photoView.invalidate();
    }
}
