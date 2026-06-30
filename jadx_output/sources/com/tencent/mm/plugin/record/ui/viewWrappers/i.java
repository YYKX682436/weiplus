package com.tencent.mm.plugin.record.ui.viewWrappers;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f155513d;

    /* renamed from: e, reason: collision with root package name */
    public et3.b f155514e;

    /* renamed from: f, reason: collision with root package name */
    public o72.r2 f155515f;

    /* renamed from: g, reason: collision with root package name */
    public r45.gp0 f155516g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f155517h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.viewWrappers.m f155518i;

    public i(com.tencent.mm.plugin.record.ui.viewWrappers.m mVar) {
        this.f155518i = mVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view != null) {
            this.f155513d = view.getContext();
            et3.b bVar = (et3.b) view.getTag();
            this.f155514e = bVar;
            this.f155515f = bVar.f256591b;
            this.f155516g = bVar.f256590a;
        }
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 2;
        z9Var.f8533f = this.f155514e.f256590a;
        favoriteOperationEvent.e();
        java.lang.String str = favoriteOperationEvent.f54244h.f6136c;
        this.f155517h = str;
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ImageViewWrapper", "file not exists");
            yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
        com.tencent.mm.plugin.record.ui.viewWrappers.m mVar = this.f155518i;
        if (mVar.f155539c == null) {
            mVar.f155539c = new com.tencent.mm.ui.widget.dialog.k0(this.f155513d, 1, false);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f155539c;
        k0Var.f211872n = new com.tencent.mm.plugin.record.ui.viewWrappers.d(this);
        k0Var.f211881s = new com.tencent.mm.plugin.record.ui.viewWrappers.g(this);
        k0Var.p(new com.tencent.mm.plugin.record.ui.viewWrappers.h(this));
        mVar.f155539c.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/record/ui/viewWrappers/ImageViewWrapper$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
