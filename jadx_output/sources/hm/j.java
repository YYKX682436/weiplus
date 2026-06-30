package hm;

/* loaded from: classes12.dex */
public final class j extends jm0.g {

    /* renamed from: g, reason: collision with root package name */
    public static final hm.g f282154g = new hm.g(null);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f282155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
        this.f282155f = jz5.h.b(hm.i.f282153d);
    }

    @Override // jm0.g
    public void Q6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        pm0.v.O("Update_AppMsgAsyncSendFSC", new hm.h(this));
    }

    public final com.tencent.mm.sdk.platformtools.o4 T6() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) this.f282155f).getValue();
    }
}
