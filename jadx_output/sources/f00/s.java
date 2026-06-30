package f00;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.g9 f258327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(bw5.g9 g9Var) {
        super(2);
        this.f258327d = g9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.ImageView imageView = (android.widget.ImageView) obj2;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        java.util.LinkedList linkedList = this.f258327d.f27755t;
        java.lang.String str = linkedList != null ? (java.lang.String) kz5.n0.a0(linkedList, intValue) : null;
        if (!(str == null || str.length() == 0)) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(str, com.tencent.mm.plugin.finder.storage.y90.f128356f));
            a17.f447873d = new f00.r(imageView);
            a17.f();
        }
        return jz5.f0.f302826a;
    }
}
