package fh5;

/* loaded from: classes13.dex */
public final class d implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh5.e f262720d;

    public d(fh5.e eVar) {
        this.f262720d = eVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.Object obj = msg.obj;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.ui.inflate.WxAsyncLayoutInflater.InflateRequest");
        fh5.a aVar = (fh5.a) obj;
        this.f262720d.getClass();
        aVar.f262716e = null;
        aVar.f262712a = null;
        aVar.f262713b = null;
        aVar.f262714c = 0;
        aVar.f262715d = null;
        fh5.e.f262721f.b(aVar);
        return true;
    }
}
