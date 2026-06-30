package z03;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final z03.b f469203d;

    /* renamed from: e, reason: collision with root package name */
    public static final z03.b f469204e;

    /* renamed from: f, reason: collision with root package name */
    public static final z03.b f469205f;

    /* renamed from: g, reason: collision with root package name */
    public static final z03.b f469206g;

    /* renamed from: h, reason: collision with root package name */
    public static final z03.b f469207h;

    /* renamed from: i, reason: collision with root package name */
    public static final z03.b f469208i;

    /* renamed from: m, reason: collision with root package name */
    public static final z03.b f469209m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ z03.b[] f469210n;

    static {
        z03.b bVar = new z03.b("InviteTimeout", 0);
        f469203d = bVar;
        z03.b bVar2 = new z03.b("Canceled", 1);
        f469204e = bVar2;
        z03.b bVar3 = new z03.b("Rejected", 2);
        f469205f = bVar3;
        z03.b bVar4 = new z03.b("SelfHangup", 3);
        f469206g = bVar4;
        z03.b bVar5 = new z03.b("AnotherHangup", 4);
        f469207h = bVar5;
        z03.b bVar6 = new z03.b("Ignored", 5);
        f469208i = bVar6;
        z03.b bVar7 = new z03.b("PhoneComing", 6);
        f469209m = bVar7;
        z03.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new z03.b("Killed", 7)};
        f469210n = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static z03.b valueOf(java.lang.String str) {
        return (z03.b) java.lang.Enum.valueOf(z03.b.class, str);
    }

    public static z03.b[] values() {
        return (z03.b[]) f469210n.clone();
    }
}
