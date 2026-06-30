package zl2;

/* loaded from: classes.dex */
public final class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f473690f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.u3 f473691g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f473692h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473693i;

    public c1(android.content.Context context, int i17, int i18, com.tencent.mm.storage.u3 u3Var, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f473688d = context;
        this.f473689e = i17;
        this.f473690f = i18;
        this.f473691g = u3Var;
        this.f473692h = c0Var;
        this.f473693i = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new zl2.b1(this.f473688d, this.f473689e, this.f473690f, this.f473691g, this.f473692h, this.f473693i, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/utils/FinderLiveUtil$checkGiftLegalArgeement$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
