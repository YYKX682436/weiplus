package nc4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final nc4.d f336123e;

    /* renamed from: f, reason: collision with root package name */
    public static final nc4.d f336124f;

    /* renamed from: g, reason: collision with root package name */
    public static final nc4.d f336125g;

    /* renamed from: h, reason: collision with root package name */
    public static final nc4.d f336126h;

    /* renamed from: i, reason: collision with root package name */
    public static final nc4.d f336127i;

    /* renamed from: m, reason: collision with root package name */
    public static final nc4.d f336128m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ nc4.d[] f336129n;

    /* renamed from: d, reason: collision with root package name */
    public final int f336130d;

    static {
        nc4.d dVar = new nc4.d("CANCEL", 0, 0);
        f336123e = dVar;
        nc4.d dVar2 = new nc4.d("ALBUM", 1, 1);
        f336124f = dVar2;
        nc4.d dVar3 = new nc4.d("RECORD", 2, 3);
        f336125g = dVar3;
        nc4.d dVar4 = new nc4.d("FINDER", 3, 6);
        f336126h = dVar4;
        nc4.d dVar5 = new nc4.d("SECOND_CUT", 4, 7);
        f336127i = dVar5;
        nc4.d dVar6 = new nc4.d("SPRING", 5, 8);
        f336128m = dVar6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        nc4.d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        f336129n = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f336130d = i18;
    }

    public static nc4.d valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        nc4.d dVar = (nc4.d) java.lang.Enum.valueOf(nc4.d.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        return dVar;
    }

    public static nc4.d[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        nc4.d[] dVarArr = (nc4.d[]) f336129n.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        return dVarArr;
    }

    public final int h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.EntranceType");
        return this.f336130d;
    }
}
