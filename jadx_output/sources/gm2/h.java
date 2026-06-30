package gm2;

/* loaded from: classes3.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    public static final void a(gm2.h hVar, java.lang.String str) {
        hVar.getClass();
        try {
            com.tencent.mm.sdk.platformtools.r2 r2Var = gm2.j.f273415f;
            int size = r2Var.size();
            zl2.r4.f473950a.M2("FinderLiveFansSpan", str + " cache Size:" + size);
            if (size > 0) {
                r2Var.d(-1);
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveFansSpan-memoryTrim");
        }
    }

    public final android.graphics.Bitmap b(int i17) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = gm2.j.f273415f;
        java.lang.Object element = r2Var.get(java.lang.Integer.valueOf(i17));
        if (element == null) {
            synchronized (r2Var) {
                element = r2Var.get(java.lang.Integer.valueOf(i17));
                if (element == null) {
                    element = com.tencent.mm.sdk.platformtools.x.c0(i17);
                    r2Var.put(java.lang.Integer.valueOf(i17), element);
                    com.tencent.mars.xlog.Log.i("FinderLiveFansSpan", "getFansIcon resId:" + i17);
                }
            }
        }
        kotlin.jvm.internal.o.f(element, "element");
        return (android.graphics.Bitmap) element;
    }
}
