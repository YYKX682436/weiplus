package p60;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final p60.i f352160e;

    /* renamed from: f, reason: collision with root package name */
    public static final p60.j f352161f;

    /* renamed from: g, reason: collision with root package name */
    public static final p60.j f352162g;

    /* renamed from: h, reason: collision with root package name */
    public static final p60.j f352163h;

    /* renamed from: i, reason: collision with root package name */
    public static final p60.j f352164i;

    /* renamed from: m, reason: collision with root package name */
    public static final p60.j f352165m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p60.j[] f352166n;

    /* renamed from: d, reason: collision with root package name */
    public final int f352167d;

    static {
        p60.j jVar = new p60.j("GameLiveState_NotInited", 0, 0);
        f352161f = jVar;
        p60.j jVar2 = new p60.j("GameLiveState_PrePare", 1, 1);
        f352162g = jVar2;
        p60.j jVar3 = new p60.j("GameLiveState_LivingForeGround", 2, 2);
        f352163h = jVar3;
        p60.j jVar4 = new p60.j("GameLiveState_LivingBackGround", 3, 3);
        f352164i = jVar4;
        p60.j jVar5 = new p60.j("GameLiveState_Destroy", 4, 4);
        f352165m = jVar5;
        p60.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        f352166n = jVarArr;
        rz5.b.a(jVarArr);
        f352160e = new p60.i(null);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f352167d = i18;
    }

    public static p60.j valueOf(java.lang.String str) {
        return (p60.j) java.lang.Enum.valueOf(p60.j.class, str);
    }

    public static p60.j[] values() {
        return (p60.j[]) f352166n.clone();
    }

    public final java.lang.String h() {
        int i17 = this.f352167d;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.eclipsesource.mmv8.Platform.UNKNOWN : "GameLiveState_Destroy" : "GameLiveState_LivingBackGround" : "GameLiveState_LivingForeGround" : "GameLiveState_PrePare" : "GameLiveState_NotInited";
    }
}
