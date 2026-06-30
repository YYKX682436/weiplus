package r45;

/* loaded from: classes2.dex */
public class sb3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f385606d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f385607e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f385608f;

    /* renamed from: g, reason: collision with root package name */
    public int f385609g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sb3)) {
            return false;
        }
        r45.sb3 sb3Var = (r45.sb3) fVar;
        return n51.f.a(this.BaseResponse, sb3Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f385606d), java.lang.Integer.valueOf(sb3Var.f385606d)) && n51.f.a(this.f385607e, sb3Var.f385607e) && n51.f.a(java.lang.Integer.valueOf(this.f385608f), java.lang.Integer.valueOf(sb3Var.f385608f)) && n51.f.a(java.lang.Integer.valueOf(this.f385609g), java.lang.Integer.valueOf(sb3Var.f385609g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f385607e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f385606d);
            fVar.g(5, 8, linkedList);
            fVar.e(6, this.f385608f);
            fVar.e(7, this.f385609g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f385606d) + b36.f.g(5, 8, linkedList) + b36.f.e(6, this.f385608f) + b36.f.e(7, this.f385609g);
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
        r45.sb3 sb3Var = (r45.sb3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                sb3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            sb3Var.f385606d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            if (intValue == 6) {
                sb3Var.f385608f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 7) {
                return -1;
            }
            sb3Var.f385609g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.fo4 fo4Var = new r45.fo4();
            if (bArr3 != null && bArr3.length > 0) {
                fo4Var.parseFrom(bArr3);
            }
            sb3Var.f385607e.add(fo4Var);
        }
        return 0;
    }
}
