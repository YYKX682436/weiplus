package r45;

/* loaded from: classes11.dex */
public class fi extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374362d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374363e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374364f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f374365g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f374366h;

    /* renamed from: i, reason: collision with root package name */
    public int f374367i;

    /* renamed from: m, reason: collision with root package name */
    public r45.du5 f374368m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f374369n;

    /* renamed from: o, reason: collision with root package name */
    public int f374370o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f374371p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f374372q;

    /* renamed from: r, reason: collision with root package name */
    public r45.cu5 f374373r;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fi)) {
            return false;
        }
        r45.fi fiVar = (r45.fi) fVar;
        return n51.f.a(this.BaseRequest, fiVar.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f374362d), java.lang.Integer.valueOf(fiVar.f374362d)) && n51.f.a(this.f374363e, fiVar.f374363e) && n51.f.a(this.f374364f, fiVar.f374364f) && n51.f.a(this.f374365g, fiVar.f374365g) && n51.f.a(this.f374366h, fiVar.f374366h) && n51.f.a(java.lang.Integer.valueOf(this.f374367i), java.lang.Integer.valueOf(fiVar.f374367i)) && n51.f.a(this.f374368m, fiVar.f374368m) && n51.f.a(this.f374369n, fiVar.f374369n) && n51.f.a(java.lang.Integer.valueOf(this.f374370o), java.lang.Integer.valueOf(fiVar.f374370o)) && n51.f.a(this.f374371p, fiVar.f374371p) && n51.f.a(this.f374372q, fiVar.f374372q) && n51.f.a(this.f374373r, fiVar.f374373r);
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
            fVar.e(2, this.f374362d);
            java.lang.String str = this.f374363e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f374364f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f374365g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f374366h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.e(7, this.f374367i);
            r45.du5 du5Var = this.f374368m;
            if (du5Var != null) {
                fVar.i(8, du5Var.computeSize());
                this.f374368m.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f374369n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.computeSize());
                this.f374369n.writeFields(fVar);
            }
            fVar.e(10, this.f374370o);
            java.lang.String str5 = this.f374371p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f374372q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            r45.cu5 cu5Var2 = this.f374373r;
            if (cu5Var2 == null) {
                return 0;
            }
            fVar.i(13, cu5Var2.computeSize());
            this.f374373r.writeFields(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f374362d);
            java.lang.String str7 = this.f374363e;
            if (str7 != null) {
                i18 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f374364f;
            if (str8 != null) {
                i18 += b36.f.j(4, str8);
            }
            java.lang.String str9 = this.f374365g;
            if (str9 != null) {
                i18 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f374366h;
            if (str10 != null) {
                i18 += b36.f.j(6, str10);
            }
            int e17 = i18 + b36.f.e(7, this.f374367i);
            r45.du5 du5Var2 = this.f374368m;
            if (du5Var2 != null) {
                e17 += b36.f.i(8, du5Var2.computeSize());
            }
            r45.cu5 cu5Var3 = this.f374369n;
            if (cu5Var3 != null) {
                e17 += b36.f.i(9, cu5Var3.computeSize());
            }
            int e18 = e17 + b36.f.e(10, this.f374370o);
            java.lang.String str11 = this.f374371p;
            if (str11 != null) {
                e18 += b36.f.j(11, str11);
            }
            java.lang.String str12 = this.f374372q;
            if (str12 != null) {
                e18 += b36.f.j(12, str12);
            }
            r45.cu5 cu5Var4 = this.f374373r;
            return cu5Var4 != null ? e18 + b36.f.i(13, cu5Var4.computeSize()) : e18;
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
        r45.fi fiVar = (r45.fi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    fiVar.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                fiVar.f374362d = aVar2.g(intValue);
                return 0;
            case 3:
                fiVar.f374363e = aVar2.k(intValue);
                return 0;
            case 4:
                fiVar.f374364f = aVar2.k(intValue);
                return 0;
            case 5:
                fiVar.f374365g = aVar2.k(intValue);
                return 0;
            case 6:
                fiVar.f374366h = aVar2.k(intValue);
                return 0;
            case 7:
                fiVar.f374367i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr2 != null && bArr2.length > 0) {
                        du5Var3.b(bArr2);
                    }
                    fiVar.f374368m = du5Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var5.b(bArr3);
                    }
                    fiVar.f374369n = cu5Var5;
                }
                return 0;
            case 10:
                fiVar.f374370o = aVar2.g(intValue);
                return 0;
            case 11:
                fiVar.f374371p = aVar2.k(intValue);
                return 0;
            case 12:
                fiVar.f374372q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var6.b(bArr4);
                    }
                    fiVar.f374373r = cu5Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
