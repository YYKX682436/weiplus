package v83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final v83.b f434080d;

    /* renamed from: e, reason: collision with root package name */
    public static final v83.b f434081e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ v83.b[] f434082f;

    static {
        v83.b bVar = new v83.b("SCENE_CHOOSE_LOGIN", 0);
        f434080d = bVar;
        v83.b bVar2 = new v83.b("SCENE_CHOOSE_REG", 1);
        f434081e = bVar2;
        v83.b[] bVarArr = {bVar, bVar2};
        f434082f = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static v83.b valueOf(java.lang.String str) {
        return (v83.b) java.lang.Enum.valueOf(v83.b.class, str);
    }

    public static v83.b[] values() {
        return (v83.b[]) f434082f.clone();
    }
}
