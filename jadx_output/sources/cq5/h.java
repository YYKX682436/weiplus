package cq5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final cq5.h f221538e;

    /* renamed from: f, reason: collision with root package name */
    public static final cq5.h f221539f;

    /* renamed from: g, reason: collision with root package name */
    public static final cq5.h f221540g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cq5.h[] f221541h;

    /* renamed from: d, reason: collision with root package name */
    public final int f221542d;

    static {
        cq5.h hVar = new cq5.h("SUCCESS", 0, 0);
        f221538e = hVar;
        cq5.h hVar2 = new cq5.h("INTERRUPTION", 1, 1);
        f221539f = hVar2;
        cq5.h hVar3 = new cq5.h("USER_END", 2, 2);
        f221540g = hVar3;
        cq5.h[] hVarArr = {hVar, hVar2, hVar3};
        f221541h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f221542d = i18;
    }

    public static cq5.h valueOf(java.lang.String str) {
        return (cq5.h) java.lang.Enum.valueOf(cq5.h.class, str);
    }

    public static cq5.h[] values() {
        return (cq5.h[]) f221541h.clone();
    }
}
