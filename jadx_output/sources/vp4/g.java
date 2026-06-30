package vp4;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f439022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp4.j f439023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f439024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlin.coroutines.Continuation continuation, vp4.j jVar, java.lang.String str) {
        super(2);
        this.f439022d = continuation;
        this.f439023e = jVar;
        this.f439024f = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        kotlin.coroutines.Continuation continuation = this.f439022d;
        if (booleanValue) {
            vp4.j jVar = this.f439023e;
            jVar.getClass();
            ut3.f fVar = ut3.f.f431176c;
            fVar.f431178b.putString("key_background_remux_work_id", this.f439024f);
            fVar.f431178b.putBoolean("key_is_background_video", true);
            vp4.s.f439074a.g(jVar.f439037c);
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(intValue == 0 ? og3.h.f345165e : og3.h.f345164d, intValue, "go to background remux", null, 8, null)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(intValue == 0 ? og3.h.f345165e : og3.h.f345164d, intValue, "ERROR_TARGET_BITRATE_ERROR remux error", null, 8, null)));
        }
        return jz5.f0.f302826a;
    }
}
