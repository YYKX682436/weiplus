package ga3;

/* loaded from: classes15.dex */
public class n implements kh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.v f269861a;

    public n(ga3.v vVar) {
        this.f269861a = vVar;
    }

    @Override // kh1.d
    public void a(byte[] bArr, int i17, boolean z17) {
        ga3.v vVar = this.f269861a;
        vVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrame:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (!vVar.f269897w || bArr == null || i17 <= 0 || vVar.f269884j <= 0) {
            return;
        }
        if (i17 < bArr.length) {
            byte[] bArr2 = new byte[i17];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
            bArr = bArr2;
        }
        com.tencent.mm.plugin.lite.LiteAppCenter.onNativeRecorderFrameData(vVar.f269884j, bArr, z17);
    }
}
