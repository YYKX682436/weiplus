package te2;

/* loaded from: classes3.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(te2.p8 p8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418206e = p8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.l5(this.f418206e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418205d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f418205d = 1;
            if (kotlinx.coroutines.k1.b(10L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        te2.p8 p8Var = this.f418206e;
        int height = ((android.widget.ScrollView) ((jz5.n) p8Var.f418312h).getValue()).getHeight();
        com.tencent.mars.xlog.Log.i("FinderLiveNoticeQRCodeUIC", "#fixContentLayoutSize realSpace=" + height + " mQrCodeRootView.height=" + p8Var.f7().getHeight());
        if (height > 0 && p8Var.f7().getHeight() > 0) {
            if (height < p8Var.f7().getHeight()) {
                float height2 = height / p8Var.f7().getHeight();
                p8Var.f7().setPivotY(0.0f);
                p8Var.f7().setScaleX(height2);
                p8Var.f7().setScaleY(height2);
            } else {
                p8Var.f7().setScaleX(1.0f);
                p8Var.f7().setScaleY(1.0f);
            }
        }
        p8Var.c7().setVisibility(0);
        return jz5.f0.f302826a;
    }
}
