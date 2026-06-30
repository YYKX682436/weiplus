package in5;

/* loaded from: classes10.dex */
public final class a0 extends in5.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f293003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f293004e;

    public a0(android.view.View view, int i17) {
        this.f293003d = view;
        this.f293004e = i17;
    }

    @Override // in5.w
    public int a() {
        return 0;
    }

    @Override // in5.w
    public android.view.View b() {
        return this.f293003d;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof in5.w) && getItemId() == ((in5.w) obj).getItemId();
    }

    @Override // in5.c
    public long getItemId() {
        return this.f293003d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return this.f293004e;
    }
}
