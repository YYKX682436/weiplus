package j92;

/* loaded from: classes2.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final m92.b f298352d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f298353e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zn5 f298354f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f298355g;

    public a(m92.b account, boolean z17) {
        kotlin.jvm.internal.o.g(account, "account");
        this.f298352d = account;
        this.f298353e = z17;
        this.f298355g = true;
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return j92.a.class.getName().hashCode();
    }
}
