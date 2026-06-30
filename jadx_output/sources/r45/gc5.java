package r45;

/* loaded from: classes8.dex */
public class gc5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f375084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f375085e;

    /* renamed from: f, reason: collision with root package name */
    public int f375086f;

    /* renamed from: g, reason: collision with root package name */
    public long f375087g;

    /* renamed from: h, reason: collision with root package name */
    public int f375088h;

    /* renamed from: i, reason: collision with root package name */
    public long f375089i;

    /* renamed from: m, reason: collision with root package name */
    public r45.js3 f375090m;

    /* renamed from: n, reason: collision with root package name */
    public int f375091n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f375092o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f375093p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f375094q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gc5)) {
            return false;
        }
        r45.gc5 gc5Var = (r45.gc5) fVar;
        return n51.f.a(this.BaseRequest, gc5Var.BaseRequest) && n51.f.a(this.f375084d, gc5Var.f375084d) && n51.f.a(this.f375085e, gc5Var.f375085e) && n51.f.a(java.lang.Integer.valueOf(this.f375086f), java.lang.Integer.valueOf(gc5Var.f375086f)) && n51.f.a(java.lang.Long.valueOf(this.f375087g), java.lang.Long.valueOf(gc5Var.f375087g)) && n51.f.a(java.lang.Integer.valueOf(this.f375088h), java.lang.Integer.valueOf(gc5Var.f375088h)) && n51.f.a(java.lang.Long.valueOf(this.f375089i), java.lang.Long.valueOf(gc5Var.f375089i)) && n51.f.a(this.f375090m, gc5Var.f375090m) && n51.f.a(java.lang.Integer.valueOf(this.f375091n), java.lang.Integer.valueOf(gc5Var.f375091n)) && n51.f.a(this.f375092o, gc5Var.f375092o) && n51.f.a(this.f375093p, gc5Var.f375093p) && n51.f.a(this.f375094q, gc5Var.f375094q);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f375084d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f375085e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f375086f);
            fVar.h(5, this.f375087g);
            fVar.e(10, this.f375088h);
            fVar.h(11, this.f375089i);
            r45.js3 js3Var = this.f375090m;
            if (js3Var != null) {
                fVar.i(12, js3Var.computeSize());
                this.f375090m.writeFields(fVar);
            }
            fVar.e(100, this.f375091n);
            java.lang.String str3 = this.f375092o;
            if (str3 != null) {
                fVar.j(101, str3);
            }
            java.lang.String str4 = this.f375093p;
            if (str4 != null) {
                fVar.j(102, str4);
            }
            java.lang.String str5 = this.f375094q;
            if (str5 != null) {
                fVar.j(103, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str6 = this.f375084d;
            if (str6 != null) {
                i18 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f375085e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            int e17 = i18 + b36.f.e(4, this.f375086f) + b36.f.h(5, this.f375087g) + b36.f.e(10, this.f375088h) + b36.f.h(11, this.f375089i);
            r45.js3 js3Var2 = this.f375090m;
            if (js3Var2 != null) {
                e17 += b36.f.i(12, js3Var2.computeSize());
            }
            int e18 = e17 + b36.f.e(100, this.f375091n);
            java.lang.String str8 = this.f375092o;
            if (str8 != null) {
                e18 += b36.f.j(101, str8);
            }
            java.lang.String str9 = this.f375093p;
            if (str9 != null) {
                e18 += b36.f.j(102, str9);
            }
            java.lang.String str10 = this.f375094q;
            return str10 != null ? e18 + b36.f.j(103, str10) : e18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        r45.gc5 gc5Var = (r45.gc5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                gc5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gc5Var.f375084d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gc5Var.f375085e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            gc5Var.f375086f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 5) {
            gc5Var.f375087g = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 10:
                gc5Var.f375088h = aVar2.g(intValue);
                return 0;
            case 11:
                gc5Var.f375089i = aVar2.i(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.js3 js3Var3 = new r45.js3();
                    if (bArr2 != null && bArr2.length > 0) {
                        js3Var3.parseFrom(bArr2);
                    }
                    gc5Var.f375090m = js3Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 100:
                        gc5Var.f375091n = aVar2.g(intValue);
                        return 0;
                    case 101:
                        gc5Var.f375092o = aVar2.k(intValue);
                        return 0;
                    case 102:
                        gc5Var.f375093p = aVar2.k(intValue);
                        return 0;
                    case 103:
                        gc5Var.f375094q = aVar2.k(intValue);
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
