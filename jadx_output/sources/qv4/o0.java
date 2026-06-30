package qv4;

/* loaded from: classes8.dex */
public final class o0 implements q80.f0 {
    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("FTS.GlobalTeachViewAdapter", "startLiteApp, callback failed");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("FTS.GlobalTeachViewAdapter", "startLiteApp, callback successfully");
    }
}
