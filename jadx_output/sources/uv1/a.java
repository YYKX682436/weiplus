package uv1;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lo.j f431357d;

    public a(uv1.d dVar, lo.j jVar) {
        this.f431357d = jVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileService", "requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        xv1.d.b(i17, i18, intent, this.f431357d);
    }
}
