package yr3;

/* loaded from: classes11.dex */
public final class f1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.h1 f464812d;

    public f1(yr3.h1 h1Var) {
        this.f464812d = h1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        wr3.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wr3.h hVar = this.f464812d.f464838d.f448819i;
        if (hVar != null && (aVar = ((wr3.b1) hVar).f448761a.f154419o) != null) {
            as3.m0 m0Var = as3.m0.f13534h;
            com.tencent.mm.plugin.profile.ui.tab.ContactWidgetTabBizInfo contactWidgetTabBizInfo = ((com.tencent.mm.plugin.profile.ui.tab.k6) aVar).f154384a;
            com.tencent.mm.plugin.profile.ui.tab.view.BizProfileTabLayout bizProfileTabLayout = contactWidgetTabBizInfo.C;
            if (bizProfileTabLayout == null) {
                kotlin.jvm.internal.o.o("menuTabLayout");
                throw null;
            }
            int A = bizProfileTabLayout.A(m0Var);
            if (A < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ContactWidgetTabBizInfo", "Tab " + m0Var + " is not visible");
            } else {
                androidx.viewpager.widget.ViewPager viewPager = contactWidgetTabBizInfo.A;
                if (viewPager == null) {
                    kotlin.jvm.internal.o.o("viewPager");
                    throw null;
                }
                viewPager.setCurrentItem(A, false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSlidePicViewHolder$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
