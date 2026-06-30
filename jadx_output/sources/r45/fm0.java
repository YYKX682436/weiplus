package r45;

/* loaded from: classes9.dex */
public class fm0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374436d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374437e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374438f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f374439g;

    /* renamed from: h, reason: collision with root package name */
    public a36.a f374440h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fm0)) {
            return false;
        }
        r45.fm0 fm0Var = (r45.fm0) fVar;
        return n51.f.a(this.BaseResponse, fm0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374436d), java.lang.Integer.valueOf(fm0Var.f374436d)) && n51.f.a(this.f374437e, fm0Var.f374437e) && n51.f.a(this.f374438f, fm0Var.f374438f) && n51.f.a(java.lang.Integer.valueOf(this.f374439g), java.lang.Integer.valueOf(fm0Var.f374439g)) && n51.f.a(this.f374440h, fm0Var.f374440h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374438f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f374436d);
            java.lang.String str = this.f374437e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f374439g);
            a36.a aVar = this.f374440h;
            if (aVar != null) {
                fVar.i(6, aVar.computeSize());
                this.f374440h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374436d);
            java.lang.String str2 = this.f374437e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f374439g);
            a36.a aVar2 = this.f374440h;
            return aVar2 != null ? g17 + b36.f.i(6, aVar2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar3 = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar3)) {
                if (!super.populateBuilderWithField(aVar3, this, nextFieldNumber)) {
                    aVar3.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar4 = (c36.a) objArr[0];
        r45.fm0 fm0Var = (r45.fm0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar4.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    fm0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                fm0Var.f374436d = aVar4.g(intValue);
                return 0;
            case 3:
                fm0Var.f374437e = aVar4.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar4.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    a36.i iVar = new a36.i();
                    if (bArr3 != null && bArr3.length > 0) {
                        iVar.parseFrom(bArr3);
                    }
                    fm0Var.f374438f.add(iVar);
                }
                return 0;
            case 5:
                fm0Var.f374439g = aVar4.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar4.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    a36.a aVar5 = new a36.a();
                    if (bArr4 != null && bArr4.length > 0) {
                        aVar5.parseFrom(bArr4);
                    }
                    fm0Var.f374440h = aVar5;
                }
                return 0;
            default:
                return -1;
        }
    }
}
