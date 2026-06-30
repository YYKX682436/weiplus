package q50;

/* loaded from: classes.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f360136d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f360137e;

    public a(java.lang.String userName, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f360136d = userName;
        this.f360137e = z17;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f360136d.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
