package com.tencent.mm.pluginsdk.model;

@j95.b
/* loaded from: classes9.dex */
public final class q1 extends i95.w implements o72.v3 {
    public java.lang.Object Ai(java.lang.String str, dn.m mVar, r45.gp0 gp0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        jm0.o service = ((a82.v) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).cj()).f300267d;
        kotlin.jvm.internal.o.g(service, "service");
        if (!jm0.g.class.isAssignableFrom(a82.t.class)) {
            throw new java.lang.IllegalArgumentException(service.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(service.getViewModel(), new jm0.e(service)).a(a82.t.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        jm0.g gVar = (jm0.g) a17;
        a82.t tVar = gVar instanceof a82.t ? (a82.t) gVar : null;
        if (tVar != null) {
            return tVar.d7(str, mVar, false, gp0Var, z17, continuation);
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FavApiFeatureService", "can not get downloader");
        return java.lang.Boolean.FALSE;
    }

    public dn.m wi(java.lang.String taskName, r45.gp0 dataItem) {
        kotlin.jvm.internal.o.g(taskName, "taskName");
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        o72.b2 b2Var = o72.c2.f343317a;
        dn.m mVar = new dn.m();
        mVar.f241785d = taskName;
        mVar.field_mediaId = dataItem.T;
        mVar.f241789h = 2;
        mVar.field_appType = 10;
        if (dataItem.I == 4) {
            if (dataItem.R >= 26214400) {
                mVar.field_fileType = 10007;
            } else {
                mVar.field_fileType = 10002;
            }
        } else if (dataItem.R >= 26214400) {
            mVar.field_fileType = 10007;
        } else {
            mVar.field_fileType = 10001;
        }
        mVar.f241786e = false;
        mVar.field_totalLen = dataItem.R;
        mVar.field_aesKey = dataItem.f375438u;
        mVar.field_fileId = dataItem.f375434s;
        mVar.field_priority = 2;
        mVar.field_fullpath = o72.x1.x(dataItem) + ".temp";
        mVar.field_needStorage = true;
        mVar.f241806x0 = 4;
        if (kotlin.jvm.internal.o.b(dataItem.P1, "WeNoteHtmlFile") && o72.d3.f343321a.b()) {
            java.lang.String str = dataItem.K;
            if (str == null) {
                str = "";
            }
            mVar.f241789h = 8;
            mVar.field_needStorage = false;
            try {
                com.tencent.wechat.aff.favorites.q qVar = new com.tencent.wechat.aff.favorites.q();
                qVar.f216855d.add(kotlin.jvm.internal.o.b(str, ".md") ? com.tencent.wechat.aff.favorites.u.MARKDOWN : com.tencent.wechat.aff.favorites.u.HTML);
                qVar.f216857f[1] = true;
                mVar.P = qVar.toByteArray();
                com.tencent.mars.xlog.Log.i("MicroMsg.Fav.FavApiLogicKt", "note download new protocol in getFavDataDownloadCdnTaskInfo, bizid=8, format=".concat(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Fav.FavApiLogicKt", "note download new protocol serialize error: " + e17.getMessage());
            }
        }
        return mVar;
    }
}
