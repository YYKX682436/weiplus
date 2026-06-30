package yo4;

/* loaded from: classes10.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f464262d;

    /* renamed from: e, reason: collision with root package name */
    public int f464263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout f464264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f464265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.q f464267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout, kotlin.jvm.internal.h0 h0Var, java.lang.String str, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464264f = multiVideoFullScreenPluginLayout;
        this.f464265g = h0Var;
        this.f464266h = str;
        this.f464267i = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.m0(this.f464264f, this.f464265g, this.f464266h, this.f464267i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.m0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f464263e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.jvm.internal.h0 h0Var2 = this.f464265g;
        com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout multiVideoFullScreenPluginLayout = this.f464264f;
        boolean z17 = true;
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
                this.f464262d = h0Var2;
                this.f464263e = 1;
                obj = kotlinx.coroutines.l.g(kotlinx.coroutines.q1.f310570c, new yo4.h(this.f464266h, finderObject, pVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
                h0Var = h0Var2;
            }
            java.lang.String str = (java.lang.String) h0Var2.f310123d;
            int i18 = com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.T1;
            multiVideoFullScreenPluginLayout.z(str, this.f464267i);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h0Var = (kotlin.jvm.internal.h0) this.f464262d;
        kotlin.ResultKt.throwOnFailure(obj);
        h0Var.f310123d = obj;
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var2.f310123d;
        if (charSequence != null && charSequence.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiVideoFullScreenPluginLayout", "appendFinderMusicInfo fail, return");
            multiVideoFullScreenPluginLayout.B.z();
            return f0Var;
        }
        java.lang.String str2 = (java.lang.String) h0Var2.f310123d;
        int i182 = com.tencent.mm.plugin.vlog.ui.MultiVideoFullScreenPluginLayout.T1;
        multiVideoFullScreenPluginLayout.z(str2, this.f464267i);
        return f0Var;
    }
}
