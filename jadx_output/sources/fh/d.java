package fh;

/* loaded from: classes7.dex */
public abstract class d {
    public static final void a(com.tencent.magicbrush.a aVar, java.lang.String message) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        kotlin.jvm.internal.o.g(message, "message");
        if (aVar.f48614p) {
            ah.i.b("MagicBrush", message, new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0068, code lost:
    
        if (r5.y != 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.tencent.magicbrush.a r8) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fh.d.b(com.tencent.magicbrush.a):void");
    }

    public static final void c(com.tencent.magicbrush.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<this>");
        yg.f0 f0Var = aVar.f48606h;
        if (!f0Var.f462055a) {
            if (f0Var.f462059e == null) {
                a(aVar, "ImageHandler invalid, BindingImage can not use. BE CAUTIOUS!");
                return;
            }
            return;
        }
        com.github.henryye.nativeiv.BaseImageDecodeService baseImageDecodeService = new com.github.henryye.nativeiv.BaseImageDecodeService();
        baseImageDecodeService.addImageStreamFetcher(new eh.e(), false);
        java.util.List list = f0Var.f462056b;
        int i17 = 0;
        for (java.lang.Object obj : list) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            h8.c cVar = (h8.c) obj;
            boolean z17 = true;
            if (i17 != ((java.util.ArrayList) list).size() - 1) {
                z17 = false;
            }
            baseImageDecodeService.addImageStreamFetcher(cVar, z17);
            i17 = i18;
        }
        g8.i iVar = f0Var.f462057c;
        if (iVar != null) {
            baseImageDecodeService.setKvReportDelegate(iVar);
        }
        e8.b bVar = f0Var.f462058d;
        if (bVar != null) {
            kotlin.jvm.internal.o.d(bVar);
            baseImageDecodeService.setBitmapDecodeSlave(bVar);
        }
        f0Var.f462059e = baseImageDecodeService;
    }
}
