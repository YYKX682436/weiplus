package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class y2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FollowUserEvent f120404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h3 f120405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent, com.tencent.mm.plugin.finder.live.widget.h3 h3Var) {
        super(0);
        this.f120404d = followUserEvent;
        this.f120405e = h3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.FollowUserEvent followUserEvent = this.f120404d;
        java.lang.String str = followUserEvent.f54346g.f8551a;
        com.tencent.mm.plugin.finder.live.widget.h3 h3Var = this.f120405e;
        r45.cw1 cw1Var = h3Var.f118515d;
        boolean b17 = kotlin.jvm.internal.o.b(str, cw1Var != null ? cw1Var.getString(0) : null);
        am.zd zdVar = followUserEvent.f54346g;
        if (b17) {
            int i17 = zdVar.f8552b;
            boolean z17 = i17 == 4 || i17 == 1;
            android.view.View view = h3Var.f118519h;
            if (z17) {
                r45.cw1 cw1Var2 = h3Var.f118515d;
                if (cw1Var2 != null && cw1Var2.getBoolean(4)) {
                    r5 = true;
                }
                if (!r5) {
                    r45.cw1 cw1Var3 = h3Var.f118515d;
                    if (cw1Var3 != null) {
                        cw1Var3.set(4, java.lang.Boolean.TRUE);
                    }
                    h3Var.a(view != null ? view.findViewById(com.tencent.mm.R.id.i_f) : null, h3Var.f118515d);
                }
            } else {
                if (i17 == 5 || i17 == 2) {
                    r45.cw1 cw1Var4 = h3Var.f118515d;
                    if (cw1Var4 != null && !cw1Var4.getBoolean(4)) {
                        r5 = true;
                    }
                    if (!r5) {
                        r45.cw1 cw1Var5 = h3Var.f118515d;
                        if (cw1Var5 != null) {
                            cw1Var5.set(4, java.lang.Boolean.FALSE);
                        }
                        h3Var.a(view != null ? view.findViewById(com.tencent.mm.R.id.i_f) : null, h3Var.f118515d);
                    }
                }
            }
        } else {
            com.tencent.mm.plugin.finder.live.widget.u2 u2Var = h3Var.f118517f;
            java.util.Iterator it = u2Var.f119929d.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((r45.cw1) it.next()).getString(0), zdVar.f8551a)) {
                    break;
                }
                i18++;
            }
            if (i18 != -1) {
                int i19 = zdVar.f8552b;
                if (!(i19 == 4 || i19 == 1)) {
                    if ((i19 == 5 || i19 == 2) && ((r45.cw1) u2Var.f119929d.get(i18)).getBoolean(4)) {
                        ((r45.cw1) u2Var.f119929d.get(i18)).set(4, java.lang.Boolean.FALSE);
                        u2Var.notifyItemChanged(i18);
                    }
                } else if (!((r45.cw1) u2Var.f119929d.get(i18)).getBoolean(4)) {
                    ((r45.cw1) u2Var.f119929d.get(i18)).set(4, java.lang.Boolean.TRUE);
                    u2Var.notifyItemChanged(i18);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
