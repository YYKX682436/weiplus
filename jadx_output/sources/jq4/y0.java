package jq4;

/* loaded from: classes5.dex */
public final class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f301227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f301229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301230h;

    public y0(jq4.z0 z0Var, android.graphics.Bitmap bitmap, android.view.View view, android.widget.ImageView imageView, android.view.View view2) {
        this.f301226d = z0Var;
        this.f301227e = bitmap;
        this.f301228f = view;
        this.f301229g = imageView;
        this.f301230h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.y0 y0Var = this.f301226d.f301234c;
        if (y0Var != null) {
            kotlinx.coroutines.l.d(y0Var, null, null, new jq4.x0(this.f301227e, this.f301226d, this.f301228f, this.f301229g, this.f301230h, null), 3, null);
        }
    }
}
