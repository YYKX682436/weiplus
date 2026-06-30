package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class f7 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f129122d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f129123e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI f129124f;

    public f7(com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI) {
        this.f129124f = finderImagePreviewUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f129122d.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (java.lang.String) this.f129122d.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        wo0.c a17;
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        com.tencent.mm.plugin.finder.ui.FinderImagePreviewUI finderImagePreviewUI = this.f129124f;
        if (view == null) {
            view = new com.tencent.mm.ui.base.MultiTouchImageView(finderImagePreviewUI, 0, 0);
            view.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        }
        boolean z17 = this.f129123e;
        java.util.ArrayList arrayList = this.f129122d;
        if (z17) {
            vo0.a aVar = vo0.e.f438468b;
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            kotlin.jvm.internal.o.d(str);
            wo0.c i18 = aVar.i(str);
            i18.f447873d = new com.tencent.mm.plugin.finder.ui.c7(finderImagePreviewUI);
            ((wo0.b) i18).c((android.widget.ImageView) view);
        } else {
            boolean z18 = finderImagePreviewUI.f128591z;
            pf5.u uVar = pf5.u.f353936a;
            if (z18) {
                mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).N).getValue());
                java.lang.String str2 = (java.lang.String) arrayList.get(i17);
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                a17 = d1Var.a(new mn2.n(str2 != null ? str2 : "", com.tencent.mm.plugin.finder.storage.y90.V));
            } else {
                mn2.d1 d1Var2 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) uVar.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                java.lang.String str3 = (java.lang.String) arrayList.get(i17);
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                a17 = d1Var2.a(new mn2.q3(str3 != null ? str3 : "", com.tencent.mm.plugin.finder.storage.y90.f128355e));
            }
            if (a17 instanceof wo0.b) {
                ((wo0.b) a17).i((android.widget.ImageView) view, new com.tencent.mm.plugin.finder.ui.e7(finderImagePreviewUI));
            }
        }
        return view;
    }
}
