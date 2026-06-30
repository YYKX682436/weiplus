package fc3;

/* loaded from: classes9.dex */
public final class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.h f261041d;

    public g(fc3.h hVar) {
        this.f261041d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        fc3.h hVar = this.f261041d;
        if (hVar.f261047e.isEmpty()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyWordCloudTextHelper", "textCloud is empty, something is wrong");
            return true;
        }
        java.util.List list = hVar.f261047e;
        c06.d dVar = c06.e.f37716d;
        java.lang.String str = (java.lang.String) list.get(dVar.d(list.size()));
        android.graphics.PointF center = hVar.f261045c.f261080e;
        int b17 = i65.a.b(hVar.f261043a, 72);
        hVar.getClass();
        kotlin.jvm.internal.o.g(center, "center");
        double j17 = dVar.j(0.0d, 200.0d);
        if (j17 > 10.0d) {
            j17 += 160;
        }
        double radians = java.lang.Math.toRadians(j17);
        double d17 = b17;
        hVar.f261045c.c(new fc3.k(str, new android.graphics.PointF((float) (center.x + (java.lang.Math.cos(radians) * d17)), (float) (center.y + (d17 * java.lang.Math.sin(radians)))), 12.0f, 0.0f));
        return true;
    }
}
