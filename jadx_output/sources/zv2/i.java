package zv2;

/* loaded from: classes8.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.m implements yz5.a {
    public i(java.lang.Object obj) {
        super(0, obj, zv2.m.class, "onClickModify", "onClickModify()V", 0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Button button;
        zv2.m mVar = (zv2.m) this.receiver;
        java.lang.String str = mVar.f476412h;
        if (str == null) {
            str = "";
        }
        uc0.v vVar = new uc0.v(str, 0, com.tencent.mm.ui.tools.v4.e(str, com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2) + 1, new zv2.h(mVar));
        androidx.appcompat.app.AppCompatActivity appCompatActivity = mVar.f476395d;
        vVar.f426288h = appCompatActivity.getResources().getString(com.tencent.mm.R.string.evs);
        vVar.f426289i = 1;
        vVar.f426286f = mVar.f476414m;
        vVar.f426287g = mVar.f476415n;
        vVar.f426291k = new zv2.e(mVar);
        vVar.f426292l = new zv2.d(mVar);
        mVar.f476413i = vVar;
        uc0.q qVar = (uc0.q) i95.n0.c(uc0.q.class);
        uc0.v vVar2 = mVar.f476413i;
        ((tc0.m) qVar).getClass();
        hw3.a.b(appCompatActivity, vVar2);
        uc0.v vVar3 = mVar.f476413i;
        if (vVar3 != null && (button = vVar3.f426290j) != null) {
            mVar.n(button, "product_title_finish_button", 8);
        }
        return jz5.f0.f302826a;
    }
}
