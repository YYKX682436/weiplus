package k71;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class m {

    /* renamed from: f, reason: collision with root package name */
    public static final k71.m f304693f;

    /* renamed from: g, reason: collision with root package name */
    public static final k71.m f304694g;

    /* renamed from: h, reason: collision with root package name */
    public static final k71.m f304695h;

    /* renamed from: i, reason: collision with root package name */
    public static final k71.m f304696i;

    /* renamed from: m, reason: collision with root package name */
    public static final k71.m f304697m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ k71.m[] f304698n;

    /* renamed from: d, reason: collision with root package name */
    public final int f304699d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304700e;

    static {
        k71.m mVar = new k71.m("SafeCenter", 0, com.tencent.thumbplayer.api.TPPlayerMsg.TP_PLAYER_INFO_LONG0_PREPARE_TIMEOUT, com.tencent.mm.R.string.l8m);
        f304693f = mVar;
        k71.m mVar2 = new k71.m("HelpCenter", 1, 5002, com.tencent.mm.R.string.l8j);
        f304694g = mVar2;
        k71.m mVar3 = new k71.m("Feedback", 2, 5004, com.tencent.mm.R.string.lsd);
        f304695h = mVar3;
        k71.m mVar4 = new k71.m("Register", 3, 5005, com.tencent.mm.R.string.o7r);
        f304696i = mVar4;
        k71.m mVar5 = new k71.m("Freeze", 4, 7012, com.tencent.mm.R.string.f492406gi3);
        f304697m = mVar5;
        k71.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5};
        f304698n = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18, int i19) {
        this.f304699d = i18;
        this.f304700e = i19;
    }

    public static k71.m valueOf(java.lang.String str) {
        return (k71.m) java.lang.Enum.valueOf(k71.m.class, str);
    }

    public static k71.m[] values() {
        return (k71.m[]) f304698n.clone();
    }
}
