package x00;

/* loaded from: classes8.dex */
public final class b extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (jumpInfo.g().b() == null) {
            callback.c("jumpInfo.nativeInfo.params is null");
            return;
        }
        bw5.a7 a7Var = new bw5.a7();
        a7Var.parseFrom(jumpInfo.g().b().g());
        boolean[] zArr = a7Var.f25042m;
        java.lang.String str = zArr[2] ? a7Var.f25037e : "";
        if (str == null || str.length() == 0) {
            callback.c("orderId is null");
            return;
        }
        android.content.Context c17 = context.c();
        if (c17 == null) {
            callback.c("context.context is null");
            return;
        }
        c00.m3 m3Var = (c00.m3) i95.n0.c(c00.m3.class);
        java.lang.String str2 = zArr[2] ? a7Var.f25037e : "";
        kotlin.jvm.internal.o.f(str2, "getOrderId(...)");
        ((j00.d2) m3Var).Ui(c17, str2, new x00.a(callback));
    }
}
