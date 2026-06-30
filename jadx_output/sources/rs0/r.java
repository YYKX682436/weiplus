package rs0;

/* loaded from: classes10.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final rs0.r f399316a = new rs0.r();

    /* JADX WARN: Removed duplicated region for block: B:102:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rs0.q a(java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rs0.r.a(java.lang.String):rs0.q");
    }

    public final void b(com.tencent.mm.plugin.sight.base.h sightEncode, rs0.q colorSpace) {
        kotlin.jvm.internal.o.g(sightEncode, "sightEncode");
        kotlin.jvm.internal.o.g(colorSpace, "colorSpace");
        int i17 = sightEncode.f162415a;
        if (i17 >= 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList.add("color-range");
            int i18 = colorSpace.f399312a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList.add("color-standard");
            int i19 = colorSpace.f399313b;
            arrayList2.add(java.lang.Integer.valueOf(i19));
            arrayList.add("color-transfer");
            int i27 = colorSpace.f399314c;
            arrayList2.add(java.lang.Integer.valueOf(i27));
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoColorSpaceDetector", "mediaFormatKeys:" + arrayList + ", mediaFormatValues:" + arrayList2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList3.add("color-range");
            arrayList4.add(java.lang.Integer.valueOf(i18));
            arrayList3.add("color-standard");
            arrayList4.add(java.lang.Integer.valueOf(i19));
            arrayList3.add("color-transfer");
            arrayList4.add(java.lang.Integer.valueOf(i27));
            com.tencent.mm.plugin.sight.base.SightVideoJNI.setVideoFormatHeader(i17, (java.lang.String[]) arrayList3.toArray(new java.lang.String[0]), kz5.n0.R0(arrayList4));
        }
    }
}
