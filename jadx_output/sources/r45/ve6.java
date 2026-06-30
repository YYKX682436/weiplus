package r45;

/* loaded from: classes4.dex */
public class ve6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f388173d;

    /* renamed from: e, reason: collision with root package name */
    public int f388174e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388175f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f388176g;

    /* renamed from: h, reason: collision with root package name */
    public long f388177h;

    /* renamed from: i, reason: collision with root package name */
    public int f388178i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ve6)) {
            return false;
        }
        r45.ve6 ve6Var = (r45.ve6) fVar;
        return n51.f.a(this.BaseResponse, ve6Var.BaseResponse) && n51.f.a(this.f388173d, ve6Var.f388173d) && n51.f.a(java.lang.Integer.valueOf(this.f388174e), java.lang.Integer.valueOf(ve6Var.f388174e)) && n51.f.a(this.f388175f, ve6Var.f388175f) && n51.f.a(java.lang.Integer.valueOf(this.f388176g), java.lang.Integer.valueOf(ve6Var.f388176g)) && n51.f.a(java.lang.Long.valueOf(this.f388177h), java.lang.Long.valueOf(ve6Var.f388177h)) && n51.f.a(java.lang.Integer.valueOf(this.f388178i), java.lang.Integer.valueOf(ve6Var.f388178i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388175f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f388173d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f388174e);
            fVar.g(4, 8, linkedList);
            fVar.e(5, this.f388176g);
            fVar.h(6, this.f388177h);
            fVar.e(7, this.f388178i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str2 = this.f388173d;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.e(3, this.f388174e) + b36.f.g(4, 8, linkedList) + b36.f.e(5, this.f388176g) + b36.f.h(6, this.f388177h) + b36.f.e(7, this.f388178i);
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
        r45.ve6 ve6Var = (r45.ve6) objArr[1];
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
                    ve6Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                ve6Var.f388173d = aVar2.k(intValue);
                return 0;
            case 3:
                ve6Var.f388174e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.te6 te6Var = new r45.te6();
                    if (bArr3 != null && bArr3.length > 0) {
                        te6Var.parseFrom(bArr3);
                    }
                    ve6Var.f388175f.add(te6Var);
                }
                return 0;
            case 5:
                ve6Var.f388176g = aVar2.g(intValue);
                return 0;
            case 6:
                ve6Var.f388177h = aVar2.i(intValue);
                return 0;
            case 7:
                ve6Var.f388178i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
