package i53;

/* loaded from: classes8.dex */
public final class l4 {
    public final p43.a a(m33.k1 k1Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(k1Var.f323305c);
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        java.lang.String a17 = kk.k.a(r6Var);
        java.lang.String str3 = k1Var.f323303a + '_' + a17 + ".mp4";
        android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(k1Var.f323305c, 2);
        java.lang.String str4 = str + ("cover_" + a17 + ".png");
        java.lang.String str5 = str + str3;
        if (createVideoThumbnail != null && !createVideoThumbnail.isRecycled()) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(createVideoThumbnail, 100, android.graphics.Bitmap.CompressFormat.PNG, str4, true);
            } catch (java.io.IOException unused) {
            }
        }
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str6 = k1Var.f323305c;
        ((be0.e) oVar).getClass();
        int a18 = com.tencent.mm.plugin.sight.base.e.d(str6, true).a();
        if (com.tencent.mm.vfs.w6.d(k1Var.f323305c, str5, false) == -1) {
            return null;
        }
        p43.a aVar = new p43.a();
        aVar.field_fileId = a17;
        aVar.field_userId = str2;
        aVar.field_appId = k1Var.f323303a;
        aVar.field_appName = k1Var.f323304b;
        aVar.field_filePath = str5;
        aVar.field_orgFilePath = k1Var.f323305c;
        aVar.field_coverPath = str4;
        aVar.field_extJsonData = k1Var.f323306d;
        aVar.field_createTime = java.lang.System.currentTimeMillis();
        aVar.field_durationSec = a18;
        aVar.field_title = k1Var.f323307e;
        aVar.field_desc = k1Var.f323308f;
        return aVar;
    }

    public final void b(java.util.List videoList, int i17) {
        kotlin.jvm.internal.o.g(videoList, "videoList");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(videoList, 10));
        java.util.Iterator it = videoList.iterator();
        while (it.hasNext()) {
            p43.a aVar = (p43.a) it.next();
            q33.c cVar = new q33.c();
            cVar.f359938d = aVar.field_fileId;
            cVar.f359940f = aVar.field_appId;
            cVar.f359939e = aVar.field_extJsonData;
            arrayList.add(cVar);
        }
        q33.d dVar = new q33.d();
        dVar.f359941d = i17;
        dVar.f359942e = new java.util.LinkedList(arrayList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = dVar;
        lVar.f70665b = new q33.e();
        lVar.f70666c = "/cgi-bin/mmgame-bin/reportlocalwxagvideo";
        lVar.f70667d = 25686;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new i53.j4(dVar));
    }
}
