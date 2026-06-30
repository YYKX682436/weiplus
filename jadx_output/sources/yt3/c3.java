package yt3;

/* loaded from: classes10.dex */
public final class c3 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt3.d3 f465393d;

    public c3(yt3.d3 d3Var) {
        this.f465393d = d3Var;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        yt3.d3 d3Var = this.f465393d;
        y9.i iVar = new y9.i(d3Var.f465405d.getContext(), 0);
        android.view.Window window = iVar.getWindow();
        if (window != null) {
            window.clearFlags(2);
        }
        android.content.Context context = d3Var.f465405d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView xLabEffectSettingView = new com.tencent.mm.plugin.xlabeffect.XLabEffectSettingView(context);
        xLabEffectSettingView.setCameraView(d3Var.f465407f);
        iVar.setContentView(xLabEffectSettingView);
        iVar.show();
        yj0.a.i(true, this, "com/tencent/mm/plugin/recordvideo/plugin/RecordBeautifyPlugin$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
