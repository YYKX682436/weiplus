package h6;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l36.i0 f279116a = new l36.i0(new l36.h0());

    public static final java.lang.String a(android.webkit.MimeTypeMap mimeTypeMap, java.lang.String str) {
        kotlin.jvm.internal.o.g(mimeTypeMap, "<this>");
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        java.lang.String t07 = r26.n0.t0(r26.n0.t0(str, '#', null, 2, null), '?', null, 2, null);
        return mimeTypeMap.getMimeTypeFromExtension(r26.n0.o0(r26.n0.o0(t07, '/', t07), '.', ""));
    }

    public static final a6.c0 b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f483779c11);
        a6.c0 c0Var = tag instanceof a6.c0 ? (a6.c0) tag : null;
        if (c0Var == null) {
            synchronized (view) {
                java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.f483779c11);
                a6.c0 c0Var2 = tag2 instanceof a6.c0 ? (a6.c0) tag2 : null;
                if (c0Var2 == null) {
                    c0Var = new a6.c0();
                    view.addOnAttachStateChangeListener(c0Var);
                    view.setTag(com.tencent.mm.R.id.f483779c11, c0Var);
                } else {
                    c0Var = c0Var2;
                }
            }
        }
        return c0Var;
    }

    public static final d6.g c(android.widget.ImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "<this>");
        android.widget.ImageView.ScaleType scaleType = imageView.getScaleType();
        int i17 = scaleType == null ? -1 : h6.e.f279118a[scaleType.ordinal()];
        return (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) ? d6.g.FIT : d6.g.FILL;
    }

    public static final void d(a6.b0 b0Var, c6.k kVar) {
        kotlin.jvm.internal.o.g(b0Var, "<this>");
        e6.b c17 = b0Var.c();
        e6.c cVar = c17 instanceof e6.c ? (e6.c) c17 : null;
        android.widget.ImageView imageView = cVar != null ? ((coil.target.ImageViewTarget) cVar).f43914d : null;
        if (imageView == null) {
            return;
        }
        b(imageView);
    }
}
