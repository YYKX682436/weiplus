package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190169d;

    public a1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190169d = chatFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.ViewGroup viewGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$118", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190169d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = chatFooter.f189961b4;
        if (mMEditText != null && chatFooter.f190050q4 != null) {
            if (chatFooter.f190068t4) {
                chatFooter.z0();
                android.view.inputmethod.InputMethodManager inputMethodManager = chatFooter.U1;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(chatFooter.f189961b4, 0);
                }
                com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = chatFooter.f190062s4;
                if (weImageButton != null) {
                    weImageButton.setImageResource(com.tencent.mm.R.drawable.f481235o1);
                }
            } else {
                android.view.inputmethod.InputMethodManager inputMethodManager2 = chatFooter.U1;
                if (inputMethodManager2 != null) {
                    inputMethodManager2.hideSoftInputFromWindow(mMEditText.getWindowToken(), 0);
                }
                if (chatFooter.f190050q4 != null && (viewGroup = chatFooter.f190056r4) != null) {
                    chatFooter.f190068t4 = true;
                    viewGroup.setVisibility(0);
                    chatFooter.f190050q4.setVisibility(0);
                    chatFooter.f190050q4.i();
                }
                com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton2 = chatFooter.f190062s4;
                if (weImageButton2 != null) {
                    weImageButton2.setImageResource(com.tencent.mm.R.drawable.f481236o2);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$118", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
