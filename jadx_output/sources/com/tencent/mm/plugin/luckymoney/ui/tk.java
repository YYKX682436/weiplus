package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes.dex */
public final class tk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.vk f147467d;

    public tk(com.tencent.mm.plugin.luckymoney.ui.vk vkVar) {
        this.f147467d = vkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f147467d.f147560n;
        if (view == null) {
            kotlin.jvm.internal.o.o("containerView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationDefaultUIC$initUIC$2", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
