package l94;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l94.e f317319a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.ViewGroup f317320b;

    public a(l94.e component, android.view.ViewGroup viewGroup, int i17, kotlin.jvm.internal.i iVar) {
        viewGroup = (i17 & 2) != 0 ? null : viewGroup;
        kotlin.jvm.internal.o.g(component, "component");
        this.f317319a = component;
        this.f317320b = viewGroup;
    }

    public final l94.e a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComponent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComponent", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.AbsWsFoldAdComponent$ChildComponentState");
        return this.f317319a;
    }
}
