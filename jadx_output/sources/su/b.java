package su;

/* loaded from: classes9.dex */
public final class b extends ru.j {

    /* renamed from: o, reason: collision with root package name */
    public final su.d f412619o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(su.d params) {
        super(params);
        kotlin.jvm.internal.o.g(params, "params");
        this.f412619o = params;
    }

    @Override // ru.j
    public void G(com.tencent.mm.storage.f9 msgInfo, l15.c commonMsg, java.lang.String thumbName) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(commonMsg, "commonMsg");
        kotlin.jvm.internal.o.g(thumbName, "thumbName");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseSendAppMsgTask", id() + " save thumbData path: " + m11.b1.Di().L0(msgInfo, bm5.f0.f22564i, this.f412619o.f412181c, thumbName));
    }
}
