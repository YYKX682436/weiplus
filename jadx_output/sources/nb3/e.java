package nb3;

/* loaded from: classes9.dex */
public class e implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f336046d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f336047e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI f336048f;

    public e(com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI wxaLuckyMoneyDetailUI) {
        this.f336048f = wxaLuckyMoneyDetailUI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        if ((r7 != null ? 0 - r7.getTop() : 0) > 100) goto L15;
     */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onScroll(android.widget.AbsListView r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "onScroll"
            java.lang.String r3 = "(Landroid/widget/AbsListView;III)V"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r7)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r4.add(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r4.add(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            r4.add(r9)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r6
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            java.lang.String r9 = "(Landroid/widget/AbsListView;III)V"
            java.lang.String r0 = "onScroll"
            java.lang.String r1 = "android/widget/AbsListView$OnScrollListener"
            java.lang.String r2 = "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1"
            if (r10 == 0) goto L9b
            boolean r10 = r6.f336046d
            if (r10 != 0) goto L3f
            goto L9b
        L3f:
            if (r8 <= 0) goto L42
            goto L55
        L42:
            android.view.View r7 = r7.getChildAt(r8)
            r8 = 0
            if (r7 == 0) goto L50
            int r7 = r7.getTop()
            int r7 = 0 - r7
            goto L51
        L50:
            r7 = r8
        L51:
            r10 = 100
            if (r7 <= r10) goto L56
        L55:
            r8 = 1
        L56:
            boolean r7 = r6.f336047e
            if (r7 == r8) goto L97
            com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI r7 = r6.f336048f
            if (r8 == 0) goto L7f
            android.content.res.Resources r10 = r7.getResources()
            r3 = 2131234906(0x7f08105a, float:1.808599E38)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r3)
            int r3 = com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.A
            mb3.c r7 = r7.f145001d
            com.tencent.mm.ui.MMActivity r3 = r7.f147036a
            androidx.appcompat.app.b r3 = r3.getSupportActionBar()
            if (r3 == 0) goto L95
            com.tencent.mm.ui.MMActivity r7 = r7.f147036a
            androidx.appcompat.app.b r7 = r7.getSupportActionBar()
            r7.w(r10)
            goto L95
        L7f:
            int r10 = com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.WxaLuckyMoneyDetailUI.A
            mb3.c r7 = r7.f145001d
            com.tencent.mm.ui.MMActivity r10 = r7.f147036a
            androidx.appcompat.app.b r10 = r10.getSupportActionBar()
            if (r10 == 0) goto L95
            com.tencent.mm.ui.MMActivity r7 = r7.f147036a
            androidx.appcompat.app.b r7 = r7.getSupportActionBar()
            r10 = 0
            r7.w(r10)
        L95:
            r6.f336047e = r8
        L97:
            yj0.a.h(r6, r2, r1, r0, r9)
            return
        L9b:
            yj0.a.h(r6, r2, r1, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nb3.e.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (absListView.getCount() == 0) {
            yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
            return;
        }
        if (i17 == 0) {
            if (absListView.getLastVisiblePosition() == absListView.getCount() - 1) {
                nb3.a aVar = this.f336048f.f145014h;
                int count = absListView.getCount();
                nb3.i iVar = (nb3.i) aVar;
                if (iVar.f336053a == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage ui == null");
                } else {
                    java.util.LinkedList linkedList = (java.util.LinkedList) iVar.f336058f;
                    if (count < linkedList.size()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage. offset = [%d], list.size() = [%d], skip load", java.lang.Integer.valueOf(count), java.lang.Integer.valueOf(linkedList.size()));
                    } else if (iVar.f336057e) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. is loading now...");
                    } else if (iVar.f336056d == 0) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. do not has more...");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage load");
                        iVar.f336057e = true;
                        iVar.b(count);
                    }
                }
            }
            this.f336046d = false;
        } else if (i17 == 1) {
            this.f336046d = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/WxaLuckyMoneyDetailUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
