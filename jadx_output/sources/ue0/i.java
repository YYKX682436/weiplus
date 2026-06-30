package ue0;

/* loaded from: classes4.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f426783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f426784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f426785g;

    public i(ue0.j jVar, java.lang.String str, java.lang.String str2, int i17, long j17) {
        this.f426782d = str;
        this.f426783e = str2;
        this.f426784f = i17;
        this.f426785g = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 o27;
        ot0.q v17;
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        if (c01.z1.r().equalsIgnoreCase(this.f426782d)) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.j1(0);
            f9Var.r1(3);
            f9Var.u1(this.f426783e);
            f9Var.e1(c01.w9.m(this.f426783e, c01.id.a() / 1000));
            com.tencent.mm.storage.z3 l17 = c01.e2.l(this.f426783e);
            android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
            int i17 = this.f426784f == 7 ? com.tencent.mm.R.string.jqh : com.tencent.mm.R.string.jqg;
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = l17 != null ? l17.g2() : "";
            objArr[1] = ((uh4.c0) i95.n0.c(uh4.c0.class)).xf(this.f426784f).b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            objArr[2] = "<_wc_custom_link_ href='weixin://teenagerModeAgreenAuthorization/" + this.f426785g + "'>";
            objArr[3] = "</_wc_custom_link_>";
            f9Var.d1(resources.getString(i17, objArr));
            f9Var.setType(10000);
            f9Var.f1(f9Var.w0() | 8);
            c01.w9.x(f9Var);
            if (this.f426784f == 7) {
                r45.v26 v26Var = new r45.v26();
                v26Var.f387830g = 4;
                v26Var.f387833m = this.f426783e;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                lVar.f70667d = 4277;
                lVar.f70666c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
                lVar.f70664a = v26Var;
                lVar.f70665b = new r45.w26();
                com.tencent.mm.modelbase.o a17 = lVar.a();
                com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
                iVar.p(a17);
                iVar.l();
            }
            o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f426783e, this.f426785g);
        } else {
            o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(this.f426782d, this.f426785g);
        }
        if (o27 == null || com.tencent.mm.sdk.platformtools.t8.K0(o27.j()) || (v17 = ot0.q.v(o27.j())) == null) {
            return;
        }
        v17.f348654f = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jqa) + v17.f348654f;
        o27.d1(ot0.q.u(v17, null, null));
        c01.w9.C(o27);
    }
}
