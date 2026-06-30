package zn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final zn0.j f474355d;

    /* renamed from: e, reason: collision with root package name */
    public static final zn0.j f474356e;

    /* renamed from: f, reason: collision with root package name */
    public static final zn0.j f474357f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zn0.j[] f474358g;

    static {
        zn0.j jVar = new zn0.j("Unknown", 0);
        zn0.j jVar2 = new zn0.j("StartFailed", 1);
        f474355d = jVar2;
        zn0.j jVar3 = new zn0.j("UpdateFailed", 2);
        f474356e = jVar3;
        zn0.j jVar4 = new zn0.j("StopFailed", 3);
        f474357f = jVar4;
        zn0.j[] jVarArr = {jVar, jVar2, jVar3, jVar4};
        f474358g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static zn0.j valueOf(java.lang.String str) {
        return (zn0.j) java.lang.Enum.valueOf(zn0.j.class, str);
    }

    public static zn0.j[] values() {
        return (zn0.j[]) f474358g.clone();
    }
}
