package l94;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: d, reason: collision with root package name */
    public static final l94.m f317378d;

    /* renamed from: e, reason: collision with root package name */
    public static final l94.m f317379e;

    /* renamed from: f, reason: collision with root package name */
    public static final l94.m f317380f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ l94.m[] f317381g;

    static {
        l94.m mVar = new l94.m("ViewNormal", 0, 1);
        f317378d = mVar;
        l94.m mVar2 = new l94.m("ViewPressed", 1, 2);
        f317379e = mVar2;
        l94.m mVar3 = new l94.m("ViewClicked", 2, 3);
        f317380f = mVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        l94.m[] mVarArr = {mVar, mVar2, mVar3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        f317381g = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
    }

    public static l94.m valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        l94.m mVar = (l94.m) java.lang.Enum.valueOf(l94.m.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        return mVar;
    }

    public static l94.m[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        l94.m[] mVarArr = (l94.m[]) f317381g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventType");
        return mVarArr;
    }
}
