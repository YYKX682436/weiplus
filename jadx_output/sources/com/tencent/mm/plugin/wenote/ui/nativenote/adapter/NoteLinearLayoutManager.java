package com.tencent.mm.plugin.wenote.ui.nativenote.adapter;

/* loaded from: classes12.dex */
public class NoteLinearLayoutManager extends com.tencent.mm.view.recyclerview.WxLinearLayoutManager {

    /* renamed from: w, reason: collision with root package name */
    public final int f188180w;

    /* renamed from: x, reason: collision with root package name */
    public int f188181x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f188182y;

    public NoteLinearLayoutManager(android.content.Context context) {
        super(context);
        this.f188180w = com.tencent.mm.sdk.platformtools.d2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        this.f188181x = -1;
        this.f188182y = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int G(androidx.recyclerview.widget.h3 h3Var) {
        int i17 = this.f188181x;
        if (i17 > 0) {
            return i17;
        }
        return 900;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View view, int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            return super.onFocusSearchFailed(view, i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteLinearLayoutManager", "[onFocusSearchFailed] crash e = " + e17);
            return null;
        }
    }

    @Override // com.tencent.mm.view.recyclerview.WxLinearLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            super.onLayoutChildren(z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteLinearLayoutManager", "[onLayoutChildren] crash e = " + e17);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        try {
            return super.scrollHorizontallyBy(i17, z2Var, h3Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NoteLinearLayoutManager", "[scrollHorizontallyBy] crash e = " + e17);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (!this.f188182y) {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        }
        boolean z17 = i17 < 0 && android.util.TypedValue.applyDimension(1, 49.0f, mz4.j0.f333292x) <= ((float) java.lang.Math.abs(i17));
        if (i17 > 0) {
            z17 = ((float) this.f188180w) + android.util.TypedValue.applyDimension(1, 49.0f, mz4.j0.f333292x) < ((float) i17);
        }
        if (z17 && this.f188182y) {
            return 0;
        }
        try {
            return super.scrollVerticallyBy(i17, z2Var, h3Var);
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public NoteLinearLayoutManager(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        this.f188180w = com.tencent.mm.sdk.platformtools.d2.b(com.tencent.mm.sdk.platformtools.x2.f193071a, true);
        this.f188181x = -1;
        this.f188182y = false;
        this.f11881u = 0;
    }
}
