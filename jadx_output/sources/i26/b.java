package i26;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final i26.b f288087d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i26.b[] f288088e;

    static {
        i26.b bVar = new i26.b("FOR_SUBTYPING", 0);
        f288087d = bVar;
        i26.b[] bVarArr = {bVar, new i26.b("FOR_INCORPORATION", 1), new i26.b("FROM_EXPRESSION", 2)};
        f288088e = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static i26.b valueOf(java.lang.String str) {
        return (i26.b) java.lang.Enum.valueOf(i26.b.class, str);
    }

    public static i26.b[] values() {
        return (i26.b[]) f288088e.clone();
    }
}
