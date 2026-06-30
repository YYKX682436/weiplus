package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class c4 extends o13.b {

    /* renamed from: e, reason: collision with root package name */
    public o13.y f137483e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String[] f137484f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f137485g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f137486h = new com.tencent.mm.plugin.fts.logic.u3(this);

    @Override // o13.w
    public p13.c b(p13.u uVar) {
        p13.c a4Var;
        switch (uVar.f351140b) {
            case com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_ABS /* 65521 */:
                a4Var = new com.tencent.mm.plugin.fts.logic.a4(this, uVar.f351147i, uVar.f351144f);
                break;
            case com.tencent.tinker.loader.shareutil.ShareElfFile.SectionHeader.SHN_COMMON /* 65522 */:
            default:
                a4Var = new com.tencent.mm.plugin.fts.logic.v3(this, null);
                break;
            case 65523:
                a4Var = new com.tencent.mm.plugin.fts.logic.z3(this, uVar);
                break;
            case 65524:
                a4Var = new com.tencent.mm.plugin.fts.logic.y3(this, null);
                break;
            case 65525:
                a4Var = new com.tencent.mm.plugin.fts.logic.b4(this, null);
                break;
            case 65526:
                a4Var = new com.tencent.mm.plugin.fts.logic.x3(this, uVar);
                break;
        }
        ((com.tencent.mm.plugin.fts.t) this.f137483e).b(Integer.MAX_VALUE, a4Var);
        return a4Var;
    }

    @Override // o13.w
    public java.lang.String getName() {
        return "SearchTestLogic";
    }

    @Override // o13.b
    public boolean h() {
        if (!((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Fail!");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSSearchTestLogic", "Create Success!");
        this.f137483e = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137379d;
        return true;
    }

    @Override // o13.b
    public boolean i() {
        gm0.j1.d().q(30, this.f137486h);
        return false;
    }
}
