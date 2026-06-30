package ml2;

/* loaded from: classes10.dex */
public final class o5 extends java.util.LinkedHashMap {

    /* renamed from: d, reason: collision with root package name */
    public final int f327775d;

    public o5(int i17) {
        this.f327775d = i17;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(java.util.Map.Entry entry) {
        return super.size() > this.f327775d;
    }
}
