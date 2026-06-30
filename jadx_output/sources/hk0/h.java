package hk0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final hk0.h f281739d;

    /* renamed from: e, reason: collision with root package name */
    public static final hk0.h f281740e;

    /* renamed from: f, reason: collision with root package name */
    public static final hk0.h f281741f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ hk0.h[] f281742g;

    static {
        hk0.h hVar = new hk0.h("NONE", 0);
        f281739d = hVar;
        hk0.h hVar2 = new hk0.h("BRUSH", 1);
        f281740e = hVar2;
        hk0.h hVar3 = new hk0.h("BRUSH_ERASER", 2);
        f281741f = hVar3;
        hk0.h[] hVarArr = {hVar, hVar2, hVar3};
        f281742g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static hk0.h valueOf(java.lang.String str) {
        return (hk0.h) java.lang.Enum.valueOf(hk0.h.class, str);
    }

    public static hk0.h[] values() {
        return (hk0.h[]) f281742g.clone();
    }
}
