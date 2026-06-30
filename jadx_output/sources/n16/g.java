package n16;

/* loaded from: classes15.dex */
public final class g implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334169d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f334170e;

    public g(java.lang.String str, boolean z17) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f334169d = str;
        this.f334170e = z17;
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) ? 2 : 3];
        if (i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
        }
        if (i17 == 1) {
            objArr[1] = "asString";
        } else if (i17 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i17 == 3 || i17 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i17) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY;
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 4) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    public static n16.g j(java.lang.String str) {
        if (str != null) {
            return str.startsWith("<") ? m(str) : k(str);
        }
        a(9);
        throw null;
    }

    public static n16.g k(java.lang.String str) {
        if (str != null) {
            return new n16.g(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean l(java.lang.String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static n16.g m(java.lang.String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new n16.g(str, true);
        }
        throw new java.lang.IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f334169d.compareTo(((n16.g) obj).f334169d);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n16.g)) {
            return false;
        }
        n16.g gVar = (n16.g) obj;
        return this.f334170e == gVar.f334170e && this.f334169d.equals(gVar.f334169d);
    }

    public java.lang.String h() {
        java.lang.String str = this.f334169d;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public int hashCode() {
        return (this.f334169d.hashCode() * 31) + (this.f334170e ? 1 : 0);
    }

    public java.lang.String i() {
        if (this.f334170e) {
            throw new java.lang.IllegalStateException("not identifier: " + this);
        }
        java.lang.String h17 = h();
        if (h17 != null) {
            return h17;
        }
        a(2);
        throw null;
    }

    public java.lang.String toString() {
        return this.f334169d;
    }
}
