package ly4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final ly4.h f322295d;

    /* renamed from: e, reason: collision with root package name */
    public static final ly4.h f322296e;

    /* renamed from: f, reason: collision with root package name */
    public static final ly4.h f322297f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ly4.h[] f322298g;

    static {
        ly4.h hVar = new ly4.h(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, 0);
        f322295d = hVar;
        ly4.h hVar2 = new ly4.h("download", 1);
        f322296e = hVar2;
        ly4.h hVar3 = new ly4.h("view", 2);
        f322297f = hVar3;
        ly4.h[] hVarArr = {hVar, hVar2, hVar3, new ly4.h("open", 3)};
        f322298g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static ly4.h valueOf(java.lang.String str) {
        return (ly4.h) java.lang.Enum.valueOf(ly4.h.class, str);
    }

    public static ly4.h[] values() {
        return (ly4.h[]) f322298g.clone();
    }
}
