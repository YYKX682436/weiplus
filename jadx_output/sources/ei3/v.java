package ei3;

/* loaded from: classes12.dex */
public class v extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ei3.w f253150a;

    public v(ei3.w wVar) {
        this.f253150a = wVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        ei3.w wVar = this.f253150a;
        ei3.h hVar = wVar.f253154b;
        if (hVar != null) {
            hVar.a();
            wVar.f253154b = null;
        }
    }
}
