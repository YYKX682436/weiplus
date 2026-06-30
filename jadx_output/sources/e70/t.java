package e70;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final e70.t f249855d;

    /* renamed from: e, reason: collision with root package name */
    public static final e70.t f249856e;

    /* renamed from: f, reason: collision with root package name */
    public static final e70.t f249857f;

    /* renamed from: g, reason: collision with root package name */
    public static final e70.t f249858g;

    /* renamed from: h, reason: collision with root package name */
    public static final e70.t f249859h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ e70.t[] f249860i;

    static {
        e70.t tVar = new e70.t("SUCCESS", 0);
        f249855d = tVar;
        e70.t tVar2 = new e70.t("NO_NEED_UPDATE", 1);
        f249856e = tVar2;
        e70.t tVar3 = new e70.t("REQUEST_ERROR", 2);
        f249857f = tVar3;
        e70.t tVar4 = new e70.t("PROTOBUF_ERROR", 3);
        f249858g = tVar4;
        e70.t tVar5 = new e70.t("CGI_ERROR", 4);
        f249859h = tVar5;
        e70.t[] tVarArr = {tVar, tVar2, tVar3, tVar4, tVar5};
        f249860i = tVarArr;
        rz5.b.a(tVarArr);
    }

    public t(java.lang.String str, int i17) {
    }

    public static e70.t valueOf(java.lang.String str) {
        return (e70.t) java.lang.Enum.valueOf(e70.t.class, str);
    }

    public static e70.t[] values() {
        return (e70.t[]) f249860i.clone();
    }
}
