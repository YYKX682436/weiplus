package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.ChatFooterCustom f200412a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f200413b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f200414c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f200415d;

    public d3(com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom, java.lang.String str) {
        this.f200413b = null;
        this.f200412a = chatFooterCustom;
        this.f200413b = str;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
        com.tencent.mm.ui.chatting.ChatFooterCustom chatFooterCustom = this.f200412a;
        android.view.View findViewById = chatFooterCustom.findViewById(com.tencent.mm.R.id.blq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = chatFooterCustom.findViewById(com.tencent.mm.R.id.blk);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) chatFooterCustom.findViewById(com.tencent.mm.R.id.bll);
        this.f200414c = linearLayout;
        linearLayout.setWeightSum(1.0f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f200414c.getChildAt(0);
        this.f200415d = frameLayout;
        frameLayout.setVisibility(0);
        this.f200415d.setOnClickListener(new com.tencent.mm.ui.chatting.c3(this));
        android.widget.FrameLayout frameLayout2 = this.f200415d;
        frameLayout2.setBackgroundColor(frameLayout2.getContext().getResources().getColor(com.tencent.mm.R.color.BW_95));
        qv1.a aVar = (qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class));
        java.lang.String str = this.f200413b;
        if (aVar.d(str)) {
            ((android.widget.TextView) this.f200415d.findViewById(com.tencent.mm.R.id.bln)).setText(com.tencent.mm.R.string.jja);
        } else if (c01.v1.D(str)) {
            ((android.widget.TextView) this.f200415d.findViewById(com.tencent.mm.R.id.bln)).setText(com.tencent.mm.R.string.hqh);
        } else {
            ((android.widget.TextView) this.f200415d.findViewById(com.tencent.mm.R.id.bln)).setText(com.tencent.mm.R.string.bq8);
        }
        ((android.widget.TextView) this.f200415d.findViewById(com.tencent.mm.R.id.bln)).setTextColor(this.f200415d.getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        ((android.widget.TextView) this.f200415d.findViewById(com.tencent.mm.R.id.bln)).setTextSize(0, this.f200415d.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479925j4));
        android.content.Context context = this.f200415d.getContext();
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.f200415d.findViewById(com.tencent.mm.R.id.blm);
        if (weImageView != null) {
            weImageView.setVisibility(0);
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_outlined_error, context.getResources().getColor(com.tencent.mm.R.color.FG_1)));
            weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.FG_1));
            android.view.ViewGroup.LayoutParams layoutParams = weImageView.getLayoutParams();
            layoutParams.height = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            layoutParams.width = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
            weImageView.setLayoutParams(layoutParams);
        }
        for (int i17 = 1; i17 < 6; i17++) {
            android.view.View childAt = this.f200414c.getChildAt(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
