package vv4;

/* loaded from: classes11.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f440461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440462e;

    /* renamed from: f, reason: collision with root package name */
    public int f440463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f440462e = mMFTSImageRecognitionUI;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f440461d = obj;
        this.f440463f |= Integer.MIN_VALUE;
        return com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.T6(this.f440462e, null, this);
    }
}
