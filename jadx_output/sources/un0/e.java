package un0;

/* loaded from: classes13.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f429347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un0.h f429348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService f429349f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(un0.h hVar, com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService liveScreenCastForegroundService, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429348e = hVar;
        this.f429349f = liveScreenCastForegroundService;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un0.e(this.f429348e, this.f429349f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((un0.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429347d;
        un0.h hVar = this.f429348e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            un0.s sVar = un0.s.f429417a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f429347d = 1;
            obj = sVar.a(context, hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.live.core.core.trtc.screencast.LiveScreenCastForegroundService liveScreenCastForegroundService = this.f429349f;
        if (booleanValue) {
            liveScreenCastForegroundService.f68561d = hVar;
            if (hVar != null && (list = hVar.f429363l) != null) {
                list.add(liveScreenCastForegroundService.f68563f);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderLiveScreenCastForegroundService", "#onStartCommand workingRecorder is null");
            liveScreenCastForegroundService.stopSelf();
        }
        return jz5.f0.f302826a;
    }
}
