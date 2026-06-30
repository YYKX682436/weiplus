package hs;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd0.g3 f284516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f284517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f284519g;

    public c0(kd0.g3 g3Var, ll5.a aVar, int i17, android.view.View.OnClickListener onClickListener) {
        this.f284516d = g3Var;
        this.f284517e = aVar;
        this.f284518f = i17;
        this.f284519g = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/MyQRCodeService$bindMoreBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.model.h2.E(this.f284516d, this.f284517e.f319270h, this.f284518f);
        android.view.View.OnClickListener onClickListener = this.f284519g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/feature/MyQRCodeService$bindMoreBtnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
