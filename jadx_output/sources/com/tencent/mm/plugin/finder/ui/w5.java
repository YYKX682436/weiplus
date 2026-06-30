package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderFansListUI f129976e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f129977f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(int i17, com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI, java.lang.String str) {
        super(0);
        this.f129975d = i17;
        this.f129976e = finderFansListUI;
        this.f129977f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj;
        if (this.f129975d == 0) {
            com.tencent.mm.plugin.finder.ui.FinderFansListUI finderFansListUI = this.f129976e;
            java.util.Iterator it = finderFansListUI.f128569w.iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (r26.i0.q(((r45.q21) next).getString(2), this.f129977f, false, 2, null)) {
                    obj = next;
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.ui.a6(finderFansListUI, q21Var.getString(2)));
            }
        }
        return jz5.f0.f302826a;
    }
}
