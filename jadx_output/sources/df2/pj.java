package df2;

/* loaded from: classes3.dex */
public final class pj extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f231070d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f231071e;

    public pj(java.lang.ref.WeakReference rController, java.lang.String str) {
        kotlin.jvm.internal.o.g(rController, "rController");
        this.f231070d = rController;
        this.f231071e = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$CustomTextClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        df2.pk pkVar = (df2.pk) this.f231070d.get();
        if (pkVar != null) {
            java.util.List list = pkVar.K;
            java.lang.String str = this.f231071e;
            if (list != null) {
                java.util.Iterator it = list.iterator();
                int i17 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(((ce2.e) it.next()).a(), str)) {
                        break;
                    } else {
                        i17++;
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.view.gift.FinderLiveCustomGiftTagView finderLiveCustomGiftTagView = pkVar.f231084x;
                if (finderLiveCustomGiftTagView != null) {
                    finderLiveCustomGiftTagView.b(i17);
                }
                androidx.viewpager.widget.ViewPager viewPager = pkVar.f231085y;
                if (viewPager != null) {
                    viewPager.setCurrentItem(i17, false);
                }
            } else {
                com.tencent.mars.xlog.Log.e(pkVar.f231073m, "selectComponent " + str + " but index is null!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$CustomTextClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(android.graphics.Color.parseColor("#7D90A9"));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
