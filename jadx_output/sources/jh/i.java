package jh;

/* loaded from: classes13.dex */
public final class i implements jh.n {
    public i(jh.c cVar) {
    }

    @Override // jh.n
    public boolean a(java.lang.String str, int i17) {
        return com.tencent.matrix.backtrace.WeChatBacktraceNative.warmUp(str, i17, false);
    }
}
