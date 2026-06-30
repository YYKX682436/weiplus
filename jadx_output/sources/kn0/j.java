package kn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final kn0.j f309562d;

    /* renamed from: e, reason: collision with root package name */
    public static final kn0.j f309563e;

    /* renamed from: f, reason: collision with root package name */
    public static final kn0.j f309564f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kn0.j[] f309565g;

    static {
        kn0.j jVar = new kn0.j("NO_LINK_MIC", 0);
        f309562d = jVar;
        kn0.j jVar2 = new kn0.j("AUDIO_LINK_MIC", 1);
        f309563e = jVar2;
        kn0.j jVar3 = new kn0.j("VIDEO_LINK_MIC", 2);
        f309564f = jVar3;
        kn0.j[] jVarArr = {jVar, jVar2, jVar3};
        f309565g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static kn0.j valueOf(java.lang.String str) {
        return (kn0.j) java.lang.Enum.valueOf(kn0.j.class, str);
    }

    public static kn0.j[] values() {
        return (kn0.j[]) f309565g.clone();
    }
}
