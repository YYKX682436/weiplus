package tz2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final tz2.l f423302d;

    /* renamed from: e, reason: collision with root package name */
    public static final tz2.l f423303e;

    /* renamed from: f, reason: collision with root package name */
    public static final tz2.l f423304f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tz2.l[] f423305g;

    static {
        tz2.l lVar = new tz2.l("FaceFlashVideoCDNUploadType_NoNeed", 0);
        f423302d = lVar;
        tz2.l lVar2 = new tz2.l("FaceFlashVideoCDNUploadType_Upload", 1);
        f423303e = lVar2;
        tz2.l lVar3 = new tz2.l("FaceFlashVideoCDNUploadType_LateUpload", 2);
        f423304f = lVar3;
        tz2.l[] lVarArr = {lVar, lVar2, lVar3};
        f423305g = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static tz2.l valueOf(java.lang.String str) {
        return (tz2.l) java.lang.Enum.valueOf(tz2.l.class, str);
    }

    public static tz2.l[] values() {
        return (tz2.l[]) f423305g.clone();
    }
}
