package ix3;

/* loaded from: classes.dex */
public final class d3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q55.e f295386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex3.e f295387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f295388f;

    public d3(q55.e eVar, ex3.e eVar2, ix3.j3 j3Var) {
        this.f295386d = eVar;
        this.f295387e = eVar2;
        this.f295388f = j3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        q55.e eVar = this.f295386d;
        if (i17 == 0) {
            bm5.o1.f22719a.q(eVar, 0);
        } else {
            bm5.o1.f22719a.q(eVar, 1);
        }
        ex3.e eVar2 = (ex3.e) this.f295387e.y0();
        if (i17 == 0) {
            eVar2.f257210g = "以X实验为主";
        } else {
            eVar2.f257210g = "以维修厂为主";
        }
        com.tencent.mm.plugin.mvvmlist.MvvmList mvvmList = this.f295388f.f295466d;
        if (mvvmList != null) {
            com.tencent.mm.plugin.mvvmlist.MvvmList.A(mvvmList, eVar2, false, 2, null);
        }
    }
}
