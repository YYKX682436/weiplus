package ku3;

/* loaded from: classes3.dex */
public final class m0 implements yt3.r2, androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312311d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f312312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f312313f;

    public m0(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312311d = kitContext;
        this.f312312e = jz5.h.b(new ku3.l0(parent));
    }

    public final android.view.View a() {
        java.lang.Object value = ((jz5.n) this.f312312e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zt3.c cVar = (zt3.c) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitNineGridPlugin", "onChanged >> " + cVar);
        if (cVar == null) {
            return;
        }
        android.view.View a17 = a();
        int i17 = cVar.f475588b ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitNineGridPlugin", "onChanged", "(Lcom/tencent/mm/plugin/recordvideo/plugin/context/MenuInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f312311d.R6(new ku3.k0(this));
    }
}
