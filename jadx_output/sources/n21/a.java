package n21;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.b f334237d;

    public a(n21.b bVar) {
        this.f334237d = bVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        n21.b bVar = this.f334237d;
        com.tencent.mm.vfs.w6.k(bVar.f334242h);
        fp.k.c();
        java.lang.String str = bVar.f334242h;
        int i17 = bVar.f334246o;
        if (bVar.doScene(bVar.dispatcher(), bVar.f334238d) != -1) {
            return false;
        }
        bVar.f334238d.onSceneEnd(3, -1, "doScene failed", bVar);
        return false;
    }
}
