package of1;

/* loaded from: classes7.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.v f345005d;

    public t(of1.v vVar) {
        this.f345005d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        of1.v vVar = this.f345005d;
        if (((of1.w1) vVar.f345014e).m533getPageView().C1() != null) {
            ((of1.w1) vVar.f345014e).m533getPageView().C1().g();
            ni1.e eVar = (ni1.e) ((of1.w1) vVar.f345014e).m533getPageView().B1(ni1.e.class);
            if (eVar != null) {
                eVar.d(null);
            }
        }
    }
}
