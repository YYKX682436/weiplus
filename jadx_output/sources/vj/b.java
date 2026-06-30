package vj;

/* loaded from: classes7.dex */
public final class b extends lc3.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f437636d = jz5.h.b(vj.a.f437635d);

    @Override // lc3.c0
    public java.lang.String f() {
        return "getSystemInfoSync";
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        android.graphics.Rect rect;
        android.graphics.Rect m17;
        android.widget.FrameLayout C0;
        android.widget.FrameLayout C02;
        android.widget.FrameLayout C03;
        kotlin.jvm.internal.o.g(data, "data");
        z31.a aVar = (z31.a) this.f317890a;
        int b17 = (aVar == null || (C03 = aVar.C0()) == null) ? 0 : a06.d.b(java.lang.Integer.valueOf(C03.getWidth()).floatValue() / ((java.lang.Number) ((jz5.n) this.f437636d).getValue()).floatValue());
        z31.a aVar2 = (z31.a) this.f317890a;
        int b18 = (aVar2 == null || (C02 = aVar2.C0()) == null) ? 0 : a06.d.b(java.lang.Integer.valueOf(C02.getHeight()).floatValue() / ((java.lang.Number) ((jz5.n) this.f437636d).getValue()).floatValue());
        z31.a aVar3 = (z31.a) this.f317890a;
        android.app.Activity a17 = q75.a.a((aVar3 == null || (C0 = aVar3.C0()) == null) ? null : C0.getContext());
        if (a17 == null || (m17 = com.tencent.mm.ui.bk.m(a17)) == null) {
            rect = null;
        } else {
            float floatValue = ((java.lang.Number) ((jz5.n) this.f437636d).getValue()).floatValue();
            rect = new android.graphics.Rect(a06.d.b(m17.left / floatValue), a06.d.b(m17.top / floatValue), a06.d.b(m17.right / floatValue), a06.d.b(m17.bottom / floatValue));
        }
        java.util.HashMap hashMap = new java.util.HashMap(6);
        if (rect != null) {
            int i17 = rect.left;
            int i18 = rect.top;
            int i19 = rect.right;
            if (i19 > b17) {
                i19 = b17;
            }
            int i27 = rect.bottom;
            if (i27 > b18) {
                i27 = b18;
            }
            hashMap.put("left", java.lang.Integer.valueOf(i17));
            hashMap.put("top", java.lang.Integer.valueOf(i18));
            hashMap.put("right", java.lang.Integer.valueOf(i19));
            hashMap.put("bottom", java.lang.Integer.valueOf(i27));
            hashMap.put("width", java.lang.Integer.valueOf(i19 - i17));
            hashMap.put("height", java.lang.Integer.valueOf(i27 - i18));
        }
        jz5.l[] lVarArr = new jz5.l[16];
        lVarArr[0] = new jz5.l("brand", android.os.Build.BRAND);
        lVarArr[1] = new jz5.l("model", wo.w0.m());
        lVarArr[2] = new jz5.l("pixelRatio", java.lang.Float.valueOf(((java.lang.Number) ((jz5.n) this.f437636d).getValue()).floatValue()));
        lVarArr[3] = new jz5.l("screenWidth", java.lang.Integer.valueOf(b17));
        lVarArr[4] = new jz5.l("screenHeight", java.lang.Integer.valueOf(b18));
        lVarArr[5] = new jz5.l("windowWidth", java.lang.Integer.valueOf(b17));
        lVarArr[6] = new jz5.l("windowHeight", java.lang.Integer.valueOf(b18));
        lVarArr[7] = new jz5.l(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE, com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a));
        lVarArr[8] = new jz5.l("version", com.tencent.mm.sdk.platformtools.a0.a(null, com.tencent.mm.sdk.platformtools.z.f193112h));
        lVarArr[9] = new jz5.l("system", "Android " + android.os.Build.VERSION.RELEASE);
        lVarArr[10] = new jz5.l("platform", com.eclipsesource.mmv8.Platform.ANDROID);
        lVarArr[11] = new jz5.l("fontSizeSetting", java.lang.Integer.valueOf(a06.d.b(((float) 16) * j65.c.b(com.tencent.mm.sdk.platformtools.x2.f193071a))));
        lVarArr[12] = new jz5.l("benchmarkLevel", -1);
        lVarArr[13] = new jz5.l("theme", com.tencent.mm.ui.bk.C() ? "dark" : "light");
        int i28 = com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation;
        lVarArr[14] = new jz5.l("deviceOrientation", 2 == i28 ? "landscape" : 1 == i28 ? "portrait" : "");
        lVarArr[15] = new jz5.l("safeArea", hashMap);
        return l(kz5.c1.i(lVarArr));
    }
}
