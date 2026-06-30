package gm2;

/* loaded from: classes3.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final android.graphics.drawable.Drawable a(int i17, float f17) {
        com.tencent.mm.sdk.platformtools.r2 r2Var = gm2.q.f273461f;
        java.lang.Object element = r2Var.get(java.lang.Integer.valueOf(i17));
        if (element == null) {
            synchronized (r2Var) {
                element = r2Var.get(java.lang.Integer.valueOf(i17));
                if (element == null) {
                    element = m95.a.e(com.tencent.mm.sdk.platformtools.x2.f193075e, i17, f17 > 1.0f ? f17 : 1.0f);
                    r2Var.put(java.lang.Integer.valueOf(i17), element);
                    com.tencent.mars.xlog.Log.i("FinderLiveLevelImageSpan", "getLevelIcon resId:" + i17 + ",scale:" + f17);
                }
            }
        }
        kotlin.jvm.internal.o.f(element, "element");
        return (android.graphics.drawable.Drawable) element;
    }
}
