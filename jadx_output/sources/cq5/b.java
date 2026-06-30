package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.b f221502e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.b f221503f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.b f221504g;

    /* renamed from: h, reason: collision with root package name */
    public static final cq5.b f221505h;

    /* renamed from: i, reason: collision with root package name */
    public static final cq5.b f221506i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ cq5.b[] f221507m;

    /* renamed from: d, reason: collision with root package name */
    public final int f221508d;

    static {
        cq5.b bVar = new cq5.b("SUCCESS", 0, 0);
        f221502e = bVar;
        cq5.b bVar2 = new cq5.b("NO_PERMISSION", 1, 1);
        f221503f = bVar2;
        cq5.b bVar3 = new cq5.b("NO_WIFI_SWITCH", 2, 2);
        f221504g = bVar3;
        cq5.b bVar4 = new cq5.b("USER_END", 3, 3);
        f221505h = bVar4;
        cq5.b bVar5 = new cq5.b("OTHER", 4, 4);
        f221506i = bVar5;
        cq5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f221507m = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f221508d = i18;
    }

    public static cq5.b valueOf(java.lang.String str) {
        return (cq5.b) java.lang.Enum.valueOf(cq5.b.class, str);
    }

    public static cq5.b[] values() {
        return (cq5.b[]) f221507m.clone();
    }
}
