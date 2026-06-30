package mn2;

/* loaded from: classes15.dex */
public final class z extends mn2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(mn2.k4 maxSize) {
        super(maxSize.f330039d);
        kotlin.jvm.internal.o.g(maxSize, "maxSize");
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        jt0.i iVar = this.f329936a;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.get(b17);
        hp0.g gVar = bitmap != null ? new hp0.g(bitmap) : null;
        if (gVar != null) {
            return gVar;
        }
        java.lang.Object obj = url.f293573a;
        if (!(((mn2.h3) obj) instanceof mn2.n)) {
            obj = null;
        }
        mn2.h3 h3Var = (mn2.h3) obj;
        if (h3Var != null) {
            mn2.n nVar = (mn2.n) h3Var;
            if (!android.text.TextUtils.equals(nVar.f330060e, nVar.f330064i)) {
                jz5.g gVar2 = nVar.f330066n;
                if (aVar == null || (str = aVar.b((java.lang.String) ((jz5.n) gVar2).getValue())) == null) {
                    str = (java.lang.String) ((jz5.n) gVar2).getValue();
                }
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(str);
                if (bitmap2 != null) {
                    return new hp0.g(bitmap2);
                }
            }
        }
        return null;
    }

    @Override // com.tencent.mm.loader.cache.memory.e
    public java.lang.String b(ip0.a aVar, dp0.a aVar2) {
        java.lang.String str;
        mn2.h3 h3Var;
        java.lang.String b17 = super.b(aVar, aVar2);
        yo0.i iVar = (aVar == null || (h3Var = (mn2.h3) aVar.f293573a) == null) ? null : ((mn2.a) h3Var).f329906d;
        if (iVar != null) {
            int i17 = (iVar.f464100e + iVar.f464101f) / 2;
            if (1 <= i17 && i17 < 1000) {
                str = "SMALL";
            } else {
                if (1000 <= i17 && i17 < 2000) {
                    str = "MEDIUM";
                } else if (i17 > 2000) {
                    str = "LARGE";
                }
            }
            return b17 + '_' + str;
        }
        str = "";
        return b17 + '_' + str;
    }
}
