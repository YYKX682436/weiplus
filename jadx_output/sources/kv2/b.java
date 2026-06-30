package kv2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final kv2.b f312649d;

    /* renamed from: e, reason: collision with root package name */
    public static final kv2.b f312650e;

    /* renamed from: f, reason: collision with root package name */
    public static final kv2.b f312651f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kv2.b[] f312652g;

    static {
        kv2.b bVar = new kv2.b("Undefined", 0);
        f312649d = bVar;
        kv2.b bVar2 = new kv2.b("UniComment", 1);
        f312650e = bVar2;
        kv2.b bVar3 = new kv2.b("FinderComment", 2);
        f312651f = bVar3;
        kv2.b[] bVarArr = {bVar, bVar2, bVar3};
        f312652g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static kv2.b valueOf(java.lang.String str) {
        return (kv2.b) java.lang.Enum.valueOf(kv2.b.class, str);
    }

    public static kv2.b[] values() {
        return (kv2.b[]) f312652g.clone();
    }
}
