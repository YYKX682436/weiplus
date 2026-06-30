package og3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final og3.h f345164d;

    /* renamed from: e, reason: collision with root package name */
    public static final og3.h f345165e;

    /* renamed from: f, reason: collision with root package name */
    public static final og3.h f345166f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ og3.h[] f345167g;

    static {
        og3.h hVar = new og3.h("MediaRemuxError", 0);
        f345164d = hVar;
        og3.h hVar2 = new og3.h("MediaRemuxSuccess", 1);
        f345165e = hVar2;
        og3.h hVar3 = new og3.h("MediaRemuxIgnore", 2);
        f345166f = hVar3;
        og3.h[] hVarArr = {hVar, hVar2, hVar3};
        f345167g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static og3.h valueOf(java.lang.String str) {
        return (og3.h) java.lang.Enum.valueOf(og3.h.class, str);
    }

    public static og3.h[] values() {
        return (og3.h[]) f345167g.clone();
    }
}
