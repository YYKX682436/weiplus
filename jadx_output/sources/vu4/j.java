package vu4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final vu4.j f440338e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu4.j f440339f;

    /* renamed from: g, reason: collision with root package name */
    public static final vu4.j f440340g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vu4.j[] f440341h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440342d;

    static {
        vu4.j jVar = new vu4.j(com.tencent.tav.asset.Asset.TAG, 0, "asset");
        f440338e = jVar;
        vu4.j jVar2 = new vu4.j("CheckResUpdate", 1, "CheckResUpdate");
        f440339f = jVar2;
        vu4.j jVar3 = new vu4.j("UDR", 2, "UDR");
        f440340g = jVar3;
        vu4.j[] jVarArr = {jVar, jVar2, jVar3};
        f440341h = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, java.lang.String str2) {
        this.f440342d = str2;
    }

    public static vu4.j valueOf(java.lang.String str) {
        return (vu4.j) java.lang.Enum.valueOf(vu4.j.class, str);
    }

    public static vu4.j[] values() {
        return (vu4.j[]) f440341h.clone();
    }
}
