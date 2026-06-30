package u4;

/* loaded from: classes13.dex */
public final class f extends android.util.Property {
    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Object get(java.lang.Object obj) {
        return null;
    }

    @Override // android.util.Property
    public void set(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        android.graphics.PointF pointF = (android.graphics.PointF) obj2;
        int round = java.lang.Math.round(pointF.x);
        int round2 = java.lang.Math.round(pointF.y);
        u4.w1.b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
    }
}
