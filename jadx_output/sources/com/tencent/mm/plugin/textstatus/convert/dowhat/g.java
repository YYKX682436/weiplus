package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.i f173233d;

    public g(com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar) {
        this.f173233d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar = this.f173233d;
        iVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "cancel: ");
        ((com.tencent.mm.plugin.textstatus.ui.r7) iVar.f173235f).a("ACTION_ENTER");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
