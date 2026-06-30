package m84;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final m84.a f324749d;

    /* renamed from: e, reason: collision with root package name */
    public static final m84.a f324750e;

    /* renamed from: f, reason: collision with root package name */
    public static final m84.a f324751f;

    /* renamed from: g, reason: collision with root package name */
    public static final m84.a f324752g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ m84.a[] f324753h;

    static {
        m84.a aVar = new m84.a("None", 0);
        f324749d = aVar;
        m84.a aVar2 = new m84.a("StageOne", 1);
        f324750e = aVar2;
        m84.a aVar3 = new m84.a("StageTwo", 2);
        f324751f = aVar3;
        m84.a aVar4 = new m84.a("StageFour", 3);
        f324752g = aVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        m84.a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        f324753h = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17) {
    }

    public static m84.a valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        m84.a aVar = (m84.a) java.lang.Enum.valueOf(m84.a.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        return aVar;
    }

    public static m84.a[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        m84.a[] aVarArr = (m84.a[]) f324753h.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent$Stage");
        return aVarArr;
    }
}
