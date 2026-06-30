package y94;

/* loaded from: classes10.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y94.a0 f460389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(y94.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f460389d = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        y94.o oVar = new y94.o(this.f460389d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return oVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        java.lang.Object invokeSuspend = ((y94.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.os.Bundle bundle;
        boolean z17;
        float f17;
        android.os.Bundle bundle2;
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        y94.a0 a0Var = this.f460389d;
        if (y94.a0.z(a0Var) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            android.graphics.Bitmap bitmap = a0Var.f460353x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
            if (bitmap != null) {
                bn5.f z19 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z19);
                int width = z19.getWidth();
                bn5.f z27 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z27);
                int height = z27.getHeight();
                android.graphics.Rect rect = new android.graphics.Rect();
                android.graphics.Rect rect2 = new android.graphics.Rect();
                rect.left = 0;
                rect.right = width;
                int i17 = (height - width) / 2;
                rect.top = i17;
                rect.bottom = height - i17;
                rect2.left = 0;
                rect2.right = width;
                rect2.top = 0;
                rect2.bottom = height;
                bn5.f z28 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z28);
                android.graphics.Matrix matrix = new android.graphics.Matrix(z28.getMainMatrix());
                if (!y94.a0.A(a0Var)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    int i18 = a0Var.f460350u;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    if (i18 != 0) {
                        float[] fArr = new float[9];
                        matrix.getValues(fArr);
                        float f18 = fArr[0];
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                        int i19 = a0Var.f460350u;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBlurBitmapOffsetHeight$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                        matrix.postTranslate(0.0f, (i19 * f18) / 2);
                    }
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    matrix.invert(matrix2);
                    android.graphics.RectF rectF = new android.graphics.RectF(rect);
                    matrix2.mapRect(rectF);
                    rectF.round(rect);
                    android.graphics.RectF rectF2 = new android.graphics.RectF(rect2);
                    matrix2.mapRect(rectF2);
                    rectF2.round(rect2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    android.graphics.Bitmap bitmap2 = a0Var.f460353x;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo C = y94.a0.C(a0Var, bitmap2, rect2, dw3.h.d(dw3.h.f244211a, "sns_cover_img", null, 2, null), og3.a.f345156e);
                    if (C != null) {
                        arrayList.add(C);
                    }
                    if (arrayList.size() > 0) {
                        bundle = null;
                        z17 = true;
                    } else {
                        bundle = null;
                        z17 = false;
                    }
                    com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo(z17, arrayList, bundle);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
                    return mediaResultInfo;
                }
                android.graphics.Matrix matrix3 = new android.graphics.Matrix();
                matrix.invert(matrix3);
                bn5.f z29 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z29);
                android.graphics.RectF rectF3 = new android.graphics.RectF(z29.getValidImageRect());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                float f19 = width;
                float f27 = height;
                android.graphics.RectF rectF4 = new android.graphics.RectF(new android.graphics.RectF(0.0f, 0.0f, f19, f27));
                matrix3.mapRect(rectF4);
                android.graphics.RectF rectF5 = new android.graphics.RectF();
                if (rectF5.setIntersect(rectF4, rectF3)) {
                    rectF5.offset(-rectF3.left, -rectF3.top);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "cropRectInValidLocal no intersection!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    rectF5 = null;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$cropRectInValidLocal", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportCoverImage mainMatrix:");
                sb6.append(matrix);
                sb6.append(", previewWidth:");
                sb6.append(width);
                sb6.append(", previewHeight:");
                sb6.append(height);
                sb6.append(", validRect:");
                bn5.f z37 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z37);
                sb6.append(z37.getValidImageRect());
                sb6.append(' ');
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverEffectImagePlugin", sb6.toString());
                if (rectF5 != null) {
                    rectF5.round(rect2);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "exportCoverImage contentRectF is null");
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                android.graphics.Bitmap bitmap3 = a0Var.f460353x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSource$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo C2 = y94.a0.C(a0Var, bitmap3, rect2, dw3.h.d(dw3.h.f244211a, "sns_cover_img", null, 2, null), og3.a.f345156e);
                if (C2 != null) {
                    arrayList2.add(C2);
                }
                bn5.f z38 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z38);
                android.graphics.Matrix mainMatrix = z38.getMainMatrix();
                kotlin.jvm.internal.o.f(mainMatrix, "getMainMatrix(...)");
                bn5.f z39 = y94.a0.z(a0Var);
                kotlin.jvm.internal.o.d(z39);
                android.graphics.RectF rectF6 = new android.graphics.RectF(z39.getValidImageRect());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                android.graphics.Matrix matrix4 = new android.graphics.Matrix();
                mainMatrix.invert(matrix4);
                android.graphics.RectF rectF7 = new android.graphics.RectF(0.0f, 0.0f, f19, f27);
                android.graphics.RectF rectF8 = new android.graphics.RectF(rectF7);
                matrix4.mapRect(rectF8);
                android.graphics.RectF rectF9 = new android.graphics.RectF();
                if (rectF9.setIntersect(rectF8, rectF6)) {
                    mainMatrix.mapRect(rectF9);
                    float f28 = 2;
                    float height2 = (((rectF9.top + rectF9.bottom) / f28) - ((rectF7.top + rectF7.bottom) / f28)) / rectF9.height();
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverEffectImagePlugin", "calculateCoverOffset:" + height2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    f17 = height2;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsCoverEffectImagePlugin", "calculateCoverOffset no intersection!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                    f17 = 0.0f;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$calculateCoverOffset", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin");
                if (arrayList2.size() > 0) {
                    bundle2 = null;
                    z18 = true;
                } else {
                    bundle2 = null;
                    z18 = false;
                }
                com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo2 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo(z18, arrayList2, bundle2);
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putFloat("snsCoverOffsetKey", f17);
                mediaResultInfo2.f148608f = bundle3;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
                return mediaResultInfo2;
            }
        }
        com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo3 = new com.tencent.mm.plugin.mediabasic.data.MediaResultInfo(false, new java.util.ArrayList(), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectImagePlugin$exportCoverImage$2");
        return mediaResultInfo3;
    }
}
