package mn2;

/* loaded from: classes10.dex */
public final class n0 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.q0 f330067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mn2.g4 f330069f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c50.z0 f330070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f330071h;

    public n0(mn2.q0 q0Var, java.lang.String str, mn2.g4 g4Var, c50.z0 z0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f330067d = q0Var;
        this.f330068e = str;
        this.f330069f = g4Var;
        this.f330070g = z0Var;
        this.f330071h = finderItem;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        boolean z18 = hVar != null && hVar.field_retCode == -21112;
        c50.z0 z0Var = this.f330070g;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f330071h;
        mn2.q0 q0Var = this.f330067d;
        if (z18) {
            mn2.q0.b(z0Var, finderItem, q0Var, mediaId, -11);
            return -1;
        }
        java.lang.String str = this.f330068e;
        if (i17 != 0) {
            com.tencent.mars.xlog.Log.e(q0Var.f330092a, "feedId:" + str + " media is error! startRet=" + i17 + " mediaId=" + mediaId);
            if (-21006 != i17) {
                cu2.x.f222449a.n(mediaId, 0L, 0L, -1);
            }
            mn2.q0.b(z0Var, finderItem, q0Var, mediaId, -21);
            return -2;
        }
        if (gVar != null) {
            long j17 = gVar.field_toltalLength;
            if (j17 > 0) {
                long j18 = gVar.field_finishedLength;
                int i18 = j18 >= j17 ? 3 : 1;
                cu2.x xVar = cu2.x.f222449a;
                xVar.n(mediaId, j18, j17, i18);
                java.lang.Integer valueOf = hVar != null ? java.lang.Integer.valueOf(hVar.field_videoFormat) : null;
                java.lang.String str2 = hVar != null ? hVar.field_videoFlag : null;
                mn2.g4 g4Var = this.f330069f;
                if (str2 == null) {
                    str2 = g4Var.g();
                }
                xVar.j(mediaId, valueOf, str2);
                this.f330070g.b(finderItem.getId(), j18, j17);
                if (j18 >= j17) {
                    com.tencent.mars.xlog.Log.i(q0Var.f330092a, "feedId:" + str + " mediaId=" + mediaId + ", success");
                    z0Var.a(finderItem.getId(), 0, g4Var.j());
                    q0Var.f330093b.remove(mediaId);
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
