package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class q implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f205286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f205287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f205288c;

    public q(r45.g92 g92Var, android.view.View view, long j17) {
        this.f205286a = g92Var;
        this.f205287b = view;
        this.f205288c = j17;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        long j18;
        r45.g92 g92Var = this.f205286a;
        if (g92Var.getInteger(13) == 1) {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var = ml2.v1.f328140e;
            j18 = 1;
        } else {
            ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j18 = 2;
        }
        p52.c cVar = p52.h.f352016a;
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(map);
        int i17 = (int) j18;
        if (cVar.c(j17, str, map, i17)) {
            return;
        }
        com.tencent.mm.ui.chatting.viewitems.x xVar = com.tencent.mm.ui.chatting.viewitems.z.f206107a;
        if (xVar.j(g92Var.getString(1), (r45.nw1) g92Var.getCustom(24), this.f205287b, this.f205288c) || xVar.k(g92Var, (r45.nw1) g92Var.getCustom(24))) {
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Pj(j17, str, cVar.h(map, i17), 26236, false);
    }
}
