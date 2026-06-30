package h41;

/* loaded from: classes.dex */
public final class e extends qz5.l implements yz5.p {
    public e(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.e(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.e eVar = new h41.e((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.widget.Toast.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "已为你开启ASR Debug开关，建议开启悬浮窗权限。", 1).show();
        return jz5.f0.f302826a;
    }
}
