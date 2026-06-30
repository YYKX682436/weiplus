package com.tencent.mm.xeffect;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0082 J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0005H\u0082 J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0005H\u0082 ¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/xeffect/FaceTracker;", "", "", "", "modelMap", "", "nInitWithMap", "([Ljava/lang/String;)J", "nPtr", "Ljava/nio/Buffer;", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "", "width", "height", "nDetect", "", "nGetAlignments", "nGetFaceRect", "nGetFaceAngles", "nGetFaceRects", "nGetFacePartConf", "Ljz5/f0;", "nDestroy", "renderlib_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes14.dex */
public final class FaceTracker {

    /* renamed from: a, reason: collision with root package name */
    public final long f214788a;

    static {
        tq5.k.a("xlabeffect");
    }

    public FaceTracker(java.util.Map modelMap) {
        kotlin.jvm.internal.o.h(modelMap, "modelMap");
        this.f214788a = nInitWithMap(tq5.i.f421270b.a(modelMap));
    }

    private final native void nDestroy(long j17);

    private final native int nDetect(long nPtr, java.nio.Buffer data, int width, int height);

    private final native float[] nGetAlignments(long nPtr);

    private final native float[] nGetFaceAngles(long nPtr);

    private final native float[] nGetFacePartConf(long nPtr);

    private final native float[] nGetFaceRect(long nPtr);

    private final native float[] nGetFaceRects(long nPtr);

    private final native long nInitWithMap(java.lang.String[] modelMap);

    public final void a() {
        long j17 = this.f214788a;
        if (j17 != 0) {
            nDestroy(j17);
        }
    }

    public final int b(java.nio.Buffer data, int i17, int i18) {
        kotlin.jvm.internal.o.h(data, "data");
        long j17 = this.f214788a;
        if (j17 != 0) {
            return nDetect(j17, data, i17, i18);
        }
        return -1;
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] nGetAlignments = nGetAlignments(this.f214788a);
        if (nGetAlignments != null) {
            int length = nGetAlignments.length;
            if (length < 2) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "alignments data no face count", new java.lang.Object[0]);
            }
            int i17 = (int) nGetAlignments[0];
            int i18 = (int) nGetAlignments[1];
            if (length != (i17 * i18 * 2) + 2) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "alignments data size error, face:" + i17 + ", point:" + i18 + ", float:" + length, new java.lang.Object[0]);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                android.graphics.PointF[] pointFArr = new android.graphics.PointF[i18];
                for (int i27 = 0; i27 < i18; i27++) {
                    pointFArr[i27] = new android.graphics.PointF();
                }
                for (int i28 = 0; i28 < i18; i28++) {
                    android.graphics.PointF pointF = new android.graphics.PointF();
                    pointFArr[i28] = pointF;
                    int i29 = (i19 * i17) + (i28 * 2);
                    pointF.x = nGetAlignments[i29 + 2];
                    pointF.y = nGetAlignments[i29 + 3];
                }
                arrayList.add(pointFArr);
            }
        }
        return arrayList;
    }

    public final java.util.List d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] nGetFaceAngles = nGetFaceAngles(this.f214788a);
        if (nGetFaceAngles != null) {
            int length = nGetFaceAngles.length;
            if (length % 3 != 0) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "angles data size not match " + length, new java.lang.Object[0]);
            }
            int i17 = length / 3;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i18 * 3;
                arrayList.add(new tq5.a(nGetFaceAngles[i19], nGetFaceAngles[i19 + 1], nGetFaceAngles[i19 + 2]));
            }
        }
        return arrayList;
    }

    public final java.util.List e() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] nGetFacePartConf = nGetFacePartConf(this.f214788a);
        if (nGetFacePartConf != null) {
            int length = nGetFacePartConf.length;
            if (length < 2) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "part conf data no face count", new java.lang.Object[0]);
                return arrayList;
            }
            int i17 = (int) nGetFacePartConf[0];
            int i18 = (int) nGetFacePartConf[1];
            if (length != (i17 * i18) + 2) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "part conf data size error, face:" + i17 + ", conf:" + i18 + ", float:" + length, new java.lang.Object[0]);
                return arrayList;
            }
            for (int i19 = 0; i19 < i17; i19++) {
                int i27 = (i19 * i17) + 2;
                arrayList.add(kz5.v.r(nGetFacePartConf, i27, i27 + i18));
            }
        }
        return arrayList;
    }

    public final java.util.List f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float[] nGetFaceRects = nGetFaceRects(this.f214788a);
        if (nGetFaceRects != null) {
            int length = nGetFaceRects.length;
            if (length % 4 != 0) {
                com.tencent.mm.xeffect.XEffectLog.b("FaceTracker", "rects data size not match " + length, new java.lang.Object[0]);
            }
            int i17 = length / 4;
            for (int i18 = 0; i18 < i17; i18++) {
                int i19 = i18 * 4;
                float f17 = nGetFaceRects[i19];
                float f18 = nGetFaceRects[i19 + 1];
                arrayList.add(new android.graphics.RectF(f17, f18, nGetFaceRects[i19 + 2] + f17, nGetFaceRects[i19 + 3] + f18));
            }
        }
        return arrayList;
    }
}
