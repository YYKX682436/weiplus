package va;

/* loaded from: classes16.dex */
public abstract class d implements va.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f434180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f434181b;

    /* renamed from: c, reason: collision with root package name */
    public final va.h f434182c;

    public d(java.lang.Object obj, int i17, va.h hVar) {
        this.f434180a = obj;
        this.f434181b = i17;
        this.f434182c = hVar;
    }

    @Override // va.h
    public va.h b() {
        return this.f434182c;
    }

    @Override // va.h
    public int c() {
        return this.f434181b;
    }

    @Override // va.h
    public java.lang.Object getKey() {
        return this.f434180a;
    }
}
