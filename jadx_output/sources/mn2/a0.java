package mn2;

/* loaded from: classes10.dex */
public class a0 extends bp0.c {
    @Override // zo0.i
    public hp0.g a(cp0.n targetView, vo0.h reaper, jp0.f input) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(reaper, "reaper");
        kotlin.jvm.internal.o.g(input, "input");
        pm0.c cVar = new pm0.c("FinderBitmapProducer");
        java.io.InputStream b17 = input.b();
        if (b17 != null) {
            yo0.i iVar = reaper.f438472b;
            int i17 = iVar.f464100e;
            int i18 = iVar.f464101f;
            com.tencent.mars.xlog.Log.i("MicroMsg.Loader.InputStreamBitmapProducer", "asResource: maxW=" + i17 + ", maxH=" + i18 + ", length=" + b17.available());
            ((d60.y) ((e60.j1) i95.n0.c(e60.j1.class))).getClass();
            bitmap = z23.h.f469742e.a(b17, i17, i18, true, false, true);
        } else {
            bitmap = null;
        }
        cVar.a();
        return new hp0.g(bitmap);
    }
}
