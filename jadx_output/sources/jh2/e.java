package jh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final jh2.e f299812d;

    /* renamed from: e, reason: collision with root package name */
    public static final jh2.e f299813e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ jh2.e[] f299814f;

    static {
        jh2.e eVar = new jh2.e("Score_Init_Error", 0);
        f299812d = eVar;
        jh2.e eVar2 = new jh2.e("Bgm_Play_Error", 1);
        f299813e = eVar2;
        jh2.e[] eVarArr = {eVar, eVar2};
        f299814f = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static jh2.e valueOf(java.lang.String str) {
        return (jh2.e) java.lang.Enum.valueOf(jh2.e.class, str);
    }

    public static jh2.e[] values() {
        return (jh2.e[]) f299814f.clone();
    }
}
