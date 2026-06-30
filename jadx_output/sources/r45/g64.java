package r45;

/* loaded from: classes8.dex */
public class g64 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f374917d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374918e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f374919f;

    /* renamed from: g, reason: collision with root package name */
    public int f374920g;

    /* renamed from: h, reason: collision with root package name */
    public int f374921h;

    /* renamed from: i, reason: collision with root package name */
    public int f374922i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g64)) {
            return false;
        }
        r45.g64 g64Var = (r45.g64) fVar;
        return n51.f.a(this.BaseResponse, g64Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f374917d), java.lang.Integer.valueOf(g64Var.f374917d)) && n51.f.a(this.f374918e, g64Var.f374918e) && n51.f.a(java.lang.Integer.valueOf(this.f374919f), java.lang.Integer.valueOf(g64Var.f374919f)) && n51.f.a(java.lang.Integer.valueOf(this.f374920g), java.lang.Integer.valueOf(g64Var.f374920g)) && n51.f.a(java.lang.Integer.valueOf(this.f374921h), java.lang.Integer.valueOf(g64Var.f374921h)) && n51.f.a(java.lang.Integer.valueOf(this.f374922i), java.lang.Integer.valueOf(g64Var.f374922i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374918e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f374917d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f374919f);
            fVar.e(5, this.f374920g);
            fVar.e(6, this.f374921h);
            fVar.e(7, this.f374922i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f374917d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f374919f) + b36.f.e(5, this.f374920g) + b36.f.e(6, this.f374921h) + b36.f.e(7, this.f374922i);
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
        r45.g64 g64Var = (r45.g64) objArr[1];
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
                    g64Var.BaseResponse = ieVar3;
                }
                return 0;
            case 2:
                g64Var.f374917d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.b64 b64Var = new r45.b64();
                    if (bArr3 != null && bArr3.length > 0) {
                        b64Var.parseFrom(bArr3);
                    }
                    g64Var.f374918e.add(b64Var);
                }
                return 0;
            case 4:
                g64Var.f374919f = aVar2.g(intValue);
                return 0;
            case 5:
                g64Var.f374920g = aVar2.g(intValue);
                return 0;
            case 6:
                g64Var.f374921h = aVar2.g(intValue);
                return 0;
            case 7:
                g64Var.f374922i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
