package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class f50 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q50 f118313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f118314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f118315c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f118316d;

    public f50(com.tencent.mm.plugin.finder.live.widget.q50 q50Var, boolean z17, java.util.LinkedList linkedList, boolean z18) {
        this.f118313a = q50Var;
        this.f118314b = z17;
        this.f118315c = linkedList;
        this.f118316d = z18;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        java.lang.Object obj;
        java.io.Serializable serializableExtra = intent != null ? intent.getSerializableExtra("KEY_PARAMS_CHOOSE_WHITE_LIST") : null;
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            java.util.LinkedList G2 = zl2.r4.f473950a.G2(list, null);
            com.tencent.mm.plugin.finder.live.widget.q50 q50Var = this.f118313a;
            r45.re2 re2Var = q50Var.f119504z1;
            re2Var.getList(3).clear();
            re2Var.getList(3).addAll(G2);
            boolean z17 = this.f118314b;
            java.util.LinkedList linkedList = this.f118315c;
            if (z17) {
                if (linkedList != null) {
                    pm0.v.d0(G2, new com.tencent.mm.plugin.finder.live.widget.c50(linkedList));
                }
                com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "add file list = ".concat(kz5.n0.g0(G2, "|", null, null, 0, null, com.tencent.mm.plugin.finder.live.widget.d50.f118058d, 30, null)));
            } else if (this.f118316d) {
                if (linkedList != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj2 : linkedList) {
                        r45.il1 il1Var = (r45.il1) obj2;
                        java.util.Iterator it = G2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (kotlin.jvm.internal.o.b(((r45.il1) obj).getString(0), il1Var.getString(0))) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        if (!(obj != null)) {
                            arrayList.add(obj2);
                        }
                    }
                    G2 = new java.util.LinkedList(arrayList);
                }
                com.tencent.mars.xlog.Log.i("FinderLivingWhiteListPanel", "remove file list = ".concat(kz5.n0.g0(G2, "|", null, null, 0, null, com.tencent.mm.plugin.finder.live.widget.e50.f118228d, 30, null)));
            }
            r45.re2 re2Var2 = q50Var.f119503y1;
            if (re2Var2 == null) {
                r45.re2 re2Var3 = new r45.re2();
                re2Var3.set(3, G2);
                q50Var.f119503y1 = re2Var3;
            } else if (re2Var2 != null) {
                re2Var2.set(3, G2);
            }
            q50Var.i0();
        }
    }
}
