package te2;

/* loaded from: classes3.dex */
public final class h6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f418060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cf2.h f418061f;

    public h6(te2.p8 p8Var, r45.h32 h32Var, cf2.h hVar) {
        this.f418059d = p8Var;
        this.f418060e = h32Var;
        this.f418061f = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cf2.h hVar = this.f418061f;
        this.f418059d.V6(this.f418060e, hVar.M.getText().toString());
        hVar.B();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initView$9$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
