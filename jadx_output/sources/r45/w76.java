package r45;

/* loaded from: classes4.dex */
public class w76 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388948d;

    /* renamed from: e, reason: collision with root package name */
    public int f388949e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388950f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f388951g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f388952h;

    /* renamed from: i, reason: collision with root package name */
    public int f388953i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ga6 f388954m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.w76)) {
            return false;
        }
        r45.w76 w76Var = (r45.w76) fVar;
        return n51.f.a(this.BaseResponse, w76Var.BaseResponse) && n51.f.a(this.f388948d, w76Var.f388948d) && n51.f.a(java.lang.Integer.valueOf(this.f388949e), java.lang.Integer.valueOf(w76Var.f388949e)) && n51.f.a(this.f388950f, w76Var.f388950f) && n51.f.a(java.lang.Integer.valueOf(this.f388951g), java.lang.Integer.valueOf(w76Var.f388951g)) && n51.f.a(this.f388952h, w76Var.f388952h) && n51.f.a(java.lang.Integer.valueOf(this.f388953i), java.lang.Integer.valueOf(w76Var.f388953i)) && n51.f.a(this.f388954m, w76Var.f388954m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388950f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f388948d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388949e);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f388951g);
            java.lang.String str2 = this.f388952h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f388953i);
            r45.ga6 ga6Var = this.f388954m;
            if (ga6Var != null) {
                fVar.i(8, ga6Var.computeSize());
                this.f388954m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f388948d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f388949e) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f388951g);
            java.lang.String str4 = this.f388952h;
            if (str4 != null) {
                e17 += b36.f.j(6, str4);
            }
            int e18 = e17 + b36.f.e(7, this.f388953i);
            r45.ga6 ga6Var2 = this.f388954m;
            return ga6Var2 != null ? e18 + b36.f.i(8, ga6Var2.computeSize()) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.w76 w76Var = (r45.w76) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    w76Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                w76Var.f388948d = aVar2.k(intValue);
                return 0;
            case 3:
                w76Var.f388949e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
                    if (bArr3 != null && bArr3.length > 0) {
                        snsObject.parseFrom(bArr3);
                    }
                    w76Var.f388950f.add(snsObject);
                }
                return 0;
            case 5:
                w76Var.f388951g = aVar2.g(intValue);
                return 0;
            case 6:
                w76Var.f388952h = aVar2.k(intValue);
                return 0;
            case 7:
                w76Var.f388953i = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.ga6 ga6Var3 = new r45.ga6();
                    if (bArr4 != null && bArr4.length > 0) {
                        ga6Var3.parseFrom(bArr4);
                    }
                    w76Var.f388954m = ga6Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
