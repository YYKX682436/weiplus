package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes16.dex */
public final class ks implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c00.u3 f204372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ms f204375i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204376m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204377n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f204378o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204379p;

    public ks(java.lang.String str, java.lang.String str2, c00.u3 u3Var, com.tencent.mm.storage.f9 f9Var, java.lang.String str3, com.tencent.mm.ui.chatting.viewitems.ms msVar, java.lang.String str4, java.lang.String str5, java.util.Map map, java.lang.String str6) {
        this.f204370d = str;
        this.f204371e = str2;
        this.f204372f = u3Var;
        this.f204373g = f9Var;
        this.f204374h = str3;
        this.f204375i = msVar;
        this.f204376m = str4;
        this.f204377n = str5;
        this.f204378o = map;
        this.f204379p = str6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/EcsKfProductCardWholeController$inflateButtonItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("button click: word=");
        sb6.append(this.f204370d);
        sb6.append(", viewId=");
        java.lang.String str = this.f204371e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardWholeCtrl", sb6.toString());
        ((b00.a0) this.f204372f).aj("view_clk", this.f204373g, str);
        java.lang.String ecsJumpInfoBase64 = this.f204374h;
        boolean z17 = ecsJumpInfoBase64 == null || ecsJumpInfoBase64.length() == 0;
        com.tencent.mm.ui.chatting.viewitems.ms msVar = this.f204375i;
        if (z17) {
            java.lang.String url = this.f204377n;
            if (!(url == null || url.length() == 0)) {
                kotlin.jvm.internal.o.f(url, "$url");
                msVar.getClass();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.String str2 = this.f204379p;
                sb7.append(str2);
                sb7.append(".weapp_username");
                java.lang.String sb8 = sb7.toString();
                java.util.Map map = this.f204378o;
                java.lang.String str3 = (java.lang.String) map.get(sb8);
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                boolean z19 = str3.length() == 0;
                android.content.Context context = msVar.f204602a;
                if (z19) {
                    try {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", url);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardWholeCtrl", e17, "jumpByUrl error", new java.lang.Object[0]);
                    }
                } else {
                    try {
                        java.lang.String str5 = (java.lang.String) map.get(str2 + ".weapp_path");
                        if (str5 != null) {
                            str4 = str5;
                        }
                        android.content.Intent intent2 = new android.content.Intent();
                        intent2.putExtra("rawUrl", "weixin://dl/business/?appid=" + str3 + "&path=" + str4);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent2, null);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsKfProductCardWholeCtrl", e18, "jumpByUrl weapp error", new java.lang.Object[0]);
                    }
                }
            }
        } else {
            kotlin.jvm.internal.o.f(ecsJumpInfoBase64, "$ecsJumpInfoBase64");
            msVar.b(ecsJumpInfoBase64, this.f204376m);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/EcsKfProductCardWholeController$inflateButtonItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
