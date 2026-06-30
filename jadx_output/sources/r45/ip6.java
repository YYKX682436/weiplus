package r45;

/* loaded from: classes4.dex */
public class ip6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377257d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377258e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377259f;

    /* renamed from: g, reason: collision with root package name */
    public int f377260g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip6)) {
            return false;
        }
        r45.ip6 ip6Var = (r45.ip6) fVar;
        return n51.f.a(this.BaseRequest, ip6Var.BaseRequest) && n51.f.a(this.f377257d, ip6Var.f377257d) && n51.f.a(this.f377258e, ip6Var.f377258e) && n51.f.a(this.f377259f, ip6Var.f377259f) && n51.f.a(java.lang.Integer.valueOf(this.f377260g), java.lang.Integer.valueOf(ip6Var.f377260g));
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
            java.lang.String str = this.f377257d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f377258e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f377259f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.e(5, this.f377260g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f377257d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f377258e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f377259f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            return i18 + b36.f.e(5, this.f377260g);
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
        r45.ip6 ip6Var = (r45.ip6) objArr[1];
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
                ip6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ip6Var.f377257d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            ip6Var.f377258e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ip6Var.f377259f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ip6Var.f377260g = aVar2.g(intValue);
        return 0;
    }
}
