package gc3;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f270430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270431e;

    public j(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout, boolean z17) {
        this.f270431e = luckyMoneyVoiceLayout;
        this.f270430d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.jp jpVar = this.f270431e.f147605e;
        int i17 = jpVar.f147086k + 1;
        jpVar.f147086k = i17;
        jpVar.f147085j = i17 >= 4;
        if (!this.f270430d) {
            jpVar.f147088m = 3;
        }
        jpVar.invalidateSelf();
    }
}
