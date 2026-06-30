package r45;

/* loaded from: classes10.dex */
public class a13 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f369630d;

    /* renamed from: e, reason: collision with root package name */
    public long f369631e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369632f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369633g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369634h;

    /* renamed from: i, reason: collision with root package name */
    public long f369635i;

    /* renamed from: m, reason: collision with root package name */
    public int f369636m;

    /* renamed from: n, reason: collision with root package name */
    public int f369637n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f369638o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f369639p;

    /* renamed from: q, reason: collision with root package name */
    public int f369640q;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a13)) {
            return false;
        }
        r45.a13 a13Var = (r45.a13) fVar;
        return n51.f.a(this.BaseRequest, a13Var.BaseRequest) && n51.f.a(this.f369630d, a13Var.f369630d) && n51.f.a(java.lang.Long.valueOf(this.f369631e), java.lang.Long.valueOf(a13Var.f369631e)) && n51.f.a(this.f369632f, a13Var.f369632f) && n51.f.a(this.f369633g, a13Var.f369633g) && n51.f.a(this.f369634h, a13Var.f369634h) && n51.f.a(java.lang.Long.valueOf(this.f369635i), java.lang.Long.valueOf(a13Var.f369635i)) && n51.f.a(java.lang.Integer.valueOf(this.f369636m), java.lang.Integer.valueOf(a13Var.f369636m)) && n51.f.a(java.lang.Integer.valueOf(this.f369637n), java.lang.Integer.valueOf(a13Var.f369637n)) && n51.f.a(this.f369638o, a13Var.f369638o) && n51.f.a(this.f369639p, a13Var.f369639p) && n51.f.a(java.lang.Integer.valueOf(this.f369640q), java.lang.Integer.valueOf(a13Var.f369640q));
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
            r45.kv0 kv0Var = this.f369630d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f369630d.writeFields(fVar);
            }
            fVar.h(3, this.f369631e);
            java.lang.String str = this.f369632f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f369633g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f369634h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f369635i);
            fVar.e(8, this.f369636m);
            fVar.e(9, this.f369637n);
            java.lang.String str4 = this.f369638o;
            if (str4 != null) {
                fVar.j(10, str4);
            }
            com.tencent.mm.protobuf.g gVar = this.f369639p;
            if (gVar != null) {
                fVar.b(100, gVar);
            }
            fVar.e(101, this.f369640q);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f369630d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            int h17 = i18 + b36.f.h(3, this.f369631e);
            java.lang.String str5 = this.f369632f;
            if (str5 != null) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f369633g;
            if (str6 != null) {
                h17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f369634h;
            if (str7 != null) {
                h17 += b36.f.j(6, str7);
            }
            int h18 = h17 + b36.f.h(7, this.f369635i) + b36.f.e(8, this.f369636m) + b36.f.e(9, this.f369637n);
            java.lang.String str8 = this.f369638o;
            if (str8 != null) {
                h18 += b36.f.j(10, str8);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f369639p;
            if (gVar2 != null) {
                h18 += b36.f.b(100, gVar2);
            }
            return h18 + b36.f.e(101, this.f369640q);
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
        r45.a13 a13Var = (r45.a13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            a13Var.f369639p = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 101) {
            a13Var.f369640q = aVar2.g(intValue);
            return 0;
        }
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
                    a13Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.parseFrom(bArr2);
                    }
                    a13Var.f369630d = kv0Var3;
                }
                return 0;
            case 3:
                a13Var.f369631e = aVar2.i(intValue);
                return 0;
            case 4:
                a13Var.f369632f = aVar2.k(intValue);
                return 0;
            case 5:
                a13Var.f369633g = aVar2.k(intValue);
                return 0;
            case 6:
                a13Var.f369634h = aVar2.k(intValue);
                return 0;
            case 7:
                a13Var.f369635i = aVar2.i(intValue);
                return 0;
            case 8:
                a13Var.f369636m = aVar2.g(intValue);
                return 0;
            case 9:
                a13Var.f369637n = aVar2.g(intValue);
                return 0;
            case 10:
                a13Var.f369638o = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
