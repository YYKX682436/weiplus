package z74;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final z74.b f470584d;

    /* renamed from: e, reason: collision with root package name */
    public static final z74.b f470585e;

    /* renamed from: f, reason: collision with root package name */
    public static final z74.b f470586f;

    /* renamed from: g, reason: collision with root package name */
    public static final z74.b f470587g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ z74.b[] f470588h;

    static {
        z74.b bVar = new z74.b("START", 0);
        f470584d = bVar;
        z74.b bVar2 = new z74.b("PLAYING", 1);
        f470585e = bVar2;
        z74.b bVar3 = new z74.b("PAUSE", 2);
        f470586f = bVar3;
        z74.b bVar4 = new z74.b("COMPLETED", 3);
        f470587g = bVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        z74.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        f470588h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    public static z74.b valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        z74.b bVar = (z74.b) java.lang.Enum.valueOf(z74.b.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        return bVar;
    }

    public static z74.b[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        z74.b[] bVarArr = (z74.b[]) f470588h.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.timeline.video.online.AdVideoCallbackListener$VideoEvent");
        return bVarArr;
    }
}
