package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class ko implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mo f147117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f147118e;

    public ko(com.tencent.mm.plugin.luckymoney.ui.mo moVar, android.view.View view) {
        this.f147117d = moVar;
        this.f147118e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.mo moVar = this.f147117d;
        if (moVar.isShowing()) {
            this.f147118e.getLocationInWindow(moVar.f147208k);
            int[] iArr = moVar.f147208k;
            moVar.f147204g = iArr[0];
            int i17 = iArr[1];
            android.widget.FrameLayout frameLayout = moVar.f147199b;
            kotlin.jvm.internal.o.d(frameLayout);
            moVar.f147205h = (i17 - frameLayout.getMeasuredHeight()) + com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479738dv);
            int i18 = moVar.f147205h - moVar.f147206i;
            if (java.lang.Math.abs(i18) > 100) {
                com.tencent.mars.xlog.Log.i(moVar.f147198a, "update location  yDiff:%s", java.lang.Integer.valueOf(i18));
                int i19 = moVar.f147204g;
                moVar.update(i19 >= 100 ? i19 : 0, moVar.f147205h, -1, -1);
            }
            moVar.f147206i = moVar.f147205h;
        }
    }
}
