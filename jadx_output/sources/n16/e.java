package n16;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f334162e = n16.g.m("<root>");

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f334163f = java.util.regex.Pattern.compile("\\.");

    /* renamed from: g, reason: collision with root package name */
    public static final yz5.l f334164g = new n16.d();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f334165a;

    /* renamed from: b, reason: collision with root package name */
    public transient n16.c f334166b;

    /* renamed from: c, reason: collision with root package name */
    public transient n16.e f334167c;

    /* renamed from: d, reason: collision with root package name */
    public transient n16.g f334168d;

    public e(java.lang.String str, n16.c cVar) {
        if (str == null) {
            a(0);
            throw null;
        }
        if (cVar != null) {
            this.f334165a = str;
            this.f334166b = cVar;
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
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                i18 = 2;
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                i18 = 3;
                break;
        }
        java.lang.Object[] objArr = new java.lang.Object[i18];
        if (i17 != 1) {
            switch (i17) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 18:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "other";
                    break;
                case 17:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i17) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = "toString";
                break;
        }
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        switch (i17) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 18:
                throw new java.lang.IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            case 17:
            default:
                throw new java.lang.IllegalArgumentException(format);
        }
    }

    public n16.e b(n16.g gVar) {
        java.lang.String str;
        if (gVar == null) {
            a(9);
            throw null;
        }
        if (d()) {
            str = gVar.h();
        } else {
            str = this.f334165a + "." + gVar.h();
        }
        return new n16.e(str, this, gVar);
    }

    public final void c() {
        java.lang.String str = this.f334165a;
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f334168d = n16.g.j(str.substring(lastIndexOf + 1));
            this.f334167c = new n16.e(str.substring(0, lastIndexOf));
        } else {
            this.f334168d = n16.g.j(str);
            this.f334167c = n16.c.f334159c.i();
        }
    }

    public boolean d() {
        return this.f334165a.isEmpty();
    }

    public boolean e() {
        if (this.f334166b == null) {
            java.lang.String str = this.f334165a;
            if (str == null) {
                a(4);
                throw null;
            }
            if (str.indexOf(60) >= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n16.e) && this.f334165a.equals(((n16.e) obj).f334165a);
    }

    public java.util.List f() {
        java.util.List list;
        if (d()) {
            list = java.util.Collections.emptyList();
        } else {
            java.lang.String[] split = f334163f.split(this.f334165a);
            yz5.l transform = f334164g;
            kotlin.jvm.internal.o.g(split, "<this>");
            kotlin.jvm.internal.o.g(transform, "transform");
            java.util.ArrayList arrayList = new java.util.ArrayList(split.length);
            for (java.lang.String str : split) {
                arrayList.add(((n16.d) transform).invoke(str));
            }
            list = arrayList;
        }
        if (list != null) {
            return list;
        }
        a(14);
        throw null;
    }

    public n16.g g() {
        n16.g gVar = this.f334168d;
        if (gVar != null) {
            if (gVar != null) {
                return gVar;
            }
            a(10);
            throw null;
        }
        if (d()) {
            throw new java.lang.IllegalStateException("root");
        }
        c();
        n16.g gVar2 = this.f334168d;
        if (gVar2 != null) {
            return gVar2;
        }
        a(11);
        throw null;
    }

    public n16.c h() {
        n16.c cVar = this.f334166b;
        if (cVar == null) {
            n16.c cVar2 = new n16.c(this);
            this.f334166b = cVar2;
            return cVar2;
        }
        if (cVar != null) {
            return cVar;
        }
        a(5);
        throw null;
    }

    public int hashCode() {
        return this.f334165a.hashCode();
    }

    public java.lang.String toString() {
        java.lang.String h17 = d() ? f334162e.h() : this.f334165a;
        if (h17 != null) {
            return h17;
        }
        a(18);
        throw null;
    }

    public e(java.lang.String str) {
        if (str != null) {
            this.f334165a = str;
        } else {
            a(2);
            throw null;
        }
    }

    public e(java.lang.String str, n16.e eVar, n16.g gVar) {
        if (str != null) {
            this.f334165a = str;
            this.f334167c = eVar;
            this.f334168d = gVar;
            return;
        }
        a(3);
        throw null;
    }
}
