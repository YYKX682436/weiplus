package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.u0 f191321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.v0 f191322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f191323f;

    public t0(com.tencent.mm.pluginsdk.ui.u0 u0Var, com.tencent.mm.pluginsdk.ui.v0 v0Var, int i17) {
        this.f191321d = u0Var;
        this.f191322e = v0Var;
        this.f191323f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.recyclerview.widget.f2 adapter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.u0 u0Var = this.f191321d;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove() called with: data = ");
        com.tencent.mm.pluginsdk.ui.v0 data = this.f191322e;
        sb6.append(data);
        sb6.append(", position = ");
        int i17 = this.f191323f;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FilePreviewItemConvert", sb6.toString());
        com.tencent.mm.pluginsdk.ui.q0 q0Var = u0Var.f192026e;
        if (q0Var != null) {
            kotlin.jvm.internal.o.g(data, "data");
            int i18 = com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI.f189767i;
            com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI fileSelectorPreviewUI = ((com.tencent.mm.pluginsdk.ui.w0) q0Var).f192035a;
            fileSelectorPreviewUI.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FileSelectorPreviewUI", "remove() called with: data = " + data + ", position = " + i17);
            c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).i("INTENT_KEY_DATA_LIST", fileSelectorPreviewUI.f189770f);
            fileSelectorPreviewUI.f189770f.remove(data);
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = fileSelectorPreviewUI.f189768d;
            if (wxRecyclerView != null && (adapter = wxRecyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
            android.widget.TextView textView = fileSelectorPreviewUI.f189769e;
            if (textView != null) {
                textView.setVisibility(com.tencent.mm.sdk.platformtools.t8.L0(fileSelectorPreviewUI.f189770f) ? 0 : 8);
            }
            fileSelectorPreviewUI.U6();
            if (com.tencent.mm.sdk.platformtools.t8.L0(fileSelectorPreviewUI.f189770f)) {
                fileSelectorPreviewUI.finish();
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/FilePreviewItemConvert$onBindViewHolder$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
