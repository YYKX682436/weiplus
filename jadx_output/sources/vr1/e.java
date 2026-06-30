package vr1;

/* loaded from: classes8.dex */
public final class e implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439556a;

    public e(vr1.o oVar) {
        this.f439556a = oVar;
    }

    @Override // in5.y0
    public void a(androidx.recyclerview.widget.RecyclerView recyclerView, in5.w0 data) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(data, "data");
        vr1.o oVar = this.f439556a;
        int size = oVar.P6().f152065o.size();
        if (size > 0 && data.f293152e > size - 10) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.g(oVar.P6(), null, 0, 2, null);
        }
        pm0.v.X(new vr1.d(oVar, data));
    }
}
