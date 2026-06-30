package r45;

/* loaded from: classes4.dex */
public class ca0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371391d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f371392e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371393f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371394g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca0)) {
            return false;
        }
        r45.ca0 ca0Var = (r45.ca0) fVar;
        return n51.f.a(this.BaseResponse, ca0Var.BaseResponse) && n51.f.a(this.f371391d, ca0Var.f371391d) && n51.f.a(this.f371392e, ca0Var.f371392e) && n51.f.a(this.f371393f, ca0Var.f371393f) && n51.f.a(this.f371394g, ca0Var.f371394g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371392e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f371391d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f371393f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371394g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f371391d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str5 = this.f371393f;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371394g;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
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
        r45.ca0 ca0Var = (r45.ca0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                ca0Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ca0Var.f371391d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ca0Var.f371393f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ca0Var.f371394g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.yz4 yz4Var = new r45.yz4();
            if (bArr3 != null && bArr3.length > 0) {
                yz4Var.parseFrom(bArr3);
            }
            ca0Var.f371392e.add(yz4Var);
        }
        return 0;
    }
}
