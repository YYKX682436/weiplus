package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public final class w8 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f205912b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f205913c;

    /* renamed from: d, reason: collision with root package name */
    public q31.n f205914d;

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public void create(android.view.View view) {
        super.create(view);
        this.checkBox = view != null ? (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf) : null;
        this.maskView = view != null ? view.findViewById(com.tencent.mm.R.id.bpa) : null;
        this.f205912b = view != null ? view.findViewById(com.tencent.mm.R.id.f483645bk4) : null;
        this.f205913c = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.r_5) : null;
        android.view.View view2 = this.f205912b;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "create", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFunctionGuideList$AppMsgFunctionGuideListHolder", "create", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView = this.userTV;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.TextView textView2 = this.timeTV;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }
}
