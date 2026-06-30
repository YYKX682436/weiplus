package com.tencent.mm.view.recyclerview;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B-\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/recyclerview/WxLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class WxLinearLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {

    /* renamed from: v, reason: collision with root package name */
    public final android.content.Context f213714v;

    public WxLinearLayoutManager(android.content.Context context) {
        super(context);
        this.f213714v = context;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void P(int i17, int i18) {
        super.P(i17, i18);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WxLinearLayoutManager", "scrollToPositionWithOffset:" + i17 + " offset:" + i18, new java.lang.Object[0]);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        android.content.Context context = this.f213714v;
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.IllegalArgumentException e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLayoutChildren ");
            sb6.append(context != null ? context.getClass().getName() : null);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxLinearLayoutManager", e17, sb6.toString(), new java.lang.Object[0]);
        } catch (java.lang.IndexOutOfBoundsException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxLinearLayoutManager", "meet a IOOBE in RecyclerView");
        } catch (java.lang.Exception e18) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("onLayoutChildren ");
            sb7.append(context != null ? context.getClass().getName() : null);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxLinearLayoutManager", e18, sb7.toString(), new java.lang.Object[0]);
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
                throw e18;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        super.scrollToPosition(i17);
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WxLinearLayoutManager", "scrollToPosition:" + i17, new java.lang.Object[0]);
    }

    public WxLinearLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context, i17, z17);
        this.f213714v = context;
    }

    public WxLinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f213714v = context;
    }
}
