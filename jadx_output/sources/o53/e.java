package o53;

/* loaded from: classes8.dex */
public final class e extends com.tencent.mm.plugin.game.luggage.liteapp.ui.d {
    public final android.content.Context E;
    public final android.os.Bundle F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public final java.util.ArrayList I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f343119J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public boolean P;
    public java.lang.String Q;
    public final com.tencent.mm.sdk.event.IListener R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context mcontext, android.os.Bundle params) {
        super(mcontext, params);
        kotlin.jvm.internal.o.g(mcontext, "mcontext");
        kotlin.jvm.internal.o.g(params, "params");
        this.E = mcontext;
        this.F = params;
        this.I = new java.util.ArrayList();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.R = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.GetUnreadGameMsgCountEvent>(a0Var) { // from class: com.tencent.mm.plugin.game.ui.liteapp.GameLiteSettingActionBar$getUnreadGameMsgListener$1
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
                ((ku5.t0) ku5.t0.f312615d).B(new o53.a(o53.e.this, i17, i19, i18, z17));
                return false;
            }
        };
    }

    public static final void c(o53.e eVar, int i17, int i18, int i19, boolean z17) {
        android.widget.ImageView imageView;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("GameLiteSettingActionBar", "get chat unread count: %d,  notifyUnreadCount:%d,gameLifeUnreadCount:%d, hasChatRoomUnreadMsg:%b", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Boolean.valueOf(z17));
        int i27 = i17 + i19;
        boolean z18 = i27 + i18 > 0 || z17;
        if (z18) {
            android.widget.TextView textView = eVar.H;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = eVar.G;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (i27 > 0) {
                android.widget.ImageView imageView3 = eVar.G;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                android.widget.TextView textView2 = eVar.H;
                if (textView2 != null) {
                    if (i27 >= 100) {
                        textView2.setText("99+");
                        textView2.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(eVar.getContext(), i27));
                        textView2.setTextSize(0, i65.a.f(eVar.getContext(), com.tencent.mm.R.dimen.f479637bc) * i65.a.m(eVar.getContext()));
                        textView2.setVisibility(0);
                    } else {
                        textView2.setText(java.lang.String.valueOf(i27));
                        textView2.setBackgroundResource(com.tencent.mm.ui.tools.pd.b(eVar.getContext(), i27));
                        textView2.setTextSize(0, i65.a.f(eVar.getContext(), com.tencent.mm.R.dimen.f479637bc) * i65.a.m(eVar.getContext()));
                        textView2.setVisibility(0);
                    }
                }
            } else {
                android.widget.TextView textView3 = eVar.H;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if ((z18 || i18 > 0) && (imageView = eVar.G) != null) {
                    imageView.setVisibility(0);
                }
            }
        } else {
            android.widget.TextView textView4 = eVar.H;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.ImageView imageView4 = eVar.G;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        if (eVar.P) {
            return;
        }
        eVar.L = z18;
        eVar.M = i17 + i18 + i19;
        eVar.P = true;
        if (!eVar.N || eVar.f343119J) {
            return;
        }
        eVar.f343119J = true;
        eVar.f(false, eVar.Q);
    }

    @Override // com.tencent.mm.plugin.game.luggage.liteapp.ui.e
    public void a(boolean z17) {
        android.widget.ImageView imageView = this.f139826n;
        android.widget.ImageView imageView2 = this.f139823h;
        android.widget.TextView textView = this.f139824i;
        if (z17) {
            textView.setTextColor(-1);
            imageView2.postDelayed(new com.tencent.mm.plugin.game.luggage.liteapp.ui.j(this), 100L);
            if (!this.f139830r) {
                imageView.setImageResource(com.tencent.mm.R.raw.actionbar_icon_light_more);
            }
        } else {
            textView.setTextColor(-16777216);
            imageView2.postDelayed(new com.tencent.mm.plugin.game.luggage.liteapp.ui.i(this), 100L);
            if (!this.f139830r) {
                imageView.setImageResource(com.tencent.mm.R.raw.actionbar_icon_dark_more);
            }
        }
        com.tencent.mm.plugin.webview.luggage.DownloadProgressImageView downloadProgressImageView = this.f139818z;
        if (downloadProgressImageView != null) {
            downloadProgressImageView.setDarkMode(z17);
        }
        for (android.widget.ImageView imageView3 : this.I) {
            android.graphics.drawable.Drawable drawable = imageView3.getDrawable();
            if (drawable != null) {
                com.tencent.mm.ui.uk.f(drawable, z17 ? b3.l.getColor(getContext(), com.tencent.mm.R.color.aaz) : b3.l.getColor(getContext(), com.tencent.mm.R.color.f478716f7));
                imageView3.setImageDrawable(drawable);
            }
        }
    }

    public final void d(android.widget.ImageView imageView, int i17) {
        android.graphics.drawable.Drawable drawable = b3.l.getDrawable(getContext(), i17);
        if (drawable != null) {
            com.tencent.mm.ui.uk.f(drawable, b3.l.getColor(getContext(), com.tencent.mm.R.color.f478714f5));
            imageView.setImageDrawable(drawable);
        }
    }

    public final long e(android.net.Uri uri, java.lang.String str) {
        try {
            return java.lang.Long.parseLong(uri.getQueryParameter(str));
        } catch (java.lang.NumberFormatException unused) {
            com.tencent.mars.xlog.Log.e("GameLiteSettingActionBar", "gamelog parse long error key = " + str + " uri = " + uri);
            return 0L;
        }
    }

    public final void f(boolean z17, java.lang.String str) {
        if (str == null) {
            str = this.F.getString("game_tab_key");
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("isred", this.L ? "1" : "2");
        hashMap.put("TotalNum", java.lang.String.valueOf(this.M));
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE, java.lang.String.valueOf(str));
        android.content.Context context = getContext();
        int i17 = z17 ? 6 : 1;
        com.tencent.mm.game.report.l.c(context, 37, 3701, z17 ? 1 : 0, i17, this.K, com.tencent.mm.game.report.l.b(hashMap));
    }

    public final com.tencent.mm.sdk.event.IListener<?> getGetUnreadGameMsgListener() {
        return this.R;
    }

    public final android.content.Context getMcontext() {
        return this.E;
    }

    public final android.os.Bundle getParams() {
        return this.F;
    }

    @Override // com.tencent.mm.plugin.game.luggage.liteapp.ui.d, com.tencent.mm.plugin.game.luggage.liteapp.ui.e, android.view.View
    public void setAlpha(float f17) {
        super.setAlpha(f17);
        if (f17 == 0.0f) {
            f17 = 1.0f;
        }
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        int i17 = (int) (f17 * 255);
        java.util.Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setImageAlpha(i17);
        }
    }
}
