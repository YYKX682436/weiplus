package l44;

/* loaded from: classes4.dex */
public final class q implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 f316303b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316304c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f316305d;

    public q(android.widget.CheckBox checkBox, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 h2Var, android.widget.CheckBox checkBox2, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f316302a = checkBox;
        this.f316303b = h2Var;
        this.f316304c = checkBox2;
        this.f316305d = z2Var;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$5");
        kotlin.jvm.internal.o.g(buttonView, "buttonView");
        l44.y.a(this.f316302a, this.f316303b, this.f316304c, this.f316305d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCheckedChanged", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$5");
    }
}
