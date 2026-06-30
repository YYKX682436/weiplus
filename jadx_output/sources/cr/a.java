package cr;

/* loaded from: classes12.dex */
public final class a implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr.b f221552d;

    public a(cr.b bVar) {
        this.f221552d = bVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        yz5.l lVar;
        cr.b bVar = this.f221552d;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", "callback " + i17 + ' ' + gVar + ' ' + hVar);
        if (i17 != 0 || hVar == null || hVar.field_retCode != 0) {
            if ((i17 != 0 || (hVar != null && hVar.field_retCode != 0)) && (lVar = bVar.f221554b) != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            return 0;
        }
        bVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        cr.i iVar = bVar.f221553a;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("fetcherConfig");
            throw null;
        }
        sb6.append(iVar.f221568a.getMd5());
        sb6.append(" finish");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFetcher", sb6.toString());
        yz5.l lVar2 = bVar.f221554b;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Boolean.TRUE);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
