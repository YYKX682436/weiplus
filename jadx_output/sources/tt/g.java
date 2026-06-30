package tt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final tt.g f421758d;

    /* renamed from: e, reason: collision with root package name */
    public static final tt.g f421759e;

    /* renamed from: f, reason: collision with root package name */
    public static final tt.g f421760f;

    /* renamed from: g, reason: collision with root package name */
    public static final tt.g f421761g;

    /* renamed from: h, reason: collision with root package name */
    public static final tt.g f421762h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tt.g[] f421763i;

    static {
        tt.g gVar = new tt.g("Success", 0);
        f421758d = gVar;
        tt.g gVar2 = new tt.g("Cancel", 1);
        f421759e = gVar2;
        tt.g gVar3 = new tt.g("Error", 2);
        f421760f = gVar3;
        tt.g gVar4 = new tt.g("InvalidFileId", 3);
        f421761g = gVar4;
        tt.g gVar5 = new tt.g("NotSupport", 4);
        f421762h = gVar5;
        tt.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f421763i = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static tt.g valueOf(java.lang.String str) {
        return (tt.g) java.lang.Enum.valueOf(tt.g.class, str);
    }

    public static tt.g[] values() {
        return (tt.g[]) f421763i.clone();
    }
}
