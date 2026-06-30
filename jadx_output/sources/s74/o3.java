package s74;

/* loaded from: classes4.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.f3 f404466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f404467e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f404468f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f404469g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f404470h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s74.j3 f404471i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(s74.f3 f3Var, org.json.JSONObject jSONObject, boolean z17, android.content.Context context, boolean z18, s74.j3 j3Var) {
        super(1);
        this.f404466d = f3Var;
        this.f404467e = jSONObject;
        this.f404468f = z17;
        this.f404469g = context;
        this.f404470h = z18;
        this.f404471i = j3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        org.json.JSONObject it = (org.json.JSONObject) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        kotlin.jvm.internal.o.g(it, "it");
        s74.f3 f3Var = this.f404466d;
        f3Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getObj2ParentMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        java.util.Map map = f3Var.f404283q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getObj2ParentMap", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
        org.json.JSONObject jSONObject = this.f404467e;
        map.put(it, jSONObject);
        f3Var.l(jSONObject);
        f3Var.l(it);
        boolean z17 = this.f404468f || kotlin.jvm.internal.o.b(it.optString(dm.i4.COL_ID), "mainElementContainer");
        s74.u3 u3Var = s74.u3.f404562a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        s74.j3 f17 = u3Var.f(f3Var, it, this.f404469g, z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$createFlexViewInternal", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory");
        if (f17 != null) {
            if (this.f404470h && !z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                java.util.List list = f3Var.f404287u;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOtherAlphaAnimViews", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$DynamicViewContext");
                ((java.util.ArrayList) list).add(f17.c());
            }
            if (!kotlin.jvm.internal.o.b(it.optString("position"), "absolute")) {
                s74.j3 j3Var = this.f404471i;
                android.view.View c17 = j3Var.c();
                android.view.ViewGroup viewGroup = c17 instanceof android.view.ViewGroup ? (android.view.ViewGroup) c17 : null;
                if (viewGroup == null) {
                    com.tencent.mars.xlog.Log.e("DynamicView.Factory", "parentView is null!  " + j3Var.b());
                }
                s74.g3 b17 = f17.b();
                b17.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toFlexBoxLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$LayoutParamsInfo");
                com.google.android.flexbox.FlexboxLayout.LayoutParams layoutParams = new com.google.android.flexbox.FlexboxLayout.LayoutParams(b17.f404308k, b17.f404309l);
                layoutParams.f44189d = b17.f404310m;
                layoutParams.f44190e = b17.f404311n;
                layoutParams.f44191f = b17.f404312o;
                layoutParams.f44192g = -1;
                layoutParams.f44193h = b17.f404313p;
                layoutParams.f44195m = b17.f404315r;
                layoutParams.f44194i = b17.f404314q;
                layoutParams.f44197o = b17.f404317t;
                layoutParams.f44196n = b17.f404316s;
                layoutParams.f44198p = false;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = b17.f404301d;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin = b17.f404300c;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = b17.f404299b;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = b17.f404298a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toFlexBoxLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$LayoutParamsInfo");
                if (viewGroup != null) {
                    viewGroup.addView(f17.c(), layoutParams);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicViewFactory$createFlexViewInternal$1");
        return f0Var;
    }
}
