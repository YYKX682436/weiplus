package tf4;

/* loaded from: classes12.dex */
public final class a extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf4.b f418949a;

    public a(tf4.b bVar) {
        this.f418949a = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        tf4.b bVar = this.f418949a;
        if (bVar.f418951l) {
            return;
        }
        bVar.o(200);
        bVar.q("record");
    }
}
