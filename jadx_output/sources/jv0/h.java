package jv0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final jv0.h f302191d;

    /* renamed from: e, reason: collision with root package name */
    public static final jv0.h f302192e;

    /* renamed from: f, reason: collision with root package name */
    public static final jv0.h f302193f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ jv0.h[] f302194g;

    static {
        jv0.h hVar = new jv0.h("NORMAL", 0);
        f302191d = hVar;
        jv0.h hVar2 = new jv0.h("TRIMMING", 1);
        f302192e = hVar2;
        jv0.h hVar3 = new jv0.h("MOVING", 2);
        f302193f = hVar3;
        jv0.h[] hVarArr = {hVar, hVar2, hVar3};
        f302194g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static jv0.h valueOf(java.lang.String str) {
        return (jv0.h) java.lang.Enum.valueOf(jv0.h.class, str);
    }

    public static jv0.h[] values() {
        return (jv0.h[]) f302194g.clone();
    }
}
