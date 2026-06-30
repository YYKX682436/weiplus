package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes15.dex */
public final class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC f134838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ka f134839e;

    public ja(com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC, com.tencent.mm.plugin.finder.viewmodel.component.ka kaVar) {
        this.f134838d = finderEmojiListUIC;
        this.f134839e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderEmojiListUIC finderEmojiListUIC = this.f134838d;
        androidx.fragment.app.Fragment fragment = finderEmojiListUIC.getFragment();
        if ((fragment != null && fragment.isDetached()) || finderEmojiListUIC.getActivity().isDestroyed() || finderEmojiListUIC.getActivity().isFinishing()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderEmojiListUIC", "[updateState] state=" + finderEmojiListUIC.Q6().f107399e + " cachedState=" + finderEmojiListUIC.Q6().f107400f);
        android.widget.FrameLayout frameLayout = finderEmojiListUIC.f133536e;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("stateLayout");
            throw null;
        }
        frameLayout.setOnClickListener(null);
        frameLayout.setVisibility(8);
        if (finderEmojiListUIC.Q6().f107400f == com.tencent.mm.plugin.finder.feed.model.p0.f108238e) {
            int ordinal = finderEmojiListUIC.Q6().f107399e.ordinal();
            if (ordinal == 1) {
                android.widget.FrameLayout frameLayout2 = finderEmojiListUIC.f133536e;
                if (frameLayout2 == null) {
                    kotlin.jvm.internal.o.o("stateLayout");
                    throw null;
                }
                frameLayout2.setVisibility(0);
                finderEmojiListUIC.S6().f434638f.setVisibility(8);
                finderEmojiListUIC.S6().f434639g.setVisibility(8);
                finderEmojiListUIC.S6().f434637e.setVisibility(0);
                return;
            }
            if (ordinal == 2) {
                android.widget.FrameLayout frameLayout3 = finderEmojiListUIC.f133536e;
                if (frameLayout3 == null) {
                    kotlin.jvm.internal.o.o("stateLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                finderEmojiListUIC.S6().f434638f.setVisibility(0);
                finderEmojiListUIC.S6().f434639g.setVisibility(8);
                finderEmojiListUIC.S6().f434637e.setVisibility(8);
                return;
            }
            if (ordinal != 3) {
                return;
            }
            android.widget.FrameLayout frameLayout4 = finderEmojiListUIC.f133536e;
            if (frameLayout4 == null) {
                kotlin.jvm.internal.o.o("stateLayout");
                throw null;
            }
            frameLayout4.setVisibility(0);
            finderEmojiListUIC.S6().f434638f.setVisibility(8);
            finderEmojiListUIC.S6().f434639g.setVisibility(0);
            finderEmojiListUIC.S6().f434637e.setVisibility(8);
            frameLayout4.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.ia(this.f134839e));
        }
    }
}
