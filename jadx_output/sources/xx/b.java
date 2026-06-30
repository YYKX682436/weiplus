package xx;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final xx.b f457770e;

    /* renamed from: f, reason: collision with root package name */
    public static final xx.b f457771f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xx.b[] f457772g;

    /* renamed from: d, reason: collision with root package name */
    public final int f457773d;

    static {
        xx.b bVar = new xx.b("AICommentTypePerson", 0, 1);
        f457770e = bVar;
        xx.b bVar2 = new xx.b("AICommentTypeBot", 1, 2);
        f457771f = bVar2;
        xx.b[] bVarArr = {bVar, bVar2};
        f457772g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f457773d = i18;
    }

    public static xx.b valueOf(java.lang.String str) {
        return (xx.b) java.lang.Enum.valueOf(xx.b.class, str);
    }

    public static xx.b[] values() {
        return (xx.b[]) f457772g.clone();
    }
}
