package mz0;

/* loaded from: classes5.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f333031d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c f333033f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333034g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333035h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar, java.lang.String str, mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333033f = cVar;
        this.f333034g = str;
        this.f333035h = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mz0.r1 r1Var = new mz0.r1(this.f333033f, this.f333034g, this.f333035h, continuation);
        r1Var.f333032e = obj;
        return r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f333031d;
        mz0.b2 b2Var = this.f333035h;
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = this.f333033f;
        java.lang.String str = this.f333034g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f333032e;
            if (cVar != null) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.g(0.0f), str);
            }
            android.app.Activity context = b2Var.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            dz0.l lVar = (dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class);
            this.f333032e = y0Var;
            this.f333031d = 1;
            obj = ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar).g7(str, true, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            y0Var = (kotlinx.coroutines.y0) this.f333032e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.flow.j jVar = (kotlinx.coroutines.flow.j) obj;
        if (jVar != null) {
            kotlinx.coroutines.flow.l0 l0Var = new kotlinx.coroutines.flow.l0(new kotlinx.coroutines.flow.g0(jVar, new mz0.o1(b2Var, str, cVar, null)), new mz0.p1(cVar, str, null));
            mz0.q1 q1Var = new mz0.q1(cVar, str);
            this.f333032e = y0Var;
            this.f333031d = 2;
            if (l0Var.a(q1Var, this) == aVar) {
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Template.TemplateControlUIC", "recreateWithMusicID return null, musicId:" + str);
            if (cVar != null) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.e(null, 1, null), str);
            }
        }
        return jz5.f0.f302826a;
    }
}
