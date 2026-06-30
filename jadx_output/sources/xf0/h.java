package xf0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final xf0.h f454169d;

    /* renamed from: e, reason: collision with root package name */
    public static final xf0.h f454170e;

    /* renamed from: f, reason: collision with root package name */
    public static final xf0.h f454171f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xf0.h[] f454172g;

    static {
        xf0.h hVar = new xf0.h("Start", 0);
        f454169d = hVar;
        xf0.h hVar2 = new xf0.h("Progress", 1);
        f454170e = hVar2;
        xf0.h hVar3 = new xf0.h("Finish", 2);
        f454171f = hVar3;
        xf0.h[] hVarArr = {hVar, hVar2, hVar3};
        f454172g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static xf0.h valueOf(java.lang.String str) {
        return (xf0.h) java.lang.Enum.valueOf(xf0.h.class, str);
    }

    public static xf0.h[] values() {
        return (xf0.h[]) f454172g.clone();
    }
}
