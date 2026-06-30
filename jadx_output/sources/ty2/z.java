package ty2;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f423126a;

    /* renamed from: b, reason: collision with root package name */
    public final int f423127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f423128c;

    /* renamed from: d, reason: collision with root package name */
    public final int f423129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423130e;

    /* renamed from: f, reason: collision with root package name */
    public final ty2.c f423131f;

    public z(int i17, int i18, int i19, int i27, int i28, ty2.c cVar) {
        this.f423126a = i17;
        this.f423127b = i18;
        this.f423128c = i19;
        this.f423129d = i27;
        this.f423130e = i28;
        this.f423131f = cVar;
    }

    public static ty2.z a(ty2.z zVar, int i17, int i18, int i19, int i27, int i28, ty2.c cVar, int i29, java.lang.Object obj) {
        if ((i29 & 1) != 0) {
            i17 = zVar.f423126a;
        }
        if ((i29 & 2) != 0) {
            i18 = zVar.f423127b;
        }
        int i37 = i18;
        if ((i29 & 4) != 0) {
            i19 = zVar.f423128c;
        }
        int i38 = i19;
        if ((i29 & 8) != 0) {
            i27 = zVar.f423129d;
        }
        int i39 = i27;
        if ((i29 & 16) != 0) {
            i28 = zVar.f423130e;
        }
        int i47 = i28;
        if ((i29 & 32) != 0) {
            cVar = zVar.f423131f;
        }
        zVar.getClass();
        return new ty2.z(i17, i37, i38, i39, i47, cVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.z)) {
            return false;
        }
        ty2.z zVar = (ty2.z) obj;
        return this.f423126a == zVar.f423126a && this.f423127b == zVar.f423127b && this.f423128c == zVar.f423128c && this.f423129d == zVar.f423129d && this.f423130e == zVar.f423130e && kotlin.jvm.internal.o.b(this.f423131f, zVar.f423131f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f423126a) * 31) + java.lang.Integer.hashCode(this.f423127b)) * 31) + java.lang.Integer.hashCode(this.f423128c)) * 31) + java.lang.Integer.hashCode(this.f423129d)) * 31) + java.lang.Integer.hashCode(this.f423130e)) * 31;
        ty2.c cVar = this.f423131f;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public java.lang.String toString() {
        return "ProductSubViewConfig(marginTop=" + this.f423126a + ", marginLeft=" + this.f423127b + ", marginRight=" + this.f423128c + ", marginBottom=" + this.f423129d + ", maxWidthPx=" + this.f423130e + ", ext=" + this.f423131f + ')';
    }

    public /* synthetic */ z(int i17, int i18, int i19, int i27, int i28, ty2.c cVar, int i29, kotlin.jvm.internal.i iVar) {
        this((i29 & 1) != 0 ? 0 : i17, (i29 & 2) != 0 ? 0 : i18, (i29 & 4) != 0 ? 0 : i19, (i29 & 8) != 0 ? 0 : i27, (i29 & 16) == 0 ? i28 : 0, (i29 & 32) != 0 ? null : cVar);
    }
}
