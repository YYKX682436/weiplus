package pk2;

/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.n0 f355977d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(pk2.n0 n0Var) {
        super(1);
        this.f355977d = n0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.TextView textView;
        r45.nz6 vp6 = (r45.nz6) obj;
        kotlin.jvm.internal.o.g(vp6, "vp");
        pk2.n0 n0Var = this.f355977d;
        n0Var.getClass();
        int i17 = vp6.f381778d;
        dk2.ef efVar = dk2.ef.f233372a;
        dk2.ef.f233376c = i17;
        com.tencent.mars.xlog.Log.i(n0Var.f356023j, "onDefinitionSelected videoQualityLevel:" + i17);
        java.lang.String str = vp6.f381783i;
        if (str == null) {
            str = "";
        }
        if ((str.length() > 0) && (textView = n0Var.f356024k) != null) {
            textView.setText(str);
        }
        efVar.q0(vp6);
        efVar.U(vp6.f381778d);
        ml2.a5[] a5VarArr = ml2.a5.f327208d;
        int i18 = vp6.f381778d;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(ya.b.SOURCE, 2);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_MEDIA_RESOLUTION, i18);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.M2, jSONObject.toString(), null, 4, null);
        android.widget.TextView textView2 = n0Var.f356024k;
        android.content.Context context = textView2 != null ? textView2.getContext() : null;
        if (context != null) {
            db5.t7.h(context, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.egw));
        }
        return jz5.f0.f302826a;
    }
}
