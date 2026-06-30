package gk4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final gk4.c f272537d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ gk4.c[] f272538e;

    static {
        gk4.c cVar = new gk4.c("Default", 0);
        gk4.c cVar2 = new gk4.c("RightToLeft", 1);
        gk4.c cVar3 = new gk4.c("LeftToRight", 2);
        gk4.c cVar4 = new gk4.c("ZoomOutAspectFit", 3);
        gk4.c cVar5 = new gk4.c("ZoomInAspectFit", 4);
        gk4.c cVar6 = new gk4.c("ZoomOutAspectFill", 5);
        gk4.c cVar7 = new gk4.c("ZoomInAspectFill", 6);
        gk4.c cVar8 = new gk4.c("Unknown", 7);
        f272537d = cVar8;
        gk4.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        f272538e = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static gk4.c valueOf(java.lang.String str) {
        return (gk4.c) java.lang.Enum.valueOf(gk4.c.class, str);
    }

    public static gk4.c[] values() {
        return (gk4.c[]) f272538e.clone();
    }
}
