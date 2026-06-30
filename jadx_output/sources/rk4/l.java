package rk4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: e, reason: collision with root package name */
    public static final rk4.l f396806e;

    /* renamed from: f, reason: collision with root package name */
    public static final rk4.l f396807f;

    /* renamed from: g, reason: collision with root package name */
    public static final rk4.l f396808g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rk4.l[] f396809h;

    /* renamed from: d, reason: collision with root package name */
    public final int f396810d;

    static {
        rk4.l lVar = new rk4.l(com.google.android.gms.stats.netstats.NetstatsParserPatterns.TYPE_BACKGROUND_PATTERN, 0, 0);
        f396806e = lVar;
        rk4.l lVar2 = new rk4.l("MUSIC_AUDIO_ICON_WITH_RECENT", 1, 4);
        f396807f = lVar2;
        rk4.l lVar3 = new rk4.l("RECOMMEND_MUSIC_LIST", 2, 5);
        f396808g = lVar3;
        rk4.l[] lVarArr = {lVar, lVar2, lVar3};
        f396809h = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17, int i18) {
        this.f396810d = i18;
    }

    public static rk4.l valueOf(java.lang.String str) {
        return (rk4.l) java.lang.Enum.valueOf(rk4.l.class, str);
    }

    public static rk4.l[] values() {
        return (rk4.l[]) f396809h.clone();
    }
}
