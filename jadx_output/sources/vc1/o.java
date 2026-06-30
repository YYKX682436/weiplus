package vc1;

/* loaded from: classes13.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f435026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f435027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vc1.p1 f435028f;

    public o(vc1.p1 p1Var, android.widget.ImageView imageView, android.widget.FrameLayout.LayoutParams layoutParams) {
        this.f435028f = p1Var;
        this.f435026d = imageView;
        this.f435027e = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f435028f.f435064c.addView(this.f435026d, this.f435027e);
        synchronized (this.f435028f.V) {
            vc1.p1 p1Var = this.f435028f;
            p1Var.V.add(new vc1.h1(p1Var, this.f435026d));
        }
    }
}
