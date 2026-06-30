package zc5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final zc5.h f471447d;

    /* renamed from: e, reason: collision with root package name */
    public static final zc5.h f471448e;

    /* renamed from: f, reason: collision with root package name */
    public static final zc5.h f471449f;

    /* renamed from: g, reason: collision with root package name */
    public static final zc5.h f471450g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zc5.h[] f471451h;

    static {
        zc5.h hVar = new zc5.h("IMAGE", 0);
        f471447d = hVar;
        zc5.h hVar2 = new zc5.h("VIDEO", 1);
        f471448e = hVar2;
        zc5.h hVar3 = new zc5.h("LIVE_PHOTO", 2);
        f471449f = hVar3;
        zc5.h hVar4 = new zc5.h("UNKNOWN", 3);
        f471450g = hVar4;
        zc5.h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f471451h = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static zc5.h valueOf(java.lang.String str) {
        return (zc5.h) java.lang.Enum.valueOf(zc5.h.class, str);
    }

    public static zc5.h[] values() {
        return (zc5.h[]) f471451h.clone();
    }
}
