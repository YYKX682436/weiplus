package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class ck implements com.tencent.mm.plugin.appbrand.widget.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f131782a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f131783b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f131784c = "";

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public int a() {
        return com.tencent.mm.R.id.g2j;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onWidgetCreated, "onWidgetCreated");
        com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(data), com.tencent.mm.plugin.finder.view.yj.class, new com.tencent.mm.plugin.finder.view.zj(this, onWidgetCreated, context), null);
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.View view = this.f131782a;
        if (view == null || (context = view.getContext()) == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        layoutParams.topMargin = i65.a.b(context, 12);
        return layoutParams;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.view.View d(android.content.Context context, java.lang.String data) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f131783b = data;
        try {
            com.tencent.mars.xlog.Log.i("Finder.FinderShareProductWxaCoverWidget", "createWidget data:".concat(data));
            org.json.JSONObject jSONObject = new org.json.JSONObject(data);
            java.lang.String string = jSONObject.getString("feedId");
            kotlin.jvm.internal.o.f(string, "getString(...)");
            this.f131784c = string;
            kotlin.jvm.internal.o.f(jSONObject.getString("nonceId"), "getString(...)");
        } catch (java.lang.Throwable unused) {
        }
        return e(context);
    }

    public final android.view.View e(android.content.Context context) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489095dk, (android.view.ViewGroup) null);
        this.f131782a = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new com.tencent.mm.plugin.finder.view.bk(this));
        }
        inflate.setTag("isFinderWidget");
        return inflate;
    }
}
