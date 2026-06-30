package gk4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final gk4.e f272542d;

    /* renamed from: e, reason: collision with root package name */
    public static final gk4.e f272543e;

    /* renamed from: f, reason: collision with root package name */
    public static final gk4.e f272544f;

    /* renamed from: g, reason: collision with root package name */
    public static final gk4.e f272545g;

    /* renamed from: h, reason: collision with root package name */
    public static final gk4.e f272546h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ gk4.e[] f272547i;

    static {
        gk4.e eVar = new gk4.e("Unknown", 0);
        f272542d = eVar;
        gk4.e eVar2 = new gk4.e("Started", 1);
        f272543e = eVar2;
        gk4.e eVar3 = new gk4.e("Pause", 2);
        f272544f = eVar3;
        gk4.e eVar4 = new gk4.e("Stop", 3);
        f272545g = eVar4;
        gk4.e eVar5 = new gk4.e("Seeking", 4);
        f272546h = eVar5;
        gk4.e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        f272547i = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static gk4.e valueOf(java.lang.String str) {
        return (gk4.e) java.lang.Enum.valueOf(gk4.e.class, str);
    }

    public static gk4.e[] values() {
        return (gk4.e[]) f272547i.clone();
    }
}
