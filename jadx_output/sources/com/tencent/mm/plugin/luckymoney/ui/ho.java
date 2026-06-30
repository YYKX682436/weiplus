package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class ho implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.jo f147005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.mo f147006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f147007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f147008g;

    public ho(com.tencent.mm.plugin.luckymoney.ui.jo joVar, com.tencent.mm.plugin.luckymoney.ui.mo moVar, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f147005d = joVar;
        this.f147006e = moVar;
        this.f147007f = textView;
        this.f147008g = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.jo joVar = this.f147005d;
        if (joVar.getContext().isFinishing() || joVar.getContext().isDestroyed()) {
            return;
        }
        android.widget.TextView actionOptionTv = this.f147007f;
        kotlin.jvm.internal.o.f(actionOptionTv, "$actionOptionTv");
        com.tencent.mm.plugin.luckymoney.ui.mo moVar = this.f147006e;
        moVar.getClass();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        moVar.f147209l = actionOptionTv;
        if (moVar.getBackground() == null) {
            moVar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        }
        android.view.View contentView = moVar.getContentView();
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = layoutParams.leftMargin;
        layoutParams2.rightMargin = layoutParams.rightMargin;
        layoutParams2.topMargin = layoutParams.topMargin;
        layoutParams2.bottomMargin = layoutParams.bottomMargin;
        contentView.setLayoutParams(layoutParams2);
        com.tencent.mm.ui.bk.t();
        int i17 = com.tencent.mm.ui.bk.t().heightPixels;
        int[] iArr = new int[2];
        actionOptionTv.getLocationInWindow(iArr);
        moVar.setWidth(-2);
        moVar.setHeight(-2);
        moVar.f147202e = iArr[0] + actionOptionTv.getWidth();
        moVar.f147203f = (i17 - iArr[1]) - actionOptionTv.getHeight();
        android.widget.FrameLayout frameLayout = moVar.f147199b;
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(moVar.f147202e, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)), android.view.View.MeasureSpec.makeMeasureSpec(moVar.f147203f, android.view.View.MeasureSpec.getMode(Integer.MIN_VALUE)));
        moVar.setWidth(java.lang.Math.min(frameLayout.getMeasuredWidth(), moVar.f147202e));
        moVar.setHeight(java.lang.Math.min(frameLayout.getMeasuredHeight(), moVar.f147203f));
        frameLayout.getMeasuredWidth();
        frameLayout.getMeasuredHeight();
        actionOptionTv.getLocationInWindow(new int[2]);
        moVar.f147200c = 0;
        moVar.f147201d = 0;
        moVar.f147200c = ((-(frameLayout.getMeasuredWidth() - actionOptionTv.getWidth())) / 2) + (actionOptionTv.getWidth() / 2);
        com.tencent.mars.xlog.Log.i(moVar.f147198a, "[computePosition] x: " + moVar.f147200c + ",anchor.width: " + actionOptionTv.getWidth() + "、anchor.height: " + actionOptionTv.getHeight() + ", contentWrapView!!.measuredWidth: " + frameLayout.getMeasuredWidth());
        moVar.f147201d = moVar.f147201d - com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479648bn);
        moVar.f147206i = 0;
        moVar.f147207j = new com.tencent.mm.plugin.luckymoney.ui.lo(actionOptionTv, moVar);
        actionOptionTv.getViewTreeObserver().addOnGlobalLayoutListener(moVar.f147207j);
        if (moVar.isShowing()) {
            moVar.update(actionOptionTv, moVar.f147200c, moVar.f147201d, moVar.getWidth(), moVar.getHeight());
        } else {
            moVar.showAsDropDown(actionOptionTv, moVar.f147200c, moVar.f147201d);
        }
        actionOptionTv.postDelayed(new com.tencent.mm.plugin.luckymoney.ui.go(joVar, moVar, actionOptionTv, this.f147008g), 50L);
    }
}
