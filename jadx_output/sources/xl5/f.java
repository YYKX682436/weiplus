package xl5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final xl5.f f455140d;

    /* renamed from: e, reason: collision with root package name */
    public static final xl5.f f455141e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xl5.f[] f455142f;

    static {
        xl5.f fVar = new xl5.f("MSG_EDIT_INSERT", 0, 1);
        xl5.f fVar2 = new xl5.f("MSG_EDIT_SELECT", 1, 2);
        f455140d = fVar2;
        xl5.f fVar3 = new xl5.f("MSG_TEXT_SELECT", 2, 3);
        f455141e = fVar3;
        xl5.f[] fVarArr = {fVar, fVar2, fVar3};
        f455142f = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17, int i18) {
    }

    public static xl5.f valueOf(java.lang.String str) {
        return (xl5.f) java.lang.Enum.valueOf(xl5.f.class, str);
    }

    public static xl5.f[] values() {
        return (xl5.f[]) f455142f.clone();
    }
}
