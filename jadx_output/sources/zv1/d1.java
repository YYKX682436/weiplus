package zv1;

/* loaded from: classes14.dex */
public final class d1 {
    public d1(kotlin.jvm.internal.i iVar) {
    }

    public final void a(zv1.r rVar, java.util.List list, java.lang.String str, int i17) {
        if (list.isEmpty()) {
            return;
        }
        int min = java.lang.Math.min(i17, list.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", str + " - TOP " + min + " files:");
        int i18 = 0;
        while (i18 < min) {
            zv1.e1 e1Var = (zv1.e1) list.get(i18);
            float f17 = ((float) e1Var.f476294b) / 1000000;
            i18++;
            java.lang.String format = java.lang.String.format("[%2d] %s - %.2f MB (%s) - EXEMPTED(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(i18), e1Var.f476293a, java.lang.Float.valueOf(f17), zv1.i0.a().format(new java.util.Date(e1Var.f476295c)), e1Var.f476297e}, 5));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", format);
        }
    }

    public final void b(zv1.r continuation, java.util.List fileInfoList, int i17, long j17) {
        java.util.List list;
        double d17;
        kotlin.jvm.internal.o.g(continuation, "continuation");
        kotlin.jvm.internal.o.g(fileInfoList, "fileInfoList");
        if (fileInfoList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "dumpTopNFiles skip: empty");
            return;
        }
        if (i17 < 0 || i17 >= fileInfoList.size()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CleanCache.Utils", "dumpTopNFiles invalid index: " + i17 + ", size: " + fileInfoList.size());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "TimeThreshold: " + j17 + " (" + zv1.i0.a().format(new java.util.Date(j17)) + ')');
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Index: ");
        sb6.append(i17);
        sb6.append(", Total files: ");
        sb6.append(fileInfoList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", sb6.toString());
        int i18 = i17 + 1;
        int size = fileInfoList.size();
        if (i18 <= size) {
            size = i18;
        }
        java.util.List subList = fileInfoList.subList(0, size);
        java.util.List subList2 = i18 < fileInfoList.size() ? fileInfoList.subList(i18, fileInfoList.size()) : kz5.p0.f313996d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "Files to clean (older than threshold): " + subList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", "Files to keep (newer than threshold): " + subList2.size());
        java.util.Iterator it = subList.iterator();
        long j18 = 0;
        while (it.hasNext()) {
            j18 += ((zv1.e1) it.next()).f476294b;
        }
        java.util.Iterator it6 = subList2.iterator();
        long j19 = 0;
        while (it6.hasNext()) {
            j19 += ((zv1.e1) it6.next()).f476294b;
            subList = subList;
        }
        java.util.List list2 = subList;
        java.util.Iterator it7 = fileInfoList.iterator();
        long j27 = 0;
        while (it7.hasNext()) {
            j27 += ((zv1.e1) it7.next()).f476294b;
        }
        java.lang.Object[] objArr = new java.lang.Object[4];
        float f17 = 1000000;
        objArr[0] = java.lang.Float.valueOf(((float) j18) / f17);
        if (j27 > 0) {
            list = subList2;
            d17 = (j18 * 100.0d) / j27;
        } else {
            list = subList2;
            d17 = 0.0d;
        }
        objArr[1] = java.lang.Double.valueOf(d17);
        objArr[2] = java.lang.Float.valueOf(((float) j19) / f17);
        objArr[3] = java.lang.Double.valueOf(j27 > 0 ? (j19 * 100.0d) / j27 : 0.0d);
        java.lang.String format = java.lang.String.format("Size distribution - To clean: %.2f MB (%.1f%%), To keep: %.2f MB (%.1f%%)", java.util.Arrays.copyOf(objArr, 4));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCache.Utils", format);
        a(continuation, kz5.n0.F0(list2, new zv1.b1()), "FILES TO CLEAN (older)", 20);
        if (!list.isEmpty()) {
            a(continuation, kz5.n0.F0(list, new zv1.c1()), "FILES TO KEEP (newer)", 20);
        }
    }
}
