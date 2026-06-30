package zv1;

/* loaded from: classes7.dex */
public abstract class v0 implements zv1.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f476384a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f476385b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f476386c;

    public v0(int i17, boolean z17, boolean z18) {
        this.f476384a = i17;
        this.f476385b = z17;
        this.f476386c = z18;
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("days must be greater than 0");
        }
    }

    @Override // zv1.w0
    public boolean a() {
        return this.f476385b;
    }

    @Override // zv1.w0
    public boolean b() {
        return this.f476386c;
    }
}
