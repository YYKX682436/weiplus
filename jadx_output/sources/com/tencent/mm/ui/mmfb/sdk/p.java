package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mmfb.sdk.s f209220d;

    public p(com.tencent.mm.ui.mmfb.sdk.s sVar) {
        this.f209220d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mmfb/sdk/FbDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.mmfb.sdk.s sVar = this.f209220d;
        sVar.f209226e.onCancel();
        sVar.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/mmfb/sdk/FbDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
