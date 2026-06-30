package id2;

/* loaded from: classes3.dex */
public final class j3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo f290630e;

    public j3(id2.u3 u3Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo) {
        this.f290629d = u3Var;
        this.f290630e = finderJumpInfo;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshCustomerServiceEntrance$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mm.plugin.finder.assist.a4 a4Var = com.tencent.mm.plugin.finder.assist.a4.f102002a;
        id2.u3 u3Var = this.f290629d;
        android.app.Activity context = u3Var.getContext();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = context instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) context : null;
        if (mMFinderUI == null || (str = java.lang.Integer.valueOf(mMFinderUI.getD()).toString()) == null) {
            str = "";
        }
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(str, b52.b.b(), "person_page_service_assistant", "");
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.app.Activity context2 = u3Var.getContext();
        r45.ac4 ac4Var = new r45.ac4();
        ac4Var.set(1, this.f290630e);
        ((c61.p2) ybVar).Bi(context2, ac4Var, null, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLivePersonalCenterUIC$refreshCustomerServiceEntrance$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
    }
}
