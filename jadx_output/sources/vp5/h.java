package vp5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final vp5.h f439111d;

    /* renamed from: e, reason: collision with root package name */
    public static final vp5.h f439112e;

    /* renamed from: f, reason: collision with root package name */
    public static final vp5.h f439113f;

    /* renamed from: g, reason: collision with root package name */
    public static final vp5.h f439114g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vp5.h[] f439115h;

    static {
        vp5.h hVar = new vp5.h("Foreground", 0);
        f439111d = hVar;
        vp5.h hVar2 = new vp5.h("Background", 1);
        f439112e = hVar2;
        vp5.h hVar3 = new vp5.h("Suspended", 2);
        f439113f = hVar3;
        vp5.h hVar4 = new vp5.h("Destroyed", 3);
        f439114g = hVar4;
        vp5.h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f439115h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static vp5.h valueOf(java.lang.String str) {
        return (vp5.h) java.lang.Enum.valueOf(vp5.h.class, str);
    }

    public static vp5.h[] values() {
        return (vp5.h[]) f439115h.clone();
    }
}
