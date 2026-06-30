package l14;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final l14.d f315003e;

    /* renamed from: f, reason: collision with root package name */
    public static final l14.d f315004f;

    /* renamed from: g, reason: collision with root package name */
    public static final l14.d f315005g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ l14.d[] f315006h;

    /* renamed from: d, reason: collision with root package name */
    public final int f315007d;

    static {
        l14.d dVar = new l14.d("MSG_NOTIFICATION_OTHER", 0, 0);
        l14.d dVar2 = new l14.d("MSG_NOTIFICATION_SYSTEM", 1, 1);
        f315003e = dVar2;
        l14.d dVar3 = new l14.d("MSG_NOTIFICATION_VOICE_VIDEO", 2, 2);
        f315004f = dVar3;
        l14.d dVar4 = new l14.d("MSG_NOTIFICATION_VOICE_VIDEO_SHORTCUT", 3, 3);
        l14.d dVar5 = new l14.d("MSG_NOTIFICATION_CONTENT", 4, 4);
        f315005g = dVar5;
        l14.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, new l14.d("MSG_NOTIFICATION_SYSTEM_SETTING", 5, 5), new l14.d("MSG_NOTIFICATION_BANNER", 6, 6), new l14.d("MSG_NOTIFICATION_SOUND", 7, 7)};
        f315006h = dVarArr;
        java.util.List a17 = rz5.b.a(dVarArr);
        int d17 = kz5.b1.d(kz5.d0.q(a17, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        kz5.e eVar = new kz5.e((kz5.h) a17);
        while (eVar.hasNext()) {
            java.lang.Object next = eVar.next();
            linkedHashMap.put(java.lang.Integer.valueOf(((l14.d) next).f315007d), next);
        }
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f315007d = i18;
    }

    public static l14.d valueOf(java.lang.String str) {
        return (l14.d) java.lang.Enum.valueOf(l14.d.class, str);
    }

    public static l14.d[] values() {
        return (l14.d[]) f315006h.clone();
    }
}
