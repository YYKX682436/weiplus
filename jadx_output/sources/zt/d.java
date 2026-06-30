package zt;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f475533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, zt.e eVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f475532d = str;
        this.f475533e = bitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.g gVar = ot.g.f348308m;
        java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) ot.g.f348308m).getValue();
        java.lang.String str = this.f475532d;
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
                    imageView.setImageBitmap(this.f475533e);
                    imageView.setBackgroundDrawable(null);
                }
            }
            if (hashSet.isEmpty()) {
                jz5.g gVar2 = ot.g.f348308m;
                ((java.util.HashMap) ((jz5.n) ot.g.f348308m).getValue()).remove(str);
            }
        }
        return jz5.f0.f302826a;
    }
}
