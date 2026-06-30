package od5;

/* loaded from: classes.dex */
public abstract class i {
    public static final void a(com.tencent.mm.ui.chatting.viewitems.g0 tag, yb5.d ui6, boolean z17) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(ui6, "ui");
        com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView = tag.avatarIV;
        jz5.f0 f0Var = null;
        android.view.ViewParent parent = chattingAvatarImageView != null ? chattingAvatarImageView.getParent() : null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.ecm);
            if (findViewById != null) {
                int i17 = z17 ? 0 : 8;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItemKt", "showDebugView", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/mvvm/MvvmChattingItemKt", "showDebugView", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null && z17) {
                android.view.View view = new android.view.View(ui6.g());
                view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(30, 30));
                view.setBackgroundColor(android.graphics.Color.parseColor("#E6FF0000"));
                viewGroup.addView(view);
            }
        }
    }
}
