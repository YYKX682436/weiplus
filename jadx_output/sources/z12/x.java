package z12;

/* loaded from: classes12.dex */
public class x implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z12.y f469380a;

    public x(z12.y yVar) {
        this.f469380a = yVar;
    }

    @Override // qr.i
    public void onResult(int i17, java.lang.String str) {
        z12.y yVar = this.f469380a;
        if (i17 != 0) {
            yVar.f469382e.onSceneEnd(4, -2, "", yVar);
            return;
        }
        yVar.f469385h = true;
        yVar.f469384g = true;
        if (yVar.doScene(yVar.dispatcher(), yVar.f469382e) < 0) {
            yVar.f469382e.onSceneEnd(3, -1, "", yVar);
        }
    }
}
