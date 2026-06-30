package so2;

/* loaded from: classes10.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f410539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410540f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(so2.w5 w5Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410539e = w5Var;
        this.f410540f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.p5(this.f410539e, this.f410540f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.p5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f410538d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f410538d = 1;
            this.f410539e.getClass();
            android.graphics.Bitmap t17 = com.tencent.mm.sdk.platformtools.x.t(this.f410540f, 4, 4, false, false);
            if (t17 == null || t17.isRecycled()) {
                obj = new java.lang.Integer(-1);
            } else {
                i4.i iVar = new i4.f(t17).b().f288359d;
                java.lang.Integer num = iVar != null ? new java.lang.Integer(iVar.f288349d) : null;
                int i18 = com.tencent.mm.ui.bk.c(t17, 4, 4)[0];
                int intValue = num != null ? num.intValue() : i18;
                com.tencent.mars.xlog.Log.i("Finder.SetProfileCoverViewModel", "rgbColor domainRgb:" + num + "  bgRgb:" + i18);
                int i19 = (int) (((float) 255) * 0.0f);
                int i27 = i19 > 0 ? i19 : 0;
                obj = new java.lang.Integer(((255 > i27 ? i27 : 255) << 24) + (intValue & 16777215));
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
