package qj4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final qj4.j f363917e;

    /* renamed from: f, reason: collision with root package name */
    public static final qj4.j f363918f;

    /* renamed from: g, reason: collision with root package name */
    public static final qj4.j f363919g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qj4.j[] f363920h;

    /* renamed from: d, reason: collision with root package name */
    public final int f363921d;

    static {
        qj4.j jVar = new qj4.j("ExitAlertClickOption_NONE", 0, 0);
        f363917e = jVar;
        qj4.j jVar2 = new qj4.j("ExitAlertClickOption_CANCEL", 1, 1);
        f363918f = jVar2;
        qj4.j jVar3 = new qj4.j("ExitAlertClickOption_CONFIRM", 2, 2);
        f363919g = jVar3;
        qj4.j[] jVarArr = {jVar, jVar2, jVar3};
        f363920h = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f363921d = i18;
    }

    public static qj4.j valueOf(java.lang.String str) {
        return (qj4.j) java.lang.Enum.valueOf(qj4.j.class, str);
    }

    public static qj4.j[] values() {
        return (qj4.j[]) f363920h.clone();
    }
}
