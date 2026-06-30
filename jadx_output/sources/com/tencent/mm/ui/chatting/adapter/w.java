package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f198446a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f198447b;

    /* renamed from: c, reason: collision with root package name */
    public final int f198448c;

    /* renamed from: d, reason: collision with root package name */
    public final long f198449d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f198450e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f198451f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.adapter.v f198452g;

    public w(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.app.d D0;
        ot0.m1 m1Var;
        this.f198448c = 0;
        this.f198451f = false;
        com.tencent.mm.ui.chatting.adapter.v vVar = new com.tencent.mm.ui.chatting.adapter.v(this);
        this.f198452g = vVar;
        this.f198447b = f9Var;
        java.lang.String str2 = "";
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
        } else {
            if (!f9Var.isVideo() && !f9Var.Y2()) {
                if (f9Var.M2()) {
                    this.f198451f = true;
                    ot0.q v17 = ot0.q.v(f9Var.j());
                    if (v17 != null) {
                        str2 = v17.f348734z;
                        ot0.f fVar = (ot0.f) v17.y(ot0.f.class);
                        if (fVar != null && (m1Var = fVar.f348465l) != null) {
                            vVar.f198445a = com.tencent.mm.sdk.platformtools.t8.u(m1Var.f373344i);
                        }
                    }
                } else {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    str2 = m11.b1.Di().D2(f9Var, f9Var.z0(), false);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !str2.endsWith("hd") && com.tencent.mm.vfs.w6.j(str2.concat("hd"))) {
                        str2 = str2.concat("hd");
                    }
                }
            } else {
                this.f198450e = true;
                str2 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                if (h17 != null) {
                    vVar.f198445a = com.tencent.mm.sdk.platformtools.t8.u(h17.f415015m);
                }
                ot0.q.v(f9Var.U1());
            }
            if (f9Var.o2()) {
                ot0.q v18 = ot0.q.v(f9Var.j());
                java.lang.String str3 = (v18 == null || (str = v18.f348694p) == null || str.length() <= 0 || (D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v18.f348694p)) == null) ? null : D0.field_fileFullPath;
                if (str3 != null) {
                    str2 = str3;
                }
            }
        }
        this.f198446a = str2;
        this.f198449d = f9Var.getCreateTime();
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var = this.f198447b;
        return (f9Var == null || !(obj instanceof com.tencent.mm.storage.f9) || obj == null) ? super.equals(obj) : f9Var.getMsgId() == ((com.tencent.mm.storage.f9) obj).getMsgId();
    }

    public w(long j17) {
        this.f198448c = 0;
        this.f198451f = false;
        this.f198452g = new com.tencent.mm.ui.chatting.adapter.v(this);
        this.f198449d = j17;
        this.f198448c = Integer.MAX_VALUE;
    }
}
