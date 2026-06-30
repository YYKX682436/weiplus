package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class un {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f114591a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f114592b;

    /* renamed from: c, reason: collision with root package name */
    public final int f114593c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f114594d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f114595e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f114596f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView f114597g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView f114598h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f114599i;

    /* renamed from: j, reason: collision with root package name */
    public final android.view.ViewGroup f114600j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.ViewGroup f114601k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f114602l;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f114603m;

    public un(android.view.ViewGroup container, boolean z17, boolean z18, boolean z19, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        kotlin.jvm.internal.o.g(container, "container");
        this.f114591a = z18;
        this.f114592b = z19;
        this.f114593c = i17;
        android.widget.TextView textView = (android.widget.TextView) container.findViewById(com.tencent.mm.R.id.ezs);
        this.f114594d = textView;
        android.widget.TextView textView2 = (android.widget.TextView) container.findViewById(com.tencent.mm.R.id.ezt);
        this.f114595e = textView2;
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) container.findViewById(com.tencent.mm.R.id.ezw);
        this.f114596f = mMPAGView;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = (com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView) container.findViewById(com.tencent.mm.R.id.ezr);
        this.f114597g = finderLiveGiftTextView;
        com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = (com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView) container.findViewById(com.tencent.mm.R.id.ezq);
        this.f114598h = finderRandomAnimTextView;
        this.f114599i = container.findViewById(com.tencent.mm.R.id.agx);
        this.f114600j = (android.view.ViewGroup) container.findViewById(com.tencent.mm.R.id.ezv);
        this.f114601k = (android.view.ViewGroup) container.findViewById(com.tencent.mm.R.id.ezu);
        this.f114602l = container.findViewById(com.tencent.mm.R.id.f486318qn4);
        this.f114603m = (android.widget.TextView) container.findViewById(com.tencent.mm.R.id.f486319qn5);
        if (z19) {
            android.view.ViewGroup.LayoutParams layoutParams2 = mMPAGView != null ? mMPAGView.getLayoutParams() : null;
            if (layoutParams2 != null) {
                layoutParams2.width = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            }
            layoutParams = mMPAGView != null ? mMPAGView.getLayoutParams() : null;
            if (layoutParams != null) {
                layoutParams.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            }
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setTextSize(1, 12.0f);
            }
            if (finderRandomAnimTextView != null) {
                finderRandomAnimTextView.setTextSize(12.0f);
                return;
            }
            return;
        }
        if (!z18) {
            if (z17) {
                if (textView != null) {
                    textView.setTextSize(1, 15.0f);
                }
                if (textView2 != null) {
                    textView2.setTextSize(1, 15.0f);
                }
                android.view.View findViewById = container.findViewById(com.tencent.mm.R.id.agx);
                layoutParams = findViewById != null ? findViewById.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
                }
            } else {
                if (textView != null) {
                    textView.setTextSize(1, 17.0f);
                }
                if (textView2 != null) {
                    textView2.setTextSize(1, 17.0f);
                }
                android.view.View findViewById2 = container.findViewById(com.tencent.mm.R.id.agx);
                layoutParams = findViewById2 != null ? findViewById2.getLayoutParams() : null;
                if (layoutParams != null) {
                    layoutParams.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
                }
            }
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setTextSize(1, 22.0f);
            }
            if (finderRandomAnimTextView != null) {
                finderRandomAnimTextView.setTextSize(22.0f);
                return;
            }
            return;
        }
        if (textView != null) {
            textView.setTextSize(1, 12.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(1, 12.0f);
        }
        android.view.ViewGroup.LayoutParams layoutParams3 = mMPAGView != null ? mMPAGView.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        }
        android.view.ViewGroup.LayoutParams layoutParams4 = mMPAGView != null ? mMPAGView.getLayoutParams() : null;
        if (layoutParams4 != null) {
            layoutParams4.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        }
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setTextSize(1, 17.0f);
        }
        if (finderRandomAnimTextView != null) {
            finderRandomAnimTextView.setTextSize(17.0f);
        }
        android.view.ViewGroup.LayoutParams layoutParams5 = container.getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
        }
        android.view.View findViewById3 = container.findViewById(com.tencent.mm.R.id.agx);
        android.view.ViewGroup.LayoutParams layoutParams6 = findViewById3 != null ? findViewById3.getLayoutParams() : null;
        if (layoutParams6 != null) {
            layoutParams6.width = com.tencent.mm.plugin.finder.live.plugin.ap.U;
        }
        android.view.View findViewById4 = container.findViewById(com.tencent.mm.R.id.agx);
        layoutParams = findViewById4 != null ? findViewById4.getLayoutParams() : null;
        if (layoutParams == null) {
            return;
        }
        layoutParams.height = (int) container.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479704cz);
    }
}
