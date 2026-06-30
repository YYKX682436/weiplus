package z51;

/* loaded from: classes10.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f470224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z51.w f470225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z51.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f470225e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new z51.t(this.f470225e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((z51.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.Bitmap L;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f470224d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            z51.w wVar = this.f470225e;
            java.lang.String str = wVar.f470230h;
            wVar.getClass();
            wVar.f("safeGetBitmap >> thumbPath: " + str);
            if (com.tencent.mm.vfs.w6.j(str)) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.sdk.platformtools.x.J(str, options);
                float f17 = options.outWidth;
                float f18 = options.outHeight;
                wVar.f("safeGetBitmap >> bmWidth: " + f17 + " bmHeight: " + f18);
                while (f17 * f18 > 5242880.0f) {
                    wVar.g("thumbSize is to big, need to compress");
                    f18 *= 0.9f;
                    f17 *= 0.9f;
                }
                wVar.f("safeGetBitmap final >> bmWidth: " + f17 + " bmHeight: " + f18);
                L = com.tencent.mm.sdk.platformtools.x.L(str, (int) f17, (int) f18);
            } else {
                wVar.e(str + " is no exist");
                L = null;
            }
            h0Var.f310123d = L;
            if (L == null) {
                wVar.e("bitmap is null");
                return f0Var;
            }
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(wVar.f470230h).getOrientationInDegree();
            wVar.f("degree : " + orientationInDegree);
            h0Var.f310123d = com.tencent.mm.sdk.platformtools.x.w0((android.graphics.Bitmap) h0Var.f310123d, (float) orientationInDegree);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            z51.s sVar = new z51.s(wVar, h0Var, null);
            this.f470224d = 1;
            if (kotlinx.coroutines.l.g(g3Var, sVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
