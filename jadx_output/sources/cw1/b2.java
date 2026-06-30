package cw1;

/* loaded from: classes3.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f222810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.o0 f222811e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f222812f;

    public b2(android.widget.Button button, cw1.o0 o0Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f222810d = button;
        this.f222811e = o0Var;
        this.f222812f = cleanCacheUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f222811e.d(!kotlin.jvm.internal.o.b(this.f222810d.getTag(), java.lang.Boolean.TRUE));
        this.f222812f.f95694i.invoke();
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanCacheUI$initUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
