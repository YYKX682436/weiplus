package ib0;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.openmsg.ui.OpenMsgUI f290034d;

    public g(com.tencent.mm.feature.openmsg.ui.OpenMsgUI openMsgUI) {
        this.f290034d = openMsgUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/openmsg/ui/OpenMsgUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        androidx.appcompat.app.AppCompatActivity context = this.f290034d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((gb0.n) kVar).getClass();
        ib0.e eVar = ib0.e.f290029a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/5ovo5GKYRLqp7KJZ");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/feature/openmsg/ui/OpenMsgUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
