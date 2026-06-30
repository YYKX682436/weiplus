package w22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final w22.b f442521d;

    /* renamed from: e, reason: collision with root package name */
    public static final w22.b f442522e;

    /* renamed from: f, reason: collision with root package name */
    public static final w22.b f442523f;

    /* renamed from: g, reason: collision with root package name */
    public static final w22.b f442524g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w22.b[] f442525h;

    static {
        w22.b bVar = new w22.b("RECORD_STATE_IDLE", 0);
        f442521d = bVar;
        w22.b bVar2 = new w22.b("RECORD_STATE_PREVIEW", 1);
        f442522e = bVar2;
        w22.b bVar3 = new w22.b("RECORD_STATE_PREVIEW_PAUSED", 2);
        w22.b bVar4 = new w22.b("RECORD_STATE_STARTED", 3);
        f442523f = bVar4;
        w22.b bVar5 = new w22.b("RECORD_STATE_STOP", 4);
        f442524g = bVar5;
        w22.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f442525h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static w22.b valueOf(java.lang.String str) {
        return (w22.b) java.lang.Enum.valueOf(w22.b.class, str);
    }

    public static w22.b[] values() {
        return (w22.b[]) f442525h.clone();
    }
}
