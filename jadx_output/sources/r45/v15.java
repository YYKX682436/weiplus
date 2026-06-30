package r45;

/* loaded from: classes4.dex */
public class v15 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387802d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387803e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f387804f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387805g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v15)) {
            return false;
        }
        r45.v15 v15Var = (r45.v15) fVar;
        return n51.f.a(this.BaseRequest, v15Var.BaseRequest) && n51.f.a(this.f387802d, v15Var.f387802d) && n51.f.a(this.f387803e, v15Var.f387803e) && n51.f.a(this.f387804f, v15Var.f387804f) && n51.f.a(this.f387805g, v15Var.f387805g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f387802d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387803e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f387804f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f387805g;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str5 = this.f387802d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f387803e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f387804f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f387805g;
            return str8 != null ? i18 + b36.f.j(5, str8) : i18;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.v15 v15Var = (r45.v15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.parseFrom(bArr);
                }
                v15Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            v15Var.f387802d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v15Var.f387803e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            v15Var.f387804f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v15Var.f387805g = aVar2.k(intValue);
        return 0;
    }
}
