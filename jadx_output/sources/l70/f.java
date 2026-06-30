package l70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final l70.f f316820d;

    /* renamed from: e, reason: collision with root package name */
    public static final l70.f f316821e;

    /* renamed from: f, reason: collision with root package name */
    public static final l70.f f316822f;

    /* renamed from: g, reason: collision with root package name */
    public static final l70.f f316823g;

    /* renamed from: h, reason: collision with root package name */
    public static final l70.f f316824h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ l70.f[] f316825i;

    static {
        l70.f fVar = new l70.f("Success", 0);
        f316820d = fVar;
        l70.f fVar2 = new l70.f("Cancel", 1);
        f316821e = fVar2;
        l70.f fVar3 = new l70.f("DownloadError", 2);
        f316822f = fVar3;
        l70.f fVar4 = new l70.f("MoveFileError", 3);
        f316823g = fVar4;
        l70.f fVar5 = new l70.f("WxamToJpgError", 4);
        f316824h = fVar5;
        l70.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f316825i = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static l70.f valueOf(java.lang.String str) {
        return (l70.f) java.lang.Enum.valueOf(l70.f.class, str);
    }

    public static l70.f[] values() {
        return (l70.f[]) f316825i.clone();
    }
}
