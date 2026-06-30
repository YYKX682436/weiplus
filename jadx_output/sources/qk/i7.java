package qk;

/* loaded from: classes12.dex */
public abstract class i7 {

    /* renamed from: a, reason: collision with root package name */
    public int f364155a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f364156b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f364157c = "";

    /* renamed from: d, reason: collision with root package name */
    public final long f364158d = java.lang.System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    public boolean f364159e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f364160f;

    public final java.lang.String c() {
        if (this.f364157c.length() == 0) {
            this.f364157c = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        return this.f364157c;
    }

    public final void d(int i17) {
        this.f364155a = i17;
    }
}
