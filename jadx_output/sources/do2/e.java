package do2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final do2.e f242077d;

    /* renamed from: e, reason: collision with root package name */
    public static final do2.e f242078e;

    /* renamed from: f, reason: collision with root package name */
    public static final do2.e f242079f;

    /* renamed from: g, reason: collision with root package name */
    public static final do2.e f242080g;

    /* renamed from: h, reason: collision with root package name */
    public static final do2.e f242081h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ do2.e[] f242082i;

    static {
        do2.e eVar = new do2.e("PORTRAIT", 0);
        f242077d = eVar;
        do2.e eVar2 = new do2.e("LANDSCAPE", 1);
        f242078e = eVar2;
        do2.e eVar3 = new do2.e("SQUARE", 2);
        f242079f = eVar3;
        do2.e eVar4 = new do2.e("MUSIC", 3);
        f242080g = eVar4;
        do2.e eVar5 = new do2.e("ERROR", 4);
        f242081h = eVar5;
        do2.e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f242082i = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static do2.e valueOf(java.lang.String str) {
        return (do2.e) java.lang.Enum.valueOf(do2.e.class, str);
    }

    public static do2.e[] values() {
        return (do2.e[]) f242082i.clone();
    }
}
