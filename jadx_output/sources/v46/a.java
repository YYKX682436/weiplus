package v46;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile v46.e f433254d = v46.e.f433258o;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f433255a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f433256b;

    /* renamed from: c, reason: collision with root package name */
    public final v46.e f433257c;

    public a(java.lang.Object obj, v46.e eVar) {
        eVar = eVar == null ? f433254d : eVar;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(512);
        this.f433255a = stringBuffer;
        this.f433257c = eVar;
        this.f433256b = obj;
        if (obj == null) {
            eVar.getClass();
            return;
        }
        if (eVar.f433262e) {
            v46.e.d(obj);
            if (eVar.f433263f) {
                stringBuffer.append(eVar.c(obj.getClass()));
            } else {
                stringBuffer.append(obj.getClass().getName());
            }
        }
        if (eVar.f433264g) {
            v46.e.d(obj);
            stringBuffer.append('@');
            stringBuffer.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj)));
        }
        stringBuffer.append(eVar.f433265h);
        if (eVar.f433267m) {
            stringBuffer.append(eVar.f433268n);
        }
    }

    public java.lang.String toString() {
        v46.e eVar = this.f433257c;
        java.lang.StringBuffer stringBuffer = this.f433255a;
        java.lang.Object obj = this.f433256b;
        if (obj == null) {
            eVar.getClass();
            stringBuffer.append("<null>");
        } else {
            eVar.getClass();
            int length = stringBuffer.length();
            int length2 = eVar.f433268n.length();
            if (length > 0 && length2 > 0 && length >= length2) {
                boolean z17 = false;
                int i17 = 0;
                while (true) {
                    if (i17 >= length2) {
                        z17 = true;
                        break;
                    }
                    if (stringBuffer.charAt((length - 1) - i17) != eVar.f433268n.charAt((length2 - 1) - i17)) {
                        break;
                    }
                    i17++;
                }
                if (z17) {
                    stringBuffer.setLength(length - length2);
                }
            }
            stringBuffer.append(eVar.f433266i);
            v46.e.e(obj);
        }
        return stringBuffer.toString();
    }
}
