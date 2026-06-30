package u4;

/* loaded from: classes16.dex */
public final class c extends android.util.Property {
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        u4.j jVar = (u4.j) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        jVar.getClass();
        jVar.f424494c = java.lang.Math.round(pointF.x);
        int round = java.lang.Math.round(pointF.y);
        jVar.f424495d = round;
        int i17 = jVar.f424498g + 1;
        jVar.f424498g = i17;
        if (jVar.f424497f == i17) {
            u4.w1.b(jVar.f424496e, jVar.f424492a, jVar.f424493b, jVar.f424494c, round);
            jVar.f424497f = 0;
            jVar.f424498g = 0;
        }
    }
}
