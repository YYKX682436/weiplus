package pf3;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pf3.d f353816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f353818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f353819g;

    public c(pf3.d dVar, java.lang.String str, android.view.View.OnClickListener onClickListener, android.view.View view) {
        this.f353816d = dVar;
        this.f353817e = str;
        this.f353818f = onClickListener;
        this.f353819g = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/common/BaseOperationLayer$clickable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f353816d.Q("click: " + this.f353817e, new java.lang.Object[0]);
        this.f353818f.onClick(this.f353819g);
        yj0.a.h(this, "com/tencent/mm/plugin/media/common/BaseOperationLayer$clickable$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
