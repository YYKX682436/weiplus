package ub1;

/* loaded from: classes13.dex */
public class a extends ub1.b {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f426009d;

    /* renamed from: e, reason: collision with root package name */
    public kd0.d3 f426010e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f426011f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f426012g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f426013h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f426014i;

    public a(ub1.e eVar, java.lang.String str) {
        super(eVar);
        ((jd0.w2) ((kd0.e3) i95.n0.c(kd0.e3.class))).getClass();
        zs5.a0 type = (zs5.a0) ((jz5.n) zs5.n0.f475451b).getValue();
        kotlin.jvm.internal.o.g(type, "type");
        this.f426010e = new zs5.z();
        this.f426011f = new java.lang.Object();
        this.f426012g = false;
        this.f426009d = str;
    }

    public int[] a(java.lang.String str) {
        java.util.HashSet hashSet = new java.util.HashSet();
        if (str.contains("barcode")) {
            hashSet.add(1);
        }
        if (str.contains("qrcode")) {
            hashSet.add(2);
        }
        int[] iArr = new int[hashSet.size()];
        java.util.Iterator it = hashSet.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            if (num != null) {
                iArr[i17] = num.intValue();
                i17++;
            }
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect b(android.graphics.Rect r10, android.graphics.Point r11, int r12, int r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub1.a.b(android.graphics.Rect, android.graphics.Point, int, int, int, int):android.graphics.Rect");
    }

    public final void c(com.tencent.qbar.QbarNative$QBarPoint qbarNative$QBarPoint, int i17, int i18, int i19, int i27, int i28) {
        int i29;
        int i37;
        if (qbarNative$QBarPoint == null) {
            return;
        }
        if (i28 == 90 || i28 == 270) {
            i29 = i17;
            i37 = i18;
        } else {
            i37 = i17;
            i29 = i18;
        }
        float f17 = qbarNative$QBarPoint.f215230x0;
        float f18 = qbarNative$QBarPoint.f215231x1;
        float f19 = qbarNative$QBarPoint.f215232x2;
        float f27 = qbarNative$QBarPoint.f215233x3;
        float f28 = qbarNative$QBarPoint.f215234y0;
        float f29 = qbarNative$QBarPoint.f215235y1;
        float f37 = qbarNative$QBarPoint.f215236y2;
        float f38 = qbarNative$QBarPoint.f215237y3;
        int i38 = 360 - ((i28 * 2) % com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        if (i38 == 90) {
            float f39 = i37;
            qbarNative$QBarPoint.f215230x0 = f39 - f27;
            qbarNative$QBarPoint.f215231x1 = f39 - f17;
            qbarNative$QBarPoint.f215232x2 = f39 - f18;
            qbarNative$QBarPoint.f215233x3 = f39 - f19;
            qbarNative$QBarPoint.f215234y0 = f38;
            qbarNative$QBarPoint.f215235y1 = f28;
            qbarNative$QBarPoint.f215236y2 = f29;
            qbarNative$QBarPoint.f215237y3 = f37;
        } else if (i38 == 180) {
            float f47 = i37;
            qbarNative$QBarPoint.f215230x0 = f47 - f19;
            qbarNative$QBarPoint.f215231x1 = f47 - f27;
            qbarNative$QBarPoint.f215232x2 = f47 - f17;
            qbarNative$QBarPoint.f215233x3 = f47 - f18;
            float f48 = i29;
            qbarNative$QBarPoint.f215234y0 = f48 - f37;
            qbarNative$QBarPoint.f215235y1 = f48 - f38;
            qbarNative$QBarPoint.f215236y2 = f48 - f28;
            qbarNative$QBarPoint.f215237y3 = f48 - f29;
        } else if (i38 == 270) {
            qbarNative$QBarPoint.f215230x0 = f18;
            qbarNative$QBarPoint.f215231x1 = f19;
            qbarNative$QBarPoint.f215232x2 = f27;
            qbarNative$QBarPoint.f215233x3 = f17;
            float f49 = i29;
            qbarNative$QBarPoint.f215234y0 = f49 - f29;
            qbarNative$QBarPoint.f215235y1 = f49 - f37;
            qbarNative$QBarPoint.f215236y2 = f49 - f38;
            qbarNative$QBarPoint.f215237y3 = f49 - f28;
        }
        float max = java.lang.Math.max((i27 * 1.0f) / i29, (i19 * 1.0f) / i37);
        qbarNative$QBarPoint.f215230x0 *= max;
        qbarNative$QBarPoint.f215231x1 *= max;
        qbarNative$QBarPoint.f215232x2 *= max;
        qbarNative$QBarPoint.f215233x3 *= max;
        qbarNative$QBarPoint.f215234y0 *= max;
        qbarNative$QBarPoint.f215235y1 *= max;
        qbarNative$QBarPoint.f215236y2 *= max;
        qbarNative$QBarPoint.f215237y3 *= max;
    }
}
