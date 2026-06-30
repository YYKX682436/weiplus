package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.v4 f151404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f151405e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f151406f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(com.tencent.mm.plugin.mv.ui.uic.v4 v4Var, android.content.Intent intent, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151404d = v4Var;
        this.f151405e = intent;
        this.f151406f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.r4(this.f151404d, this.f151405e, this.f151406f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.uic.r4 r4Var = (com.tencent.mm.plugin.mv.ui.uic.r4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Intent intent;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mv.ui.uic.v4 v4Var = this.f151404d;
        v4Var.getClass();
        if (this.f151406f == -1 && (intent = this.f151405e) != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.lang.String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            boolean j17 = com.tencent.mm.vfs.w6.j(stringExtra);
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFlexEditUIC", "takePhotoFinished, videoPath:" + stringExtra + ", videoExist:" + j17 + ", thumbPath:" + str + ", thumbExist:" + com.tencent.mm.vfs.w6.j(str));
            if (j17) {
                ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(stringExtra, true);
                fm3.q qVar = new fm3.q();
                qVar.f264109g = 3;
                qVar.f264112m = new fm3.g(str, stringExtra);
                fm3.p pVar = new fm3.p(stringExtra + '_' + stringExtra.hashCode(), stringExtra, d17.f162382a, 0, 0, 24, null);
                pVar.f264098d = d17.f162384c;
                pVar.f264099e = d17.f162385d;
                qVar.f264113n = pVar;
                fm3.g0 g0Var = fm3.g0.f264070a;
                fm3.g0.f264072c = 1;
                com.tencent.mm.plugin.mv.model.flex.MusicMvFlexLiveList musicMvFlexLiveList = v4Var.f151491h;
                g0Var.b(musicMvFlexLiveList.f152065o.size(), qVar);
                gm3.c cVar = new gm3.c("local_-1", 3, java.lang.System.currentTimeMillis(), 0);
                cVar.f273547h = new gm3.a(0L, 0L, null, null, 0, 0, 63, null);
                com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem galleryItem$VideoMediaItem = new com.tencent.mm.plugin.gallery.model.GalleryItem$VideoMediaItem();
                galleryItem$VideoMediaItem.f138446x = d17.f162382a;
                int i17 = d17.f162383b;
                galleryItem$VideoMediaItem.f138448z = d17.f162384c;
                galleryItem$VideoMediaItem.f138447y = d17.f162385d;
                galleryItem$VideoMediaItem.A = i17;
                galleryItem$VideoMediaItem.f138430e = stringExtra;
                galleryItem$VideoMediaItem.f138433h = str;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                galleryItem$VideoMediaItem.f138435m = currentTimeMillis;
                gm3.a aVar2 = cVar.f273547h;
                if (aVar2 != null) {
                    aVar2.f273537c = str;
                }
                if (aVar2 != null) {
                    aVar2.f273535a = -1L;
                }
                if (aVar2 != null) {
                    aVar2.f273536b = currentTimeMillis;
                }
                if (aVar2 != null) {
                    aVar2.f273538d = galleryItem$VideoMediaItem;
                }
                cVar.f273549m = galleryItem$VideoMediaItem.f138446x;
                com.tencent.mm.plugin.mvvmlist.MvvmList.q(musicMvFlexLiveList, cVar, false, 2, null);
                musicMvFlexLiveList.D();
                v4Var.f151489f.postValue(1);
            }
        }
        return jz5.f0.f302826a;
    }
}
