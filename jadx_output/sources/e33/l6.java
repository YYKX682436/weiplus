package e33;

/* loaded from: classes10.dex */
public final class l6 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f247337a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f247338b;

    public l6(android.widget.ImageView imageView, java.lang.String str) {
        this.f247337a = new java.lang.ref.WeakReference(imageView);
        this.f247338b = str;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return this.f247338b;
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable c17 = c();
        boolean z17 = c17 instanceof e33.m6;
        java.lang.ref.WeakReference weakReference = this.f247337a;
        if (!z17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ThumbDrawable", "drawable [%s] in ownerRef [%s] is not a ThumbDrawable, ignore.", c17, weakReference);
            return;
        }
        e33.m6 m6Var = (e33.m6) c17;
        if (!j33.d0.d(m6Var.f247367d, m6Var.f247372i, m6Var.f247371h).equals(str) || (imageView = (android.widget.ImageView) weakReference.get()) == null) {
            return;
        }
        imageView.post(new e33.k6(imageView));
    }

    public final android.graphics.drawable.Drawable c() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f247337a.get();
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        android.graphics.drawable.Drawable drawable;
        if (obj == null) {
            return false;
        }
        android.graphics.drawable.Drawable c17 = c();
        if (!(obj instanceof e33.l6)) {
            if (obj instanceof e33.m6) {
                drawable = (android.graphics.drawable.Drawable) obj;
            }
            return false;
        }
        drawable = ((e33.l6) obj).c();
        if (c17 != null && drawable != null) {
            return c17.equals(drawable);
        }
        return false;
    }

    public int hashCode() {
        android.graphics.drawable.Drawable c17 = c();
        return c17 != null ? c17.hashCode() : super.hashCode();
    }

    public java.lang.String toString() {
        return "decodeTaskKey:" + this.f247338b + " ownerRef:" + this.f247337a;
    }
}
