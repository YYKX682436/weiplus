package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f159121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f159122e;

    public p0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView, java.util.ArrayList arrayList) {
        this.f159121d = multiCodeMaskView;
        this.f159122e = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f159121d;
        multiCodeMaskView.a();
        com.tencent.mm.plugin.scanner.f0 mMultiCodeMaskViewListener = multiCodeMaskView.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.b(this.f159122e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$setCancelView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
