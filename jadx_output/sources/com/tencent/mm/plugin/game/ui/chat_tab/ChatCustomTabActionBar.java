package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class ChatCustomTabActionBar extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f141088g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f141089d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f141090e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.tabs.TabLayout f141091f;

    public ChatCustomTabActionBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f141089d = getContext();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bhw, (android.view.ViewGroup) this, false);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        this.f141090e = findViewById;
        findViewById.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar.f141088g;
                com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar chatCustomTabActionBar = com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar.this;
                chatCustomTabActionBar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatCustomTabActionBar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", chatCustomTabActionBar, array2);
                ((android.app.Activity) chatCustomTabActionBar.f141089d).finish();
                yj0.a.h(chatCustomTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(chatCustomTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/ChatCustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        this.f141091f = (com.google.android.material.tabs.TabLayout) inflate.findViewById(com.tencent.mm.R.id.ofc);
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a)));
    }

    public final void b(oa.i iVar, int i17) {
        android.view.View view = iVar.f343783f;
        if (view == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgc);
        android.widget.TextView textView2 = (android.widget.TextView) iVar.f343783f.findViewById(com.tencent.mm.R.id.nvo);
        java.lang.String trim = iVar.f343780c.toString().trim();
        java.lang.String trim2 = textView2.getText().toString().trim();
        textView.setText(trim);
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(i17));
        textView2.setText(trim2);
        textView2.setTypeface(android.graphics.Typeface.defaultFromStyle(i17));
    }

    public com.google.android.material.tabs.TabLayout getmTabs() {
        return this.f141091f;
    }

    public void setBackBtn(android.view.View.OnClickListener onClickListener) {
        this.f141090e.setOnClickListener(onClickListener);
    }

    public ChatCustomTabActionBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
