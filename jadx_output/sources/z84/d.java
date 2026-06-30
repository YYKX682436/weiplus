package z84;

/* loaded from: classes4.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public int f470765a;

    /* renamed from: b, reason: collision with root package name */
    public int f470766b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f470767c;

    /* renamed from: d, reason: collision with root package name */
    public int f470768d;

    public abstract void a(android.view.View view);

    public abstract void b(int i17, float f17, android.view.View view, int i18, int i19, int i27);

    public abstract boolean c(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17, int i18);

    public abstract float d();

    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f470767c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutManager", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$LayoutHelper");
        return cardLayoutManager;
    }
}
