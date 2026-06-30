package com.tencent.mm.plugin.textstatus.convert.dowhat;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.textstatus.convert.dowhat.a f173222d = new com.tencent.mm.plugin.textstatus.convert.dowhat.a();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.DoWhatCustomStatusConvert", "expand: statusIconLayout onClick");
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/dowhat/DoWhatCustomStatusConvert$expand$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
