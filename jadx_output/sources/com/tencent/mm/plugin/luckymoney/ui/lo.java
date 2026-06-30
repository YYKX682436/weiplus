package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class lo implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mo f147156e;

    public lo(android.view.View view, com.tencent.mm.plugin.luckymoney.ui.mo moVar) {
        this.f147155d = view;
        this.f147156e = moVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.tencent.mm.plugin.luckymoney.ui.mo moVar = this.f147156e;
        android.view.View view = this.f147155d;
        view.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.ko(moVar, view), 175L);
    }
}
