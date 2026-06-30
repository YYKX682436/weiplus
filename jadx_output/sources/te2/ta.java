package te2;

/* loaded from: classes3.dex */
public final class ta extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418457e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(te2.hc hcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418457e = hcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.ta(this.f418457e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.ta) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418456d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418456d = 1;
            if (kotlinx.coroutines.k1.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        te2.hc hcVar = this.f418457e;
        ((android.view.View) ((jz5.n) hcVar.f418083u).getValue()).getGlobalVisibleRect(rect);
        ((android.view.View) ((jz5.n) hcVar.B).getValue()).getGlobalVisibleRect(new android.graphics.Rect());
        int height = ((android.widget.ScrollView) ((jz5.n) hcVar.f418069d).getValue()).getHeight();
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + hcVar.R6().getHeight());
        if (height > 0 && hcVar.R6().getHeight() > 0) {
            if (height < hcVar.R6().getHeight()) {
                float height2 = height / hcVar.R6().getHeight();
                hcVar.R6().setScaleX(height2);
                hcVar.R6().setScaleY(height2);
            } else {
                hcVar.R6().setScaleX(1.0f);
                hcVar.R6().setScaleY(1.0f);
            }
        }
        hcVar.Q6().setVisibility(0);
        return jz5.f0.f302826a;
    }
}
