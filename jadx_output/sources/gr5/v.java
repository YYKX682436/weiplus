package gr5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final gr5.v f274949d;

    /* renamed from: e, reason: collision with root package name */
    public static final gr5.v f274950e;

    /* renamed from: f, reason: collision with root package name */
    public static final gr5.v f274951f;

    /* renamed from: g, reason: collision with root package name */
    public static final gr5.v f274952g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ gr5.v[] f274953h;

    static {
        gr5.v vVar = new gr5.v("NONE", 0);
        f274949d = vVar;
        gr5.v vVar2 = new gr5.v("START", 1);
        f274950e = vVar2;
        gr5.v vVar3 = new gr5.v("END", 2);
        f274951f = vVar3;
        gr5.v vVar4 = new gr5.v("BOTH", 3);
        f274952g = vVar4;
        gr5.v[] vVarArr = {vVar, vVar2, vVar3, vVar4};
        f274953h = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17) {
    }

    public static gr5.v valueOf(java.lang.String str) {
        return (gr5.v) java.lang.Enum.valueOf(gr5.v.class, str);
    }

    public static gr5.v[] values() {
        return (gr5.v[]) f274953h.clone();
    }
}
