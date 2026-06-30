package hj5;

/* loaded from: classes.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hj5.e f281663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f281664e;

    public a(hj5.e eVar, wi5.n0 n0Var) {
        this.f281663d = eVar;
        this.f281664e = n0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        int i17;
        kotlin.jvm.internal.o.g(it, "it");
        hj5.e eVar = this.f281663d;
        androidx.appcompat.app.AppCompatActivity activity = eVar.getActivity();
        android.content.Intent intent = new android.content.Intent();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.LinkedList linkedList = this.f281664e.f446319o;
        java.lang.Integer num = null;
        if (!(!com.tencent.mm.sdk.platformtools.t8.L0(linkedList))) {
            linkedList = null;
        }
        if (linkedList != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.util.List j17 = ((b93.b) c93.a.a()).j((java.lang.String) it6.next());
                if (j17 != null) {
                    if (!(!com.tencent.mm.sdk.platformtools.t8.L0(j17))) {
                        j17 = null;
                    }
                    if (j17 != null) {
                        hashSet.addAll(j17);
                    }
                }
            }
        }
        intent.putExtra("KSelectUserList", com.tencent.mm.sdk.platformtools.t8.c1(kz5.n0.S0(hashSet), ","));
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) eVar.f281668d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        if (a17 != null && (arrayList = a17.f152065o) != null) {
            if (arrayList.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it7 = arrayList.iterator();
                i17 = 0;
                while (it7.hasNext()) {
                    if (((ri5.j) it7.next()).f396126w && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectLabelTopMenuUIC", "clickConfirmMenu: size:" + num);
        intent.putExtra("INTENT_KEY_SIZE", num);
        activity.setResult(-1, intent);
        eVar.getActivity().finish();
        return false;
    }
}
