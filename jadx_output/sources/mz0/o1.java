package mz0;

/* loaded from: classes5.dex */
public final class o1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333013d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333015f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c f333016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(mz0.b2 b2Var, java.lang.String str, com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f333014e = b2Var;
        this.f333015f = str;
        this.f333016g = cVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = this.f333016g;
        mz0.o1 o1Var = new mz0.o1(this.f333014e, this.f333015f, cVar, (kotlin.coroutines.Continuation) obj3);
        o1Var.f333013d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        o1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.app.Activity context;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f333013d;
        mz0.b2 b2Var = this.f333014e;
        java.lang.String str = this.f333015f;
        b2Var.s7(th6, str);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = this.f333016g;
        if (th6 == null) {
            if (!((com.tencent.mm.mj_template.album_template.widget.MusicV2State) b2Var.f332898v.getValue()).f69764h && (context = b2Var.getContext()) != null) {
                java.lang.Object systemService = context.getSystemService("vibrator");
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10L);
                }
            }
            if (cVar != null) {
                ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.h(null, 1, null), str);
            }
            mz0.b2.Q6(b2Var);
        } else if (cVar != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.e(th6), str);
        }
        return jz5.f0.f302826a;
    }
}
