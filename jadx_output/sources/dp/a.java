package dp;

/* loaded from: classes15.dex */
public class a extends android.widget.Toast {

    /* renamed from: h, reason: collision with root package name */
    public static java.util.concurrent.atomic.AtomicBoolean f242091h;

    /* renamed from: i, reason: collision with root package name */
    public static final dp.e f242092i = new dp.a$$a();

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f242093a;

    /* renamed from: b, reason: collision with root package name */
    public int f242094b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.CharSequence f242095c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f242096d;

    /* renamed from: e, reason: collision with root package name */
    public dp.d f242097e;

    /* renamed from: f, reason: collision with root package name */
    public dp.c f242098f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.Toast f242099g;

    public a(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        super(context);
        android.content.Context applicationContext = context.getApplicationContext();
        this.f242093a = applicationContext;
        this.f242095c = charSequence;
        this.f242094b = i17;
        this.f242099g = android.widget.Toast.makeText(applicationContext, charSequence, i17);
    }

    public static android.widget.Toast makeText(android.content.Context context, int i17, int i18) {
        return makeText(context, context.getResources().getText(i17), i18);
    }

    @Override // android.widget.Toast
    public void cancel() {
        try {
            this.f242099g.cancel();
        } catch (java.lang.Throwable th6) {
            th6.getMessage();
        }
    }

    @Override // android.widget.Toast
    public void setDuration(int i17) {
        this.f242094b = i17;
        this.f242099g.setDuration(i17);
        super.setDuration(i17);
    }

    @Override // android.widget.Toast
    public void setGravity(int i17, int i18, int i19) {
        if (this.f242097e == null) {
            this.f242097e = new dp.d(null);
        }
        dp.d dVar = this.f242097e;
        dVar.f242103a = i17;
        dVar.f242104b = i18;
        dVar.f242105c = i19;
        this.f242099g.setGravity(i17, i18, i19);
        super.setGravity(i17, i18, i19);
    }

    @Override // android.widget.Toast
    public void setMargin(float f17, float f18) {
        if (this.f242098f == null) {
            this.f242098f = new dp.c(null);
        }
        dp.c cVar = this.f242098f;
        cVar.f242102b = f17;
        cVar.f242101a = f18;
        this.f242099g.setMargin(f17, f18);
        super.setMargin(f17, f18);
    }

    @Override // android.widget.Toast
    public void setText(java.lang.CharSequence charSequence) {
        this.f242095c = charSequence;
        this.f242099g.setText(charSequence);
        try {
            super.setText(charSequence);
        } catch (java.lang.RuntimeException unused) {
            android.widget.TextView textView = new android.widget.TextView(this.f242093a);
            textView.setText(charSequence);
            super.setView(textView);
        }
    }

    @Override // android.widget.Toast
    public void setView(android.view.View view) {
        this.f242096d = view;
        this.f242099g.setView(view);
        super.setView(view);
    }

    @Override // android.widget.Toast
    public void show() {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: dp.a$$b
            @Override // java.lang.Runnable
            public final void run() {
                dp.a aVar = dp.a.this;
                aVar.getClass();
                try {
                    aVar.f242099g.show();
                } catch (java.lang.Throwable th6) {
                    th6.getMessage();
                    try {
                        ((dp.a$$a) dp.a.f242092i).a(aVar.f242093a, aVar.f242095c, aVar.f242096d, aVar.f242097e, aVar.f242098f, aVar.f242094b);
                    } catch (java.lang.Throwable th7) {
                        th7.getMessage();
                    }
                }
            }
        };
        if (android.os.Looper.myLooper() == null) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(runnable);
        } else {
            runnable.run();
        }
    }

    public static android.widget.Toast makeText(android.content.Context context, java.lang.CharSequence charSequence, int i17) {
        boolean z17;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = f242091h;
        if (atomicBoolean != null) {
            z17 = atomicBoolean.get();
        } else {
            if (android.os.Build.VERSION.SDK_INT >= 30 && context.getApplicationInfo().targetSdkVersion >= 30) {
                if (java.util.Arrays.asList("vivo").contains(java.lang.String.valueOf(android.os.Build.MANUFACTURER).toLowerCase())) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = new java.util.concurrent.atomic.AtomicBoolean(false);
                    f242091h = atomicBoolean2;
                    z17 = atomicBoolean2.get();
                }
            }
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean3 = new java.util.concurrent.atomic.AtomicBoolean(true);
            f242091h = atomicBoolean3;
            z17 = atomicBoolean3.get();
        }
        if (z17) {
            return android.widget.Toast.makeText(context.getApplicationContext(), charSequence, i17);
        }
        return new dp.a(context, charSequence, i17);
    }

    @Override // android.widget.Toast
    public void setText(int i17) {
        setText(this.f242093a.getText(i17));
    }
}
