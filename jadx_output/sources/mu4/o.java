package mu4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final mu4.o f331434d;

    /* renamed from: e, reason: collision with root package name */
    public static final mu4.o f331435e;

    /* renamed from: f, reason: collision with root package name */
    public static final mu4.o f331436f;

    /* renamed from: g, reason: collision with root package name */
    public static final mu4.o f331437g;

    /* renamed from: h, reason: collision with root package name */
    public static final mu4.o f331438h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ mu4.o[] f331439i;

    static {
        mu4.o oVar = new mu4.o("UseDebugPkg", 0);
        f331434d = oVar;
        mu4.o oVar2 = new mu4.o("UsePreviewPkg", 1);
        f331435e = oVar2;
        mu4.o oVar3 = new mu4.o("UseResPkg", 2);
        f331436f = oVar3;
        mu4.o oVar4 = new mu4.o("UseAssetsPkg", 3);
        f331437g = oVar4;
        mu4.o oVar5 = new mu4.o("FallbackAssetsPkg", 4);
        f331438h = oVar5;
        mu4.o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5};
        f331439i = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static mu4.o valueOf(java.lang.String str) {
        return (mu4.o) java.lang.Enum.valueOf(mu4.o.class, str);
    }

    public static mu4.o[] values() {
        return (mu4.o[]) f331439i.clone();
    }
}
