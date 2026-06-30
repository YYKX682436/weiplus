package com.tencent.mm.pluginsdk.ui.tools;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0005&\u000b\u0003\u0014\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u0010\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014R$\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001f\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/tools/DropdownListView;", "Landroid/widget/LinearLayout;", "Landroid/widget/AdapterView$OnItemClickListener;", "Lcom/tencent/mm/pluginsdk/ui/tools/z0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setListener", "Li/a;", "color", "setColor", "", "Lcom/tencent/mm/pluginsdk/ui/tools/y0;", "items", "setItems", "Lcom/tencent/mm/pluginsdk/ui/tools/b1;", "onItemStateChanged", "setOnItemStateChanged", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "setSelectItemName", "Lcom/tencent/mm/pluginsdk/ui/tools/a1;", "onFolderAlbumDialogDismiss", "setFolderAlbumDialogDismiss", "mOnItemStateChanged", "Lcom/tencent/mm/pluginsdk/ui/tools/b1;", "getMOnItemStateChanged", "()Lcom/tencent/mm/pluginsdk/ui/tools/b1;", "setMOnItemStateChanged", "(Lcom/tencent/mm/pluginsdk/ui/tools/b1;)V", "getSelectedItemName", "()Ljava/lang/String;", "selectedItemName", "mOnFolderAlbumDialogDismiss", "Lcom/tencent/mm/pluginsdk/ui/tools/a1;", "getMOnFolderAlbumDialogDismiss", "()Lcom/tencent/mm/pluginsdk/ui/tools/a1;", "setMOnFolderAlbumDialogDismiss", "(Lcom/tencent/mm/pluginsdk/ui/tools/a1;)V", "com/tencent/mm/pluginsdk/ui/tools/x0", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class DropdownListView extends android.widget.LinearLayout implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f191356d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ListView f191357e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.x0 f191358f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f191359g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f191360h;

    public DropdownListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final com.tencent.mm.pluginsdk.ui.tools.a1 getMOnFolderAlbumDialogDismiss() {
        return null;
    }

    public final com.tencent.mm.pluginsdk.ui.tools.b1 getMOnItemStateChanged() {
        return null;
    }

    public final java.lang.String getSelectedItemName() {
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var);
        java.lang.String str = x0Var.f191975f;
        kotlin.jvm.internal.o.d(str);
        return str;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var);
        com.tencent.mm.pluginsdk.ui.tools.y0 y0Var = (com.tencent.mm.pluginsdk.ui.tools.y0) x0Var.f191974e.get(i17);
        if (y0Var == null) {
            yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
            return;
        }
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var2 = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var2);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = y0Var.f192004a;
        if (str == null) {
            str = "";
        }
        x0Var2.f191975f = str;
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var3 = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var3);
        x0Var3.notifyDataSetChanged();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/tools/DropdownListView", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    public final void setColor(i.a color) {
        kotlin.jvm.internal.o.g(color, "color");
    }

    public final void setFolderAlbumDialogDismiss(com.tencent.mm.pluginsdk.ui.tools.a1 a1Var) {
    }

    public final void setItems(java.util.List<com.tencent.mm.pluginsdk.ui.tools.y0> items) {
        kotlin.jvm.internal.o.g(items, "items");
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var);
        x0Var.f191974e = items;
        java.lang.String str = items.isEmpty() ? "" : items.get(0).f192004a;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        x0Var.f191975f = str != null ? str : "";
    }

    public final void setListener(com.tencent.mm.pluginsdk.ui.tools.z0 z0Var) {
    }

    public final void setMOnFolderAlbumDialogDismiss(com.tencent.mm.pluginsdk.ui.tools.a1 a1Var) {
    }

    public final void setMOnItemStateChanged(com.tencent.mm.pluginsdk.ui.tools.b1 b1Var) {
    }

    public final void setOnItemStateChanged(com.tencent.mm.pluginsdk.ui.tools.b1 b1Var) {
    }

    public final void setSelectItemName(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        x0Var.f191975f = name;
        com.tencent.mm.pluginsdk.ui.tools.x0 x0Var2 = this.f191358f;
        kotlin.jvm.internal.o.d(x0Var2);
        x0Var2.notifyDataSetChanged();
    }

    public DropdownListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
    }

    public DropdownListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        super(context, (i19 & 2) != 0 ? null : attributeSet, (i19 & 4) != 0 ? 0 : i17, (i19 & 8) != 0 ? 0 : i18);
        setOrientation(1);
        this.f191356d = new android.widget.FrameLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = this.f191356d;
        kotlin.jvm.internal.o.d(frameLayout);
        frameLayout.setVisibility(8);
        addView(this.f191356d, layoutParams);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_3));
        frameLayout2.setOnClickListener(new com.tencent.mm.pluginsdk.ui.tools.c1(this));
        android.widget.FrameLayout frameLayout3 = this.f191356d;
        kotlin.jvm.internal.o.d(frameLayout3);
        frameLayout3.addView(frameLayout2, layoutParams2);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = new com.tencent.mm.ui.widget.RoundedCornerFrameLayout(getContext());
        roundedCornerFrameLayout.b(0.0f, 0.0f, com.tencent.mm.ui.zk.a(getContext(), 8), com.tencent.mm.ui.zk.a(getContext(), 8));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 48;
        android.widget.FrameLayout frameLayout4 = this.f191356d;
        kotlin.jvm.internal.o.d(frameLayout4);
        frameLayout4.addView(roundedCornerFrameLayout, layoutParams3);
        android.widget.ListView listView = new android.widget.ListView(getContext());
        this.f191357e = listView;
        listView.setCacheColorHint(0);
        android.widget.ListView listView2 = this.f191357e;
        kotlin.jvm.internal.o.d(listView2);
        listView2.setOnItemClickListener(this);
        roundedCornerFrameLayout.addView(this.f191357e, new android.widget.RelativeLayout.LayoutParams(-1, -2));
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.f191358f = new com.tencent.mm.pluginsdk.ui.tools.x0(context2);
        android.widget.ListView listView3 = this.f191357e;
        kotlin.jvm.internal.o.d(listView3);
        listView3.setAdapter((android.widget.ListAdapter) this.f191358f);
    }
}
