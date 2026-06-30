package j93;

/* loaded from: classes.dex */
public final class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f298539d;

    public z0(j93.j1 j1Var) {
        this.f298539d = j1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        java.util.ArrayList arrayList;
        int i17;
        kotlin.jvm.internal.o.g(it, "it");
        j93.j1 j1Var = this.f298539d;
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) j1Var.f298413d).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        java.lang.Integer num = null;
        if (a17 != null && (arrayList = a17.f152065o) != null) {
            if (arrayList.isEmpty()) {
                i17 = 0;
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                i17 = 0;
                while (it6.hasNext()) {
                    if (((ri5.j) it6.next()).f396126w && (i17 = i17 + 1) < 0) {
                        kz5.c0.o();
                        throw null;
                    }
                }
            }
            num = java.lang.Integer.valueOf(i17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clickConfirmMenu: count:");
        java.util.HashSet hashSet = j1Var.f298415f;
        sb6.append(hashSet.size());
        sb6.append(" size:");
        sb6.append(num);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomContactTopMenuUIC", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        for (java.lang.String str : (java.util.List) ((jz5.n) j1Var.f298414e).getValue()) {
            if (hashSet.contains(str)) {
                hashSet.remove(str);
            }
        }
        java.util.List S0 = kz5.n0.S0(hashSet);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(S0)) {
            intent.putExtra("KSelectUserList", com.tencent.mm.sdk.platformtools.t8.c1(S0, ","));
        }
        intent.putExtra("INTENT_KEY_SIZE", num);
        j1Var.getActivity().setResult(-1, intent);
        j1Var.getActivity().finish();
        return false;
    }
}
