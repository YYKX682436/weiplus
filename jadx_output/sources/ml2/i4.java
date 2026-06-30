package ml2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i4 {

    /* renamed from: e, reason: collision with root package name */
    public static final ml2.i4 f327560e;

    /* renamed from: f, reason: collision with root package name */
    public static final ml2.i4 f327561f;

    /* renamed from: g, reason: collision with root package name */
    public static final ml2.i4 f327562g;

    /* renamed from: h, reason: collision with root package name */
    public static final ml2.i4 f327563h;

    /* renamed from: i, reason: collision with root package name */
    public static final ml2.i4 f327564i;

    /* renamed from: m, reason: collision with root package name */
    public static final ml2.i4 f327565m;

    /* renamed from: n, reason: collision with root package name */
    public static final ml2.i4 f327566n;

    /* renamed from: o, reason: collision with root package name */
    public static final ml2.i4 f327567o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ ml2.i4[] f327568p;

    /* renamed from: d, reason: collision with root package name */
    public final int f327569d;

    static {
        ml2.i4 i4Var = new ml2.i4("CLICK_LIVE_DEFAULT", 0, 0);
        f327560e = i4Var;
        ml2.i4 i4Var2 = new ml2.i4("CLICK_LIVE_CARD", 1, 1);
        f327561f = i4Var2;
        ml2.i4 i4Var3 = new ml2.i4("CLICK_LIVE_CARD_AVATAR_LIVING", 2, 2);
        f327562g = i4Var3;
        ml2.i4 i4Var4 = new ml2.i4("CLICK_CARD_AVATAR_LIVING", 3, 3);
        f327563h = i4Var4;
        ml2.i4 i4Var5 = new ml2.i4("CLICK_AVATAR_LIVING", 4, 4);
        f327564i = i4Var5;
        ml2.i4 i4Var6 = new ml2.i4("CLICK_SNSAD_ENTER_LIVE_ROOM", 5, 5);
        f327565m = i4Var6;
        ml2.i4 i4Var7 = new ml2.i4("CLICK_MIXED_TIMELINE_ENTER_LIVE_ROOM", 6, 6);
        f327566n = i4Var7;
        ml2.i4 i4Var8 = new ml2.i4("CLICK_JSAPI_HEJI_ENTER_LIVE_ROOM", 7, 1001);
        f327567o = i4Var8;
        ml2.i4[] i4VarArr = {i4Var, i4Var2, i4Var3, i4Var4, i4Var5, i4Var6, i4Var7, i4Var8};
        f327568p = i4VarArr;
        rz5.b.a(i4VarArr);
    }

    public i4(java.lang.String str, int i17, int i18) {
        this.f327569d = i18;
    }

    public static ml2.i4 valueOf(java.lang.String str) {
        return (ml2.i4) java.lang.Enum.valueOf(ml2.i4.class, str);
    }

    public static ml2.i4[] values() {
        return (ml2.i4[]) f327568p.clone();
    }
}
