package y70;

/* loaded from: classes12.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f459689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, y70.p pVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f459688d = str;
        this.f459689e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap b17 = v70.b0.f433600m.b();
        java.lang.String str = this.f459688d;
        java.util.HashSet hashSet = (java.util.HashSet) b17.get(str);
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) ((d75.c) next).get();
                if (imageView == null) {
                    it.remove();
                } else if (kotlin.jvm.internal.o.b(imageView.getTag(com.tencent.mm.R.id.h9z), str)) {
                    android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                    int i17 = layoutParams != null ? layoutParams.width : 0;
                    android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    int i18 = layoutParams2 != null ? layoutParams2.height : 0;
                    imageView.setImageBitmap(this.f459689e);
                    imageView.setBackgroundDrawable(null);
                    java.lang.Object tag = imageView.getTag(com.tencent.mm.R.id.uhz);
                    if (tag != null) {
                        android.view.View view = tag instanceof android.view.View ? (android.view.View) tag : null;
                        if (view != null) {
                            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                        }
                    }
                    java.lang.Object tag2 = imageView.getTag(com.tencent.mm.R.id.f485995ui0);
                    if (tag2 != null) {
                        android.view.View view2 = tag2 instanceof android.view.View ? (android.view.View) tag2 : null;
                        if (view2 != null) {
                            view2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(i17, i18));
                        }
                    }
                }
            }
            if (hashSet.isEmpty()) {
                v70.b0.f433600m.b().remove(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
