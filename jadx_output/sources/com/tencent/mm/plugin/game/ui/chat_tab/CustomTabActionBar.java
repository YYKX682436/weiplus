package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes3.dex */
public class CustomTabActionBar extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f141112g = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f141113d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f141114e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f141115f;

    public CustomTabActionBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public final void a() {
        this.f141113d = getContext();
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.bhv, (android.view.ViewGroup) this, false);
        this.f141114e = inflate.findViewById(com.tencent.mm.R.id.actionbar_up_indicator);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f141115f = textView;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479575r);
        this.f141114e.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar.f141112g;
                com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar customTabActionBar = com.tencent.mm.plugin.game.ui.chat_tab.CustomTabActionBar.this;
                customTabActionBar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customTabActionBar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", customTabActionBar, array2);
                ((android.app.Activity) customTabActionBar.f141113d).finish();
                yj0.a.h(customTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(customTabActionBar, "com/tencent/mm/plugin/game/ui/chat_tab/CustomTabActionBar", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a)));
    }

    public void setBackBtn(android.view.View.OnClickListener onClickListener) {
        this.f141114e.setOnClickListener(onClickListener);
    }

    public void setTitle(int i17) {
        this.f141115f.setText(i17);
    }

    public void setTitle(java.lang.String str) {
        this.f141115f.setText(str);
    }

    public CustomTabActionBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
