package du3;

/* loaded from: classes3.dex */
public final class j0 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f243631f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f243632g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f243633h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(parent, "parent");
        this.f243631f = parent;
        this.f243632g = jz5.h.b(new du3.c0(this));
        this.f243633h = jz5.h.b(new du3.i0(this));
    }

    @Override // yt3.r2
    public void onAttach() {
        android.view.View z17 = z();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(z17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        z17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(z17, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoBackPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jz5.g gVar = this.f243633h;
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(2, new du3.e0(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(3, new du3.f0(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).Z6(4, new du3.g0(this));
        ((hk0.u0) ((jz5.n) gVar).getValue()).a7(1, new du3.h0(this));
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        z().setOnClickListener(new du3.d0(this));
    }

    public final android.view.View z() {
        java.lang.Object value = ((jz5.n) this.f243632g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }
}
