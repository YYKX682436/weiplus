package zb2;

/* loaded from: classes2.dex */
public final class d implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.fl5 f471260d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f471261e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f471262f;

    /* renamed from: g, reason: collision with root package name */
    public final long f471263g;

    /* renamed from: h, reason: collision with root package name */
    public final int f471264h;

    public d(r45.fl5 fl5Var, boolean z17, java.lang.String dividerTitle, long j17, int i17) {
        kotlin.jvm.internal.o.g(dividerTitle, "dividerTitle");
        this.f471260d = fl5Var;
        this.f471261e = z17;
        this.f471262f = dividerTitle;
        this.f471263g = j17;
        this.f471264h = i17;
    }

    @Override // in5.c
    public long getItemId() {
        r45.fl5 fl5Var = this.f471260d;
        return fl5Var != null ? fl5Var.getLong(0) : this.f471263g;
    }

    @Override // in5.c
    public int h() {
        return this.f471261e ? 2 : 1;
    }
}
