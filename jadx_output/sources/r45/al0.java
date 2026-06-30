package r45;

/* loaded from: classes8.dex */
public class al0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370079d;

    /* renamed from: e, reason: collision with root package name */
    public long f370080e;

    /* renamed from: f, reason: collision with root package name */
    public int f370081f;

    /* renamed from: g, reason: collision with root package name */
    public int f370082g;

    /* renamed from: i, reason: collision with root package name */
    public int f370084i;

    /* renamed from: m, reason: collision with root package name */
    public int f370085m;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f370083h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f370086n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.al0)) {
            return false;
        }
        r45.al0 al0Var = (r45.al0) fVar;
        return n51.f.a(this.BaseResponse, al0Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370079d), java.lang.Integer.valueOf(al0Var.f370079d)) && n51.f.a(java.lang.Long.valueOf(this.f370080e), java.lang.Long.valueOf(al0Var.f370080e)) && n51.f.a(java.lang.Integer.valueOf(this.f370081f), java.lang.Integer.valueOf(al0Var.f370081f)) && n51.f.a(java.lang.Integer.valueOf(this.f370082g), java.lang.Integer.valueOf(al0Var.f370082g)) && n51.f.a(this.f370083h, al0Var.f370083h) && n51.f.a(java.lang.Integer.valueOf(this.f370084i), java.lang.Integer.valueOf(al0Var.f370084i)) && n51.f.a(java.lang.Integer.valueOf(this.f370085m), java.lang.Integer.valueOf(al0Var.f370085m)) && n51.f.a(this.f370086n, al0Var.f370086n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370086n;
        java.util.LinkedList linkedList2 = this.f370083h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370079d);
            fVar.h(3, this.f370080e);
            fVar.e(4, this.f370081f);
            fVar.e(5, this.f370082g);
            fVar.g(6, 8, linkedList2);
            fVar.e(7, this.f370084i);
            fVar.e(8, this.f370085m);
            fVar.g(9, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370079d) + b36.f.h(3, this.f370080e) + b36.f.e(4, this.f370081f) + b36.f.e(5, this.f370082g) + b36.f.g(6, 8, linkedList2) + b36.f.e(7, this.f370084i) + b36.f.e(8, this.f370085m) + b36.f.g(9, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.al0 al0Var = (r45.al0) objArr[1];
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
                    al0Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                al0Var.f370079d = aVar2.g(intValue);
                return 0;
            case 3:
                al0Var.f370080e = aVar2.i(intValue);
                return 0;
            case 4:
                al0Var.f370081f = aVar2.g(intValue);
                return 0;
            case 5:
                al0Var.f370082g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nk6 nk6Var = new r45.nk6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nk6Var.parseFrom(bArr3);
                    }
                    al0Var.f370083h.add(nk6Var);
                }
                return 0;
            case 7:
                al0Var.f370084i = aVar2.g(intValue);
                return 0;
            case 8:
                al0Var.f370085m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.mk6 mk6Var = new r45.mk6();
                    if (bArr4 != null && bArr4.length > 0) {
                        mk6Var.parseFrom(bArr4);
                    }
                    al0Var.f370086n.add(mk6Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
