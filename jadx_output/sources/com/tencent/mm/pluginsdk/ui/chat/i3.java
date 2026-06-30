package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class i3 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final int f190391d;

    /* renamed from: e, reason: collision with root package name */
    public float f190392e;

    /* renamed from: f, reason: collision with root package name */
    public float f190393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190394g;

    public i3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190394g = chatFooter;
        this.f190391d = android.view.ViewConfiguration.get(chatFooter.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.ViewGroup viewGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190394g;
        if (chatFooter.f190076u6) {
            chatFooter.f190076u6 = false;
            com.tencent.mm.plugin.transvoice.model.c cVar = chatFooter.f190038o6;
            if (cVar != null) {
                cVar.a(false, true);
            }
            chatFooter.f190064s6.d();
            chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), (java.lang.CharSequence) ((java.util.HashMap) chatFooter.f189980e6).get(java.lang.Integer.valueOf(chatFooter.f190082v6))));
            com.tencent.mm.plugin.transvoice.model.e eVar = chatFooter.N3;
            eVar.f175398v = 0;
            eVar.f175394r = java.lang.System.currentTimeMillis();
            chatFooter.f190026m6 = false;
        }
        chatFooter.N3.f175400x = 1;
        if (motionEvent.getActionMasked() == 0) {
            this.f190392e = motionEvent.getX();
            this.f190393f = motionEvent.getY();
        } else if (motionEvent.getActionMasked() == 1) {
            float abs = java.lang.Math.abs(motionEvent.getX() - this.f190392e);
            int i17 = this.f190391d;
            if (abs <= i17 && java.lang.Math.abs(motionEvent.getY() - this.f190393f) <= i17 && (viewGroup = chatFooter.f190056r4) != null && !chatFooter.f190074u4) {
                chatFooter.f190074u4 = true;
                if (chatFooter.f190010k2 || chatFooter.f190068t4) {
                    viewGroup.setVisibility(0);
                    com.tencent.mm.ui.widget.imageview.WeImageButton weImageButton = chatFooter.f190062s4;
                    if (weImageButton != null) {
                        weImageButton.setImageResource(com.tencent.mm.R.drawable.f481235o1);
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$62", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
