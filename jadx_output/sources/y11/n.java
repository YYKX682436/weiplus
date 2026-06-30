package y11;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ly11/n;", "Lg75/f0;", "Ly11/l;", "Ly11/m;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-messenger-foundation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class n extends g75.f0<y11.l, y11.m> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendMsgPPC.SendMsgDoCgiPPC", "pipeline:" + this.f269401a.hashCode());
        v65.i.b((com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) ((y11.b0) i95.n0.c(y11.b0.class)).f458805n).getValue(), null, new y11.a0(null), 1, null);
        return new y11.m(((y11.l) bVar).f458819b);
    }
}
