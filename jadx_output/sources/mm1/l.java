package mm1;

/* loaded from: classes10.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f328672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.audio.BizAudioFlutterActivity f328673e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.audio.BizAudioFlutterActivity bizAudioFlutterActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f328673e = bizAudioFlutterActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm1.l(this.f328673e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm1.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f328672d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.audio.BizAudioFlutterActivity activity = this.f328673e;
            com.tencent.mars.xlog.Log.i(activity.f92466u, "exitWithAnimation from pop");
            kotlin.jvm.internal.o.g(activity, "activity");
            zm1.m mVar = (zm1.m) pf5.z.f353948a.a(activity).a(zm1.m.class);
            this.f328672d = 1;
            if (mVar.d(true, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
