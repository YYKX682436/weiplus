package ju3;

/* loaded from: classes10.dex */
public final class w extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f302029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout f302030e;

    /* renamed from: f, reason: collision with root package name */
    public int f302031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout cameraKitRecordViewLayout, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f302030e = cameraKitRecordViewLayout;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f302029d = obj;
        this.f302031f |= Integer.MIN_VALUE;
        return this.f302030e.j(this);
    }
}
