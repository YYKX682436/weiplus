package q53;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.plugin.game.luggage.page.u {
    public static final /* synthetic */ int D1 = 0;
    public boolean A1;
    public java.lang.String B1;
    public final com.tencent.mm.sdk.event.IListener C1;
    public final com.tencent.mm.plugin.game.luggage.page.x0 V;
    public final android.os.Bundle W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f360194l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.ImageView f360195p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f360196p1;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f360197x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f360198x1;

    /* renamed from: y0, reason: collision with root package name */
    public final java.util.ArrayList f360199y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f360200y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f360201z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.game.luggage.page.x0 page, android.os.Bundle params) {
        super(page);
        kotlin.jvm.internal.o.g(page, "page");
        kotlin.jvm.internal.o.g(params, "params");
        this.V = page;
        this.W = params;
        this.f360199y0 = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.C1 = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar$getUnreadGameMsgListener$1
            {
                this.__eventId = 98332773;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent getUnreadGameMsgCountEvent) {
                com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent event = getUnreadGameMsgCountEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ug ugVar = event.f54419g;
                int i17 = ugVar.f8080a;
                int i18 = ugVar.f8082c;
                int i19 = ugVar.f8081b;
                boolean z17 = ugVar.f8083d;
                ((ku5.t0) ku5.t0.f312615d).B(new q53.b(q53.f.this, i17, i19, i18, z17));
                return false;
            }
        };
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.u, com.tencent.mm.plugin.webview.luggage.y1
    public void d() {
        super.d();
        this.C1.dead();
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.u, com.tencent.mm.plugin.webview.luggage.y1
    public void e(boolean z17) {
        super.e(z17);
        for (android.widget.ImageView imageView : this.f360199y0) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                com.tencent.mm.ui.uk.f(drawable, z17 ? b3.l.getColor(getContext(), com.tencent.mm.R.color.aaz) : b3.l.getColor(getContext(), com.tencent.mm.R.color.f478716f7));
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final com.tencent.mm.sdk.event.IListener<?> getGetUnreadGameMsgListener() {
        return this.C1;
    }

    public final com.tencent.mm.plugin.game.luggage.page.x0 getPage() {
        return this.V;
    }

    public final android.os.Bundle getParams() {
        return this.W;
    }

    public final void m(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(getContext(), i17);
        if (drawable != null) {
            com.tencent.mm.ui.uk.f(drawable, b3.l.getColor(getContext(), com.tencent.mm.R.color.f478714f5));
            imageView.setImageDrawable(drawable);
        }
    }

    public final long n(android.net.Uri uri, java.lang.String str) {
        try {
            return java.lang.Long.parseLong(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException unused) {
            com.tencent.mars.xlog.Log.e("GameWebSettingActionBar", "gamelog parse long error key = " + str + " uri = " + uri);
            return 0L;
        }
    }

    public final void o(boolean z17, java.lang.String str) {
        if (str == null) {
            str = this.W.getString("game_tab_key");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isred", this.f360198x1 ? "1" : "2");
        hashMap.put("TotalNum", java.lang.String.valueOf(this.f360200y1));
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, java.lang.String.valueOf(str));
        android.content.Context context = getContext();
        int i17 = z17 ? 6 : 1;
        com.tencent.mm.game.report.l.c(context, 37, 3701, z17 ? 1 : 0, i17, this.f360196p1, com.tencent.mm.game.report.l.b(hashMap));
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.u, com.tencent.mm.plugin.webview.luggage.y1, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255);
        java.util.Iterator it = this.f360199y0.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setImageAlpha(i17);
        }
    }
}
