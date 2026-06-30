package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class SplashWelcomeView extends android.widget.FrameLayout implements com.tencent.mm.ui.chatting.ne {

    /* renamed from: d, reason: collision with root package name */
    public boolean f197091d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f197092e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f197093f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f197094g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f197095h;

    /* renamed from: i, reason: collision with root package name */
    public int f197096i;

    public SplashWelcomeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public final boolean a(android.content.SharedPreferences sharedPreferences) {
        this.f197096i = sharedPreferences.getInt("launch_fail_times", 0);
        int i17 = sharedPreferences.getInt("launch_last_status", 0);
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("SplashWelcomeView", "last launch status is 'start'.");
            this.f197096i++;
            sharedPreferences.edit().putInt("launch_fail_times", this.f197096i).commit();
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("SplashWelcomeView", "last launch status is 'end'.");
        }
        sharedPreferences.edit().putInt("launch_last_status", 1).apply();
        int i18 = this.f197096i;
        if (i18 < 3) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("SplashWelcomeView", "launch exceed max failed times, %d", java.lang.Integer.valueOf(i18));
        return false;
    }

    public final void b(android.content.Context context) {
        com.tencent.mm.ui.SplashImageView splashImageView = new com.tencent.mm.ui.SplashImageView(context);
        this.f197095h = splashImageView;
        splashImageView.setOnDrawListener(this);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0);
            try {
                boolean z17 = sharedPreferences.getBoolean("transit_to_switch_account", false);
                com.tencent.mars.xlog.Log.i("SplashWelcomeView", "transit to switch account %s", java.lang.Boolean.valueOf(z17));
                if (z17) {
                    java.lang.String str = com.tencent.mm.ui.p2.f209490a;
                    byte[] N = com.tencent.mm.vfs.w6.N(str, 0, (int) com.tencent.mm.vfs.w6.k(str));
                    com.tencent.mm.vfs.w6.h(str);
                    sharedPreferences.edit().putBoolean("transit_to_switch_account", false).commit();
                    if (N != null && N.length > 0) {
                        int length = N.length;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList.add(java.lang.Integer.valueOf(length));
                        arrayList.add(0);
                        arrayList.add(N);
                        java.lang.Object obj = new java.lang.Object();
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/SplashWelcomeView", "initSrc", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                        yj0.a.e(obj, decodeByteArray, "com/tencent/mm/ui/SplashWelcomeView", "initSrc", "(Landroid/content/Context;)V", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                        if (decodeByteArray != null) {
                            this.f197095h.setImageBitmap(decodeByteArray);
                            fp.m.e();
                            ((android.app.Activity) getContext()).getWindow().setStatusBarColor(-1);
                        } else {
                            com.tencent.mars.xlog.Log.e("SplashWelcomeView", "get switch account bg null!");
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("SplashWelcomeView", e17, "show switch account view with exception!", new java.lang.Object[0]);
            }
        }
        addView(this.f197095h, layoutParams);
        try {
            if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                com.tencent.mars.xlog.Log.i("SplashWelcomeView", "not main process, only load default splash bitmap.");
                return;
            }
            android.content.SharedPreferences sharedPreferences2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("system_config_prefs", 0);
            long j17 = sharedPreferences2.getLong("new_launch_image_begin_time", 0L);
            long j18 = sharedPreferences2.getLong("new_launch_image_end_time", 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
            com.tencent.mars.xlog.Log.i("SplashWelcomeView", "beginTime:%s,endTime:%s,currentTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(currentTimeMillis));
            java.lang.String str2 = lp0.b.e() + "splashWelcomeImg";
            if (currentTimeMillis <= j17 || currentTimeMillis >= j18) {
                com.tencent.mars.xlog.Log.i("SplashWelcomeView", "change launch image activity is finished!");
                com.tencent.mm.vfs.w6.h(str2);
            } else if (a(sharedPreferences2)) {
                s75.d.b(new com.tencent.mm.ui.bj(this, str2), "readWelcomeBg");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("SplashWelcomeView", e18, "%s", e18.getMessage());
        }
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("SplashWelcomeView", "hasDrawed:%s", java.lang.Boolean.valueOf(this.f197091d));
        if (this.f197091d) {
            return;
        }
        this.f197091d = true;
        if (!this.f197093f || this.f197092e) {
            return;
        }
        d();
    }

    public final synchronized void d() {
        if (!this.f197092e) {
            this.f197092e = true;
            if (this.f197094g != null) {
                try {
                    com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.dj(this));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("SplashWelcomeView", e17, "%s", e17.getMessage());
                }
            }
        }
    }

    public SplashWelcomeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
