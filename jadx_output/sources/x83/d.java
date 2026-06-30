package x83;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final x83.d f452556e;

    /* renamed from: f, reason: collision with root package name */
    public static final x83.d f452557f;

    /* renamed from: g, reason: collision with root package name */
    public static final x83.d f452558g;

    /* renamed from: h, reason: collision with root package name */
    public static final x83.d f452559h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ x83.d[] f452560i;

    /* renamed from: d, reason: collision with root package name */
    public final int f452561d;

    static {
        x83.d dVar = new x83.d("LOGIN_RESULT_SUCCESS", 0, 1);
        f452556e = dVar;
        x83.d dVar2 = new x83.d("LOGIN_RESULT_TURN_TO_REG", 1, 2);
        f452557f = dVar2;
        x83.d dVar3 = new x83.d("LOGIN_RESULT_CANCEL", 2, 3);
        f452558g = dVar3;
        x83.d dVar4 = new x83.d("LOGIN_RESULT_FAIL", 3, 4);
        f452559h = dVar4;
        x83.d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f452560i = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f452561d = i18;
    }

    public static x83.d valueOf(java.lang.String str) {
        return (x83.d) java.lang.Enum.valueOf(x83.d.class, str);
    }

    public static x83.d[] values() {
        return (x83.d[]) f452560i.clone();
    }
}
