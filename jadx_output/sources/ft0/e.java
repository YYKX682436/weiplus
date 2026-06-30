package ft0;

/* loaded from: classes14.dex */
public final class e implements di3.o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ft0.f f266467d;

    public e(ft0.f fVar) {
        this.f266467d = fVar;
    }

    @Override // di3.o
    public final boolean a(byte[] bArr) {
        ft0.f fVar = this.f266467d;
        if (bArr != null) {
            ms0.c cVar = fVar.f266462c;
            if (cVar != null) {
                ms0.c.l(cVar, bArr, false, 2, null);
            }
            fVar.f266460a.requestRender();
        } else {
            fVar.getClass();
        }
        return false;
    }
}
