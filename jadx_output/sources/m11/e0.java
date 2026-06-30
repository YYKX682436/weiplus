package m11;

/* loaded from: classes12.dex */
public class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m11.f0 f322678d;

    public e0(m11.f0 f0Var) {
        this.f322678d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        android.widget.ImageView imageView;
        m11.f0 f0Var = this.f322678d;
        m11.l0 l0Var = f0Var.f322692m;
        java.lang.String str = f0Var.f322687e;
        java.lang.String str2 = f0Var.f322691i;
        boolean z17 = f0Var.f322689g;
        int i17 = f0Var.f322690h;
        l0Var.getClass();
        ((java.util.HashSet) l0Var.f322743m).remove(java.lang.Integer.valueOf(str.hashCode()));
        java.util.Iterator it = ((java.util.ArrayList) l0Var.f322739f).iterator();
        while (it.hasNext()) {
            m11.i0 i0Var = (m11.i0) it.next();
            if (str.equals(i0Var.f322711b) && (bitmap = (android.graphics.Bitmap) ((jt0.i) l0Var.f322738e).i(str)) != null && !bitmap.isRecycled()) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.lang.ref.WeakReference) ((java.util.HashMap) l0Var.f322740g).get(java.lang.Integer.valueOf(i0Var.f322710a))).get();
                if (imageView2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoStorage", "[checkrefresh] bitmap width %d,height %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
                    if (m11.l0.f322735v == 1) {
                        try {
                            if (imageView2.getTag() != null && !imageView2.getTag().toString().equals(str2)) {
                            }
                        } catch (java.lang.Throwable th6) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ImgInfoStorage", "checkrefresh check diff error = " + th6.getMessage());
                        }
                    }
                    m11.h0.a(bitmap, imageView2);
                    imageView2.setLayoutParams(l0Var.f322747q);
                    boolean z18 = bitmap.getWidth() >= bitmap.getHeight() * 2;
                    boolean z19 = bitmap.getHeight() >= bitmap.getWidth() * 2;
                    if (z18 || z19) {
                        bitmap.getWidth();
                        bitmap.getHeight();
                        imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                    }
                    java.util.Map map = l0Var.f322741h;
                    int i18 = i0Var.f322712c;
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    if (hashMap.get(java.lang.Integer.valueOf(i18)) != null && (imageView = (android.widget.ImageView) ((java.lang.ref.WeakReference) hashMap.get(java.lang.Integer.valueOf(i18))).get()) != null) {
                        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                    }
                    java.util.Map map2 = l0Var.f322742i;
                    int i19 = i0Var.f322713d;
                    java.util.HashMap hashMap2 = (java.util.HashMap) map2;
                    if (hashMap2.get(java.lang.Integer.valueOf(i19)) != null && (view = (android.view.View) ((java.lang.ref.WeakReference) hashMap2.get(java.lang.Integer.valueOf(i19))).get()) != null) {
                        view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(bitmap.getWidth(), bitmap.getHeight()));
                    }
                }
            }
        }
    }
}
