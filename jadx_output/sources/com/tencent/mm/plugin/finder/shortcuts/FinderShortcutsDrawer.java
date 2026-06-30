package com.tencent.mm.plugin.finder.shortcuts;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/shortcuts/FinderShortcutsDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawer;", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderShortcutsDrawer extends com.tencent.mm.view.drawer.RecyclerViewDrawer {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f126366z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f126367y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderShortcutsDrawer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawer, com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        super.c(z17, z18, i17);
        if (z17 || z18) {
            return;
        }
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderShortcutsDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.e5j, getHeaderLayout());
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f126367y = inflate;
        android.widget.Button btnCancel = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.f483482b02);
        android.view.View btnAdd = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.azw);
        android.widget.TextView tvTitle = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqh);
        android.widget.TextView tvDesc = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.vjg);
        android.widget.TextView tvChannel = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487424vi2);
        setId(com.tencent.mm.R.id.tbf);
        kotlin.jvm.internal.o.f(tvTitle, "tvTitle");
        com.tencent.mm.ui.fk.b(tvTitle);
        kotlin.jvm.internal.o.f(tvDesc, "tvDesc");
        com.tencent.mm.ui.fk.c(tvDesc);
        kotlin.jvm.internal.o.f(btnCancel, "btnCancel");
        com.tencent.mm.ui.fk.b(btnCancel);
        kotlin.jvm.internal.o.f(tvChannel, "tvChannel");
        com.tencent.mm.ui.fk.b(tvChannel);
        kotlin.jvm.internal.o.f(btnAdd, "btnAdd");
        k(btnAdd);
        k(btnCancel);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (!z17) {
            i19 = i19 >= i18 ? i19 : i18;
        }
        setTopOffset(i19 - ((int) getContext().getResources().getDimension(com.tencent.mm.R.dimen.aoc)));
        setSquaresBackgroundResource(com.tencent.mm.R.drawable.d0m);
        setEnableClickBackgroundToCloseDrawer(true);
        setBackgroundColorRes(com.tencent.mm.R.color.a9e);
        setBackgroundResource(getBackgroundColorRes());
        setChangeBackgroundAlpha(false);
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares squares = getSquares();
        android.view.ViewGroup.LayoutParams layoutParams = getSquares().getLayoutParams();
        layoutParams.height = -2;
        squares.setLayoutParams(layoutParams);
        btnAdd.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
        btnAdd.setOnClickListener(new au2.k(this));
        btnCancel.setOnClickListener(new au2.l(this));
    }

    public /* synthetic */ FinderShortcutsDrawer(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }
}
