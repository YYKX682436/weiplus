package fo5;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f264999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fo5.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f264999d = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.i(this.f264999d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        fo5.i iVar = (fo5.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fo5.r0 r0Var = this.f264999d;
        lo5.h hVar = r0Var.f265095n;
        if (hVar.f320216c.f301233b) {
            lo5.h.b(hVar, false, 1, null);
        }
        if (r0Var.r()) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
            com.tencent.mm.plugin.voipmp.platform.v0.f177287b.d(false, true, fo5.h.f264992a);
        }
        qo5.b bVar = qo5.b.f365663a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "cancelNotifyWithoutKillForegroundListener: ");
        ((com.tencent.mm.booter.notification.x) mo3.f.f330406a).f(41);
        return jz5.f0.f302826a;
    }
}
