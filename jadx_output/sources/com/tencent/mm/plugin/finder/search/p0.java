package com.tencent.mm.plugin.finder.search;

/* loaded from: classes8.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ix0 f125807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFansSearchUI f125808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kh2 f125809f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(r45.ix0 ix0Var, com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI, r45.kh2 kh2Var) {
        super(0);
        this.f125807d = ix0Var;
        this.f125808e = finderFansSearchUI;
        this.f125809f = kh2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.kh2 kh2Var;
        java.lang.Object obj;
        r45.ix0 ix0Var = this.f125807d;
        if (ix0Var.getInteger(1) == 0) {
            com.tencent.mm.plugin.finder.search.FinderFansSearchUI finderFansSearchUI = this.f125808e;
            java.util.Iterator it = finderFansSearchUI.f125540x.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                kh2Var = this.f125809f;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (r26.i0.q(((r45.q21) obj).getString(2), kh2Var.getString(4), false, 2, null)) {
                    break;
                }
            }
            r45.q21 q21Var = (r45.q21) obj;
            if (q21Var != null) {
                finderFansSearchUI.f125540x.remove(q21Var);
                com.tencent.mm.plugin.finder.search.i0 i0Var = finderFansSearchUI.f125541y;
                if (i0Var == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                i0Var.notifyDataSetChanged();
                com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent finderAddUserToBlackListEvent = new com.tencent.mm.autogen.events.FinderAddUserToBlackListEvent();
                java.lang.String string = kh2Var.getString(4);
                am.ma maVar = finderAddUserToBlackListEvent.f54256g;
                maVar.f7331a = string;
                maVar.f7332b = ix0Var.getInteger(1);
                finderAddUserToBlackListEvent.e();
            }
        }
        return jz5.f0.f302826a;
    }
}
