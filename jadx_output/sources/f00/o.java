package f00;

/* loaded from: classes.dex */
public final class o implements com.tencent.mm.plugin.appbrand.widget.d0 {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f258320a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f258321b = "";

    /* renamed from: c, reason: collision with root package name */
    public boolean f258322c;

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public int a() {
        return com.tencent.mm.R.id.g2j;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public void b(android.content.Context context, java.lang.String data, yz5.l onWidgetCreated) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(onWidgetCreated, "onWidgetCreated");
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.d0
    public android.widget.RelativeLayout.LayoutParams c() {
        android.content.Context context;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        android.view.View view = this.f258320a;
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
        this.f258321b = data;
        boolean z17 = true;
        if (data.length() > 0) {
            try {
                com.tencent.mars.xlog.Log.i("EcsProductWxaCoverWidget", "createWidget data:".concat(data));
                org.json.JSONObject jSONObject = new org.json.JSONObject(data);
                java.lang.String optString = jSONObject.optString("finderUsername");
                if (jSONObject.has("showLiving")) {
                    this.f258322c = jSONObject.optBoolean("showLiving");
                } else {
                    kotlin.jvm.internal.o.d(optString);
                    if (optString.length() <= 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCString(data), f00.j.class, new f00.l(this));
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("EcsProductWxaCoverWidget", "createWidget error:" + th6);
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e4i, (android.view.ViewGroup) null);
        this.f258320a = inflate;
        if (inflate != null) {
            inflate.setOnClickListener(new f00.n(this));
        }
        inflate.setTag("isAsyncEcsProductFinderWidget");
        int i17 = this.f258322c ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget", "genWidget", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/feature/ecs/card/view/EcsProductWxaCoverWidget", "genWidget", "(Landroid/content/Context;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return inflate;
    }
}
