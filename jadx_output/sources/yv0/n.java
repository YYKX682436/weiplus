package yv0;

/* loaded from: classes5.dex */
public final class n extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f465980a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f465981b;

    public n(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f465980a = oldList;
        this.f465981b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        yv0.p pVar = (yv0.p) this.f465981b.get(i18);
        yv0.p pVar2 = (yv0.p) this.f465980a.get(i17);
        return kotlin.jvm.internal.o.b(pVar.f465985a, pVar2.f465985a) && pVar.f465986b == pVar2.f465986b && kotlin.jvm.internal.o.b(pVar.f465989e, pVar2.f465989e);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return kotlin.jvm.internal.o.b(((yv0.p) this.f465981b.get(i18)).f465985a, ((yv0.p) this.f465980a.get(i17)).f465985a);
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        yv0.p pVar = (yv0.p) this.f465981b.get(i18);
        yv0.p pVar2 = (yv0.p) this.f465980a.get(i17);
        int width = pVar.f465989e.width();
        int width2 = pVar2.f465989e.width();
        android.graphics.Rect rect = pVar.f465989e;
        android.graphics.Rect rect2 = pVar2.f465989e;
        if (width != width2 && rect.height() != rect2.height()) {
            return yv0.o.f465982d;
        }
        if (rect.left == rect2.left && rect.top == rect2.top) {
            return null;
        }
        return yv0.o.f465983e;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f465981b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f465980a.size();
    }
}
