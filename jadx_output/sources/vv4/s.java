package vv4;

/* loaded from: classes11.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f440495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI f440496e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.Map map, com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440495d = map;
        this.f440496e = mMFTSImageRecognitionUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vv4.s(this.f440495d, this.f440496e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vv4.s sVar = (vv4.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI mMFTSImageRecognitionUI = this.f440496e;
        java.util.Map imageInfo = this.f440495d;
        if (imageInfo != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMFTSImageRecognitionUI", "upload done imageInfo=" + imageInfo);
            kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
            com.tencent.mm.plugin.websearch.ui.MMFTSImageRecognitionUI.V6(mMFTSImageRecognitionUI, java.lang.String.valueOf(ri.l0.a(kz5.b1.e(new jz5.l("imageInfo", java.lang.String.valueOf(ri.l0.a(imageInfo)))))));
        } else {
            db5.e1.G(mMFTSImageRecognitionUI, mMFTSImageRecognitionUI.getContext().getString(com.tencent.mm.R.string.o4r), null, false, new vv4.r(mMFTSImageRecognitionUI));
        }
        return jz5.f0.f302826a;
    }
}
