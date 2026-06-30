package fo5;

/* loaded from: classes14.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f265156e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(int i17, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265155d = i17;
        this.f265156e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.y2(this.f265155d, this.f265156e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.y2 y2Var = (fo5.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        er4.w h17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.a aVar2 = fo5.f3.f264986c;
        er4.w wVar = null;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            if (r0Var.f265100s) {
                ro5.b bVar = r0Var.f265097p;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("renderController");
                    throw null;
                }
                int i17 = this.f265155d;
                h17 = bVar.h(i17);
                if (h17 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "getRenderTexture for " + i17 + " ret " + h17.f256187d);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMP.CoreV2", "no engine !!!");
                h17 = new er4.w();
                h17.d(1.0d);
                h17.e(0L);
                h17.f(0L);
                h17.g(0.0d);
                h17.b(0.0d);
                h17.c(false);
            }
            wVar = h17;
        }
        com.tencent.mm.plugin.voipmp.platform.w wVar2 = fo5.f3.f264985b;
        if (wVar2 != null) {
            wVar2.b0(this.f265156e, wVar);
        }
        return jz5.f0.f302826a;
    }
}
