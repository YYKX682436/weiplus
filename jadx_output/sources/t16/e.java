package t16;

/* loaded from: classes15.dex */
public final class e extends t16.t {
    public e(char c17) {
        super(java.lang.Character.valueOf(c17));
    }

    @Override // t16.g
    public f26.o0 a(o06.v0 module) {
        kotlin.jvm.internal.o.g(module, "module");
        l06.o h17 = module.h();
        h17.getClass();
        f26.z0 t17 = h17.t(l06.r.f314897m);
        if (t17 != null) {
            return t17;
        }
        l06.o.a(63);
        throw null;
    }

    @Override // t16.g
    public java.lang.String toString() {
        java.lang.String valueOf;
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.Object obj = this.f414613a;
        boolean z17 = false;
        objArr[0] = java.lang.Integer.valueOf(((java.lang.Character) obj).charValue());
        char charValue = ((java.lang.Character) obj).charValue();
        if (charValue == '\b') {
            valueOf = "\\b";
        } else if (charValue == '\t') {
            valueOf = "\\t";
        } else if (charValue == '\n') {
            valueOf = "\\n";
        } else if (charValue == '\f') {
            valueOf = "\\f";
        } else if (charValue == '\r') {
            valueOf = "\\r";
        } else {
            byte type = (byte) java.lang.Character.getType(charValue);
            if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                z17 = true;
            }
            valueOf = z17 ? java.lang.String.valueOf(charValue) : "?";
        }
        objArr[1] = valueOf;
        java.lang.String format = java.lang.String.format("\\u%04X ('%s')", java.util.Arrays.copyOf(objArr, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
