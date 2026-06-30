package com.tencent.mm.plugin.luckymoney.ui.voice;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u0002B%\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010%\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'B\u001d\b\u0016\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010(R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/voice/LuckyMoneyVoiceInputLayout;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Lgc3/a;", "d", "Lgc3/a;", "getVoiceDetectListener", "()Lgc3/a;", "setVoiceDetectListener", "(Lgc3/a;)V", "voiceDetectListener", "", "e", "Ljava/lang/String;", "getFilePath", "()Ljava/lang/String;", com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, "", "<set-?>", "g", "I", "getCurrentState", "()I", "setCurrentState", "(I)V", "currentState", "", "h", "Z", "getDisableTrans", "()Z", "setDisableTrans", "(Z)V", "disableTrans", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public abstract class LuckyMoneyVoiceInputLayout extends com.tencent.mm.view.x2c.X2CLinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public gc3.a voiceDetectListener;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String filePath;

    /* renamed from: f, reason: collision with root package name */
    public z21.e f147596f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int currentState;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean disableTrans;

    /* renamed from: i, reason: collision with root package name */
    public final int f147599i;

    /* renamed from: m, reason: collision with root package name */
    public final int f147600m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f147601n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f147602o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f147603p;

    public LuckyMoneyVoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.String f17 = com.tencent.mm.plugin.luckymoney.model.e5.f();
        kotlin.jvm.internal.o.f(f17, "getVoiceFilePath(...)");
        this.filePath = f17;
        this.currentState = 1;
        this.f147599i = 3000;
        this.f147600m = 10000;
        this.f147601n = new gc3.e(this);
        this.f147602o = new gc3.c(this);
        this.f147603p = new com.tencent.mm.sdk.platformtools.b4(new gc3.b(this), true);
    }

    public final void c() {
        int i17 = this.currentState;
        if (i17 == 1 || i17 != 2) {
            return;
        }
        this.currentState = 3;
        gc3.a aVar = this.voiceDetectListener;
        if (aVar != null) {
            ((gc3.o) aVar).a();
        }
        this.f147603p.d();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f147601n;
        n3Var.removeMessages(0);
        n3Var.sendEmptyMessageDelayed(0, this.f147599i);
        n3Var.sendEmptyMessageDelayed(1, this.f147600m);
        e(true);
        z21.e eVar = this.f147596f;
        if (eVar != null) {
            eVar.stop(true);
        }
    }

    public abstract void e(boolean z17);

    public final int getCurrentState() {
        return this.currentState;
    }

    public final boolean getDisableTrans() {
        return this.disableTrans;
    }

    public final java.lang.String getFilePath() {
        return this.filePath;
    }

    public final gc3.a getVoiceDetectListener() {
        return this.voiceDetectListener;
    }

    public abstract void i(int i17);

    public abstract void j();

    public final void setCurrentState(int i17) {
        this.currentState = i17;
    }

    public final void setDisableTrans(boolean z17) {
        this.disableTrans = z17;
    }

    public final void setVoiceDetectListener(gc3.a aVar) {
        this.voiceDetectListener = aVar;
    }

    public LuckyMoneyVoiceInputLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        java.lang.String f17 = com.tencent.mm.plugin.luckymoney.model.e5.f();
        kotlin.jvm.internal.o.f(f17, "getVoiceFilePath(...)");
        this.filePath = f17;
        this.currentState = 1;
        this.f147599i = 3000;
        this.f147600m = 10000;
        this.f147601n = new gc3.e(this);
        this.f147602o = new gc3.c(this);
        this.f147603p = new com.tencent.mm.sdk.platformtools.b4(new gc3.b(this), true);
    }
}
