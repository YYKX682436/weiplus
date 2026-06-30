package dk5;

/* loaded from: classes.dex */
public class z6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.ShareImageSelectorUI f235023d;

    public z6(com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI) {
        this.f235023d = shareImageSelectorUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.transmit.ShareImageSelectorUI.f211038m;
        com.tencent.mm.ui.transmit.ShareImageSelectorUI shareImageSelectorUI = this.f235023d;
        shareImageSelectorUI.getClass();
        android.content.Intent intent = new android.content.Intent(shareImageSelectorUI, (java.lang.Class<?>) com.tencent.mm.ui.tools.ShowImageUI.class);
        intent.putExtra("key_image_path", shareImageSelectorUI.f211039d);
        intent.putExtra("show_menu", false);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(shareImageSelectorUI, arrayList2.toArray(), "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        shareImageSelectorUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(shareImageSelectorUI, "com/tencent/mm/ui/transmit/ShareImageSelectorUI", "showImage", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/transmit/ShareImageSelectorUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
