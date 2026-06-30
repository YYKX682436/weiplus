package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class w implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f115729a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f115730b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gk2.e f115731c;

    public w(boolean z17, dk2.zf zfVar, gk2.e eVar) {
        this.f115729a = z17;
        this.f115730b = zfVar;
        this.f115731c = eVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a != 0 || fVar.f70616b != 0) {
            r45.zm6 zm6Var = (r45.zm6) ((r45.tp2) fVar.f70618d).getCustom(7);
            if (zm6Var != null && zm6Var.getBoolean(1)) {
                java.lang.String string = zm6Var.getString(0);
                if (!(string == null || string.length() == 0)) {
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, zm6Var.getString(0), 0).show();
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveBoxUtil", "localLikeLog ".concat("cgi failed, revert like op"));
            com.tencent.mm.plugin.finder.live.util.x xVar = com.tencent.mm.plugin.finder.live.util.x.f115742a;
            boolean z17 = true ^ this.f115729a;
            dk2.zf zfVar = this.f115730b;
            xVar.j(z17, (dk2.cg) zfVar);
            ((mm2.j2) this.f115731c.a(mm2.j2.class)).c7(zfVar);
        }
        return jz5.f0.f302826a;
    }
}
