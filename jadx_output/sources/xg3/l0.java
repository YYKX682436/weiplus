package xg3;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f454411b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f454412c;

    /* renamed from: d, reason: collision with root package name */
    public int f454413d;

    /* renamed from: e, reason: collision with root package name */
    public int f454414e;

    /* renamed from: f, reason: collision with root package name */
    public final int f454415f;

    /* renamed from: g, reason: collision with root package name */
    public long f454416g;

    /* renamed from: h, reason: collision with root package name */
    public long f454417h;

    public l0(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f454412c = arrayList;
        this.f454414e = 0;
        this.f454415f = 0;
        this.f454416g = 0L;
        this.f454417h = -1L;
        this.f454410a = str;
        this.f454411b = str2;
        this.f454413d = i17;
        this.f454417h = f9Var != null ? f9Var.t0() : -1L;
        if (f9Var != null) {
            arrayList.add(f9Var);
        }
    }

    public l0(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, int i17, int i18) {
        this(str, str2, f9Var, i17);
        this.f454415f = i18;
    }
}
