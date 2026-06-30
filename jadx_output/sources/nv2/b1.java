package nv2;

/* loaded from: classes2.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final nv2.b1 f340456d = new nv2.b1();

    public b1() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        finderItem.setFavFlag(intValue);
        finderItem.setFavCount(intValue2);
        en3.d0.a(en3.d0.b(en3.d0.c(finderItem.getFeedObject()))).set(3, java.lang.Integer.valueOf(intValue2));
        return jz5.f0.f302826a;
    }
}
