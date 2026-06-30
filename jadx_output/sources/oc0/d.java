package oc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final oc0.d f344133d;

    /* renamed from: e, reason: collision with root package name */
    public static final oc0.d f344134e;

    /* renamed from: f, reason: collision with root package name */
    public static final oc0.d f344135f;

    /* renamed from: g, reason: collision with root package name */
    public static final oc0.d f344136g;

    /* renamed from: h, reason: collision with root package name */
    public static final oc0.d f344137h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ oc0.d[] f344138i;

    static {
        oc0.d dVar = new oc0.d("Success", 0);
        f344133d = dVar;
        oc0.d dVar2 = new oc0.d("XmlError", 1);
        f344134e = dVar2;
        oc0.d dVar3 = new oc0.d("DownloadError", 2);
        f344135f = dVar3;
        oc0.d dVar4 = new oc0.d("UploadFileNotExist", 3);
        f344136g = dVar4;
        oc0.d dVar5 = new oc0.d("UploadError", 4);
        f344137h = dVar5;
        oc0.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5};
        f344138i = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static oc0.d valueOf(java.lang.String str) {
        return (oc0.d) java.lang.Enum.valueOf(oc0.d.class, str);
    }

    public static oc0.d[] values() {
        return (oc0.d[]) f344138i.clone();
    }
}
