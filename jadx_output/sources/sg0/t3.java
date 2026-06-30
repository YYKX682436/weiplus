package sg0;

/* loaded from: classes8.dex */
public class t3 implements e75.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e75.a f407816d;

    public t3(sg0.u3 u3Var, e75.a aVar) {
        this.f407816d = aVar;
    }

    @Override // e75.a
    public void onChanged(java.lang.Object obj) {
        try {
            this.f407816d.onChanged((ug0.x) obj);
        } catch (java.lang.ClassCastException e17) {
            com.tencent.mars.xlog.Log.w("WebSearchService", "Can't cast WebSearchState to target: \n" + e17.toString());
        }
    }
}
