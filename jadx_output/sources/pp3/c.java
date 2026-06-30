package pp3;

/* loaded from: classes5.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.j f357469d;

    public c(pp3.j jVar) {
        this.f357469d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/patmsg/ui/PatHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f357469d.f357486e;
        n3Var.sendMessageAtFrontOfQueue(n3Var.obtainMessage(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, view));
        yj0.a.h(this, "com/tencent/mm/plugin/patmsg/ui/PatHandler$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
