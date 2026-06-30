package v11;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f432487a;

    public x(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57) {
        this.f432487a = i37;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.x)) {
            return false;
        }
        v11.x xVar = (v11.x) obj;
        xVar.getClass();
        return this.f432487a == xVar.f432487a;
    }

    public int hashCode() {
        return (((((((((((((((((((((((java.lang.Integer.hashCode(-4958209) * 31) + java.lang.Integer.hashCode(-14254183)) * 31) + java.lang.Integer.hashCode(-16748351)) * 31) + java.lang.Integer.hashCode(-3653568)) * 31) + java.lang.Integer.hashCode(-16153000)) * 31) + java.lang.Integer.hashCode(-16744448)) * 31) + java.lang.Integer.hashCode(this.f432487a)) * 31) + java.lang.Integer.hashCode(-8823258)) * 31) + java.lang.Integer.hashCode(-8388608)) * 31) + java.lang.Integer.hashCode(-40634)) * 31) + java.lang.Integer.hashCode(-8823258)) * 31) + java.lang.Integer.hashCode(-14442241)) * 31) + java.lang.Integer.hashCode(-16748351);
    }

    public java.lang.String toString() {
        return "NativeMarkdownCodeHighlightColors(keyword=-4958209, type=-14254183, literal=-16748351, string=-3653568, number=-16153000, comment=-16744448, operator=" + this.f432487a + ", annotation=-8823258, tag=-8388608, property=-40634, function=-8823258, variable=-14442241, constant=-16748351)";
    }
}
