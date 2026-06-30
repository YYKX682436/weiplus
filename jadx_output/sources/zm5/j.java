package zm5;

/* loaded from: classes3.dex */
public final class j implements db5.a8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zm5.l f474228a;

    public j(zm5.l lVar) {
        this.f474228a = lVar;
    }

    @Override // db5.a8
    public final void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryPageUIC", "longClick");
        zm5.l lVar = this.f474228a;
        androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        zm5.f0 f0Var = (zm5.f0) zVar.a(activity).a(zm5.f0.class);
        zm5.x0 x0Var = f0Var.f474216r;
        zm5.x0 x0Var2 = zm5.x0.f474287e;
        if ((x0Var == x0Var2 || f0Var.f474213o == x0Var2) ? false : true) {
            java.util.ArrayList arrayList = lVar.f474235f;
            com.tencent.mm.ui.base.MMViewPager mMViewPager = lVar.f474234e;
            kotlin.jvm.internal.o.d(mMViewPager);
            java.lang.Object obj = arrayList.get(mMViewPager.getCurrentItem());
            kotlin.jvm.internal.o.f(obj, "get(...)");
            com.tencent.mm.api.QueryImageData queryImageData = (com.tencent.mm.api.QueryImageData) obj;
            androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((zm5.f0) zVar.a(activity2).a(zm5.f0.class)).S6(queryImageData.f53203d, queryImageData.f53210n);
        }
    }
}
