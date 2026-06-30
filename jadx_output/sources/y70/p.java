package y70;

/* loaded from: classes12.dex */
public final class p extends g75.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.t
    public void c() {
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        if (cVar != null) {
            d75.b.g(new y70.n(h().k("Common_ImageKey"), cVar));
        }
    }

    @Override // g75.t
    public void e() {
        java.lang.String k17 = h().k("Common_ImageKey");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) m11.b1.Di().f322738e).i(k17);
        if (bitmap != null) {
            d75.b.g(new y70.o(k17, this, bitmap));
        }
    }
}
