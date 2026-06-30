package mx0;

/* loaded from: classes5.dex */
public final class b6 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public int f331850d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331851e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331852f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f331853g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331854h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f331853g = recordConfigProvider;
        this.f331854h = shootComposingPluginLayout;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mx0.b6 b6Var = new mx0.b6(this.f331853g, this.f331854h, (kotlin.coroutines.Continuation) obj3);
        b6Var.f331851e = (java.lang.String) obj;
        b6Var.f331852f = (rx0.k) obj2;
        return b6Var.invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String resultMediaFilePath;
        java.lang.Object e17;
        rx0.k kVar;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.maas.model.time.MJTime mJTime;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f331850d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            resultMediaFilePath = (java.lang.String) this.f331851e;
            rx0.k kVar2 = (rx0.k) this.f331852f;
            ((yy0.o0) ((pp0.k0) i95.n0.c(pp0.k0.class))).getClass();
            kotlin.jvm.internal.o.g(resultMediaFilePath, "resultMediaFilePath");
            yy0.m7 m7Var = (yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class));
            m7Var.hj("Completed", resultMediaFilePath);
            m7Var.rj(9);
            iy1.c cVar = iy1.c.MainUI;
            m7Var.qj(30097);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map Ai = m7Var.Ai();
            Ai.put("view_id", "sc_asset_generate_complete");
            ((cy1.a) rVar).yj("sc_asset_generate_complete", null, Ai, 6, false);
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerateToPost", "MJShootComposing", m7Var.Ni(), 0);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jump2VideoPostPageForMaterialImportPreview: cover start time: ");
            com.tencent.maas.model.time.MJTime mJTime2 = kVar2.f400940g;
            sb6.append(mJTime2 != null ? new java.lang.Double(mJTime2.toSeconds()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
            vt3.l lVar = vt3.l.f440005a;
            lVar.b(kz5.b0.c(resultMediaFilePath), 4, true);
            this.f331851e = resultMediaFilePath;
            this.f331852f = kVar2;
            this.f331850d = 1;
            e17 = lVar.e(this);
            if (e17 == aVar) {
                return aVar;
            }
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = (rx0.k) this.f331852f;
            resultMediaFilePath = (java.lang.String) this.f331851e;
            kotlin.ResultKt.throwOnFailure(obj);
            e17 = obj;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) e17;
        if (byteBuffer != null) {
            byte[] bArr = new byte[byteBuffer.capacity()];
            byteBuffer.rewind();
            byteBuffer.get(bArr);
            gVar = com.tencent.mm.protobuf.g.b(bArr);
        } else {
            gVar = null;
        }
        vt3.l.f440005a.d();
        r45.q23 q23Var = kVar.f400937d;
        com.tencent.maas.camerafun.MJRecordingFinishInfo mJRecordingFinishInfo = kVar.f400936c;
        java.lang.Number num = (mJRecordingFinishInfo == null || (mJTime = mJRecordingFinishInfo.f47819c) == null) ? new java.lang.Integer(0) : new java.lang.Double(mJTime.toMilliseconds());
        xt0.d dVar = new xt0.d();
        long longValue = num.longValue();
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = this.f331853g;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        r45.h70 a17 = fx0.b.f267109a.a(resultMediaFilePath, resultMediaFilePath, ou0.d0.b(configProvider, longValue, false));
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ShootComposingPluginLayout", "jump2VideoPostPageForMaterialImportPreview: compositionInfo == null");
            return f0Var;
        }
        nu3.i.f340218a.n("KEY_MEDIA_SOURCE_INT", new java.lang.Integer(0));
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331854h;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f331853g;
        com.tencent.maas.camstudio.MJCamMusicDesc mJCamMusicDesc = shootComposingPluginLayout.f69557v.T;
        dVar.a(shootComposingPluginLayout.Q0(recordConfigProvider, mJCamMusicDesc != null ? mJCamMusicDesc.getMusicID() : null, this.f331854h.f69557v.U));
        xt0.g gVar2 = new xt0.g(resultMediaFilePath, a17);
        android.content.Context context = this.f331854h.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        dVar.c(context, num.doubleValue(), this.f331853g, q23Var, false, gVar2, kVar.f400940g, null, null, null, null, null, gVar, null);
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (((c61.p7) ((m40.k0) c17)).bj()) {
            i95.m c18 = i95.n0.c(bg0.v.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((b92.u2) ((bg0.v) c18)).bj(resultMediaFilePath);
        }
        return f0Var;
    }
}
