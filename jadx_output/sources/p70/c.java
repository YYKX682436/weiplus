package p70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final p70.c f352466d;

    /* renamed from: e, reason: collision with root package name */
    public static final p70.c f352467e;

    /* renamed from: f, reason: collision with root package name */
    public static final p70.c f352468f;

    /* renamed from: g, reason: collision with root package name */
    public static final p70.c f352469g;

    /* renamed from: h, reason: collision with root package name */
    public static final p70.c f352470h;

    /* renamed from: i, reason: collision with root package name */
    public static final p70.c f352471i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p70.c[] f352472m;

    static {
        p70.c cVar = new p70.c("Success", 0);
        f352466d = cVar;
        p70.c cVar2 = new p70.c("Cancel", 1);
        p70.c cVar3 = new p70.c("ParamsError", 2);
        f352467e = cVar3;
        p70.c cVar4 = new p70.c("PreBuildError", 3);
        f352468f = cVar4;
        p70.c cVar5 = new p70.c("CopyInputFileError", 4);
        f352469g = cVar5;
        p70.c cVar6 = new p70.c("ChangeInputWxamToJpgError", 5);
        f352470h = cVar6;
        p70.c cVar7 = new p70.c("ThumbFileError", 6);
        f352471i = cVar7;
        p70.c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f352472m = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static p70.c valueOf(java.lang.String str) {
        return (p70.c) java.lang.Enum.valueOf(p70.c.class, str);
    }

    public static p70.c[] values() {
        return (p70.c[]) f352472m.clone();
    }
}
