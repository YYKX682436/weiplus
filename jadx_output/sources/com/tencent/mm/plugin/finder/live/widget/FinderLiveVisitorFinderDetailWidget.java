package com.tencent.mm.plugin.finder.live.widget;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLiveVisitorFinderDetailWidget extends android.widget.FrameLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f117698p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f117699d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f117700e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f117701f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.LinearLayout f117702g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f117703h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f117704i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f117705m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.LinearLayout f117706n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f117707o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorFinderDetailWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117699d = "FinderLiveVisitorFinderDetailWidget";
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.ea9, this);
        this.f117700e = inflate;
        this.f117701f = inflate.findViewById(com.tencent.mm.R.id.ucf);
        this.f117702g = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.vps);
        this.f117703h = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.fuv);
        this.f117704i = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484433qj3);
        this.f117705m = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.e_c);
        this.f117706n = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482890qy);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f117707o = linkedList;
        linkedList.clear();
        linkedList.add(inflate.findViewById(com.tencent.mm.R.id.h9p));
        linkedList.add(inflate.findViewById(com.tencent.mm.R.id.h9q));
        linkedList.add(inflate.findViewById(com.tencent.mm.R.id.h9r));
        linkedList.add(inflate.findViewById(com.tencent.mm.R.id.h9s));
    }

    public static final void a(com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorFinderDetailWidget finderLiveVisitorFinderDetailWidget, r45.nw6 nw6Var, yz5.l lVar, yz5.a aVar) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo authInfo;
        finderLiveVisitorFinderDetailWidget.getClass();
        if (((com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null) {
            finderLiveVisitorFinderDetailWidget.setVisibility(8);
            aVar.invoke();
            return;
        }
        android.view.View view = finderLiveVisitorFinderDetailWidget.f117701f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget", "showItemWidget", "(Lcom/tencent/mm/protocal/protobuf/UserPreviewInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorFinderDetailWidget", "showItemWidget", "(Lcom/tencent/mm/protocal/protobuf/UserPreviewInfo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        finderLiveVisitorFinderDetailWidget.f117702g.setVisibility(0);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0);
        finderLiveVisitorFinderDetailWidget.f117703h.setText(finderContact != null ? finderContact.getNickname() : null);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0);
        finderLiveVisitorFinderDetailWidget.f117704i.setText((finderContact2 == null || (authInfo = finderContact2.getAuthInfo()) == null) ? null : authInfo.getAuthProfession());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        android.widget.ImageView finderAuthIcon = finderLiveVisitorFinderDetailWidget.f117705m;
        kotlin.jvm.internal.o.f(finderAuthIcon, "finderAuthIcon");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0);
        m1Var.c(finderAuthIcon, finderContact3 != null ? finderContact3.getAuthInfo() : null, 1);
        java.util.List<android.widget.ImageView> list = finderLiveVisitorFinderDetailWidget.f117707o;
        for (android.widget.ImageView imageView : list) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        int size = nw6Var.getList(2).size();
        android.widget.LinearLayout linearLayout = finderLiveVisitorFinderDetailWidget.f117706n;
        if (size > 0) {
            linearLayout.setVisibility(0);
            for (int i17 = 0; i17 < size; i17++) {
                java.util.LinkedList linkedList = (java.util.LinkedList) list;
                if (i17 >= linkedList.size()) {
                    break;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) linkedList.get(i17);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.plugin.finder.assist.d8.f102092a.d(nw6Var.getList(2).get(i17), imageView2);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0);
        lVar.invoke(finderContact4 != null ? finderContact4.getUsername() : null);
    }
}
