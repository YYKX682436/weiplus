package hu3;

/* loaded from: classes5.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285126d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f285127e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285128f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285129g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, hu3.n0 n0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285127e = i17;
        this.f285128f = n0Var;
        this.f285129g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.g0(this.f285127e, this.f285128f, this.f285129g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Boolean bool;
        boolean z17;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f285126d;
        hu3.n0 n0Var = this.f285128f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("angel >> ");
            int i18 = this.f285127e;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
            rg.e eVar = rg.e.H264;
            rg.a aVar2 = rg.a.MPEG4AAC;
            rg.d dVar = rg.d.MP4;
            hu3.t0 t0Var = n0Var.f285168o;
            com.tencent.maas.instamovie.MJRecordingSettings mJRecordingSettings = new com.tencent.maas.instamovie.MJRecordingSettings(eVar, aVar2, dVar, t0Var.f285199a, t0Var.f285201c, t0Var.f285202d, t0Var.f285203e);
            mJRecordingSettings.f48158m = i18;
            if (n0Var.f285175v) {
                mJRecordingSettings.f48156k = com.tencent.maas.instamovie.d.Disabled;
            }
            pp0.p0 p0Var = n0Var.f285162f;
            bool = null;
            if (p0Var != null) {
                this.f285126d = 1;
                obj = p0Var.C(this.f285129g, mJRecordingSettings, null, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startRecord >> " + bool);
            if ((n0Var.f285164h == 1 || n0Var.f285165i != null) && !(z17 = n0Var.f285175v) && !z17 && (recordConfigProvider = n0Var.f285167n) != null) {
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = recordConfigProvider.f155676n;
                hu3.s0 s0Var = new hu3.s0(new hu3.a(videoTransPara.f71199o, videoTransPara.f71200p));
                n0Var.f285176w = s0Var;
                s0Var.a(new hu3.f0(n0Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startAudioRecord");
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        bool = (java.lang.Boolean) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startRecord >> " + bool);
        if (n0Var.f285164h == 1) {
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = recordConfigProvider.f155676n;
        hu3.s0 s0Var2 = new hu3.s0(new hu3.a(videoTransPara2.f71199o, videoTransPara2.f71200p));
        n0Var.f285176w = s0Var2;
        s0Var2.a(new hu3.f0(n0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", "startAudioRecord");
        return jz5.f0.f302826a;
    }
}
