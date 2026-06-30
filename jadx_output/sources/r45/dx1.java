package r45;

/* loaded from: classes4.dex */
public class dx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f372817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f372818e;

    /* renamed from: f, reason: collision with root package name */
    public long f372819f;

    /* renamed from: g, reason: collision with root package name */
    public long f372820g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f372821h;

    /* renamed from: i, reason: collision with root package name */
    public int f372822i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dx1)) {
            return false;
        }
        r45.dx1 dx1Var = (r45.dx1) fVar;
        return n51.f.a(this.BaseRequest, dx1Var.BaseRequest) && n51.f.a(this.f372817d, dx1Var.f372817d) && n51.f.a(this.f372818e, dx1Var.f372818e) && n51.f.a(java.lang.Long.valueOf(this.f372819f), java.lang.Long.valueOf(dx1Var.f372819f)) && n51.f.a(java.lang.Long.valueOf(this.f372820g), java.lang.Long.valueOf(dx1Var.f372820g)) && n51.f.a(this.f372821h, dx1Var.f372821h) && n51.f.a(java.lang.Integer.valueOf(this.f372822i), java.lang.Integer.valueOf(dx1Var.f372822i));
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
            r45.kv0 kv0Var = this.f372817d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.computeSize());
                this.f372817d.writeFields(fVar);
            }
            java.lang.String str = this.f372818e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f372819f);
            fVar.h(5, this.f372820g);
            java.lang.String str2 = this.f372821h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f372822i);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.kv0 kv0Var2 = this.f372817d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.computeSize());
            }
            java.lang.String str3 = this.f372818e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f372819f) + b36.f.h(5, this.f372820g);
            java.lang.String str4 = this.f372821h;
            if (str4 != null) {
                h17 += b36.f.j(6, str4);
            }
            return h17 + b36.f.e(7, this.f372822i);
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
        r45.dx1 dx1Var = (r45.dx1) objArr[1];
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
                    dx1Var.BaseRequest = heVar3;
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
                    dx1Var.f372817d = kv0Var3;
                }
                return 0;
            case 3:
                dx1Var.f372818e = aVar2.k(intValue);
                return 0;
            case 4:
                dx1Var.f372819f = aVar2.i(intValue);
                return 0;
            case 5:
                dx1Var.f372820g = aVar2.i(intValue);
                return 0;
            case 6:
                dx1Var.f372821h = aVar2.k(intValue);
                return 0;
            case 7:
                dx1Var.f372822i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
