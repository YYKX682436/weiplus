package f7;

/* loaded from: classes13.dex */
public final class c extends f7.b {
    @Override // w6.z0
    public java.lang.Class a() {
        return this.f260024d.getClass();
    }

    @Override // w6.z0
    public int getSize() {
        android.graphics.drawable.Drawable drawable = this.f260024d;
        return java.lang.Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }

    @Override // w6.z0
    public void recycle() {
    }
}
