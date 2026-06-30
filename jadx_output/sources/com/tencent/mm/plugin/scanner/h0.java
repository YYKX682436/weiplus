package com.tencent.mm.plugin.scanner;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.MultiCodeMaskView f158729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f158730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ImageQBarDataBean f158731f;

    public h0(com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView, java.util.ArrayList arrayList, com.tencent.mm.plugin.scanner.ImageQBarDataBean imageQBarDataBean) {
        this.f158729d = multiCodeMaskView;
        this.f158730e = arrayList;
        this.f158731f = imageQBarDataBean;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.MultiCodeMaskView multiCodeMaskView = this.f158729d;
        com.tencent.mm.plugin.scanner.f0 mMultiCodeMaskViewListener = multiCodeMaskView.getMMultiCodeMaskViewListener();
        if (mMultiCodeMaskViewListener != null) {
            mMultiCodeMaskViewListener.a(this.f158730e, this.f158731f, false);
        }
        multiCodeMaskView.a();
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/MultiCodeMaskView$initData$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
