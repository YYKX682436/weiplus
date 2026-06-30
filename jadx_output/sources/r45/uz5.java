package r45;

/* loaded from: classes4.dex */
public class uz5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387766d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387767e;

    /* renamed from: f, reason: collision with root package name */
    public long f387768f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387769g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.uz5)) {
            return false;
        }
        r45.uz5 uz5Var = (r45.uz5) fVar;
        return n51.f.a(this.BaseRequest, uz5Var.BaseRequest) && n51.f.a(this.f387766d, uz5Var.f387766d) && n51.f.a(this.f387767e, uz5Var.f387767e) && n51.f.a(java.lang.Long.valueOf(this.f387768f), java.lang.Long.valueOf(uz5Var.f387768f)) && n51.f.a(this.f387769g, uz5Var.f387769g);
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
            java.lang.String str = this.f387766d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f387767e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.h(4, this.f387768f);
            java.lang.String str3 = this.f387769g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f387766d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f387767e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f387768f);
            java.lang.String str6 = this.f387769g;
            return str6 != null ? h17 + b36.f.j(5, str6) : h17;
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
        r45.uz5 uz5Var = (r45.uz5) objArr[1];
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
                uz5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            uz5Var.f387766d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            uz5Var.f387767e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            uz5Var.f387768f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        uz5Var.f387769g = aVar2.k(intValue);
        return 0;
    }
}
