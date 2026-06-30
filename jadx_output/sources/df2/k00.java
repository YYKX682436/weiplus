package df2;

/* loaded from: classes3.dex */
public final class k00 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230536d;

    public k00(df2.m00 m00Var) {
        this.f230536d = m00Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        r45.j92 j92Var = (r45.j92) obj;
        df2.m00 m00Var = this.f230536d;
        if (j92Var == null) {
            com.tencent.mars.xlog.Log.i(m00Var.f230740m, "get vipInfo = null");
            return;
        }
        if (j92Var.getInteger(2) != 0) {
            java.util.LinkedList list = j92Var.getList(0);
            if (!(list == null || list.isEmpty())) {
                java.lang.String str = m00Var.f230740m;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on new vip info ");
                java.util.LinkedList list2 = j92Var.getList(0);
                if (list2 != null) {
                    arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((r45.b35) it.next()).getString(0));
                    }
                } else {
                    arrayList = null;
                }
                sb6.append(arrayList);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                java.util.LinkedList list3 = j92Var.getList(0);
                kotlin.jvm.internal.o.f(list3, "getPag_animation_info(...)");
                m00Var.f230741n = list3;
                android.view.View findViewById = m00Var.findViewById(com.tencent.mm.R.id.f483752by4);
                if (findViewById != null) {
                    findViewById.setOnClickListener(new df2.l00(m00Var));
                }
                df2.m00 m00Var2 = this.f230536d;
                com.tencent.mm.plugin.finder.live.util.y.o(m00Var2, null, null, new df2.j00(m00Var2, null), 3, null);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(m00Var.f230740m, "get hide flag or empty animationList, hide bubble");
        com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout d76 = m00Var.d7();
        if (d76 != null) {
            d76.c();
        }
    }
}
