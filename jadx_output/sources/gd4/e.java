package gd4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final gd4.e f270681d;

    /* renamed from: e, reason: collision with root package name */
    public static final gd4.e f270682e;

    /* renamed from: f, reason: collision with root package name */
    public static final gd4.e f270683f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ gd4.e[] f270684g;

    static {
        gd4.e eVar = new gd4.e("CANPLAY", 0);
        f270681d = eVar;
        gd4.e eVar2 = new gd4.e("PAUSE", 1);
        f270682e = eVar2;
        gd4.e eVar3 = new gd4.e("STOP", 2);
        f270683f = eVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        gd4.e[] eVarArr = {eVar, eVar2, eVar3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        f270684g = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17) {
    }

    public static gd4.e valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        gd4.e eVar = (gd4.e) java.lang.Enum.valueOf(gd4.e.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        return eVar;
    }

    public static gd4.e[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        gd4.e[] eVarArr = (gd4.e[]) f270684g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$PlayStates");
        return eVarArr;
    }
}
