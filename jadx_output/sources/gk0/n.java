package gk0;

/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f272445e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, gk0.o oVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f272444d = str;
        this.f272445e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        gk0.n0.K0.getClass();
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gk0.m0.f272443b).getValue();
        java.lang.String str = this.f272444d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(str);
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
                    imageView.setImageBitmap(this.f272445e);
                }
            }
            if (hashSet.isEmpty()) {
                gk0.n0.K0.getClass();
                ((java.util.HashMap) ((jz5.n) gk0.m0.f272443b).getValue()).remove(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
