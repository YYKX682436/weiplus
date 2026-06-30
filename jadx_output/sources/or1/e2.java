package or1;

/* loaded from: classes12.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.d2 f347484d;

    public e2(or1.f2 f2Var, or1.d2 d2Var) {
        this.f347484d = d2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.SearchOrRecommendBizUI", "Has got recommend groups, so notifyDataSetChanged.");
        this.f347484d.notifyDataSetChanged();
    }
}
