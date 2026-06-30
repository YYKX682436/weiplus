package h40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final h40.b f278720e;

    /* renamed from: f, reason: collision with root package name */
    public static final h40.b f278721f;

    /* renamed from: g, reason: collision with root package name */
    public static final h40.b f278722g;

    /* renamed from: h, reason: collision with root package name */
    public static final h40.b f278723h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h40.b[] f278724i;

    /* renamed from: d, reason: collision with root package name */
    public final int f278725d;

    static {
        h40.b bVar = new h40.b("FILE_DOWNLOAD_FROM_OTHER", 0, 0);
        f278720e = bVar;
        h40.b bVar2 = new h40.b("FILE_DOWNLOAD_FROM_CHAT", 1, 1);
        f278721f = bVar2;
        h40.b bVar3 = new h40.b("FILE_DOWNLOAD_FROM_MID_PAGE", 2, 2);
        f278722g = bVar3;
        h40.b bVar4 = new h40.b("FILE_DOWNLOAD_FROM_PREVIEW_PAGE", 3, 3);
        f278723h = bVar4;
        h40.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f278724i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f278725d = i18;
    }

    public static h40.b valueOf(java.lang.String str) {
        return (h40.b) java.lang.Enum.valueOf(h40.b.class, str);
    }

    public static h40.b[] values() {
        return (h40.b[]) f278724i.clone();
    }
}
