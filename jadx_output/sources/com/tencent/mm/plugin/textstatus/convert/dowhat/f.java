package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes11.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.dowhat.i f173232d;

    public f(com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar) {
        this.f173232d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        android.text.Editable text;
        java.lang.String obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.convert.dowhat.i iVar = this.f173232d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = iVar.f173238i;
        if (mMEditText == null || (text = mMEditText.getText()) == null || (obj = text.toString()) == null || (str = r26.n0.u0(obj).toString()) == null) {
            str = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ok: ");
        sb6.append(str);
        sb6.append(' ');
        java.lang.String iconId = iVar.f173239m;
        sb6.append(iconId);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", sb6.toString());
        com.tencent.mm.plugin.textstatus.ui.q7 q7Var = (com.tencent.mm.plugin.textstatus.ui.q7) iVar.f173234e;
        q7Var.getClass();
        kotlin.jvm.internal.o.g(iconId, "iconId");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "onCustomStatusConfirm onItemClick() called with: iconId = " + iconId + ", customStatusWord = " + str);
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2 textStatusDoWhatActivityV2 = q7Var.f174224a;
        textStatusDoWhatActivityV2.getClass();
        textStatusDoWhatActivityV2.f173541i = str;
        com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.X6(q7Var.f174224a, iconId, false, false, 6, null);
        ((com.tencent.mm.plugin.textstatus.ui.r7) iVar.f173235f).a("ACTION_EXIT");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
