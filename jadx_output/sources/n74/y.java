package n74;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final n74.y f335445d;

    /* renamed from: e, reason: collision with root package name */
    public static final n74.y f335446e;

    /* renamed from: f, reason: collision with root package name */
    public static final n74.y f335447f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n74.y[] f335448g;

    static {
        n74.y yVar = new n74.y("RESULT_STATE_DOWNLOADING", 0);
        f335445d = yVar;
        n74.y yVar2 = new n74.y("RESULT_STATE_ERROR", 1);
        f335446e = yVar2;
        n74.y yVar3 = new n74.y("RESULT_STATE_COMPLETE", 2);
        f335447f = yVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        n74.y[] yVarArr = {yVar, yVar2, yVar3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        f335448g = yVarArr;
        rz5.b.a(yVarArr);
    }

    public y(java.lang.String str, int i17) {
    }

    public static n74.y valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        n74.y yVar = (n74.y) java.lang.Enum.valueOf(n74.y.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        return yVar;
    }

    public static n74.y[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        n74.y[] yVarArr = (n74.y[]) f335448g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$ResultState");
        return yVarArr;
    }
}
