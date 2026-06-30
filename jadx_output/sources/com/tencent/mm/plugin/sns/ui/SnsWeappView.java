package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB%\b\u0016\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\r\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsWeappView;", "Landroid/widget/LinearLayout;", "Lk91/v5;", "attr", "Ljz5/f0;", "setAttrNickname", "", dm.i4.COL_USERNAME, "setWeappUsername", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class SnsWeappView extends android.widget.LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f167620g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final int f167621d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f167622e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167623f;

    public SnsWeappView(android.content.Context context) {
        super(context);
        this.f167621d = com.tencent.mm.R.string.f490614a00;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.epm, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.voy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f167622e = (android.widget.TextView) findViewById;
    }

    public static final /* synthetic */ void a(com.tencent.mm.plugin.sns.ui.SnsWeappView snsWeappView, k91.v5 v5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setAttrNickname", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        snsWeappView.setAttrNickname(v5Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setAttrNickname", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
    }

    private final void setAttrNickname(k91.v5 v5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttrNickname", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.pv(v5Var, this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttrNickname", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        this.f167622e.setText(i65.a.r(getContext(), this.f167621d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDefaultName", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
    }

    public final void setWeappUsername(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWeappUsername", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
        this.f167623f = str;
        if (android.text.TextUtils.isEmpty(str)) {
            b();
        } else {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(str);
            if (Bi == null) {
                b();
                ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Di(str, new com.tencent.mm.plugin.sns.ui.qv(this));
            } else {
                setAttrNickname(Bi);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWeappUsername", "com.tencent.mm.plugin.sns.ui.SnsWeappView");
    }

    public SnsWeappView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167621d = com.tencent.mm.R.string.f490614a00;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.epm, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.voy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f167622e = (android.widget.TextView) findViewById;
    }

    public SnsWeappView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f167621d = com.tencent.mm.R.string.f490614a00;
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.epm, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.voy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f167622e = (android.widget.TextView) findViewById;
    }
}
