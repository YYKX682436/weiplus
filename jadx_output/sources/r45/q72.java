package r45;

/* loaded from: classes8.dex */
public class q72 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f383725d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383726e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f383727f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383728g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f383729h;

    /* renamed from: i, reason: collision with root package name */
    public long f383730i;

    /* renamed from: m, reason: collision with root package name */
    public long f383731m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f383732n;

    /* renamed from: o, reason: collision with root package name */
    public int f383733o;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q72)) {
            return false;
        }
        r45.q72 q72Var = (r45.q72) fVar;
        return n51.f.a(this.BaseRequest, q72Var.BaseRequest) && n51.f.a(this.f383725d, q72Var.f383725d) && n51.f.a(this.f383726e, q72Var.f383726e) && n51.f.a(this.f383727f, q72Var.f383727f) && n51.f.a(this.f383728g, q72Var.f383728g) && n51.f.a(this.f383729h, q72Var.f383729h) && n51.f.a(java.lang.Long.valueOf(this.f383730i), java.lang.Long.valueOf(q72Var.f383730i)) && n51.f.a(java.lang.Long.valueOf(this.f383731m), java.lang.Long.valueOf(q72Var.f383731m)) && n51.f.a(this.f383732n, q72Var.f383732n) && n51.f.a(java.lang.Integer.valueOf(this.f383733o), java.lang.Integer.valueOf(q72Var.f383733o));
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
            r45.kv0 kv0Var = this.f383725d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f383725d.writeFields(fVar);
            }
            java.lang.String str = this.f383726e;
            if (str != null) {
                fVar.j(3, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f383727f;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            java.lang.String str2 = this.f383728g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f383729h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.h(7, this.f383730i);
            fVar.h(8, this.f383731m);
            java.lang.String str4 = this.f383732n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f383733o);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f383725d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str5 = this.f383726e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f383727f;
            if (gVar2 != null) {
                i18 += b36.f.b(4, gVar2);
            }
            java.lang.String str6 = this.f383728g;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f383729h;
            if (str7 != null) {
                i18 += b36.f.j(6, str7);
            }
            int h17 = i18 + b36.f.h(7, this.f383730i) + b36.f.h(8, this.f383731m);
            java.lang.String str8 = this.f383732n;
            if (str8 != null) {
                h17 += b36.f.j(9, str8);
            }
            return h17 + b36.f.e(10, this.f383733o);
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
        r45.q72 q72Var = (r45.q72) objArr[1];
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
                    q72Var.BaseRequest = heVar3;
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
                    q72Var.f383725d = kv0Var3;
                }
                return 0;
            case 3:
                q72Var.f383726e = aVar2.k(intValue);
                return 0;
            case 4:
                q72Var.f383727f = aVar2.d(intValue);
                return 0;
            case 5:
                q72Var.f383728g = aVar2.k(intValue);
                return 0;
            case 6:
                q72Var.f383729h = aVar2.k(intValue);
                return 0;
            case 7:
                q72Var.f383730i = aVar2.i(intValue);
                return 0;
            case 8:
                q72Var.f383731m = aVar2.i(intValue);
                return 0;
            case 9:
                q72Var.f383732n = aVar2.k(intValue);
                return 0;
            case 10:
                q72Var.f383733o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
