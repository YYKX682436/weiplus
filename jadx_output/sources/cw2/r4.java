package cw2;

/* loaded from: classes5.dex */
public final class r4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f223968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw2.s4 f223969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f223970f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(java.util.List list, cw2.s4 s4Var, yz5.p pVar) {
        super(0);
        this.f223968d = list;
        this.f223969e = s4Var;
        this.f223970f = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap;
        java.util.Iterator it = this.f223968d.iterator();
        android.graphics.Bitmap bitmap2 = null;
        while (it.hasNext()) {
            long longValue = ((java.lang.Number) it.next()).longValue();
            gp.d dVar = this.f223969e.f223991b;
            if (dVar != null) {
                zj0.a aVar = new zj0.a();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                aVar.c(2);
                aVar.c(java.lang.Long.valueOf(1000 * longValue));
                yj0.a.d(dVar, aVar.b(), "com/tencent/mm/plugin/finder/video/FinderNormalVideoThumbFetcher$requestFrames$1", "invoke", "()V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
                zj0.c.f473285a.set(aVar);
                bitmap = dVar.getFrameAtTime(((java.lang.Long) aVar.a(0)).longValue(), ((java.lang.Integer) zj0.c.a().a(1)).intValue());
                yj0.a.e(dVar, bitmap, "com/tencent/mm/plugin/finder/video/FinderNormalVideoThumbFetcher$requestFrames$1", "invoke", "()V", "Undefined", "getFrameAtTime", "(JI)Landroid/graphics/Bitmap;");
            } else {
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap2 = bitmap;
            }
            this.f223970f.invoke(java.lang.Long.valueOf(longValue), bitmap2);
        }
        return jz5.f0.f302826a;
    }
}
