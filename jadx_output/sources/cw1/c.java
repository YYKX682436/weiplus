package cw1;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f222832a;

    /* renamed from: b, reason: collision with root package name */
    public long f222833b;

    /* renamed from: c, reason: collision with root package name */
    public long f222834c;

    /* renamed from: d, reason: collision with root package name */
    public long f222835d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f222836e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Set f222837f;

    /* renamed from: g, reason: collision with root package name */
    public long f222838g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f222839h;

    public c(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f222832a = username;
        this.f222839h = new java.util.ArrayList();
        if (!z17) {
            this.f222836e = null;
        } else {
            this.f222836e = new java.util.HashSet();
            this.f222837f = new java.util.HashSet();
        }
    }
}
