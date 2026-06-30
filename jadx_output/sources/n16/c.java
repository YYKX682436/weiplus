package n16;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final n16.c f334159c = new n16.c("");

    /* renamed from: a, reason: collision with root package name */
    public final n16.e f334160a;

    /* renamed from: b, reason: collision with root package name */
    public transient n16.c f334161b;

    public c(java.lang.String str) {
        if (str != null) {
            this.f334160a = new n16.e(str, this);
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str;
        int i18;
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 8:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                i18 = 2;
                break;
            case 8:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        switch (i17) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "fqName";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 8:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 12:
                objArr[0] = "segment";
                break;
            case 13:
                objArr[0] = "other";
                break;
            case 14:
                objArr[0] = "shortName";
                break;
            default:
                objArr[0] = "names";
                break;
        }
        switch (i17) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
                objArr[1] = "toUnsafe";
                break;
            case 6:
            case 7:
                objArr[1] = "parent";
                break;
            case 8:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqName";
                break;
            case 9:
                objArr[1] = "shortName";
                break;
            case 10:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 11:
                objArr[1] = "pathSegments";
                break;
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
                objArr[2] = "<init>";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                break;
            case 8:
                objArr[2] = "child";
                break;
            case 12:
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "fromSegments";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
                throw new java.lang.IllegalStateException(format);
            case 8:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    public static n16.c j(n16.g gVar) {
        if (gVar == null) {
            a(14);
            throw null;
        }
        if (gVar != null) {
            return new n16.c(new n16.e(gVar.h(), f334159c.i(), gVar));
        }
        n16.e.a(17);
        throw null;
    }

    public java.lang.String b() {
        java.lang.String str = this.f334160a.f334165a;
        if (str != null) {
            return str;
        }
        n16.e.a(4);
        throw null;
    }

    public n16.c c(n16.g gVar) {
        if (gVar != null) {
            return new n16.c(this.f334160a.b(gVar), this);
        }
        a(8);
        throw null;
    }

    public boolean d() {
        return this.f334160a.d();
    }

    public n16.c e() {
        n16.c cVar = this.f334161b;
        if (cVar != null) {
            if (cVar != null) {
                return cVar;
            }
            a(6);
            throw null;
        }
        if (d()) {
            throw new java.lang.IllegalStateException("root");
        }
        n16.e eVar = this.f334160a;
        n16.e eVar2 = eVar.f334167c;
        if (eVar2 == null) {
            if (eVar.d()) {
                throw new java.lang.IllegalStateException("root");
            }
            eVar.c();
            eVar2 = eVar.f334167c;
            if (eVar2 == null) {
                n16.e.a(8);
                throw null;
            }
        }
        n16.c cVar2 = new n16.c(eVar2);
        this.f334161b = cVar2;
        return cVar2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n16.c) && this.f334160a.equals(((n16.c) obj).f334160a);
    }

    public n16.g f() {
        n16.g g17 = this.f334160a.g();
        if (g17 != null) {
            return g17;
        }
        a(9);
        throw null;
    }

    public n16.g g() {
        n16.g g17;
        n16.e eVar = this.f334160a;
        if (eVar.d()) {
            g17 = n16.e.f334162e;
            if (g17 == null) {
                n16.e.a(12);
                throw null;
            }
        } else {
            g17 = eVar.g();
            if (g17 == null) {
                n16.e.a(13);
                throw null;
            }
        }
        return g17;
    }

    public boolean h(n16.g gVar) {
        if (gVar == null) {
            a(12);
            throw null;
        }
        n16.e eVar = this.f334160a;
        if (gVar == null) {
            eVar.getClass();
            n16.e.a(15);
            throw null;
        }
        if (eVar.d()) {
            return false;
        }
        java.lang.String str = eVar.f334165a;
        int indexOf = str.indexOf(46);
        java.lang.String h17 = gVar.h();
        if (indexOf == -1) {
            indexOf = java.lang.Math.max(str.length(), h17.length());
        }
        return str.regionMatches(0, h17, 0, indexOf);
    }

    public int hashCode() {
        return this.f334160a.hashCode();
    }

    public n16.e i() {
        n16.e eVar = this.f334160a;
        if (eVar != null) {
            return eVar;
        }
        a(5);
        throw null;
    }

    public java.lang.String toString() {
        return this.f334160a.toString();
    }

    public c(n16.e eVar) {
        if (eVar != null) {
            this.f334160a = eVar;
        } else {
            a(2);
            throw null;
        }
    }

    public c(n16.e eVar, n16.c cVar) {
        if (eVar != null) {
            this.f334160a = eVar;
            this.f334161b = cVar;
        } else {
            a(3);
            throw null;
        }
    }
}
