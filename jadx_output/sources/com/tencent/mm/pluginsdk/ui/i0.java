package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f190866a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f190867b;

    /* renamed from: c, reason: collision with root package name */
    public final int f190868c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f190869d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f190870e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f190871f;

    /* renamed from: g, reason: collision with root package name */
    public final int f190872g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f190873h;

    public i0(java.lang.String str, android.content.Context context) {
        this.f190866a = -7829368;
        this.f190867b = false;
        this.f190868c = -1593835521;
        this.f190869d = false;
        this.f190870e = false;
        this.f190871f = false;
        this.f190872g = 0;
        this.f190873h = false;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "chatbg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed, values is null");
            return;
        }
        try {
            com.tencent.mm.sdk.platformtools.t8.q1(java.lang.Integer.valueOf((java.lang.String) d17.get(".chatbg.$version")));
            if (((java.lang.String) d17.get(".chatbg.$time_color")) == null) {
                return;
            }
            this.f190866a = (int) com.tencent.mm.sdk.platformtools.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$time_color"), 16)), context.getResources().getColor(com.tencent.mm.R.color.FG_2));
            this.f190867b = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_show_shadow_color")));
            this.f190868c = (int) com.tencent.mm.sdk.platformtools.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$time_shadow_color"), 16)), 0L);
            this.f190869d = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_show_background")));
            this.f190870e = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_light_background")));
            com.tencent.mm.sdk.platformtools.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$voice_second_color"), 16)), -16777216L);
            this.f190871f = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$voice_second_show_shadow_color")));
            this.f190872g = (int) com.tencent.mm.sdk.platformtools.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$voice_second_shadow_color"), 16)), 0L);
            this.f190873h = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$voice_second_show_background")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBgAttr", e17, "", new java.lang.Object[0]);
        }
    }
}
