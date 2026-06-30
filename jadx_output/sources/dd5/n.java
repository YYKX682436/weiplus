package dd5;

/* loaded from: classes9.dex */
public final class n extends uc5.p {

    /* renamed from: b, reason: collision with root package name */
    public static final dd5.n f229222b = new dd5.n();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Class f229223c = dd5.l.class;

    /* renamed from: d, reason: collision with root package name */
    public static final uc5.n f229224d = dd5.k.f229187p;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Set f229225e = kz5.o1.c(49);

    @Override // uc5.p
    public java.util.Set b() {
        return f229225e;
    }

    @Override // uc5.p
    public java.lang.Class c() {
        return f229223c;
    }

    @Override // uc5.p
    public uc5.n d() {
        return f229224d;
    }

    @Override // uc5.p
    public boolean e(oi3.g simpleMsgInfo) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        int i17 = simpleMsgInfo.f345617d;
        if (simpleMsgInfo.getInteger(i17 + 5) != 33 && simpleMsgInfo.getInteger(i17 + 5) != 36) {
            return false;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(simpleMsgInfo.getString(i17 + 13));
        s05.d dVar = (s05.d) bVar.getCustom(bVar.f432315e + 39);
        return dVar != null && dVar.getType() == 1;
    }

    @Override // uc5.p
    public java.lang.Boolean f(int i17, int i18) {
        if (i17 != 49) {
            return java.lang.Boolean.FALSE;
        }
        if (i18 == 33 || i18 == 36) {
            return null;
        }
        return java.lang.Boolean.FALSE;
    }
}
