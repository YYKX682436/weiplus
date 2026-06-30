package w51;

/* loaded from: classes15.dex */
public class l implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public int f442986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w51.n f442987b;

    public l(w51.n nVar) {
        this.f442987b = nVar;
    }

    @Override // q51.b
    public void onItemSelected(int i17) {
        w51.n nVar = this.f442987b;
        int intValue = ((java.lang.Integer) nVar.f442993e.getAdapter().getItem(i17)).intValue();
        this.f442986a = ((java.lang.Integer) nVar.f442994f.getAdapter().getItem(nVar.f442994f.getCurrentItem())).intValue();
        if (intValue == nVar.f443007s) {
            nVar.f442994f.setAdapter(new o51.d(0, nVar.f443008t));
            int i18 = this.f442986a;
            int i19 = nVar.f443008t;
            if (i18 >= i19) {
                nVar.f442994f.setCurrentItem(i19);
            } else {
                nVar.f442994f.setCurrentItem(i18);
            }
        } else if (intValue == nVar.f443005q) {
            nVar.f442994f.setAdapter(new o51.d(nVar.f443006r, 59));
            int i27 = this.f442986a;
            int i28 = nVar.f443006r;
            if (i27 < i28) {
                nVar.f442994f.setCurrentItem(0);
            } else {
                nVar.f442994f.setCurrentItem(i27 - i28);
            }
        } else {
            nVar.f442994f.setAdapter(new o51.d(0, 59));
            nVar.f442994f.setCurrentItem(this.f442986a);
        }
        v51.a aVar = nVar.f443012x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}
