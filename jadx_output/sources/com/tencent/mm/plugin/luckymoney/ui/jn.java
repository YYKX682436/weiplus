package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes3.dex */
public class jn implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.co f147074d;

    public jn(com.tencent.mm.plugin.luckymoney.ui.co coVar) {
        this.f147074d = coVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.co coVar = this.f147074d;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) coVar.f146818q.getLayoutParams();
        layoutParams.width = coVar.f146810f.getWidth();
        layoutParams.height = coVar.f146810f.getHeight();
        coVar.f146818q.setLayoutParams(layoutParams);
    }
}
