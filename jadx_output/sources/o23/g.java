package o23;

/* loaded from: classes10.dex */
public final class g extends h.b {

    /* renamed from: a, reason: collision with root package name */
    public final int f342416a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342417b;

    public g(int i17, int i18) {
        this.f342416a = i17;
        this.f342417b = i18;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[LOOP:0: B:30:0x00bd->B:32:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff A[LOOP:1: B:38:0x00f9->B:40:0x00ff, LOOP_END] */
    @Override // h.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.content.Intent a(android.content.Context r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o23.g.a(android.content.Context, java.lang.Object):android.content.Intent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0197  */
    /* JADX WARN: Type inference failed for: r1v15, types: [com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    @Override // h.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r39, android.content.Intent r40) {
        /*
            Method dump skipped, instructions count: 941
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o23.g.c(int, android.content.Intent):java.lang.Object");
    }

    public final java.util.List d(java.util.ArrayList arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFeatureService", "no image selected");
            return kz5.p0.f313996d;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryFeatureService", "handleImages size=" + arrayList.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new qc0.l1(qc0.n1.f361418e, (java.lang.String) it.next(), null, 0L, null, null, 0L, false, 0, 0L, null, null, 4092, null));
        }
        return arrayList2;
    }
}
