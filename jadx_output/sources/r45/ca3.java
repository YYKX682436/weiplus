package r45;

/* loaded from: classes4.dex */
public class ca3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f371395d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f371396e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f371397f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371398g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca3)) {
            return false;
        }
        r45.ca3 ca3Var = (r45.ca3) fVar;
        return n51.f.a(this.BaseResponse, ca3Var.BaseResponse) && n51.f.a(this.f371395d, ca3Var.f371395d) && n51.f.a(this.f371396e, ca3Var.f371396e) && n51.f.a(this.f371397f, ca3Var.f371397f) && n51.f.a(this.f371398g, ca3Var.f371398g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f371396e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            java.lang.String str = this.f371395d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f371397f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f371398g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0;
            java.lang.String str4 = this.f371395d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList);
            java.lang.String str5 = this.f371397f;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f371398g;
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
        r45.ca3 ca3Var = (r45.ca3) objArr[1];
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
                ca3Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ca3Var.f371395d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ca3Var.f371396e.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 4) {
            ca3Var.f371397f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ca3Var.f371398g = aVar2.k(intValue);
        return 0;
    }
}
