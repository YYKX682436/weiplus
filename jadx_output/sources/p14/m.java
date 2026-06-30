package p14;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView f351234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351235e;

    public m(com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView, android.content.Context context) {
        this.f351234d = selfQrCodeView;
        this.f351235e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView.G;
        com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView selfQrCodeView = this.f351234d;
        selfQrCodeView.getClass();
        selfQrCodeView.f160094e = false;
        selfQrCodeView.f160095f = false;
        selfQrCodeView.f160096g = null;
        com.tencent.mm.plugin.setting.ui.qrcode.SelfQrCodeView.k(selfQrCodeView);
        android.content.Context context = this.f351235e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.tencent.mm.plugin.setting.ui.setting.i0) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.setting.ui.setting.i0.class)).T6(false);
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/qrcode/SelfQrCodeView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
