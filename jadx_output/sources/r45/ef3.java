package r45;

/* loaded from: classes8.dex */
public class ef3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f373385d;

    /* renamed from: e, reason: collision with root package name */
    public int f373386e;

    /* renamed from: h, reason: collision with root package name */
    public int f373389h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f373387f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f373388g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f373390i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef3)) {
            return false;
        }
        r45.ef3 ef3Var = (r45.ef3) fVar;
        return n51.f.a(this.BaseResponse, ef3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f373385d), java.lang.Integer.valueOf(ef3Var.f373385d)) && n51.f.a(java.lang.Integer.valueOf(this.f373386e), java.lang.Integer.valueOf(ef3Var.f373386e)) && n51.f.a(this.f373387f, ef3Var.f373387f) && n51.f.a(this.f373388g, ef3Var.f373388g) && n51.f.a(java.lang.Integer.valueOf(this.f373389h), java.lang.Integer.valueOf(ef3Var.f373389h)) && n51.f.a(this.f373390i, ef3Var.f373390i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373390i;
        java.util.LinkedList linkedList2 = this.f373388g;
        java.util.LinkedList linkedList3 = this.f373387f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f373385d);
            fVar.e(3, this.f373386e);
            fVar.g(4, 2, linkedList3);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f373389h);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f373385d) + b36.f.e(3, this.f373386e) + b36.f.g(4, 2, linkedList3) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f373389h) + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
            linkedList2.clear();
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
        r45.ef3 ef3Var = (r45.ef3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.parseFrom(bArr2);
                    }
                    ef3Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ef3Var.f373385d = aVar2.g(intValue);
                return 0;
            case 3:
                ef3Var.f373386e = aVar2.g(intValue);
                return 0;
            case 4:
                ef3Var.f373387f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.lm0 lm0Var = new r45.lm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        lm0Var.parseFrom(bArr3);
                    }
                    ef3Var.f373388g.add(lm0Var);
                }
                return 0;
            case 6:
                ef3Var.f373389h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.w8 w8Var = new r45.w8();
                    if (bArr4 != null && bArr4.length > 0) {
                        w8Var.parseFrom(bArr4);
                    }
                    ef3Var.f373390i.add(w8Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
