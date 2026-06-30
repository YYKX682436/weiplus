package vu4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final vu4.h f440327e;

    /* renamed from: f, reason: collision with root package name */
    public static final vu4.h f440328f;

    /* renamed from: g, reason: collision with root package name */
    public static final vu4.h f440329g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ vu4.h[] f440330h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440331d;

    static {
        vu4.h hVar = new vu4.h("Receive", 0, "Receive");
        f440327e = hVar;
        vu4.h hVar2 = new vu4.h("Analysis", 1, "Analysis");
        f440328f = hVar2;
        vu4.h hVar3 = new vu4.h("Display", 2, "Display");
        f440329g = hVar3;
        vu4.h[] hVarArr = {hVar, hVar2, hVar3};
        f440330h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, java.lang.String str2) {
        this.f440331d = str2;
    }

    public static vu4.h valueOf(java.lang.String str) {
        return (vu4.h) java.lang.Enum.valueOf(vu4.h.class, str);
    }

    public static vu4.h[] values() {
        return (vu4.h[]) f440330h.clone();
    }
}
