package tu0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final tu0.a f422070e;

    /* renamed from: f, reason: collision with root package name */
    public static final tu0.a f422071f;

    /* renamed from: g, reason: collision with root package name */
    public static final tu0.a f422072g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tu0.a[] f422073h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f422074d;

    static {
        tu0.a aVar = new tu0.a("PCM", 0, "pcm");
        f422070e = aVar;
        tu0.a aVar2 = new tu0.a("WAV", 1, "wav");
        f422071f = aVar2;
        tu0.a aVar3 = new tu0.a("SILK", 2, "silk");
        f422072g = aVar3;
        tu0.a[] aVarArr = {aVar, aVar2, aVar3};
        f422073h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, java.lang.String str2) {
        this.f422074d = str2;
    }

    public static tu0.a valueOf(java.lang.String str) {
        return (tu0.a) java.lang.Enum.valueOf(tu0.a.class, str);
    }

    public static tu0.a[] values() {
        return (tu0.a[]) f422073h.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f422074d;
    }
}
