package x10;

/* loaded from: classes9.dex */
public final class a extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.FinderLotteryCompleteRecord", "handle FinderLotteryCompleteRecord jump");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            callback.c("context.context is null");
            return;
        }
        ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Oj(c17, null, true);
        callback.d(null);
    }
}
