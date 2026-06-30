package ml5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final ml5.k f328430d;

    /* renamed from: e, reason: collision with root package name */
    public static final ml5.k f328431e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml5.k f328432f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ml5.k[] f328433g;

    static {
        ml5.k kVar = new ml5.k("CENTER_CROP", 0);
        f328430d = kVar;
        ml5.k kVar2 = new ml5.k("CENTER_INSIDE", 1);
        f328431e = kVar2;
        ml5.k kVar3 = new ml5.k("ALIGN_START", 2);
        f328432f = kVar3;
        ml5.k[] kVarArr = {kVar, kVar2, kVar3};
        f328433g = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static ml5.k valueOf(java.lang.String str) {
        return (ml5.k) java.lang.Enum.valueOf(ml5.k.class, str);
    }

    public static ml5.k[] values() {
        return (ml5.k[]) f328433g.clone();
    }
}
