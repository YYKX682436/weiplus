package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gm extends androidx.recyclerview.widget.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f146963d = sp5.c.a(4);

    /* renamed from: e, reason: collision with root package name */
    public final int f146964e = sp5.c.a(8);

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI f146965f;

    public gm(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI) {
        this.f146965f = luckyMoneyPickEnvelopeUI;
    }

    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var) {
        int ceil = (int) java.lang.Math.ceil(((java.util.ArrayList) this.f146965f.f146532t).size() / 3.0f);
        int u07 = recyclerView.u0(view);
        int ceil2 = (int) java.lang.Math.ceil((u07 + 1) / 3.0f);
        int i17 = this.f146963d;
        if (ceil2 == 0) {
            rect.top = i17 * 2;
            rect.bottom = i17 * 2;
        } else if (ceil2 == ceil) {
            rect.top = i17;
            rect.bottom = i17 * 2;
        } else {
            rect.top = i17;
            rect.bottom = i17;
        }
        int i18 = u07 % 3;
        int i19 = this.f146964e;
        if (i18 == 0) {
            rect.left = i19;
            rect.right = i19 / 3;
        } else if (i18 == 1) {
            rect.left = (i19 * 2) / 3;
            rect.right = (i19 * 2) / 3;
        } else {
            rect.left = i19 / 3;
            rect.right = i19;
        }
    }
}
