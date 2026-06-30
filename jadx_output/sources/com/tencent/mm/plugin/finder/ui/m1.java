package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f129491d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderBlackListUI f129492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kh2 f129493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(r45.ix0 ix0Var, com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI, r45.kh2 kh2Var) {
        super(0);
        this.f129491d = ix0Var;
        this.f129492e = finderBlackListUI;
        this.f129493f = kh2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        int integer = this.f129491d.getInteger(1);
        com.tencent.mm.plugin.finder.ui.FinderBlackListUI finderBlackListUI = this.f129492e;
        if (integer == 0) {
            java.util.Iterator it = finderBlackListUI.f128517w.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (r26.i0.q(((r45.q21) next).getString(2), this.f129493f.getString(4), false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                java.util.ArrayList arrayList = finderBlackListUI.f128517w;
                arrayList.remove(q21Var);
                com.tencent.mm.plugin.finder.ui.e eVar = finderBlackListUI.f128516v;
                eVar.c(arrayList);
                eVar.notifyDataSetChanged();
                finderBlackListUI.e7();
            }
        } else {
            db5.t7.makeText(finderBlackListUI.getContext(), finderBlackListUI.getContext().getResources().getString(com.tencent.mm.R.string.d1v), 0).show();
        }
        return jz5.f0.f302826a;
    }
}
