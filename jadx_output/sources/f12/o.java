package f12;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f258652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f21.d0 f258655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity, java.lang.String str, f21.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258653e = springLuckyEggActivity;
        this.f258654f = str;
        this.f258655g = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.o(this.f258653e, this.f258654f, this.f258655g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f258652d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            f12.n nVar = new f12.n(this.f258654f, this.f258655g, null);
            this.f258652d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, nVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258653e;
        f12.c0 c0Var = springLuckyEggActivity.f97440f;
        if (c0Var == null) {
            kotlin.jvm.internal.o.o("viewBinding");
            throw null;
        }
        c0Var.f258579h.setImageBitmap(bitmap);
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            f12.c0 c0Var2 = springLuckyEggActivity.f97440f;
            if (c0Var2 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            android.view.ViewGroup.LayoutParams layoutParams = c0Var2.f258579h.getLayoutParams();
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (springLuckyEggActivity.f97440f == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            layoutParams.height = (int) (r7.f258579h.getWidth() / width);
            f12.c0 c0Var3 = springLuckyEggActivity.f97440f;
            if (c0Var3 == null) {
                kotlin.jvm.internal.o.o("viewBinding");
                throw null;
            }
            c0Var3.f258579h.requestLayout();
        }
        return jz5.f0.f302826a;
    }
}
