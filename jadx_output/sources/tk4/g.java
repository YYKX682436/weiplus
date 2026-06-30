package tk4;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f419976e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f419977f;

    /* renamed from: g, reason: collision with root package name */
    public int f419978g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419979h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f419980i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, android.content.Intent intent, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419979h = tingAudioPushConfigLogic;
        this.f419980i = intent;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tk4.g(this.f419979h, this.f419980i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tk4.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic;
        android.content.Intent intent;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419978g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic2 = this.f419979h;
            kotlinx.coroutines.sync.d dVar = tingAudioPushConfigLogic2.f174638J;
            this.f419975d = dVar;
            android.content.Intent intent2 = this.f419980i;
            this.f419976e = intent2;
            this.f419977f = tingAudioPushConfigLogic2;
            this.f419978g = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            tingAudioPushConfigLogic = tingAudioPushConfigLogic2;
            intent = intent2;
            obj2 = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tingAudioPushConfigLogic = (com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic) this.f419977f;
            intent = (android.content.Intent) this.f419976e;
            java.lang.Object obj3 = (kotlinx.coroutines.sync.d) this.f419975d;
            kotlin.ResultKt.throwOnFailure(obj);
            obj2 = obj3;
        }
        try {
            java.lang.String action = intent.getAction();
            if (kz5.n0.O(tingAudioPushConfigLogic.L, action)) {
                java.lang.String formatedNetType = com.tencent.mars.comm.NetStatusUtil.getFormatedNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
                com.tencent.mars.xlog.Log.i(tingAudioPushConfigLogic.f174639a, "audioPushStatusChange on network changed: " + formatedNetType);
                java.lang.String str = tingAudioPushConfigLogic.E;
                if (str != null && !kotlin.jvm.internal.o.b(formatedNetType, str) && !kotlin.jvm.internal.o.b(formatedNetType, "NON_NETWORK")) {
                    tingAudioPushConfigLogic.f(null);
                }
                tingAudioPushConfigLogic.E = formatedNetType;
            } else if (kz5.n0.O(tingAudioPushConfigLogic.M, action)) {
                tingAudioPushConfigLogic.e(null);
            }
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) obj2).d(null);
            throw th6;
        }
    }
}
