package cw0;

/* loaded from: classes5.dex */
public final class g0 implements pv0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw0.l0 f222631a;

    public g0(cw0.l0 l0Var) {
        this.f222631a = l0Var;
    }

    @Override // pv0.a
    public void a(com.tencent.maas.base.MJID segmentID, java.lang.String roleID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(roleID, "roleID");
        cw0.l0 l0Var = this.f222631a;
        ex0.q x76 = l0Var.x7(segmentID);
        if (x76 == null) {
            return;
        }
        l0Var.O7(segmentID, x76);
    }

    @Override // pv0.a
    public void b(com.tencent.maas.base.MJID segmentID) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        this.f222631a.P7(segmentID);
    }

    @Override // pv0.a
    public void c(dw0.c timbreInfo) {
        com.tencent.maas.base.MJID mjid;
        cw0.l0 l0Var;
        ex0.q x76;
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.moviecomposing.segments.Segment segment = timbreInfo.f244087b;
        if (segment == null || (mjid = segment.f48532a) == null || (x76 = (l0Var = this.f222631a).x7(mjid)) == null || !timbreInfo.b()) {
            return;
        }
        l0Var.S7(x76);
    }

    @Override // pv0.a
    public void d(dw0.c timbreInfo) {
        com.tencent.maas.base.MJID mjid;
        cw0.l0 l0Var;
        ex0.q x76;
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        com.tencent.maas.moviecomposing.segments.Segment segment = timbreInfo.f244087b;
        if (segment == null || (mjid = segment.f48532a) == null || (x76 = (l0Var = this.f222631a).x7(mjid)) == null) {
            return;
        }
        l0Var.N7(x76);
    }

    @Override // pv0.a
    public void e(ru0.e roleResult) {
        com.tencent.mm.vfs.r6 r6Var;
        kotlin.jvm.internal.o.g(roleResult, "roleResult");
        cw0.l0 l0Var = this.f222631a;
        ex0.q x76 = l0Var.x7(roleResult.f399662a);
        if (x76 == null || (r6Var = roleResult.f399665d) == null) {
            return;
        }
        l0Var.K7(roleResult, x76, r6Var);
    }

    @Override // pv0.a
    public boolean f(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
        boolean b17 = timbreInfo.b();
        cw0.l0 l0Var = this.f222631a;
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = timbreInfo.f244086a;
        if (b17) {
            l0Var.s7(new cw0.d0(l0Var));
        } else {
            l0Var.s7(new cw0.e0(dw0.f.a(mJMaterialInfo), mJMaterialInfo.f48226d));
            java.util.List y76 = l0Var.y7();
            if (y76 != null) {
                java.util.Objects.toString(timbreInfo);
                gx0.sc z76 = l0Var.z7();
                ug.m mVar = ug.m.Narration;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = y76.iterator();
                while (it.hasNext()) {
                    com.tencent.maas.moviecomposing.segments.Segment segment = ((ex0.q) it.next()).f257167a;
                    kotlin.jvm.internal.o.e(segment, "null cannot be cast to non-null type com.tencent.maas.moviecomposing.segments.NarrationSegment");
                    yu0.t f17 = ru0.a.f((com.tencent.maas.moviecomposing.segments.NarrationSegment) segment, mJMaterialInfo);
                    if (f17 != null) {
                        arrayList.add(f17);
                    }
                }
                z76.p7(mVar, arrayList);
            }
        }
        if (!kotlin.jvm.internal.o.b(l0Var.f222647s, mJMaterialInfo)) {
            java.lang.String string = l0Var.getContext().getString(com.tencent.mm.R.string.f492507hj);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            l0Var.U7(string);
        }
        kotlin.jvm.internal.o.g(mJMaterialInfo, "<set-?>");
        l0Var.f222647s = mJMaterialInfo;
        cw0.l0 l0Var2 = this.f222631a;
        pf5.e.launchUI$default(l0Var2, null, null, new cw0.f0(l0Var2, null), 3, null);
        return true;
    }

    @Override // pv0.a
    public void g(dw0.c timbreInfo) {
        kotlin.jvm.internal.o.g(timbreInfo, "timbreInfo");
    }
}
