package cv3;

/* loaded from: classes5.dex */
public final class f extends vu3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cv3.h f222573b;

    public f(cv3.h hVar) {
        this.f222573b = hVar;
    }

    @Override // vu3.c
    public void b(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        cv3.h hVar = this.f222573b;
        com.tencent.mars.xlog.Log.i(hVar.f222575h, "onDrawerClose: ");
        yz5.l lVar = hVar.f222576i;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
        com.tencent.mm.sdk.platformtools.t8.t0(hVar.d());
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a aVar = (com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a) hVar.d().b(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.a.class);
        if (aVar != null) {
            aVar.o(true);
        }
    }

    @Override // vu3.c
    public void d(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        cv3.h hVar = this.f222573b;
        com.tencent.mars.xlog.Log.i(hVar.f222575h, "onDrawerOpen: ");
        yz5.l lVar = hVar.f222576i;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        cv3.h hVar = this.f222573b;
        yz5.p pVar = hVar.f222577m;
        if (pVar != null) {
            pVar.invoke(java.lang.Float.valueOf(f17), source);
        }
        java.lang.String str = hVar.f222575h;
    }
}
