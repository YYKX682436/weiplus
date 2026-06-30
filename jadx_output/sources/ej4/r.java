package ej4;

/* loaded from: classes11.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f253374a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f253375b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f253376c;

    public r(java.lang.Object subject, java.lang.String key, java.lang.String str) {
        kotlin.jvm.internal.o.g(subject, "subject");
        kotlin.jvm.internal.o.g(key, "key");
        this.f253374a = key;
        this.f253375b = str;
        this.f253376c = new java.lang.ref.WeakReference(subject);
        java.util.Map map = ej4.c0.f253336b;
        synchronized (map) {
        }
    }

    public final java.lang.ref.WeakReference a() {
        java.lang.ref.WeakReference weakReference = this.f253376c;
        if (weakReference != null) {
            return weakReference;
        }
        kotlin.jvm.internal.o.o("ref");
        throw null;
    }

    public abstract void b();

    public /* synthetic */ r(java.lang.Object obj, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, str, (i17 & 4) != 0 ? "" : str2);
    }
}
