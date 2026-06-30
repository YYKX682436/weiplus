package tk4;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f419981d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f419982e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f419983f;

    /* renamed from: g, reason: collision with root package name */
    public int f419984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419985h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioDeviceInfo[] f419986i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic, android.media.AudioDeviceInfo[] audioDeviceInfoArr, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419985h = tingAudioPushConfigLogic;
        this.f419986i = audioDeviceInfoArr;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tk4.h(this.f419985h, this.f419986i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tk4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic;
        kotlinx.coroutines.sync.d dVar;
        android.media.AudioDeviceInfo[] audioDeviceInfoArr;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419984g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic2 = this.f419985h;
            kotlinx.coroutines.sync.d dVar2 = tingAudioPushConfigLogic2.f174638J;
            this.f419981d = dVar2;
            android.media.AudioDeviceInfo[] audioDeviceInfoArr2 = this.f419986i;
            this.f419982e = audioDeviceInfoArr2;
            this.f419983f = tingAudioPushConfigLogic2;
            this.f419984g = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            tingAudioPushConfigLogic = tingAudioPushConfigLogic2;
            dVar = kVar;
            audioDeviceInfoArr = audioDeviceInfoArr2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tingAudioPushConfigLogic = (com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic) this.f419983f;
            audioDeviceInfoArr = (android.media.AudioDeviceInfo[]) this.f419982e;
            dVar = (kotlinx.coroutines.sync.d) this.f419981d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (audioDeviceInfoArr != null) {
            try {
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 8) {
                        java.lang.CharSequence productName = audioDeviceInfo.getProductName();
                        kotlin.jvm.internal.o.f(productName, "getProductName(...)");
                        if (r26.n0.B(productName, "car", true)) {
                            java.lang.Integer num = new java.lang.Integer(3);
                            int i18 = com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.N;
                            tingAudioPushConfigLogic.e(num);
                        } else {
                            java.lang.Integer num2 = new java.lang.Integer(2);
                            int i19 = com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.N;
                            tingAudioPushConfigLogic.e(num2);
                        }
                    }
                    if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11) {
                        java.lang.Integer num3 = new java.lang.Integer(1);
                        int i27 = com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic.N;
                        tingAudioPushConfigLogic.e(num3);
                    }
                }
            } catch (java.lang.Throwable th6) {
                ((kotlinx.coroutines.sync.k) dVar).d(null);
                throw th6;
            }
        }
        ((kotlinx.coroutines.sync.k) dVar).d(null);
        return jz5.f0.f302826a;
    }
}
