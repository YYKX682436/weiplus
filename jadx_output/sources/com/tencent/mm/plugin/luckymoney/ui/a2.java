package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class a2 implements android.media.SoundPool.OnLoadCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.e1 f146689a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f146690b;

    public a2(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI, com.tencent.mm.plugin.luckymoney.model.e1 e1Var) {
        this.f146690b = luckyMoneyDetailUI;
        this.f146689a = e1Var;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public void onLoadComplete(android.media.SoundPool soundPool, int i17, int i18) {
        if (i18 == 0) {
            int[] iArr = this.f146690b.L;
            if (i17 == iArr[0]) {
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
            } else {
                if (i17 != iArr[1] || this.f146689a.f145245q < 19000) {
                    return;
                }
                soundPool.play(i17, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
    }
}
