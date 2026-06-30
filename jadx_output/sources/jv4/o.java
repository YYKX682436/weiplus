package jv4;

/* loaded from: classes12.dex */
public final class o extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f302259a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f302260b;

    public o(java.util.List list, java.util.List list2) {
        this.f302259a = list;
        this.f302260b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        return kotlin.jvm.internal.o.b(((mv4.g) this.f302259a.get(i17)).f331672a, ((jv4.n) this.f302260b.get(i18)).v());
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return ((mv4.g) this.f302259a.get(i17)).f331673b == ((jv4.n) this.f302260b.get(i18)).getType();
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f302260b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f302259a.size();
    }
}
