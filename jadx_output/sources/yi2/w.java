package yi2;

/* loaded from: classes2.dex */
public final class w extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f462592a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f462593b;

    public w(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f462592a = oldList;
        this.f462593b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return kotlin.jvm.internal.o.b(this.f462592a.get(i17), this.f462593b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f462592a;
        int h17 = ((in5.c) list.get(i17)).h();
        java.util.List list2 = this.f462593b;
        return h17 == ((in5.c) list2.get(i18)).h() && ((in5.c) list.get(i17)).getItemId() == ((in5.c) list2.get(i18)).getItemId();
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        return new android.os.Bundle();
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f462593b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f462592a.size();
    }
}
