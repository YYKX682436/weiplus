package r45;

/* loaded from: classes11.dex */
public class qe3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f383885d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383886e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f383887f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383888g;

    /* renamed from: h, reason: collision with root package name */
    public int f383889h;

    /* renamed from: i, reason: collision with root package name */
    public int f383890i;

    /* renamed from: m, reason: collision with root package name */
    public r45.tj0 f383891m;

    static {
        new r45.qe3();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qe3)) {
            return false;
        }
        r45.qe3 qe3Var = (r45.qe3) fVar;
        return n51.f.a(this.BaseResponse, qe3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f383885d), java.lang.Integer.valueOf(qe3Var.f383885d)) && n51.f.a(this.f383886e, qe3Var.f383886e) && n51.f.a(java.lang.Integer.valueOf(this.f383887f), java.lang.Integer.valueOf(qe3Var.f383887f)) && n51.f.a(this.f383888g, qe3Var.f383888g) && n51.f.a(java.lang.Integer.valueOf(this.f383889h), java.lang.Integer.valueOf(qe3Var.f383889h)) && n51.f.a(java.lang.Integer.valueOf(this.f383890i), java.lang.Integer.valueOf(qe3Var.f383890i)) && n51.f.a(this.f383891m, qe3Var.f383891m);
    }

    @Override // r45.js5, r45.ny3
    public r45.ie getBaseResponse() {
        return this.BaseResponse;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.qe3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383886e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f383885d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f383887f);
            java.lang.String str = this.f383888g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f383889h);
            fVar.e(8, this.f383890i);
            r45.tj0 tj0Var = this.f383891m;
            if (tj0Var != null) {
                fVar.i(9, tj0Var.computeSize());
                this.f383891m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f383885d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f383887f);
            java.lang.String str2 = this.f383888g;
            if (str2 != null) {
                i18 += b36.f.j(5, str2);
            }
            int e17 = i18 + b36.f.e(6, this.f383889h) + b36.f.e(8, this.f383890i);
            r45.tj0 tj0Var2 = this.f383891m;
            return tj0Var2 != null ? e17 + b36.f.i(9, tj0Var2.computeSize()) : e17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                this.f383885d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.oj0 oj0Var = new r45.oj0();
                    if (bArr2 != null && bArr2.length > 0) {
                        oj0Var.parseFrom(bArr2);
                    }
                    linkedList.add(oj0Var);
                }
                return 0;
            case 4:
                this.f383887f = aVar2.g(intValue);
                return 0;
            case 5:
                this.f383888g = aVar2.k(intValue);
                return 0;
            case 6:
                this.f383889h = aVar2.g(intValue);
                return 0;
            case 7:
            default:
                return -1;
            case 8:
                this.f383890i = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.tj0 tj0Var3 = new r45.tj0();
                    if (bArr3 != null && bArr3.length > 0) {
                        tj0Var3.parseFrom(bArr3);
                    }
                    this.f383891m = tj0Var3;
                }
                return 0;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.qe3) super.parseFrom(bArr);
    }

    @Override // r45.js5, r45.ny3
    public r45.ny3 setBaseResponse(r45.ie ieVar) {
        this.BaseResponse = ieVar;
        return this;
    }
}
