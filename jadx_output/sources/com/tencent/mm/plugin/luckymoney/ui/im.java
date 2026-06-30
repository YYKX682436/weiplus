package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes4.dex */
public class im implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147034d;

    public im(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI luckyMoneyPickEnvelopeUI, android.view.View view) {
        this.f147034d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f147034d;
        if (view.getHeight() != 0) {
            float height = view.getHeight() / 2;
            if (view != null) {
                view.setOutlineProvider(new zl5.a(true, true, height));
            }
            if (view == null) {
                return;
            }
            view.setClipToOutline(true);
            return;
        }
        float b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        if (view != null) {
            view.setOutlineProvider(new zl5.a(true, true, b17));
        }
        if (view == null) {
            return;
        }
        view.setClipToOutline(true);
    }
}
