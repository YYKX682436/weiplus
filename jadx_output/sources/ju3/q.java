package ju3;

/* loaded from: classes10.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f301993d;

    /* renamed from: e, reason: collision with root package name */
    public int f301994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju3.c0 f301995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout f301996g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f301997h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ju3.c0 c0Var, com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitPluginLayout cameraKitPluginLayout, android.os.Bundle bundle, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f301995f = c0Var;
        this.f301996g = cameraKitPluginLayout;
        this.f301997h = bundle;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ju3.q(this.f301995f, this.f301996g, this.f301997h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ju3.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ju3.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
