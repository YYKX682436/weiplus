package in5;

/* loaded from: classes10.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f293161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f293162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f293163f;

    public z0(com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, androidx.recyclerview.widget.RecyclerView recyclerView, kotlin.jvm.internal.h0 h0Var) {
        this.f293161d = wxRecyclerAdapter;
        this.f293162e = recyclerView;
        this.f293163f = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.y0 y0Var = this.f293161d.F;
        if (y0Var != null) {
            y0Var.a(this.f293162e, (in5.w0) this.f293163f.f310123d);
        }
    }
}
