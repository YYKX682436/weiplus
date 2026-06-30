package yw;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final yw.d0 f466291e;

    /* renamed from: f, reason: collision with root package name */
    public static final yw.d0 f466292f;

    /* renamed from: g, reason: collision with root package name */
    public static final yw.d0 f466293g;

    /* renamed from: h, reason: collision with root package name */
    public static final yw.d0 f466294h;

    /* renamed from: i, reason: collision with root package name */
    public static final yw.d0 f466295i;

    /* renamed from: m, reason: collision with root package name */
    public static final yw.d0 f466296m;

    /* renamed from: n, reason: collision with root package name */
    public static final yw.d0 f466297n;

    /* renamed from: o, reason: collision with root package name */
    public static final yw.d0 f466298o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ yw.d0[] f466299p;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f466300d;

    static {
        yw.d0 d0Var = new yw.d0("ON_BIZ_INFO_CHANGE", 0, "OnBizInfoChange.onNotifyChange");
        f466291e = d0Var;
        yw.d0 d0Var2 = new yw.d0("AFF_DATA_CHANGE", 1, "AffBizCppToNativeManagerImpl.callOnDataChangeAsync");
        f466292f = d0Var2;
        yw.d0 d0Var3 = new yw.d0("BIZ_CREATION_CENTER_INFO_UPDATE", 2, "BizCreationCenterInfoUpdateEvent.callback");
        f466293g = d0Var3;
        yw.d0 d0Var4 = new yw.d0("PERSONAL_CENTER_RED_DOT", 3, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent");
        f466294h = d0Var4;
        yw.d0 d0Var5 = new yw.d0("SET_FINDER_RED_DOT", 4, "BizProcessorCommand.addFinderRedDot");
        f466295i = d0Var5;
        yw.d0 d0Var6 = new yw.d0("INIT_FINDER_LIVE_DOT", 5, "BizFlutterDigestHelper.initFinderLiveDot");
        f466296m = d0Var6;
        yw.d0 d0Var7 = new yw.d0("AFF_FINDER_LIVE_INFO_CHANGED", 6, "AffBizCppToNativeManagerImpl.callOnBizDigestFinderLiveInfoChangedAsync");
        f466297n = d0Var7;
        yw.d0 d0Var8 = new yw.d0("UNKNOWN", 7, com.eclipsesource.mmv8.Platform.UNKNOWN);
        f466298o = d0Var8;
        yw.d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4, d0Var5, d0Var6, d0Var7, d0Var8};
        f466299p = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17, java.lang.String str2) {
        this.f466300d = str2;
    }

    public static yw.d0 valueOf(java.lang.String str) {
        return (yw.d0) java.lang.Enum.valueOf(yw.d0.class, str);
    }

    public static yw.d0[] values() {
        return (yw.d0[]) f466299p.clone();
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return this.f466300d;
    }
}
