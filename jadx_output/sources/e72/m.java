package e72;

/* loaded from: classes14.dex */
public class m extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e72.v f249919a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e72.v vVar, long j17, long j18) {
        super(j17, j18);
        this.f249919a = vVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: on count number finished");
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: on ticked");
        e72.v vVar = this.f249919a;
        if (vVar.f249945r) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NumberFaceMotion", "hy: isEnd. trigger cancel");
            cancel();
            return;
        }
        if (vVar.f249938k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: suspend.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: mCurrentShowedIndexInItem: %d, mItemDatas[mCurrentGroupDataIndex].length() - 1: %d, mCurrentGroupDataIndex: %d, mItemDatas.length - 1 : %d", java.lang.Integer.valueOf(vVar.f249933f), java.lang.Integer.valueOf(vVar.f249931d[vVar.f249932e].length() - 1), java.lang.Integer.valueOf(vVar.f249932e), java.lang.Integer.valueOf(vVar.f249931d.length - 1));
        if (vVar.f249933f < vVar.f249931d[vVar.f249932e].length() - 1) {
            vVar.f249933f++;
            vVar.f249948u.sendEmptyMessage(0);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NumberFaceMotion", "hy: last number in group");
        com.tencent.mm.sdk.platformtools.u3.i(vVar.f249950w, 1500L);
        vVar.f249945r = true;
        cancel();
        vVar.f249945r = true;
    }
}
