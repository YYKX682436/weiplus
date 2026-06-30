package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f117811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f117812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117811d = captureDataManager$CaptureVideoNormalModel;
        this.f117812e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.b2(this.f117811d, this.f117812e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        return new java.lang.Long(com.tencent.mm.vfs.w6.d(this.f117811d.f155662f, this.f117812e, false));
    }
}
