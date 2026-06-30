package yo4;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f464243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z23.f f464246g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f464247h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464248i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f464249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f464250n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, java.lang.String str, z23.f fVar, java.lang.String[] strArr, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464244e = multiVideoFullScreenPluginLayout;
        this.f464245f = str;
        this.f464246g = fVar;
        this.f464247h = strArr;
        this.f464248i = arrayList;
        this.f464249m = arrayList2;
        this.f464250n = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.k0(this.f464244e, this.f464245f, this.f464246g, this.f464247h, this.f464248i, this.f464249m, this.f464250n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f464243d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464244e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            yo4.p pVar = multiVideoFullScreenPluginLayout.f175855w;
            if (pVar == null) {
                kotlin.jvm.internal.o.o("addMusicPlugin");
                throw null;
            }
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = pVar.f464287r;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = audioCacheInfo != null ? audioCacheInfo.f155728y : null;
            if (finderObject != null) {
                this.f464243d = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new yo4.h(this.f464245f, finderObject, pVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            ut3.f.f431176c.d(true, nu3.i.f340218a.l());
            int i18 = com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.T1;
            multiVideoFullScreenPluginLayout.G(1L);
            this.f464244e.A(this.f464246g, this.f464247h, this.f464248i, this.f464249m, this.f464250n, 0);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = (java.lang.String) obj;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            multiVideoFullScreenPluginLayout.B.z();
            return f0Var;
        }
        ut3.f.f431176c.d(true, nu3.i.f340218a.l());
        int i182 = com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.T1;
        multiVideoFullScreenPluginLayout.G(1L);
        this.f464244e.A(this.f464246g, this.f464247h, this.f464248i, this.f464249m, this.f464250n, 0);
        return f0Var;
    }
}
