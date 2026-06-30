package or1;

/* loaded from: classes.dex */
public class z implements wd0.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI f347603a;

    public z(com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI) {
        this.f347603a = brandServiceIndexUI;
    }

    @Override // wd0.o1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceIndexUI", "doPopUpCloseSheet fail!");
    }

    @Override // wd0.o1
    public void onSuccess() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceIndexUI", "doPopUpCloseSheet success!");
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        com.tencent.mm.plugin.brandservice.ui.BrandServiceIndexUI brandServiceIndexUI = this.f347603a;
        androidx.appcompat.app.AppCompatActivity context = brandServiceIndexUI.getContext();
        ((vd0.j2) q1Var).getClass();
        v24.o0.a(context, 3, 1, 256L, 0L, null, true);
        brandServiceIndexUI.finish();
    }
}
