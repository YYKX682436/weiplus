package r53;

/* loaded from: classes8.dex */
public class m implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r[] f392679a;

    public m(com.tencent.mm.ipcinvoker.r[] rVarArr) {
        this.f392679a = rVarArr;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("MicroMsg.GameCenterUtil", "gamelog.util, startLiteApp fail");
        com.tencent.mm.ipcinvoker.r[] rVarArr = this.f392679a;
        com.tencent.mm.ipcinvoker.d0.h(rVarArr[0]);
        rVarArr[0] = null;
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameCenterUtil", "gamelog.util, startLiteApp success");
        com.tencent.mm.ipcinvoker.r[] rVarArr = this.f392679a;
        com.tencent.mm.ipcinvoker.d0.h(rVarArr[0]);
        rVarArr[0] = null;
    }
}
