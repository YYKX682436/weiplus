package r45;

/* loaded from: classes4.dex */
public class e63 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373040d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373042f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f373041e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f373043g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f373044h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f373045i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e63)) {
            return false;
        }
        r45.e63 e63Var = (r45.e63) fVar;
        return n51.f.a(this.BaseResponse, e63Var.BaseResponse) && n51.f.a(this.f373040d, e63Var.f373040d) && n51.f.a(this.f373041e, e63Var.f373041e) && n51.f.a(this.f373042f, e63Var.f373042f) && n51.f.a(this.f373043g, e63Var.f373043g) && n51.f.a(this.f373044h, e63Var.f373044h) && n51.f.a(this.f373045i, e63Var.f373045i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373045i;
        java.util.LinkedList linkedList2 = this.f373044h;
        java.util.LinkedList linkedList3 = this.f373043g;
        java.util.LinkedList linkedList4 = this.f373041e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f373040d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList4);
            java.lang.String str2 = this.f373042f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 1, linkedList3);
            fVar.g(6, 1, linkedList2);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str3 = this.f373040d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList4);
            java.lang.String str4 = this.f373042f;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            return g17 + b36.f.g(5, 1, linkedList3) + b36.f.g(6, 1, linkedList2) + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList4.clear();
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
        r45.e63 e63Var = (r45.e63) objArr[1];
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
                    e63Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                e63Var.f373040d = aVar2.k(intValue);
                return 0;
            case 3:
                e63Var.f373041e.add(aVar2.k(intValue));
                return 0;
            case 4:
                e63Var.f373042f = aVar2.k(intValue);
                return 0;
            case 5:
                e63Var.f373043g.add(aVar2.k(intValue));
                return 0;
            case 6:
                e63Var.f373044h.add(aVar2.k(intValue));
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.f63 f63Var = new r45.f63();
                    if (bArr3 != null && bArr3.length > 0) {
                        f63Var.parseFrom(bArr3);
                    }
                    e63Var.f373045i.add(f63Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
