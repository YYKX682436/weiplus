package rp4;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI f398663d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI videoCompositionRemuxUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398663d = videoCompositionRemuxUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.g0(this.f398663d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        rp4.g0 g0Var = (rp4.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lt3.n nVar = lt3.n.f321260a;
        android.graphics.Rect rect = lt3.n.f321263d;
        com.tencent.mm.plugin.vlog.ui.video.VideoCompositionRemuxUI videoCompositionRemuxUI = this.f398663d;
        rect.set(videoCompositionRemuxUI.f176103g.f398702g);
        java.lang.String str = videoCompositionRemuxUI.f176101e;
        com.tencent.mars.xlog.Log.i(str, "startRemux in main");
        rp4.x xVar = videoCompositionRemuxUI.f176103g;
        if (!xVar.c()) {
            com.tencent.mars.xlog.Log.e(str, "size is not valid,return this click");
        } else if (xVar.f398705j.f175597c.isEmpty()) {
            com.tencent.mars.xlog.Log.e(str, "composition track is empty");
        } else {
            ct0.b bVar = videoCompositionRemuxUI.f176105i;
            kotlin.jvm.internal.o.d(bVar);
            int i17 = bVar.f222207d;
            ct0.b bVar2 = videoCompositionRemuxUI.f176105i;
            kotlin.jvm.internal.o.d(bVar2);
            st3.s sVar = new st3.s(false, null, null, null, new float[]{0.0f, 0.0f, vt3.q.f440037a, vt3.q.f440038b}, i17, bVar2.f222208e, null, null, new float[]{rect.left, rect.top, rect.right, rect.bottom}, 399, null);
            com.tencent.mars.xlog.Log.i(str, "edit config: " + sVar);
            rp4.f0 f0Var = videoCompositionRemuxUI.f176102f;
            if (f0Var != null) {
                ct0.b bVar3 = videoCompositionRemuxUI.f176105i;
                kotlin.jvm.internal.o.d(bVar3);
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = videoCompositionRemuxUI.f176104h;
                kotlin.jvm.internal.o.d(recordConfigProvider);
                f0Var.d(bVar3, recordConfigProvider);
            }
            rp4.f0 f0Var2 = videoCompositionRemuxUI.f176102f;
            if (f0Var2 != null) {
                f0Var2.f(sVar, xVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
