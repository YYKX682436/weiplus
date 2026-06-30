package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class a50 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f117727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f117728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.re2 f117729c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f117730d;

    public a50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var, boolean z17, r45.re2 re2Var, boolean z18) {
        this.f117727a = q50Var;
        this.f117728b = z17;
        this.f117729c = re2Var;
        this.f117730d = z18;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.util.ArrayList<java.lang.String> stringArrayListExtra;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("label_id")) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f117727a;
        r45.re2 re2Var = q50Var.f119504z1;
        re2Var.getList(4).clear();
        re2Var.getList(4).addAll(stringArrayListExtra);
        java.util.List V0 = kz5.n0.V0(stringArrayListExtra);
        boolean z17 = this.f117728b;
        r45.re2 re2Var2 = this.f117729c;
        if (z17) {
            if (re2Var2 != null) {
                pm0.v.c0(V0, new com.tencent.mm.plugin.finder.live.widget.z40(re2Var2));
            }
            com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "select more labels result: " + kz5.n0.g0(V0, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        } else if (this.f117730d) {
            if (re2Var2 != null) {
                java.util.LinkedList list3 = re2Var2.getList(4);
                kotlin.jvm.internal.o.f(list3, "getLabel_list(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    if (!stringArrayListExtra.contains((java.lang.String) obj)) {
                        arrayList.add(obj);
                    }
                }
                V0 = kz5.n0.V0(arrayList);
            }
            com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "unselect more labels result: " + kz5.n0.g0(V0, "|", null, null, 0, null, null, 62, null) + " resultCode: " + i17);
        }
        if (q50Var.f119503y1 == null) {
            q50Var.f119503y1 = new r45.re2();
        }
        r45.re2 re2Var3 = q50Var.f119503y1;
        if (re2Var3 != null && (list2 = re2Var3.getList(4)) != null) {
            list2.clear();
        }
        r45.re2 re2Var4 = q50Var.f119503y1;
        if (re2Var4 != null && (list = re2Var4.getList(4)) != null) {
            list.addAll(V0);
        }
        q50Var.i0();
    }
}
