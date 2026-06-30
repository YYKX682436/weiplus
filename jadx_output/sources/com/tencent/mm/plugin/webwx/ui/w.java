package com.tencent.mm.plugin.webwx.ui;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.k f188069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f188070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webwx.ui.k0 f188071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f188072g;

    public w(ug3.k kVar, boolean z17, com.tencent.mm.plugin.webwx.ui.k0 k0Var, int i17) {
        this.f188069d = kVar;
        this.f188070e = z17;
        this.f188071f = k0Var;
        this.f188072g = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f188069d.f392471n);
        sb6.append(", show/hide card, isShow:");
        boolean z17 = this.f188070e;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", sb6.toString());
        com.tencent.mm.plugin.webwx.ui.r rVar = this.f188071f.f188022e;
        if (rVar != null) {
            int i17 = z17 ? -1 : this.f188072g;
            androidx.recyclerview.widget.f2 adapter = ((com.tencent.mm.plugin.webwx.ui.LoginDeviceListUI) rVar).T6().getAdapter();
            com.tencent.mm.plugin.webwx.ui.m mVar = adapter instanceof com.tencent.mm.plugin.webwx.ui.m ? (com.tencent.mm.plugin.webwx.ui.m) adapter : null;
            if (mVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LoginDeviceAdapter", "setSelection:" + i17 + ", oriSelection:" + mVar.f188045e);
                if (mVar.f188045e != i17) {
                    mVar.f188045e = i17;
                    mVar.notifyDataSetChanged();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/webwx/ui/LoginDeviceViewHolder$fillContent$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
