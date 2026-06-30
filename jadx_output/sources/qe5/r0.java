package qe5;

/* loaded from: classes.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f362181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f362182e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(java.util.List list, java.util.List list2) {
        super(2);
        this.f362181d = list;
        this.f362182e = list2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        db5.g4 menu = (db5.g4) obj2;
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = 0;
        while (true) {
            java.util.List list = this.f362181d;
            if (i17 >= list.size()) {
                break;
            }
            java.util.List list2 = this.f362182e;
            if (i17 >= list2.size()) {
                break;
            }
            menu.g(((java.lang.Number) list2.get(i17)).intValue(), (java.lang.CharSequence) list.get(i17), com.tencent.mm.R.raw.icons_filled_open);
            i17++;
        }
        return jz5.f0.f302826a;
    }
}
