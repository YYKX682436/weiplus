package x14;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f451436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView f451437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f451437e = getHdHeadImageGalleryView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new x14.e(this.f451437e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((x14.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f451436d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView getHdHeadImageGalleryView = this.f451437e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = getHdHeadImageGalleryView.f161648l1;
            if (str == null) {
                return f0Var;
            }
            kv.b0 b0Var = getHdHeadImageGalleryView.f161650x0;
            this.f451436d = 1;
            obj = ((hn1.s) b0Var).hj(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String str2 = (java.lang.String) obj;
        if (str2 == null) {
            return f0Var;
        }
        java.lang.String[] stringArray = getHdHeadImageGalleryView.getContext().getResources().getStringArray(com.tencent.mm.R.array.f478005t);
        kotlin.jvm.internal.o.f(stringArray, "getStringArray(...)");
        db5.e1.e(getHdHeadImageGalleryView.getContext(), null, stringArray, "", new x14.d(getHdHeadImageGalleryView, str2));
        return f0Var;
    }
}
