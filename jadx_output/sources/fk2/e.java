package fk2;

/* loaded from: classes3.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public static final fk2.e f263353d = new fk2.e();

    public e() {
        super(5);
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView tv6 = (com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView) obj;
        java.lang.CharSequence content = (java.lang.CharSequence) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        int intValue2 = ((java.lang.Number) obj4).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj5).booleanValue();
        kotlin.jvm.internal.o.g(tv6, "tv");
        kotlin.jvm.internal.o.g(content, "content");
        tv6.o(content, 5, intValue2, booleanValue, new fk2.d(intValue), true, true);
        return jz5.f0.f302826a;
    }
}
