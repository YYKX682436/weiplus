package xj5;

/* loaded from: classes5.dex */
public final class k extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f454908a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f454909b;

    public k(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f454908a = oldList;
        this.f454909b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        try {
            return ((xj5.a) this.f454908a.get(i17)).d((xj5.a) this.f454909b.get(i18));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        xj5.a aVar = (xj5.a) this.f454908a.get(i17);
        xj5.a aVar2 = (xj5.a) this.f454909b.get(i18);
        return aVar.h() == aVar2.h() && aVar.getItemId() == aVar2.getItemId();
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f454909b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f454908a.size();
    }
}
