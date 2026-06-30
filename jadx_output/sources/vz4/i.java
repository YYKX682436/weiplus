package vz4;

/* loaded from: classes.dex */
public class i implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("IPCSyncInvokeTask_AddOfflineCallback", "cpan offline getProcessName:%s", bm5.f1.a());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("result", "test");
        return bundle;
    }
}
