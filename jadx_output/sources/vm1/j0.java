package vm1;

/* loaded from: classes11.dex */
public final class j0 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438017a;

    public j0(vm1.x0 x0Var) {
        this.f438017a = x0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "OpenLiteApp fail");
        db5.t7.makeText(this.f438017a.f438069e, com.tencent.mm.R.string.ggb, 0).show();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "OpenLiteApp success");
    }
}
