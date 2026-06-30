package ia2;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f289922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f289923e;

    public g(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f289922d = aiVar;
        this.f289923e = appCompatActivity;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "halfScreen Translation");
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
        this.f289922d.S6(this);
        this.f289923e.finish();
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "halfScreen Open");
    }
}
