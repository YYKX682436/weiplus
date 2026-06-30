package yx0;

/* loaded from: classes5.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f467480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(yx0.b8 b8Var, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467479d = b8Var;
        this.f467480e = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.n5(this.f467479d, this.f467480e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yx0.v vVar = this.f467479d.f467192s;
        yx0.v vVar2 = yx0.v.f467695f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (vVar == vVar2) {
            kotlinx.coroutines.l.f(null, new yx0.m5(this.f467479d, this.f467480e, null), 1, null);
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin", "setMusicVolume >> but state is " + this.f467479d.f467192s);
        return f0Var;
    }
}
