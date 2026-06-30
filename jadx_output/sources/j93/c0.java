package j93;

/* loaded from: classes.dex */
public final class c0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.g0 f298365d;

    public c0(j93.g0 g0Var) {
        this.f298365d = g0Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        ym3.o oVar = (ym3.o) obj;
        if ((oVar != null ? oVar.f463177a : null) == ym3.p.f463181f) {
            j93.g0 g0Var = this.f298365d;
            java.lang.String stringExtra = g0Var.getIntent().getStringExtra("label_name");
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) g0Var.f298390d).getValue()).k();
            kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
            com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
            if (a17 == null || (arrayList2 = a17.f152065o) == null) {
                arrayList = new java.util.ArrayList();
            } else {
                arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ri5.j) it.next()).f396111f);
                }
            }
            int size = arrayList.size();
            java.lang.String str = stringExtra + '(' + size + ')';
            com.tencent.mars.xlog.Log.i("MicroMsg.LabelTitleViewUIC", " size:" + size + " labelName:" + stringExtra + " labelId:" + ((java.lang.String) ((jz5.n) g0Var.f298391e).getValue()));
            androidx.appcompat.app.AppCompatActivity activity = g0Var.getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.setMMTitle(str);
            }
        }
    }
}
