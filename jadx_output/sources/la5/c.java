package la5;

/* loaded from: classes14.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public android.view.accessibility.AccessibilityManager f317603a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f317604b;

    /* renamed from: c, reason: collision with root package name */
    public android.speech.tts.TextToSpeech f317605c = null;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Vibrator f317606d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f317607e;

    /* renamed from: f, reason: collision with root package name */
    public long f317608f;

    public c(android.content.Context context) {
        this.f317604b = context;
        this.f317603a = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
    }

    public static final la5.c f() {
        return la5.b.f317600a;
    }

    public final void a(android.view.View view, int i17, java.lang.String str) {
        android.content.Context context;
        if (!g(true) || (context = this.f317604b) == null || view == null) {
            return;
        }
        int max = java.lang.Math.max(i17, 1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489667d, max, java.lang.Integer.valueOf(max)));
        if (arrayList.size() <= 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str2 = "";
        while (it.hasNext()) {
            str2 = str2 + ((java.lang.String) it.next()) + ",";
        }
        view.setContentDescription(str2);
    }

    public final void b(android.view.View view, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        android.content.Context context;
        if (!g(true) || (context = this.f317604b) == null || view == null || str == null || str2 == null || str3 == null) {
            return;
        }
        la5.d dVar = new la5.d();
        dVar.a(str);
        if (i17 > 0) {
            dVar.a(context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489668e, 1, java.lang.Integer.valueOf(i17)));
        }
        dVar.a(str2);
        dVar.a(str3);
        dVar.b(view);
    }

    public final void c(android.view.View view, android.widget.TextView textView, android.widget.TextView textView2, android.widget.TextView textView3, java.lang.String str, android.widget.TextView textView4, boolean z17, android.widget.TextView textView5, java.lang.String str2, java.lang.String str3, int i17) {
        android.content.Context context;
        if (!g(true) || (context = this.f317604b) == null || view == null || textView == null || textView2 == null || textView3 == null || textView5 == null) {
            return;
        }
        la5.d dVar = new la5.d();
        dVar.a(textView.getText().toString());
        dVar.a(str);
        if (textView4 != null && textView4.getText() != null) {
            dVar.a(textView4.getText().toString());
        }
        if (z17) {
            dVar.a(context.getString(com.tencent.mm.R.string.bkv));
        }
        if (i17 == 1) {
            dVar.a(context.getString(com.tencent.mm.R.string.bkt));
        } else if (i17 > 1) {
            dVar.a(context.getString(com.tencent.mm.R.string.bku));
        }
        if (textView3.getText() != null) {
            dVar.a(textView3.getText().toString());
        }
        if (textView2.getText() != null) {
            dVar.a(textView2.getText().toString());
        }
        if (textView5.getText() != null) {
            dVar.a(textView5.getText().toString());
        }
        if (str2 != null) {
            dVar.a(str2);
        }
        if (str3 != null) {
            dVar.a(str3);
        }
        dVar.b(view);
    }

    public final void d(android.view.View view, java.lang.String str, java.lang.String str2, int i17) {
        android.content.Context context;
        if (!g(true) || view == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || (context = this.f317604b) == null) {
            return;
        }
        la5.d dVar = new la5.d();
        dVar.a(str);
        int i18 = 0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                int P = com.tencent.mm.sdk.platformtools.t8.P(str2, 0);
                if (P > 0) {
                    i18 = P;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        if (i18 > 0) {
            dVar.a(context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489694a5, 1, java.lang.Integer.valueOf(i18)));
        }
        dVar.a(context.getResources().getQuantityString(com.tencent.mm.R.plurals.f489695a6, 5, 3, java.lang.Integer.valueOf(i17 + 1)));
        dVar.b(view);
    }

    public void e(android.view.View view) {
        if (view == null) {
            return;
        }
        try {
            java.lang.reflect.Method method = android.view.View.class.getMethod("clearAccessibilityFocus", new java.lang.Class[0]);
            method.setAccessible(true);
            method.invoke(view, new java.lang.Object[0]);
            java.lang.reflect.Method method2 = android.view.View.class.getMethod("requestAccessibilityFocus", new java.lang.Class[0]);
            method2.setAccessible(true);
            method2.invoke(view, new java.lang.Object[0]);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Accessibility.AccessibilityHelper", e17, "", new java.lang.Object[0]);
        }
        if (this.f317606d != null) {
            this.f317606d = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        }
        android.os.Vibrator vibrator = this.f317606d;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
    }

    public boolean g(boolean z17) {
        if (!z17 || android.os.SystemClock.uptimeMillis() - this.f317608f > 2000) {
            android.view.accessibility.AccessibilityManager accessibilityManager = this.f317603a;
            if (accessibilityManager == null) {
                if (accessibilityManager == null) {
                    this.f317603a = (android.view.accessibility.AccessibilityManager) this.f317604b.getSystemService("accessibility");
                }
                if (!(this.f317603a != null)) {
                    return false;
                }
            }
            this.f317607e = this.f317603a.isEnabled() && this.f317603a.isTouchExplorationEnabled();
            this.f317608f = android.os.SystemClock.uptimeMillis();
        }
        return this.f317607e;
    }

    public boolean h() {
        android.content.Context context = this.f317604b;
        return g(true) && (android.provider.Settings.Secure.getInt(context.getContentResolver(), "speak_password", 0) != 0 || ((android.media.AudioManager) context.getSystemService("audio")).isWiredHeadsetOn());
    }

    public void i(android.view.View view, java.lang.String str) {
        android.speech.tts.TextToSpeech textToSpeech = this.f317605c;
        if (textToSpeech == null) {
            this.f317605c = new android.speech.tts.TextToSpeech(this.f317604b, new la5.a(this, str));
        } else {
            textToSpeech.setLanguage(com.tencent.mm.sdk.platformtools.m2.j() ? java.util.Locale.CHINESE : java.util.Locale.ENGLISH);
            this.f317605c.speak(str, 0, null);
        }
        e(view);
    }
}
