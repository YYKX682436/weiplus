package vp4;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f439019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp4.j f439020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f439021f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.coroutines.Continuation continuation, vp4.j jVar, android.os.Bundle bundle) {
        super(2);
        this.f439019d = continuation;
        this.f439020e = jVar;
        this.f439021f = bundle;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        java.lang.String workTagId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        nu3.m mVar = nu3.m.f340229a;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoWidgetReporter", "setBackgroundWorkTagId >> workTagId: ".concat(workTagId));
        com.tencent.mm.autogen.mmdata.rpt.SightVideoLogStruct sightVideoLogStruct = nu3.m.f340230b;
        sightVideoLogStruct.U = sightVideoLogStruct.b("BackgroundWorkId", workTagId, true);
        kotlin.coroutines.Continuation continuation = this.f439019d;
        if (booleanValue) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoBackgroundRemuxChain", "download music success, " + str);
            vp4.j jVar = this.f439020e;
            st3.r rVar = jVar.f439036b;
            rp4.a aVar = jVar.f439039e;
            int i17 = aVar != null ? aVar.f398609l : 0;
            android.os.Bundle bundle = this.f439021f;
            boolean z17 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_HARD", false) : false;
            boolean z18 = bundle != null ? bundle.getBoolean("KEY_EXPORT_HEVC_SOFT", false) : false;
            rp4.x xVar = jVar.f439042h;
            int i18 = bundle != null ? bundle.getInt("KEY_EXPORT_TARGET_VIDEO_BITRATE", 0) : 0;
            st3.s sVar = jVar.f439043i;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = jVar.f439038d;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            vp4.j jVar2 = this.f439020e;
            vp4.j.f(jVar2, z18, z17, str, i18, rVar, i17, recordConfigProvider, xVar, sVar, workTagId, new vp4.e(continuation, jVar2, workTagId));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoBackgroundRemuxChain", "download music failed");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345164d, 1008, "Background remux audio error", null, 8, null)));
        }
        return jz5.f0.f302826a;
    }
}
