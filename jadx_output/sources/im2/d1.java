package im2;

/* loaded from: classes3.dex */
public final class d1 implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292287a;

    public d1(im2.z3 z3Var) {
        this.f292287a = z3Var;
    }

    @Override // nl5.a0
    public void a(android.view.View v17, nl5.z item, java.lang.String curSelect) {
        kotlin.jvm.internal.o.g(v17, "v");
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(curSelect, "curSelect");
        if (item.f338398b == 6) {
            this.f292287a.d7().append("\n");
        }
    }

    @Override // nl5.a0
    public void b(java.util.List items, int i17) {
        kotlin.jvm.internal.o.g(items, "items");
        if (i17 == 8 || i17 == 1) {
            return;
        }
        java.lang.String string = this.f292287a.getContext().getString(com.tencent.mm.R.string.f493689la5);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        items.add(new nl5.z(string, 6));
    }
}
