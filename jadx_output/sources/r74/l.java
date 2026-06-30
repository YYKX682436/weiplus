package r74;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    public static final r74.l f393219d;

    /* renamed from: e, reason: collision with root package name */
    public static final r74.l f393220e;

    /* renamed from: f, reason: collision with root package name */
    public static final r74.l f393221f;

    /* renamed from: g, reason: collision with root package name */
    public static final r74.l f393222g;

    /* renamed from: h, reason: collision with root package name */
    public static final r74.l f393223h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ r74.l[] f393224i;

    static {
        r74.l lVar = new r74.l("Playing", 0);
        f393219d = lVar;
        r74.l lVar2 = new r74.l("Loading", 1);
        f393220e = lVar2;
        r74.l lVar3 = new r74.l("Error", 2);
        f393221f = lVar3;
        r74.l lVar4 = new r74.l("Pause", 3);
        f393222g = lVar4;
        r74.l lVar5 = new r74.l("PauseAndErrorTv", 4);
        f393223h = lVar5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        r74.l[] lVarArr = {lVar, lVar2, lVar3, lVar4, lVar5};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        f393224i = lVarArr;
        rz5.b.a(lVarArr);
    }

    public l(java.lang.String str, int i17) {
    }

    public static r74.l valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        r74.l lVar = (r74.l) java.lang.Enum.valueOf(r74.l.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        return lVar;
    }

    public static r74.l[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        r74.l[] lVarArr = (r74.l[]) f393224i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.item.combinegrid.AdCombineGridCardViewLogic$PlayModel");
        return lVarArr;
    }
}
