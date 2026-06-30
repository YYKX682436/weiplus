package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f151513e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f151514f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, android.content.Intent intent, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151512d = h4Var;
        this.f151513e = intent;
        this.f151514f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.w3(this.f151512d, this.f151513e, this.f151514f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.mv.ui.uic.w3 w3Var = (com.tencent.mm.plugin.mv.ui.uic.w3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151512d;
        android.content.Intent intent = this.f151513e;
        int i17 = this.f151514f;
        h4Var.getClass();
        if (i17 == -1 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("KEY_RECORD_VIDEO_PATH");
            java.lang.String str = stringExtra == null ? "" : stringExtra;
            java.lang.String stringExtra2 = intent.getStringExtra("KEY_RECORD_VIDEO_THUMB_PATH");
            java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
            boolean j17 = com.tencent.mm.vfs.w6.j(str);
            boolean j18 = com.tencent.mm.vfs.w6.j(str2);
            int i18 = h4Var.f151167n.f151864m;
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "takePhotoFinished, videoPath:" + str + ", videoExist:" + j17 + ", thumbPath:" + str2 + ", thumbExist:" + j18 + ", pos:" + i18);
            if (j17) {
                ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
                com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
                fm3.q qVar = new fm3.q();
                fm3.h hVar = fm3.q.f264104p;
                java.lang.Object obj2 = h4Var.f151161e.get(i18);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                hVar.c((fm3.q) obj2, qVar);
                qVar.f264109g = 3;
                qVar.f264112m = new fm3.g(str2, str);
                java.lang.Object obj3 = h4Var.f151162f.get(i18);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                qVar.f264114o = (fm3.q) h4Var.f151161e.get(i18);
                fm3.p pVar = new fm3.p(str + '_' + str.hashCode(), str, d17.f162382a, 0, 0, 24, null);
                pVar.f264098d = d17.f162384c;
                pVar.f264099e = d17.f162385d;
                qVar.f264113n = pVar;
                h4Var.f151161e.set(i18, qVar);
                fm3.g0 g0Var = fm3.g0.f264070a;
                fm3.g0.f264072c = 1;
                g0Var.b(i18, qVar);
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.mv.ui.uic.c4(h4Var, i18, qVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
