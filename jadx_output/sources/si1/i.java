package si1;

/* loaded from: classes7.dex */
public class i implements ui1.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ si1.k f408264a;

    public i(si1.g gVar, si1.k kVar) {
        this.f408264a = kVar;
    }

    @Override // ui1.r
    public void a() {
        si1.k kVar = this.f408264a;
        if (kVar != null) {
            kVar.a(si1.j.f408269g);
        }
    }

    @Override // ui1.r
    public void c(int i17, java.lang.String str) {
        si1.k kVar = this.f408264a;
        if (kVar != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                kVar.a(new si1.j(-1, "fail:auth denied", new jc1.d(i17, null)));
                return;
            }
            kVar.a(new si1.j(-1, "fail " + str, new jc1.d(i17, null)));
        }
    }

    @Override // ui1.r
    public void onCancel() {
        si1.k kVar = this.f408264a;
        if (kVar != null) {
            kVar.a(si1.j.f408266d);
        }
    }
}
