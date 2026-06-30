package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes5.dex */
public final class mo extends android.widget.PopupWindow {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f147198a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f147199b;

    /* renamed from: c, reason: collision with root package name */
    public int f147200c;

    /* renamed from: d, reason: collision with root package name */
    public int f147201d;

    /* renamed from: e, reason: collision with root package name */
    public int f147202e;

    /* renamed from: f, reason: collision with root package name */
    public int f147203f;

    /* renamed from: g, reason: collision with root package name */
    public int f147204g;

    /* renamed from: h, reason: collision with root package name */
    public int f147205h;

    /* renamed from: i, reason: collision with root package name */
    public int f147206i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewTreeObserver.OnGlobalLayoutListener f147207j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f147208k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f147209l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo(android.view.View contentView) {
        super(contentView.getContext(), (android.util.AttributeSet) null, -1);
        kotlin.jvm.internal.o.g(contentView, "contentView");
        this.f147198a = "MicroMsg.LuckyMoneyPopupWindow";
        this.f147208k = new int[2];
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(contentView.getContext());
        this.f147199b = frameLayout;
        super.setContentView(frameLayout);
        setContentView(contentView);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        this.f147206i = 0;
        android.view.View view = this.f147209l;
        if (view != null) {
            kotlin.jvm.internal.o.d(view);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f147207j);
        }
    }

    @Override // android.widget.PopupWindow
    public android.view.View getContentView() {
        android.widget.FrameLayout frameLayout = this.f147199b;
        kotlin.jvm.internal.o.d(frameLayout);
        android.view.View childAt = frameLayout.getChildAt(0);
        kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
        return childAt;
    }

    @Override // android.widget.PopupWindow
    public void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = this.f147199b;
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.removeAllViews();
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.addView(view);
    }
}
