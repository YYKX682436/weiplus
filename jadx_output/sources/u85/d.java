package u85;

/* loaded from: classes10.dex */
public final class d implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u85.e f425697d;

    public d(u85.e eVar) {
        this.f425697d = eVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        u85.e eVar = this.f425697d;
        java.lang.String str2 = eVar.f425698h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback: ");
        sb6.append(str);
        sb6.append(", ");
        sb6.append(i17);
        sb6.append("; progress ");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_toltalLength) : null);
        sb6.append(", ");
        sb6.append(gVar != null ? java.lang.Long.valueOf(gVar.field_finishedLength) : null);
        sb6.append("; result ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        if (i17 != 0) {
            eVar.e(false);
        } else if (hVar != null) {
            if (hVar.field_retCode == 0) {
                java.lang.String str3 = eVar.f425704q;
                com.tencent.mm.vfs.w6.u(str3);
                java.lang.String str4 = eVar.f425705r;
                if (com.tencent.mm.vfs.w6.Q(str4, str3) == 0) {
                    com.tencent.mm.vfs.w6.h(str4);
                    t85.j jVar = new t85.j();
                    kotlin.jvm.internal.o.g(str3, "<set-?>");
                    jVar.f416476c = str3;
                    java.lang.String str5 = eVar.f425719f.f193690e;
                    kotlin.jvm.internal.o.g(str5, "<set-?>");
                    jVar.f416474a = str5;
                    jVar.c(str3);
                    z18 = true;
                } else {
                    com.tencent.mm.vfs.w6.h(str4);
                    com.tencent.mm.vfs.w6.f(str3);
                    z18 = false;
                }
                if (z18) {
                    eVar.e(true);
                }
            }
            eVar.e(false);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
