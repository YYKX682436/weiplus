package com.tencent.mm.plugin.luckymoney.ui.voice;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0004B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceTransLayout;", "Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceInputLayout;", "", "getUseTime", "Lgc3/n;", "t", "Lgc3/n;", "getVoiceListener", "()Lgc3/n;", "setVoiceListener", "(Lgc3/n;)V", "voiceListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class LuckyMoneyVoiceTransLayout extends com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout {

    /* renamed from: q, reason: collision with root package name */
    public long f147617q;

    /* renamed from: r, reason: collision with root package name */
    public long f147618r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f147619s;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public gc3.n voiceListener;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View.OnTouchListener f147621u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f147622v;

    public LuckyMoneyVoiceTransLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        gc3.o oVar = new gc3.o(this);
        gc3.q qVar = new gc3.q(this);
        this.f147621u = qVar;
        gc3.p pVar = new gc3.p(this);
        this.f147622v = new com.tencent.mm.sdk.platformtools.b4(new gc3.r(this), true);
        setOnTouchListener(qVar);
        setOnLongClickListener(pVar);
        setVoiceDetectListener(oVar);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout
    public void e(boolean z17) {
    }

    /* renamed from: getUseTime, reason: from getter */
    public final long getF147618r() {
        return this.f147618r;
    }

    public final gc3.n getVoiceListener() {
        return this.voiceListener;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout
    public void i(int i17) {
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceInputLayout
    public void j() {
    }

    public void k(boolean z17) {
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f147617q = java.lang.System.currentTimeMillis();
        this.f147622v.c(5000L, 5000L);
    }

    public final void setVoiceListener(gc3.n nVar) {
        this.voiceListener = nVar;
    }

    public LuckyMoneyVoiceTransLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        gc3.o oVar = new gc3.o(this);
        gc3.q qVar = new gc3.q(this);
        this.f147621u = qVar;
        gc3.p pVar = new gc3.p(this);
        this.f147622v = new com.tencent.mm.sdk.platformtools.b4(new gc3.r(this), true);
        setOnTouchListener(qVar);
        setOnLongClickListener(pVar);
        setVoiceDetectListener(oVar);
    }
}
