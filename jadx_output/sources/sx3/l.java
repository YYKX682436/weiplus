package sx3;

/* loaded from: classes10.dex */
public final class l implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx3.m f413563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f413564b;

    public l(sx3.m mVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f413563a = mVar;
        this.f413564b = appCompatActivity;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onScrollStatsChanged");
        java.util.LinkedList linkedList = data.f293156i;
        if (!linkedList.isEmpty()) {
            kotlinx.coroutines.l.d(this.f413563a.getLifecycleScope(), null, null, new sx3.k(linkedList, this.f413564b, null), 3, null);
        }
    }
}
