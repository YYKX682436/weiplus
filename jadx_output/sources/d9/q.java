package d9;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final q8.e[] f227392a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.g f227393b;

    /* renamed from: c, reason: collision with root package name */
    public q8.e f227394c;

    public q(q8.e[] eVarArr, q8.g gVar) {
        this.f227392a = eVarArr;
        this.f227393b = gVar;
    }

    public q8.e a(q8.f fVar, android.net.Uri uri) {
        q8.e eVar = this.f227394c;
        if (eVar != null) {
            return eVar;
        }
        q8.e[] eVarArr = this.f227392a;
        int length = eVarArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                break;
            }
            q8.e eVar2 = eVarArr[i17];
            try {
                if (eVar2.e(fVar)) {
                    this.f227394c = eVar2;
                    ((q8.b) fVar).f360620e = 0;
                    break;
                }
            } catch (java.io.EOFException unused) {
            } catch (java.lang.Throwable th6) {
                ((q8.b) fVar).f360620e = 0;
                throw th6;
            }
            ((q8.b) fVar).f360620e = 0;
            i17++;
        }
        q8.e eVar3 = this.f227394c;
        if (eVar3 != null) {
            eVar3.b(this.f227393b);
            return this.f227394c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("None of the available extractors (");
        int i18 = t9.d0.f416498a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < eVarArr.length; i19++) {
            sb7.append(eVarArr[i19].getClass().getSimpleName());
            if (i19 < eVarArr.length - 1) {
                sb7.append(", ");
            }
        }
        sb6.append(sb7.toString());
        sb6.append(") could read the stream.");
        throw new d9.m0(sb6.toString(), uri);
    }
}
