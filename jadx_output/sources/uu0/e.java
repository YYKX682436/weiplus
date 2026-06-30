package uu0;

/* loaded from: classes5.dex */
public class e implements tu0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uu0.c f431230a;

    public e(uu0.c cVar) {
        this.f431230a = cVar;
    }

    @Override // tu0.e
    public void a(byte[] bArr, int i17, boolean z17) {
        uu0.b bVar = this.f431230a.f431223r;
        if (bVar != null) {
            bVar.a(bArr, i17, z17);
        }
    }

    @Override // tu0.e
    public void b(byte[] bArr, int i17, boolean z17) {
        uu0.b bVar = this.f431230a.f431223r;
        if (bVar != null) {
            bVar.b(bArr, i17, z17);
        }
    }
}
