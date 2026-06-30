package mn0;

/* loaded from: classes3.dex */
public class z extends mn0.y {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r2, r0)
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.o.f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn0.z.<init>(android.content.Context):void");
    }

    @Override // mn0.y
    public com.tencent.rtmp.TXLivePlayer e(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.rtmp.TXLivePlayer(context);
    }
}
