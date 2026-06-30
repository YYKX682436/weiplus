package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.b4 f125617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.finder.search.b4 b4Var) {
        super(1);
        this.f125617d = b4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.search.b4 b4Var = this.f125617d;
        int i17 = fVar != null ? fVar.f70615a : 0;
        int i18 = fVar != null ? fVar.f70616b : 0;
        r45.iu2 iu2Var = fVar != null ? (r45.iu2) fVar.f70618d : null;
        b4Var.getClass();
        if (i17 == 0 && i18 == 0 && iu2Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd getHotWords : ");
            java.util.LinkedList list = iu2Var.getList(1);
            sb6.append(list != null ? list.size() : -1);
            sb6.append(' ');
            com.tencent.mars.xlog.Log.i("Finder.FinderPopularListLogic", sb6.toString());
            java.util.LinkedList list2 = iu2Var.getList(1);
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    if (((r45.lu2) next).getInteger(1) != 1) {
                        it.remove();
                    }
                }
            }
            android.widget.TextView textView = b4Var.f125635f;
            java.lang.String string = iu2Var.getString(2);
            if (string == null) {
                string = b4Var.f125633d.getResources().getString(com.tencent.mm.R.string.f492056f31);
            }
            textView.setText(string);
            b4Var.a(list2, true);
            if (list2 == null) {
                list2 = new java.util.LinkedList();
            }
            r45.cp2 cp2Var = new r45.cp2();
            cp2Var.set(1, list2);
            cp2Var.set(0, java.lang.Long.valueOf(c01.id.e()));
            com.tencent.mm.plugin.finder.search.y3.f125986c = cp2Var;
            ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.finder.search.x3.f125977d);
            b4Var.b();
        }
        return jz5.f0.f302826a;
    }
}
