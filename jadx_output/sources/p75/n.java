package p75;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final p75.n f352673e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ p75.n[] f352674f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f352675d;

    static {
        p75.n nVar = new p75.n("And", 0, "&");
        f352673e = nVar;
        p75.n[] nVarArr = {nVar, new p75.n("Or", 1, "|")};
        f352674f = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, java.lang.String str2) {
        this.f352675d = str2;
    }

    public static p75.n valueOf(java.lang.String str) {
        return (p75.n) java.lang.Enum.valueOf(p75.n.class, str);
    }

    public static p75.n[] values() {
        return (p75.n[]) f352674f.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f352675d;
    }
}
