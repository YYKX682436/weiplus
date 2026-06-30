package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016B#\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0018R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\n\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001b\u0010\r\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u001b\u0010\u0010\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u001a"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderLoadBar;", "Landroid/widget/FrameLayout;", "", "d", "Ljz5/g;", "getDefaultProcessLoadingId", "()I", "defaultProcessLoadingId", "e", "getDefaultProcessLoadingColor", "defaultProcessLoadingColor", "f", "getDefaultIconId", "defaultIconId", "g", "getDefaultIconColor", "defaultIconColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/view/ee", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderLoadBar extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultProcessLoadingId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultProcessLoadingColor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultIconId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultIconColor;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f131266h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderProcessBar f131267i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ee f131268m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLoadBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.defaultProcessLoadingId = jz5.h.b(com.tencent.mm.plugin.finder.view.ie.f132302d);
        this.defaultProcessLoadingColor = jz5.h.b(com.tencent.mm.plugin.finder.view.he.f132236d);
        this.defaultIconId = jz5.h.b(com.tencent.mm.plugin.finder.view.ge.f132158d);
        this.defaultIconColor = jz5.h.b(com.tencent.mm.plugin.finder.view.fe.f132103d);
        this.f131268m = com.tencent.mm.plugin.finder.view.ee.f132000d;
        a(this, true, null, null, 6, null);
    }

    public static void a(com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar, boolean z17, java.lang.Integer num, java.lang.Integer num2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            num = null;
        }
        if ((i17 & 4) != 0) {
            num2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("idle cur status=");
        sb6.append(finderLoadBar.f131268m);
        sb6.append(" processBar(");
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar = finderLoadBar.f131267i;
        sb6.append(finderProcessBar != null ? finderProcessBar.hashCode() : 0);
        sb6.append("),parent:");
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar2 = finderLoadBar.f131267i;
        android.view.ViewParent parent = finderProcessBar2 != null ? finderProcessBar2.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append("; icon(");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderLoadBar.f131266h;
        sb6.append(weImageView != null ? weImageView.hashCode() : 0);
        sb6.append("),parent:");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderLoadBar.f131266h;
        android.view.ViewParent parent2 = weImageView2 != null ? weImageView2.getParent() : null;
        sb6.append(parent2 != null ? parent2.hashCode() : 0);
        finderLoadBar.b(sb6.toString());
        com.tencent.mm.plugin.finder.view.ee eeVar = finderLoadBar.f131268m;
        com.tencent.mm.plugin.finder.view.ee eeVar2 = com.tencent.mm.plugin.finder.view.ee.f132001e;
        if (eeVar != eeVar2 || z17) {
            com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar3 = finderLoadBar.f131267i;
            if (finderProcessBar3 != null) {
                finderProcessBar3.e();
            }
            finderLoadBar.removeAllViews();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = finderLoadBar.f131266h;
            if (weImageView3 == null) {
                weImageView3 = new com.tencent.mm.ui.widget.imageview.WeImageView(finderLoadBar.getContext());
                weImageView3.s(finderLoadBar.getDefaultIconId(), finderLoadBar.getDefaultIconColor());
            }
            finderLoadBar.f131266h = weImageView3;
            if (num != null) {
                int intValue = num.intValue();
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = finderLoadBar.f131266h;
                if (weImageView4 != null) {
                    weImageView4.setImageResource(intValue);
                }
            }
            if (num2 != null) {
                int intValue2 = num2.intValue();
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = finderLoadBar.f131266h;
                if (weImageView5 != null) {
                    weImageView5.setIconColor(finderLoadBar.getContext().getResources().getColor(intValue2, null));
                }
            }
            finderLoadBar.addView(finderLoadBar.f131266h);
            finderLoadBar.f131268m = eeVar2;
        }
    }

    public static void c(com.tencent.mm.plugin.finder.view.FinderLoadBar finderLoadBar, java.lang.Integer num, java.lang.Integer num2, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            num = null;
        }
        if ((i17 & 2) != 0) {
            num2 = null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("processing cur status=");
        sb6.append(finderLoadBar.f131268m);
        sb6.append(" processBar(");
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar = finderLoadBar.f131267i;
        sb6.append(finderProcessBar != null ? finderProcessBar.hashCode() : 0);
        sb6.append("),parent:");
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar2 = finderLoadBar.f131267i;
        android.view.ViewParent parent = finderProcessBar2 != null ? finderProcessBar2.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append("; icon(");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderLoadBar.f131266h;
        sb6.append(weImageView != null ? weImageView.hashCode() : 0);
        sb6.append("),parent:");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderLoadBar.f131266h;
        android.view.ViewParent parent2 = weImageView2 != null ? weImageView2.getParent() : null;
        sb6.append(parent2 != null ? parent2.hashCode() : 0);
        finderLoadBar.b(sb6.toString());
        com.tencent.mm.plugin.finder.view.ee eeVar = finderLoadBar.f131268m;
        com.tencent.mm.plugin.finder.view.ee eeVar2 = com.tencent.mm.plugin.finder.view.ee.f132002f;
        if (eeVar == eeVar2) {
            return;
        }
        finderLoadBar.removeAllViews();
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar3 = finderLoadBar.f131267i;
        if (finderProcessBar3 == null) {
            android.content.Context context = finderLoadBar.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            finderProcessBar3 = new com.tencent.mm.plugin.finder.view.FinderProcessBar(context, 0L, 2, null);
            finderProcessBar3.c(finderLoadBar.getDefaultProcessLoadingId(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(finderLoadBar.getDefaultProcessLoadingColor(), null));
        }
        finderLoadBar.f131267i = finderProcessBar3;
        if (num != null || num2 != null) {
            finderProcessBar3.c(num != null ? num.intValue() : finderLoadBar.getDefaultProcessLoadingId(), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(num2 != null ? num2.intValue() : finderLoadBar.getDefaultProcessLoadingColor(), null));
        }
        finderLoadBar.addView(finderLoadBar.f131267i);
        com.tencent.mm.plugin.finder.view.FinderProcessBar finderProcessBar4 = finderLoadBar.f131267i;
        if (finderProcessBar4 != null) {
            finderProcessBar4.d();
        }
        finderLoadBar.f131268m = eeVar2;
    }

    private final int getDefaultIconColor() {
        return ((java.lang.Number) this.defaultIconColor.getValue()).intValue();
    }

    private final int getDefaultIconId() {
        return ((java.lang.Number) this.defaultIconId.getValue()).intValue();
    }

    private final int getDefaultProcessLoadingColor() {
        return ((java.lang.Number) this.defaultProcessLoadingColor.getValue()).intValue();
    }

    private final int getDefaultProcessLoadingId() {
        return ((java.lang.Number) this.defaultProcessLoadingId.getValue()).intValue();
    }

    public final void b(java.lang.String str) {
        boolean z17;
        boolean z18 = false;
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f306225a;
        }
        if (z18) {
            com.tencent.mars.xlog.Log.i("FinderLoadBar#" + hashCode(), str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLoadBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.defaultProcessLoadingId = jz5.h.b(com.tencent.mm.plugin.finder.view.ie.f132302d);
        this.defaultProcessLoadingColor = jz5.h.b(com.tencent.mm.plugin.finder.view.he.f132236d);
        this.defaultIconId = jz5.h.b(com.tencent.mm.plugin.finder.view.ge.f132158d);
        this.defaultIconColor = jz5.h.b(com.tencent.mm.plugin.finder.view.fe.f132103d);
        this.f131268m = com.tencent.mm.plugin.finder.view.ee.f132000d;
        a(this, true, null, null, 6, null);
    }
}
