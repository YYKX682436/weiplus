package z12;

/* loaded from: classes15.dex */
public final class u implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z12.v f469370d;

    public u(z12.v vVar) {
        this.f469370d = vVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        z85.z zVar;
        z12.v vVar = this.f469370d;
        com.tencent.mars.xlog.Log.i(vVar.f469373f, "ErrType: " + i18 + ", errCode:" + i19);
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_REC_LIST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_EMOJI_STORE_REC_LIST_LAST_UPDATE_TIME_LONG, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - 28800000) + 600000));
        }
        if (i19 == 0) {
            com.tencent.mars.xlog.Log.i(vVar.f469373f, "insertCache, type:" + vVar.f469374g);
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5 f17 = com.tencent.mm.storage.n5.f();
            synchronized (f17.f195163a) {
                zVar = f17.f195169g;
            }
            int i27 = vVar.f469374g;
            com.tencent.mm.modelbase.o oVar = vVar.f469371d;
            r45.oo3 oo3Var = null;
            if (oVar != null) {
                com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
                if (fVar instanceof r45.oo3) {
                    oo3Var = (r45.oo3) fVar;
                }
            }
            zVar.y0(i27, oo3Var);
        }
        if (i18 == 0 || i18 == 4) {
            com.tencent.mm.modelbase.u0 u0Var = vVar.f469372e;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, vVar);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.u0 u0Var2 = vVar.f469372e;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, vVar);
        }
    }
}
