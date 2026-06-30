package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class s9 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f147414b;

    public s9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f147413a = luckyMoneyNewDetailUI;
        this.f147414b = e1Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 == 0) {
            int[] iArr = this.f147413a.L;
            if (iArr == null) {
                kotlin.jvm.internal.o.o("soundId");
                throw null;
            }
            if (i17 == iArr[0]) {
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
                return;
            }
            if (iArr == null) {
                kotlin.jvm.internal.o.o("soundId");
                throw null;
            }
            if (i17 != iArr[1] || this.f147414b.f145245q < 19000) {
                return;
            }
            soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
        }
    }
}
