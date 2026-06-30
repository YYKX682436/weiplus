package dl4;

/* loaded from: classes3.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f235436a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f235437b = new kk.l(500);

    public static final void a(java.lang.String imageKey, android.graphics.Bitmap bitmap, com.tencent.mm.sdk.platformtools.w1 w1Var, ff0.x xVar) {
        kotlin.jvm.internal.o.g(imageKey, "imageKey");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        ff0.z zVar = (ff0.z) ((com.tencent.mm.sdk.platformtools.r2) f235437b).get(imageKey);
        if (zVar != null) {
            pm0.v.X(new dl4.h1(xVar, zVar));
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new dl4.i1(imageKey, bitmap, w1Var, xVar), "MicroMsg.TingPickImageColorManager");
        }
    }
}
