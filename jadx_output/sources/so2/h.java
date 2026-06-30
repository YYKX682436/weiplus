package so2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final so2.h f410370d;

    /* renamed from: e, reason: collision with root package name */
    public static final so2.h f410371e;

    /* renamed from: f, reason: collision with root package name */
    public static final so2.h f410372f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ so2.h[] f410373g;

    static {
        so2.h hVar = new so2.h("UNSHOW", 0);
        f410370d = hVar;
        so2.h hVar2 = new so2.h("SHOWING", 1);
        f410371e = hVar2;
        so2.h hVar3 = new so2.h("SHOWN", 2);
        f410372f = hVar3;
        so2.h[] hVarArr = {hVar, hVar2, hVar3};
        f410373g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static so2.h valueOf(java.lang.String str) {
        return (so2.h) java.lang.Enum.valueOf(so2.h.class, str);
    }

    public static so2.h[] values() {
        return (so2.h[]) f410373g.clone();
    }
}
