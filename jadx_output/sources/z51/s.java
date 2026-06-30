package z51;

/* loaded from: classes10.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f470221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.w f470222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f470223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z51.w wVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470222e = wVar;
        this.f470223f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        z51.s sVar = new z51.s(this.f470222e, this.f470223f, continuation);
        sVar.f470221d = obj;
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f470221d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load bitmap finish >> height: ");
        kotlin.jvm.internal.h0 h0Var = this.f470223f;
        sb6.append(((android.graphics.Bitmap) h0Var.f310123d).getHeight());
        sb6.append(" width: ");
        sb6.append(((android.graphics.Bitmap) h0Var.f310123d).getWidth());
        java.lang.String sb7 = sb6.toString();
        z51.w wVar = this.f470222e;
        wVar.f(sb7);
        boolean h17 = kotlinx.coroutines.z0.h(y0Var);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            wVar.g("load bitmap job is cancel");
            return f0Var;
        }
        z51.r rVar = (z51.r) wVar.a(z51.r.class);
        int width = ((android.graphics.Bitmap) h0Var.f310123d).getWidth();
        int height = ((android.graphics.Bitmap) h0Var.f310123d).getHeight();
        rVar.f("onThumbShowToChangeTagViewLocation >> width: " + width + " thumbHeight: " + height);
        rVar.f470218m = height;
        rVar.f470217l = width;
        y51.f fVar = rVar.f470215j;
        if (fVar != null) {
            int c17 = fVar.c();
            rVar.f("onGetLocationCallback >> bottomHeight: " + c17);
            rVar.k(c17);
        }
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = wVar.f470228f;
        if (multiTouchImageView == null) {
            kotlin.jvm.internal.o.o("thumbView");
            throw null;
        }
        multiTouchImageView.setEnableHorLongBmpMode(true);
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView2 = wVar.f470228f;
        if (multiTouchImageView2 == null) {
            kotlin.jvm.internal.o.o("thumbView");
            throw null;
        }
        int width2 = ((android.graphics.Bitmap) h0Var.f310123d).getWidth();
        int height2 = ((android.graphics.Bitmap) h0Var.f310123d).getHeight();
        multiTouchImageView2.f197651o = width2;
        multiTouchImageView2.f197652p = height2;
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView3 = wVar.f470228f;
        if (multiTouchImageView3 != null) {
            multiTouchImageView3.setImageBitmap((android.graphics.Bitmap) h0Var.f310123d);
            return f0Var;
        }
        kotlin.jvm.internal.o.o("thumbView");
        throw null;
    }
}
