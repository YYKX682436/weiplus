package hs;

/* loaded from: classes5.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kd0.g3 f284511d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f284512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f284513f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f284514g;

    public b0(kd0.g3 g3Var, ll5.a aVar, int i17, android.view.View.OnClickListener onClickListener) {
        this.f284511d = g3Var;
        this.f284512e = aVar;
        this.f284513f = i17;
        this.f284514g = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/MyQRCodeService$bindItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.model.h2.E(this.f284511d, this.f284512e.f319270h, this.f284513f);
        android.view.View.OnClickListener onClickListener = this.f284514g;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        yj0.a.h(this, "com/tencent/mm/feature/MyQRCodeService$bindItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
