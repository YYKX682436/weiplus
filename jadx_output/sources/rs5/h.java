package rs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: e, reason: collision with root package name */
    public static final rs5.h f399357e;

    /* renamed from: f, reason: collision with root package name */
    public static final rs5.h f399358f;

    /* renamed from: g, reason: collision with root package name */
    public static final rs5.h f399359g;

    /* renamed from: h, reason: collision with root package name */
    public static final rs5.h f399360h;

    /* renamed from: i, reason: collision with root package name */
    public static final rs5.h f399361i;

    /* renamed from: m, reason: collision with root package name */
    public static final rs5.h f399362m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ rs5.h[] f399363n;

    /* renamed from: d, reason: collision with root package name */
    public final int f399364d;

    static {
        rs5.h hVar = new rs5.h("UNKNOWN", 0, -1);
        rs5.h hVar2 = new rs5.h("UPDATE_RES_SUCCESS", 1, 0);
        f399357e = hVar2;
        rs5.h hVar3 = new rs5.h("NO_CHANGE_SUCCESS", 2, 1);
        f399358f = hVar3;
        rs5.h hVar4 = new rs5.h("FORCE_DOWNLOAD_SUCCESS", 3, 2);
        f399359g = hVar4;
        rs5.h hVar5 = new rs5.h("REDOWNLOAD_SUCCESS", 4, 3);
        f399360h = hVar5;
        rs5.h hVar6 = new rs5.h("DOWNLOAD_FAIL", 5, 10);
        rs5.h hVar7 = new rs5.h("UNZIP_FAIL", 6, 11);
        rs5.h hVar8 = new rs5.h("NEED_NEWER_ENGINE", 7, 12);
        rs5.h hVar9 = new rs5.h("PREFER_NEWER_ENGINE", 8, 13);
        rs5.h hVar10 = new rs5.h("TIMEOUT_FAIL", 9, 14);
        rs5.h hVar11 = new rs5.h("ENGINE_BUSY_FAIL", 10, 15);
        rs5.h hVar12 = new rs5.h("PKG_NOT_READY_FAIL", 11, 16);
        f399361i = hVar12;
        rs5.h hVar13 = new rs5.h("BINDER_DEAD", 12, 1000);
        f399362m = hVar13;
        rs5.h[] hVarArr = {hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13};
        f399363n = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17, int i18) {
        this.f399364d = i18;
    }

    public static rs5.h valueOf(java.lang.String str) {
        return (rs5.h) java.lang.Enum.valueOf(rs5.h.class, str);
    }

    public static rs5.h[] values() {
        return (rs5.h[]) f399363n.clone();
    }
}
