package gc3;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f270432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout f270433e;

    public k(com.tencent.mm.plugin.luckymoney.ui.voice.LuckyMoneyVoiceLayout luckyMoneyVoiceLayout, int i17) {
        this.f270433e = luckyMoneyVoiceLayout;
        this.f270432d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.jp jpVar = this.f270433e.f147605e;
        boolean z17 = false;
        if (this.f270432d < 28) {
            int i17 = jpVar.f147086k + 1;
            jpVar.f147086k = i17;
            if (i17 >= 4) {
                z17 = true;
            }
        } else {
            jpVar.f147086k = 0;
        }
        jpVar.f147085j = z17;
        jpVar.invalidateSelf();
    }
}
