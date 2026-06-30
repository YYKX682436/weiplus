package lf4;

/* loaded from: classes4.dex */
public final class j extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f318415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f318416b;

    public j(java.util.List list, java.util.List list2) {
        this.f318415a = list;
        this.f318416b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return kotlin.jvm.internal.o.b(this.f318415a.get(i17), this.f318416b.get(i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return ((if4.f) this.f318415a.get(i17)).f291246d == ((if4.f) this.f318416b.get(i18)).f291246d;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f318416b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f318415a.size();
    }
}
