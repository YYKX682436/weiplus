package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public abstract class ip {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f147036a;

    public ip(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f147036a = mMActivity;
        android.view.Window window = mMActivity.getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.getStatusBarColor();
    }
}
