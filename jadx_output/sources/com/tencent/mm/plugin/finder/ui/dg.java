package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class dg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI f129072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f129073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI, com.tencent.mm.modelbase.f fVar) {
        super(0);
        this.f129072d = finderSelfQRCodeUI;
        this.f129073e = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f129073e.f70617c;
        com.tencent.mm.plugin.finder.ui.FinderSelfQRCodeUI finderSelfQRCodeUI = this.f129072d;
        android.widget.ProgressBar progressBar = finderSelfQRCodeUI.B;
        if (progressBar == null) {
            kotlin.jvm.internal.o.o("loading");
            throw null;
        }
        progressBar.setVisibility(8);
        android.view.View view = finderSelfQRCodeUI.C;
        if (view == null) {
            kotlin.jvm.internal.o.o("refreshArea");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "handleFailureCallback", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderSelfQRCodeUI", "handleFailureCallback", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = finderSelfQRCodeUI.getString(com.tencent.mm.R.string.ggb);
        }
        db5.t7.makeText(finderSelfQRCodeUI, str, 1).show();
        return jz5.f0.f302826a;
    }
}
