package l44;

/* loaded from: classes4.dex */
public final class w implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f316395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f316396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f316397c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f316398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 f316400f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f54.x f316401g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.CheckBox f316402h;

    public w(android.content.Context context, com.tencent.mm.ui.widget.dialog.z2 z2Var, kotlinx.coroutines.y0 y0Var, yz5.p pVar, android.widget.CheckBox checkBox, com.tencent.mm.plugin.sns.ad.landingpage.component.comp.h2 h2Var, f54.x xVar, android.widget.CheckBox checkBox2) {
        this.f316395a = context;
        this.f316396b = z2Var;
        this.f316397c = y0Var;
        this.f316398d = pVar;
        this.f316399e = checkBox;
        this.f316400f = h2Var;
        this.f316401g = xVar;
        this.f316402h = checkBox2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7");
        android.content.Context context = this.f316395a;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f316395a.getString(com.tencent.mm.R.string.j7k), true, true, null);
        this.f316396b.B();
        kotlinx.coroutines.y0 y0Var = this.f316397c;
        if (y0Var != null) {
            kotlinx.coroutines.r0 r0Var = l44.y.f316420a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            kotlinx.coroutines.r0 r0Var2 = l44.y.f316420a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExceptionHandler", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper");
            ((kotlinx.coroutines.c3) kotlinx.coroutines.l.d(y0Var, r0Var2, null, new l44.u(Q, this.f316398d, this.f316399e, this.f316400f, this.f316401g, this.f316402h, null), 2, null)).p(new l44.v(Q));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.AdCombineFollowHfScreenHelper$showHfScreen$7");
    }
}
