package of1;

/* loaded from: classes7.dex */
public class q implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.v f344989a;

    public q(of1.v vVar) {
        this.f344989a = vVar;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        of1.v vVar = this.f344989a;
        android.app.Activity v17 = ((of1.w1) vVar.f345014e).m533getPageView() != null ? ((of1.w1) vVar.f345014e).m533getPageView().v1() : null;
        if (v17 == null) {
            return false;
        }
        com.tencent.mm.plugin.webview.modeltools.n nVar = vVar.f345017h;
        if (nVar.f183327f == null) {
            if (i17 != 201) {
                return false;
            }
            nVar.f(v17, i17, i18, intent);
        }
        return true;
    }
}
