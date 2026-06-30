package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final vp5.j f439121d;

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.j f439122e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.j f439123f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ vp5.j[] f439124g;

    static {
        vp5.j jVar = new vp5.j("OK", 0);
        f439121d = jVar;
        vp5.j jVar2 = new vp5.j("Cancel", 1);
        f439122e = jVar2;
        vp5.j jVar3 = new vp5.j("Denied", 2);
        f439123f = jVar3;
        vp5.j[] jVarArr = {jVar, jVar2, jVar3};
        f439124g = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static vp5.j valueOf(java.lang.String str) {
        return (vp5.j) java.lang.Enum.valueOf(vp5.j.class, str);
    }

    public static vp5.j[] values() {
        return (vp5.j[]) f439124g.clone();
    }
}
