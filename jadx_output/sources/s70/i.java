package s70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final s70.i f403961d;

    /* renamed from: e, reason: collision with root package name */
    public static final s70.i f403962e;

    /* renamed from: f, reason: collision with root package name */
    public static final s70.i f403963f;

    /* renamed from: g, reason: collision with root package name */
    public static final s70.i f403964g;

    /* renamed from: h, reason: collision with root package name */
    public static final s70.i f403965h;

    /* renamed from: i, reason: collision with root package name */
    public static final s70.i f403966i;

    /* renamed from: m, reason: collision with root package name */
    public static final s70.i f403967m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ s70.i[] f403968n;

    static {
        s70.i iVar = new s70.i("Success", 0);
        f403961d = iVar;
        s70.i iVar2 = new s70.i("Cancel", 1);
        s70.i iVar3 = new s70.i("ParamsError", 2);
        f403962e = iVar3;
        s70.i iVar4 = new s70.i("MoveFileError", 3);
        f403963f = iVar4;
        s70.i iVar5 = new s70.i("DownloadError", 4);
        f403964g = iVar5;
        s70.i iVar6 = new s70.i("WxamToJpgError", 5);
        f403965h = iVar6;
        s70.i iVar7 = new s70.i("UploadError", 6);
        f403966i = iVar7;
        s70.i iVar8 = new s70.i("TimeoutError", 7);
        f403967m = iVar8;
        s70.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8};
        f403968n = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static s70.i valueOf(java.lang.String str) {
        return (s70.i) java.lang.Enum.valueOf(s70.i.class, str);
    }

    public static s70.i[] values() {
        return (s70.i[]) f403968n.clone();
    }
}
