package m55;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f324330d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f324331e;

    /* renamed from: f, reason: collision with root package name */
    public int f324332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ og3.d f324333g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ og3.e f324334h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f324333g = dVar;
        this.f324334h = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m55.f(this.f324333g, this.f324334h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m55.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f324332f;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        og3.d dVar = this.f324333g;
        this.f324330d = dVar;
        og3.e eVar = this.f324334h;
        this.f324331e = eVar;
        this.f324332f = 1;
        oz5.n nVar = new oz5.n(pz5.f.b(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo : dVar.f345159a) {
            if (m55.e.f324329a[mediaSingleInfo.f148609d.ordinal()] == 1) {
                rm5.j jVar = new rm5.j(mediaSingleInfo.f148610e, 2);
                jVar.f(1.0f);
                jVar.e(mediaSingleInfo.f148611f.f148600d);
                jVar.d(java.lang.Math.min(mediaSingleInfo.f148611f.f148601e, jVar.f397508j));
                jVar.c(0L);
                jVar.b(jVar.f397505g - jVar.f397504f);
                arrayList.add(jVar);
            }
        }
        rm5.v vVar = new rm5.v(arrayList);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = eVar.f345161a;
        vVar.f397583k = new sm5.b(new l55.b(videoTransPara.f71199o, videoTransPara.f71200p));
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(((rm5.j) arrayList.get(0)).f397499a, true);
        if (d17 == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            nVar.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345164d, -1, "remux error", null, 8, null)));
        } else {
            int i18 = d17.f162395n;
            int i19 = (i18 == 0 || i18 == 180) ? d17.f162384c : d17.f162385d;
            int i27 = (i18 == 0 || i18 == 180) ? d17.f162385d : d17.f162384c;
            vVar.l(i19, i27);
            vVar.m(new android.graphics.Rect(0, 0, i19, i27));
            vVar.e(true);
            com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = eVar.f345161a;
            rm5.q qVar = new rm5.q(new android.util.Size(videoTransPara2.f71191d, videoTransPara2.f71192e), videoTransPara2.f71194g, videoTransPara2.f71193f, videoTransPara2.f71197m, videoTransPara2.f71198n, videoTransPara2.f71199o, videoTransPara2.f71200p, true, ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_mediacodec_level_limit, true), false, false, 0, null, 6144, null);
            java.lang.String src = ((rm5.j) arrayList.get(0)).f397499a;
            kotlin.jvm.internal.o.g(src, "src");
            rs0.q a17 = rs0.r.f399316a.a(src);
            if (a17 != null) {
                qVar.f397549n = a17.f399312a;
                qVar.f397550o = a17.f399313b;
                qVar.f397551p = a17.f399314c;
            }
            m55.d dVar2 = new m55.d(android.os.SystemClock.elapsedRealtime(), new kotlin.jvm.internal.c0(), vVar, nVar);
            java.lang.String b17 = eVar.b();
            kotlin.jvm.internal.o.d(b17);
            vVar.f(b17, qVar, true, dVar2, null);
        }
        java.lang.Object a18 = nVar.a();
        pz5.a aVar2 = pz5.a.f359186d;
        return a18 == aVar ? aVar : a18;
    }
}
