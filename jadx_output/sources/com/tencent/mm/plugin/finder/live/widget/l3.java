package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class l3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f118887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f118889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f118890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f118891h;

    public l3(r45.h32 h32Var, java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, android.widget.TextView textView) {
        this.f118887d = h32Var;
        this.f118888e = str;
        this.f118889f = finderObject;
        this.f118890g = b4Var;
        this.f118891h = textView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.nw1 liveInfo;
        if (menuItem.getItemId() == 4) {
            r45.h32 h32Var = this.f118887d;
            h32Var.set(1, 1);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327572g;
            java.lang.String str = this.f118888e;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f118889f;
            long j17 = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0);
            ml2.q1 q1Var = ml2.q1.f327812e;
            java.lang.String string = h32Var.getString(3);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = h32Var.getString(4);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("notice_type", 1);
            c50.c1.l9(c1Var, i5Var, str, j17, 0, "temp_30", null, null, null, null, string, null, string2, jSONObject.toString(), 0L, 0, null, 58848, null);
            java.lang.String str2 = this.f118888e;
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f118890g;
            r45.h32 h32Var2 = this.f118887d;
            com.tencent.mm.plugin.finder.live.widget.m3.a(str2, b4Var, h32Var2, this.f118891h, h32Var2, 2);
            com.tencent.mm.plugin.finder.live.widget.b4 b4Var2 = this.f118890g;
            db5.t7.i(b4Var2.f117820a.getContext(), b4Var2.f117820a.getContext().getString(com.tencent.mm.R.string.cn8), com.tencent.mm.R.raw.icons_filled_done);
        }
    }
}
