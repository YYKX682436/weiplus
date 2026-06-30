package kj;

/* loaded from: classes.dex */
public class y implements java.util.Map.Entry {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f308275d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f308276e;

    public y(java.lang.Object obj, java.lang.Object obj2) {
        this.f308275d = obj;
        this.f308276e = obj2;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getKey() {
        return this.f308275d;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object getValue() {
        return this.f308276e;
    }

    @Override // java.util.Map.Entry
    public java.lang.Object setValue(java.lang.Object obj) {
        this.f308276e = obj;
        return obj;
    }

    public java.lang.String toString() {
        return "Pair{f=" + this.f308275d + ", s=" + this.f308276e + '}';
    }
}
