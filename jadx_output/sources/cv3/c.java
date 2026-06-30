package cv3;

/* loaded from: classes5.dex */
public abstract class c implements cv3.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f222569d;

    /* renamed from: e, reason: collision with root package name */
    public final int f222570e;

    /* renamed from: f, reason: collision with root package name */
    public uu3.u f222571f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f222572g;

    public c(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f222569d = context;
        this.f222570e = i17;
        this.f222572g = "MicroMsg.AbsMusicPickerDrawer";
    }

    public vu3.c a() {
        android.content.Context context = this.f222569d;
        return new vu3.b(context, context.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_5));
    }

    public abstract void b();

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public boolean isShow() {
        uu3.u uVar = this.f222571f;
        return uVar != null && uVar.isDrawerOpen;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public boolean onBackPress() {
        if (!isShow()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f222572g, "closeDrawer: ");
        uu3.u uVar = this.f222571f;
        if (uVar != null) {
            com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView
    public void setShow(boolean z17) {
        java.lang.String str = this.f222572g;
        if (!z17) {
            com.tencent.mars.xlog.Log.i(str, "closeDrawer: ");
            uu3.u uVar = this.f222571f;
            if (uVar != null) {
                com.tencent.mm.plugin.recordvideo.ui.drawer.MMCustomDraggableLayout.a(uVar, false, 1, null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openDrawerWithCheck: ");
        sb6.append(this.f222571f == null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        uu3.u uVar2 = this.f222571f;
        if (uVar2 == null && uVar2 == null) {
            com.tencent.mars.xlog.Log.i(str, "checkDrawerCreate: ");
            android.content.Context context = this.f222569d;
            int k17 = i65.a.k(context) + com.tencent.mm.ui.bk.p(context);
            int i17 = this.f222570e;
            float f17 = i17 > 0 ? i17 : k17 * 0.75f;
            androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
            if (appCompatActivity != null) {
                android.view.View findViewById = appCompatActivity.findViewById(android.R.id.content);
                kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
                vu3.h hVar = new vu3.h(this.f222569d, 0, 0, 0, false, 30, null);
                uu3.f fVar = new uu3.f();
                fVar.f431276a = f17;
                fVar.f431277b = hVar;
                cv3.h hVar2 = (cv3.h) this;
                fVar.f431278c = new vu3.d(hVar2.d());
                fVar.a(new cv3.f(hVar2));
                fVar.f431279d = a();
                ((java.util.ArrayList) fVar.f431282g).add(new cv3.a(hVar, this));
                uu3.u b17 = fVar.b((android.view.ViewGroup) findViewById);
                this.f222571f = b17;
                b17.setOnDrawerDetach(cv3.b.f222568d);
                b();
            }
        }
        com.tencent.mars.xlog.Log.i(str, "openDrawer: ");
        uu3.u uVar3 = this.f222571f;
        if (uVar3 != null) {
            uVar3.l(-uVar3.edgeAttached, false);
        }
    }
}
