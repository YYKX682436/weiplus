package ey2;

/* loaded from: classes2.dex */
public final class h extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public int f257382e;

    /* renamed from: f, reason: collision with root package name */
    public int f257383f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f257384g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f257385h;

    public h() {
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d.observeForever(ey2.g.f257374d);
    }

    public final void N6() {
        com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", "[doSync] needScene=" + this.f257383f);
        try {
            ya2.t1 t1Var = new ya2.t1(null, null, null, null, null, 31, null);
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = this.f257385h;
            if (jbVar != null) {
                ya2.w1.a(t1Var.f460542e, jbVar);
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = this.f257384g;
            if (jbVar2 != null) {
                java.lang.String str = jbVar2.field_ctrInfo.f388490h;
                if (str == null) {
                    str = "";
                }
                t1Var.f460538a = str;
                ya2.w1.a(t1Var.f460539b, jbVar2);
                this.f257382e = this.f257383f;
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).P.f(826259965, this.f257383f, null, t1Var);
        } finally {
            this.f257383f = 0;
            this.f257385h = null;
            this.f257384g = null;
        }
    }

    public final void O6() {
        if (this.f257382e > 0) {
            r45.f03 I0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[exposeFindMoreUI] hasEntranceRedDot=");
            sb6.append(I0 != null);
            sb6.append(" scene=");
            sb6.append(this.f257382e);
            com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", sb6.toString());
            if (I0 == null) {
                if (this.f257382e == 22) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(2017L, 0L, 1L);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(2017L, 1L, 1L);
                }
            }
            this.f257382e = 0;
        }
        if (this.f257383f != 0) {
            N6();
        }
    }

    public final void P6(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        jz5.f0 f0Var;
        java.util.LinkedList linkedList;
        r45.vs2 vs2Var = jbVar != null ? jbVar.field_ctrInfo : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[markEntranceCtrlInfo] ctrlInfo=");
        sb6.append(vs2Var != null ? vs2Var.f388490h : null);
        sb6.append(" show_infos=");
        sb6.append((vs2Var == null || (linkedList = vs2Var.f388489g) == null) ? null : java.lang.Integer.valueOf(linkedList.size()));
        sb6.append(", localCtrlInfo=");
        sb6.append(jbVar != null ? jbVar.field_tipsId : null);
        sb6.append('_');
        sb6.append(jbVar != null ? jbVar.field_tips_uuid : null);
        com.tencent.mars.xlog.Log.i("Finder.AlternateRedDotVM", sb6.toString());
        if (vs2Var != null) {
            this.f257384g = jbVar;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            this.f257384g = null;
        }
    }
}
