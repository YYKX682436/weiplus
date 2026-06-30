package com.tencent.mm.plugin.luckymoney.ui.voice;

/* loaded from: classes12.dex */
public class LuckyMoneyVoiceLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f147604d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.luckymoney.ui.jp f147605e;

    /* renamed from: f, reason: collision with root package name */
    public tl.d f147606f;

    /* renamed from: g, reason: collision with root package name */
    public f25.m0 f147607g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f147608h;

    /* renamed from: i, reason: collision with root package name */
    public long f147609i;

    /* renamed from: m, reason: collision with root package name */
    public long f147610m;

    /* renamed from: n, reason: collision with root package name */
    public int f147611n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f147612o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.modelbase.e1 f147613p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View.OnTouchListener f147614q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f147615r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f147616s;

    public LuckyMoneyVoiceLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f147606f = null;
        this.f147608h = "";
        this.f147611n = 1;
        this.f147612o = new gc3.f(this);
        this.f147613p = new gc3.g(this);
        this.f147614q = new gc3.h(this);
        this.f147615r = new com.tencent.mm.sdk.platformtools.b4(new gc3.l(this), true);
        this.f147616s = new com.tencent.mm.sdk.platformtools.b4(new gc3.m(this), true);
        a(context);
    }

    public void a(android.content.Context context) {
        android.view.View findViewById = android.view.View.inflate(context, com.tencent.mm.R.layout.bv_, this).findViewById(com.tencent.mm.R.id.f487619p73);
        this.f147604d = findViewById;
        findViewById.setLayerType(1, null);
        com.tencent.mm.plugin.luckymoney.ui.jp jpVar = new com.tencent.mm.plugin.luckymoney.ui.jp(context);
        this.f147605e = jpVar;
        this.f147604d.setBackground(jpVar);
        this.f147604d.setEnabled(true);
        this.f147604d.setOnTouchListener(this.f147614q);
        this.f147604d.setOnLongClickListener(this.f147612o);
    }

    public final void b(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(runnable);
        } else {
            runnable.run();
        }
    }

    public long getUseTime() {
        return this.f147610m;
    }

    public LuckyMoneyVoiceLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f147606f = null;
        this.f147608h = "";
        this.f147611n = 1;
        this.f147612o = new gc3.f(this);
        this.f147613p = new gc3.g(this);
        this.f147614q = new gc3.h(this);
        this.f147615r = new com.tencent.mm.sdk.platformtools.b4(new gc3.l(this), true);
        this.f147616s = new com.tencent.mm.sdk.platformtools.b4(new gc3.m(this), true);
        a(context);
    }
}
