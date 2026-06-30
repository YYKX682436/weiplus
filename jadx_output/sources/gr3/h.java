package gr3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final gr3.h f274869e;

    /* renamed from: f, reason: collision with root package name */
    public static final gr3.h f274870f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gr3.h[] f274871g;

    /* renamed from: d, reason: collision with root package name */
    public final int f274872d;

    static {
        gr3.h hVar = new gr3.h("CHAT_AND_MOMENTS", 0, 1);
        f274869e = hVar;
        gr3.h hVar2 = new gr3.h("ONLY_CHAT", 1, 2);
        f274870f = hVar2;
        gr3.h[] hVarArr = {hVar, hVar2};
        f274871g = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f274872d = i18;
    }

    public static gr3.h valueOf(java.lang.String str) {
        return (gr3.h) java.lang.Enum.valueOf(gr3.h.class, str);
    }

    public static gr3.h[] values() {
        return (gr3.h[]) f274871g.clone();
    }
}
