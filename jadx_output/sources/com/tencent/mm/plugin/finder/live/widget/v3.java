package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f120029b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f120030c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f120031d;

    public v3(int i17, kotlin.jvm.internal.c0 c0Var, android.widget.TextView textView, com.tencent.mm.plugin.finder.live.widget.b4 b4Var) {
        this.f120028a = i17;
        this.f120029b = c0Var;
        this.f120030c = textView;
        this.f120031d = b4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            kotlin.jvm.internal.c0 c0Var = this.f120029b;
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f120031d;
            android.widget.TextView textView = this.f120030c;
            int i17 = this.f120028a;
            if (i17 == 1) {
                c0Var.f310112d = true;
                textView.setTextColor(b4Var.f117820a.getContext().getColor(com.tencent.mm.R.color.UN_BW_97));
                textView.setText(com.tencent.mm.R.string.nkl);
                textView.setBackgroundResource(com.tencent.mm.R.drawable.d3x);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nko));
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str = b4Var.f117821b.Y().f410646a;
                ml2.q1 q1Var = ml2.q1.f327812e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9((c50.c1) c17, i5Var, str, 0L, 0, "temp_30", null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                c0Var.f310112d = false;
                textView.setTextColor(b4Var.f117820a.getContext().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
                textView.setText(com.tencent.mm.R.string.nkj);
                textView.setBackgroundResource(com.tencent.mm.R.drawable.a_5);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context2, context2.getString(com.tencent.mm.R.string.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.i5 i5Var2 = ml2.i5.f327572g;
                java.lang.String str2 = b4Var.f117821b.Y().f410646a;
                ml2.q1 q1Var2 = ml2.q1.f327812e;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9((c50.c1) c18, i5Var2, str2, 0L, 0, "temp_30", null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
