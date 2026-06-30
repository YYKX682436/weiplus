package rm5;

/* loaded from: classes7.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f397567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.l lVar) {
        super(2);
        this.f397567d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getThumbBitmap result, timeMs:");
        sb6.append(longValue);
        sb6.append(", bitmap:");
        sb6.append(bitmap);
        sb6.append(", size:[");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getWidth()) : null);
        sb6.append(", ");
        sb6.append(bitmap != null ? java.lang.Integer.valueOf(bitmap.getHeight()) : null);
        sb6.append(']');
        xm5.b.c("VideoComposition", sb6.toString(), new java.lang.Object[0]);
        this.f397567d.invoke(bitmap);
        return jz5.f0.f302826a;
    }
}
