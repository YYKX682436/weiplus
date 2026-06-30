package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class GameDropdownView extends android.widget.TextView implements android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f140767d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.ui.l3 f140768e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f140769f;

    /* renamed from: g, reason: collision with root package name */
    public int f140770g;

    /* renamed from: h, reason: collision with root package name */
    public int f140771h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.j3 f140772i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f140773m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnClickListener f140774n;

    public GameDropdownView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f140770g = 0;
        this.f140771h = 0;
        this.f140772i = null;
        this.f140773m = null;
        this.f140774n = new com.tencent.mm.plugin.game.ui.i3(this);
        this.f140767d = context;
        this.f140768e = new com.tencent.mm.plugin.game.ui.l3(context);
        setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentSelection(int i17) {
        com.tencent.mm.plugin.game.ui.l3 l3Var = this.f140768e;
        if (l3Var.getContentView() == null || !(l3Var.getContentView() instanceof android.view.ViewGroup)) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) l3Var.getContentView();
        int i18 = this.f140771h;
        if (i17 > i18 || this.f140770g > i18 || !(viewGroup.getChildAt(i17) instanceof android.widget.TextView) || !(viewGroup.getChildAt(this.f140770g) instanceof android.widget.TextView)) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) viewGroup.getChildAt(this.f140770g);
        android.content.Context context = this.f140767d;
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479232tk));
        ((android.widget.TextView) viewGroup.getChildAt(i17)).setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        setText((java.lang.CharSequence) this.f140769f.get(i17));
        com.tencent.mm.plugin.game.ui.j3 j3Var = this.f140772i;
        if (j3Var != null && this.f140770g != i17) {
            com.tencent.mm.plugin.game.ui.l4 l4Var = (com.tencent.mm.plugin.game.ui.l4) j3Var;
            l4Var.getClass();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = l4Var.f141457a;
            linkedList.addAll(gameLibraryUI.f140907o.keySet());
            if (i17 <= linkedList.size() - 1) {
                int intValue = ((java.lang.Integer) linkedList.get(i17)).intValue();
                gameLibraryUI.f140908p = intValue;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLibraryUI", "Selected SortType: %d", java.lang.Integer.valueOf(intValue));
                gameLibraryUI.f140911s = 0;
                gameLibraryUI.U6();
                com.tencent.mm.game.report.l.c(gameLibraryUI, 11, 1111, gameLibraryUI.f140908p + gameLibraryUI.B, 2, gameLibraryUI.A, null);
            }
        }
        this.f140770g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.ui.l3 l3Var = this.f140768e;
        if (l3Var.isShowing()) {
            l3Var.dismiss();
        } else {
            android.view.View view2 = this.f140773m;
            if (view2 == null) {
                l3Var.showAsDropDown(this);
            } else {
                l3Var.showAsDropDown(view2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GameDropdownView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        setVisibility(8);
    }

    public void setAnchorView(android.view.View view) {
        this.f140773m = view;
    }

    public void setOnSelectionChangedListener(com.tencent.mm.plugin.game.ui.j3 j3Var) {
        this.f140772i = j3Var;
    }
}
