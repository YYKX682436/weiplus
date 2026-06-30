package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj4.d f173240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.m f173241e;

    public l(lj4.d dVar, com.tencent.mm.plugin.textstatus.convert.dowhat.m mVar) {
        this.f173240d = dVar;
        this.f173241e = mVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String str = this.f173240d.f318982e;
        if (str != null) {
            com.tencent.mm.plugin.textstatus.convert.dowhat.u uVar = this.f173241e.f173242e;
            kotlin.jvm.internal.o.d(view);
            uVar.a(view, str);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
