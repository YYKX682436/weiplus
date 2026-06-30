package p84;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final android.view.animation.Interpolator a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.widget.animlabel.AnimLabelCtrl$Companion");
        return pathInterpolator;
    }
}
