package zu;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final zu.g f475654d;

    /* renamed from: e, reason: collision with root package name */
    public static final zu.g f475655e;

    /* renamed from: f, reason: collision with root package name */
    public static final zu.g f475656f;

    /* renamed from: g, reason: collision with root package name */
    public static final zu.g f475657g;

    /* renamed from: h, reason: collision with root package name */
    public static final zu.g f475658h;

    /* renamed from: i, reason: collision with root package name */
    public static final zu.g f475659i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ zu.g[] f475660m;

    static {
        zu.g gVar = new zu.g("Success", 0);
        f475654d = gVar;
        zu.g gVar2 = new zu.g("Error", 1);
        zu.g gVar3 = new zu.g("InvalidMsgError", 2);
        f475655e = gVar3;
        zu.g gVar4 = new zu.g("RevokeMsgError", 3);
        f475656f = gVar4;
        zu.g gVar5 = new zu.g("FlowApiError", 4);
        f475657g = gVar5;
        zu.g gVar6 = new zu.g("XmlError", 5);
        zu.g gVar7 = new zu.g("DownloadError", 6);
        f475658h = gVar7;
        zu.g gVar8 = new zu.g("UploadError", 7);
        f475659i = gVar8;
        zu.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8};
        f475660m = gVarArr;
        rz5.b.a(gVarArr);
    }

    public g(java.lang.String str, int i17) {
    }

    public static zu.g valueOf(java.lang.String str) {
        return (zu.g) java.lang.Enum.valueOf(zu.g.class, str);
    }

    public static zu.g[] values() {
        return (zu.g[]) f475660m.clone();
    }
}
