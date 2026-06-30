package dc;

/* loaded from: classes16.dex */
public class a extends dc.j {

    /* renamed from: h, reason: collision with root package name */
    public final dc.q f228599h;

    /* renamed from: i, reason: collision with root package name */
    public final int f228600i;

    /* renamed from: m, reason: collision with root package name */
    public final long f228601m;

    public a(long j17, dc.o oVar, dc.q qVar, int i17, long j18) {
        super(j17, oVar);
        this.f228599h = qVar;
        this.f228600i = i17;
        this.f228601m = j18;
    }

    @Override // dc.j
    public dc.e i() {
        java.lang.String str;
        dc.q qVar = dc.q.OBJECT;
        dc.q qVar2 = this.f228599h;
        if (qVar2 == qVar) {
            return super.i();
        }
        dc.m mVar = this.f228633f.f228625i;
        switch (qVar2.ordinal()) {
            case 1:
                str = "boolean[]";
                break;
            case 2:
                str = "char[]";
                break;
            case 3:
                str = "float[]";
                break;
            case 4:
                str = "double[]";
                break;
            case 5:
                str = "byte[]";
                break;
            case 6:
                str = "short[]";
                break;
            case 7:
                str = "int[]";
                break;
            case 8:
                str = "long[]";
                break;
            default:
                throw new java.lang.IllegalArgumentException("OBJECT type is not a primitive type");
        }
        return mVar.c(str);
    }

    @Override // dc.j
    public final int j() {
        return this.f228600i * this.f228633f.f228625i.f228658e[this.f228599h.f228672d];
    }

    public final byte[] m(int i17, int i18) {
        ((ec.b) h()).f250928d = this.f228601m;
        dc.q qVar = this.f228599h;
        int i19 = qVar.f228673e * i18;
        byte[] bArr = new byte[i19];
        ec.a h17 = h();
        int i27 = i18 * qVar.f228673e;
        ec.b bVar = (ec.b) h17;
        bVar.f250928d += i17 * r0;
        int a17 = bVar.a();
        java.nio.ByteBuffer[] byteBufferArr = bVar.f250926b;
        byteBufferArr[a17].position(bVar.b());
        if (i19 <= byteBufferArr[a17].remaining()) {
            byteBufferArr[a17].get(bArr, 0, i19);
        } else {
            int position = 1073741824 - byteBufferArr[a17].position();
            byteBufferArr[a17].get(bArr, 0, position);
            int min = java.lang.Math.min(i27 - position, i19 - position);
            int i28 = ((min + 1073741824) - 1) / 1073741824;
            for (int i29 = 0; i29 < i28; i29++) {
                int min2 = java.lang.Math.min(min, 1073741824);
                int i37 = a17 + 1 + i29;
                byteBufferArr[i37].position(0);
                byteBufferArr[i37].get(bArr, position, min2);
                position += min2;
                min -= min2;
            }
        }
        bVar.f250928d += java.lang.Math.min(i19, i27);
        return bArr;
    }

    public java.lang.Object[] n() {
        int i17 = this.f228600i;
        java.lang.Object[] objArr = new java.lang.Object[i17];
        ((ec.b) h()).f250928d = this.f228601m;
        for (int i18 = 0; i18 < i17; i18++) {
            objArr[i18] = l(this.f228599h);
        }
        return objArr;
    }

    public final java.lang.String toString() {
        java.lang.String str = i().f228606h;
        if (str.endsWith("[]")) {
            str = str.substring(0, str.length() - 2);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f228600i);
        long j17 = this.f228633f.f228625i.f228659f;
        long j18 = this.f228631d;
        return java.lang.String.format("%s[%d]@%d (0x%x)", str, valueOf, java.lang.Long.valueOf(j17 & j18), java.lang.Long.valueOf(this.f228633f.f228625i.f228659f & j18));
    }
}
