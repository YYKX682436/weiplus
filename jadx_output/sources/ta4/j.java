package ta4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class j {

    /* renamed from: d, reason: collision with root package name */
    public static final ta4.j f416769d;

    /* renamed from: e, reason: collision with root package name */
    public static final ta4.j f416770e;

    /* renamed from: f, reason: collision with root package name */
    public static final ta4.j f416771f;

    /* renamed from: g, reason: collision with root package name */
    public static final ta4.j f416772g;

    /* renamed from: h, reason: collision with root package name */
    public static final ta4.j f416773h;

    /* renamed from: i, reason: collision with root package name */
    public static final ta4.j f416774i;

    /* renamed from: m, reason: collision with root package name */
    public static final ta4.j f416775m;

    /* renamed from: n, reason: collision with root package name */
    public static final ta4.j f416776n;

    /* renamed from: o, reason: collision with root package name */
    public static final ta4.j f416777o;

    /* renamed from: p, reason: collision with root package name */
    public static final ta4.j f416778p;

    /* renamed from: q, reason: collision with root package name */
    public static final ta4.j f416779q;

    /* renamed from: r, reason: collision with root package name */
    public static final ta4.j f416780r;

    /* renamed from: s, reason: collision with root package name */
    public static final ta4.j f416781s;

    /* renamed from: t, reason: collision with root package name */
    public static final ta4.j f416782t;

    /* renamed from: u, reason: collision with root package name */
    public static final ta4.j f416783u;

    /* renamed from: v, reason: collision with root package name */
    public static final ta4.j f416784v;

    /* renamed from: w, reason: collision with root package name */
    public static final ta4.j f416785w;

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ ta4.j[] f416786x;

    static {
        ta4.j jVar = new ta4.j("Unknown", 0);
        f416769d = jVar;
        ta4.j jVar2 = new ta4.j("HitCache", 1);
        f416770e = jVar2;
        ta4.j jVar3 = new ta4.j("EnqueueDownload", 2);
        f416771f = jVar3;
        ta4.j jVar4 = new ta4.j("StartDownload", 3);
        f416772g = jVar4;
        ta4.j jVar5 = new ta4.j("StartImageLoader", 4);
        f416773h = jVar5;
        ta4.j jVar6 = new ta4.j("CdnDownloadFinished", 5);
        f416774i = jVar6;
        ta4.j jVar7 = new ta4.j("ImageLoaderFinished", 6);
        f416775m = jVar7;
        ta4.j jVar8 = new ta4.j("CallbackToUI", 7);
        f416776n = jVar8;
        ta4.j jVar9 = new ta4.j("LoadCancelByFling", 8);
        f416777o = jVar9;
        ta4.j jVar10 = new ta4.j("LoadCancelByExit", 9);
        f416778p = jVar10;
        ta4.j jVar11 = new ta4.j("CancelAndNeverLoadAgain", 10);
        ta4.j jVar12 = new ta4.j("ShowBitmapSuccess", 11);
        f416779q = jVar12;
        ta4.j jVar13 = new ta4.j("ShowBitmapFailButDownloadSuccess", 12);
        f416780r = jVar13;
        ta4.j jVar14 = new ta4.j("FallbackDownload", 13);
        f416781s = jVar14;
        ta4.j jVar15 = new ta4.j("DownloadFail", 14);
        f416782t = jVar15;
        ta4.j jVar16 = new ta4.j("ProcessFail", 15);
        f416783u = jVar16;
        ta4.j jVar17 = new ta4.j("NetSceneSnsDownloadFinishSuccess", 16);
        f416784v = jVar17;
        ta4.j jVar18 = new ta4.j("NetSceneSnsDownloadFinishError", 17);
        f416785w = jVar18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.report.LoadStage");
        ta4.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5, jVar6, jVar7, jVar8, jVar9, jVar10, jVar11, jVar12, jVar13, jVar14, jVar15, jVar16, jVar17, jVar18};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.report.LoadStage");
        f416786x = jVarArr;
        rz5.b.a(jVarArr);
    }

    public j(java.lang.String str, int i17) {
    }

    public static ta4.j valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.LoadStage");
        ta4.j jVar = (ta4.j) java.lang.Enum.valueOf(ta4.j.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.LoadStage");
        return jVar;
    }

    public static ta4.j[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.report.LoadStage");
        ta4.j[] jVarArr = (ta4.j[]) f416786x.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.report.LoadStage");
        return jVarArr;
    }
}
