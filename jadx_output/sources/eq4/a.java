package eq4;

/* loaded from: classes12.dex */
public final class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eq4.b f255902a;

    public a(eq4.b bVar) {
        this.f255902a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        eq4.b bVar = this.f255902a;
        if (bVar.f255905m) {
            return;
        }
        bVar.q("record");
        bVar.o(200);
    }
}
