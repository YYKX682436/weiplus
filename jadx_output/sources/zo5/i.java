package zo5;

/* loaded from: classes14.dex */
public class i extends zo5.a {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f474892a = jz5.h.b(zo5.g.f474890d);

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f474893b = jz5.h.b(zo5.h.f474891d);

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MVR.TextureRenderLogic", "release");
        android.opengl.GLES20.glDeleteProgram(((ap5.c) ((jz5.n) this.f474892a).getValue()).f12811m);
        android.opengl.GLES20.glDeleteProgram(((ap5.d) ((jz5.n) this.f474893b).getValue()).f12818m);
    }

    public java.lang.Object b(zo5.f params) {
        kotlin.jvm.internal.o.g(params, "params");
        boolean z17 = params.f474886a;
        android.util.Size size = params.f474889d;
        zo5.e eVar = params.f474888c;
        int i17 = params.f474887b;
        if (z17) {
            ap5.c cVar = (ap5.c) ((jz5.n) this.f474892a).getValue();
            cVar.f12816r = i17;
            int i18 = eVar.f474880a;
            int i19 = eVar.f474881b;
            cVar.d(i18, i19);
            android.util.Size size2 = eVar.f474885f;
            if (size2 != null && (size2.getWidth() != eVar.f474880a || size2.getHeight() != i19)) {
                android.graphics.Point point = new android.graphics.Point(0, size2.getHeight());
                android.graphics.Point point2 = new android.graphics.Point(size2.getWidth(), 0);
                cVar.f12809k = point;
                cVar.f12810l = point2;
            }
            cVar.f12808j = eVar.f474883d;
            int width = size.getWidth();
            cVar.f12802d = size.getHeight();
            cVar.f12801c = width;
            cVar.f12807i = eVar.f474882c;
            cVar.b();
            return null;
        }
        ap5.d dVar = (ap5.d) ((jz5.n) this.f474893b).getValue();
        dVar.f12823r = i17;
        int i27 = eVar.f474880a;
        int i28 = eVar.f474881b;
        dVar.d(i27, i28);
        android.util.Size size3 = eVar.f474885f;
        if (size3 != null && (size3.getWidth() != eVar.f474880a || size3.getHeight() != i28)) {
            android.graphics.Point point3 = new android.graphics.Point(0, size3.getHeight());
            android.graphics.Point point4 = new android.graphics.Point(size3.getWidth(), 0);
            dVar.f12809k = point3;
            dVar.f12810l = point4;
        }
        dVar.f12808j = eVar.f474883d;
        int width2 = size.getWidth();
        dVar.f12802d = size.getHeight();
        dVar.f12801c = width2;
        dVar.f12807i = eVar.f474882c;
        dVar.b();
        return null;
    }
}
