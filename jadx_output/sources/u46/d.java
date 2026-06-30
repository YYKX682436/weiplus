package u46;

/* loaded from: classes16.dex */
public class d extends u46.e {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String[] f424671c;

    public java.lang.String a(int i17) {
        java.lang.Object obj;
        java.lang.Object obj2 = null;
        u46.h hVar = this.f424673b;
        if (i17 >= 256) {
            u46.g[] gVarArr = hVar.f424682a;
            u46.g gVar = gVarArr[(Integer.MAX_VALUE & i17) % gVarArr.length];
            while (true) {
                if (gVar == null) {
                    break;
                }
                if (gVar.f424679a == i17) {
                    obj2 = gVar.f424680b;
                    break;
                }
                gVar = gVar.f424681c;
            }
            return (java.lang.String) obj2;
        }
        if (this.f424671c == null) {
            this.f424671c = new java.lang.String[256];
            for (int i18 = 0; i18 < 256; i18++) {
                java.lang.String[] strArr = this.f424671c;
                u46.g[] gVarArr2 = hVar.f424682a;
                u46.g gVar2 = gVarArr2[(i18 & Integer.MAX_VALUE) % gVarArr2.length];
                while (true) {
                    if (gVar2 == null) {
                        obj = null;
                        break;
                    }
                    if (gVar2.f424679a == i18) {
                        obj = gVar2.f424680b;
                        break;
                    }
                    gVar2 = gVar2.f424681c;
                }
                strArr[i18] = (java.lang.String) obj;
            }
        }
        return this.f424671c[i17];
    }
}
