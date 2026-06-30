package tl;

/* loaded from: classes12.dex */
public class j0 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.p0 f420055d;

    public j0(tl.p0 p0Var) {
        this.f420055d = p0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        tl.p0 p0Var = this.f420055d;
        if (booleanValue) {
            p0Var.n();
            return null;
        }
        if (p0Var.f420081n) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoice.Recorder", "mHasBeginRec is true");
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoice.Recorder", "after start bluetooth, timeout to directly start record");
        p0Var.n();
        return null;
    }
}
