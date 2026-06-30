package xs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final xs5.b f456411d;

    /* renamed from: e, reason: collision with root package name */
    public static final xs5.b f456412e;

    /* renamed from: f, reason: collision with root package name */
    public static final xs5.b f456413f;

    /* renamed from: g, reason: collision with root package name */
    public static final xs5.b f456414g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xs5.b[] f456415h;

    static {
        xs5.b bVar = new xs5.b("FIND_NEARBY_INDEPENDENT_LIVE_ROOM", 0);
        f456411d = bVar;
        xs5.b bVar2 = new xs5.b("FIND_NEARBY_INDEPENDENT_LIVE_SQUARE", 1);
        f456412e = bVar2;
        xs5.b bVar3 = new xs5.b("FIND_NEARBY_LIVE_ROOM", 2);
        f456413f = bVar3;
        xs5.b bVar4 = new xs5.b("FIND_NEARBY_LIVE_SQUARE", 3);
        f456414g = bVar4;
        xs5.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f456415h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static xs5.b valueOf(java.lang.String str) {
        return (xs5.b) java.lang.Enum.valueOf(xs5.b.class, str);
    }

    public static xs5.b[] values() {
        return (xs5.b[]) f456415h.clone();
    }
}
