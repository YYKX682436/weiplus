package xf2;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f454253d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f454254e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.du1 f454255f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, boolean z17, r45.du1 du1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f454253d = bitmap;
        this.f454254e = z17;
        this.f454255f = du1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xf2.c(this.f454253d, this.f454254e, this.f454255f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        android.graphics.Bitmap bitmap = this.f454253d;
        float width = bitmap.getWidth() / bitmap.getHeight();
        boolean z17 = this.f454254e;
        if (!z17) {
            r45.du1 du1Var = this.f454255f;
            if (((r45.ua5) du1Var.getCustom(8)) != null && ((r45.ua5) du1Var.getCustom(9)) != null) {
                r45.ua5 ua5Var = (r45.ua5) du1Var.getCustom(9);
                float f17 = ua5Var != null ? ua5Var.getFloat(0) : 0.0f;
                r45.ua5 ua5Var2 = (r45.ua5) du1Var.getCustom(8);
                if (f17 - (ua5Var2 != null ? ua5Var2.getFloat(0) : 0.0f) > 0.0f) {
                    r45.ua5 ua5Var3 = (r45.ua5) du1Var.getCustom(9);
                    float f18 = ua5Var3 != null ? ua5Var3.getFloat(1) : 0.0f;
                    r45.ua5 ua5Var4 = (r45.ua5) du1Var.getCustom(8);
                    if (f18 - (ua5Var4 != null ? ua5Var4.getFloat(1) : 0.0f) > 0.0f && du1Var.getInteger(13) != 0 && du1Var.getInteger(14) != 0 && java.lang.Math.abs((du1Var.getInteger(14) / du1Var.getInteger(13)) - width) < width * 0.1d) {
                        r45.ua5 ua5Var5 = (r45.ua5) du1Var.getCustom(9);
                        float f19 = ua5Var5 != null ? ua5Var5.getFloat(0) : 0.0f;
                        r45.ua5 ua5Var6 = (r45.ua5) du1Var.getCustom(8);
                        float f27 = (f19 - (ua5Var6 != null ? ua5Var6.getFloat(0) : 0.0f)) * bitmap.getWidth();
                        r45.ua5 ua5Var7 = (r45.ua5) du1Var.getCustom(8);
                        float f28 = (ua5Var7 != null ? ua5Var7.getFloat(0) : 0.0f) * bitmap.getWidth();
                        r45.ua5 ua5Var8 = (r45.ua5) du1Var.getCustom(9);
                        float f29 = ua5Var8 != null ? ua5Var8.getFloat(1) : 0.0f;
                        r45.ua5 ua5Var9 = (r45.ua5) du1Var.getCustom(8);
                        float f37 = (f29 - (ua5Var9 != null ? ua5Var9.getFloat(1) : 0.0f)) * bitmap.getHeight();
                        r45.ua5 ua5Var10 = (r45.ua5) du1Var.getCustom(9);
                        return new int[]{(int) f28, (int) f27, (int) ((1.0f - (ua5Var10 != null ? ua5Var10.getFloat(1) : 0.0f)) * bitmap.getHeight()), (int) f37};
                    }
                }
            }
        }
        if (!z17) {
            if (!(width == 1.7777778f)) {
                if (!(width == 0.5625f)) {
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        if (width < 1.7777778f) {
                            int width2 = bitmap.getWidth();
                            int i17 = (int) (width2 / 1.7777778f);
                            return new int[]{0, width2, (bitmap.getHeight() - i17) / 2, i17};
                        }
                        int height = bitmap.getHeight();
                        int i18 = (int) (height * 1.7777778f);
                        return new int[]{(bitmap.getWidth() - i18) / 2, i18, 0, height};
                    }
                    if (width < 0.5625f) {
                        int width3 = bitmap.getWidth();
                        int i19 = (int) (width3 / 0.5625f);
                        return new int[]{0, width3, (bitmap.getHeight() - i19) / 2, i19};
                    }
                    int height2 = bitmap.getHeight();
                    int i27 = (int) (height2 * 0.5625f);
                    return new int[]{(bitmap.getWidth() - i27) / 2, i27, 0, height2};
                }
            }
        }
        return new int[]{0, bitmap.getWidth(), 0, bitmap.getHeight()};
    }
}
