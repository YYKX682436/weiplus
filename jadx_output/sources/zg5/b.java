package zg5;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zg5.c f472840a;

    public b(zg5.c cVar) {
        this.f472840a = cVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 256) {
            return;
        }
        this.f472840a.dismiss();
    }
}
