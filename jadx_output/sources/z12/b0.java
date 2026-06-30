package z12;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f469280a;

    /* renamed from: b, reason: collision with root package name */
    public final int f469281b;

    public b0(java.lang.String str, int i17) {
        this.f469280a = str;
        this.f469281b = i17;
    }

    public final void a(yz5.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        int i17 = this.f469281b;
        java.lang.String str = this.f469280a;
        if (str != null || i17 != 0) {
            new z12.m(str, i17).l().K(new z12.a0(this, callback));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.StoreEmoticonGetDesignerAcctInfoCgi", "No valid request info provided");
            callback.invoke(null, str);
        }
    }
}
