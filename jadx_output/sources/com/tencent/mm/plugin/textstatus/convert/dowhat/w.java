package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.x f173250d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ej4.k f173251e;

    public w(com.tencent.mm.plugin.textstatus.convert.dowhat.x xVar, ej4.k kVar) {
        this.f173250d = xVar;
        this.f173251e = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.convert.dowhat.v vVar = this.f173250d.f173252e;
        if (vVar != null) {
            kotlin.jvm.internal.o.d(view);
            ej4.k kVar = this.f173251e;
            java.lang.String iconId = kVar.f253369d;
            java.lang.String str = kVar.f253370e;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.textstatus.ui.t7 t7Var = (com.tencent.mm.plugin.textstatus.ui.t7) vVar;
            kotlin.jvm.internal.o.g(iconId, "iconId");
            com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
            com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = t7Var.f174318a;
            if (!textStatusDoWhatActivityV2.b7().isExpand) {
                textStatusDoWhatActivityV2.f173541i = str;
                com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(t7Var.f174318a, iconId, true, false, 4, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/RecentUseStatusConvert$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
