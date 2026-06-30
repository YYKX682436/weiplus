package r45;

/* loaded from: classes4.dex */
public class yj5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391155d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391156e;

    /* renamed from: f, reason: collision with root package name */
    public int f391157f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f391158g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yj5)) {
            return false;
        }
        r45.yj5 yj5Var = (r45.yj5) fVar;
        return n51.f.a(this.BaseRequest, yj5Var.BaseRequest) && n51.f.a(this.f391155d, yj5Var.f391155d) && n51.f.a(this.f391156e, yj5Var.f391156e) && n51.f.a(java.lang.Integer.valueOf(this.f391157f), java.lang.Integer.valueOf(yj5Var.f391157f)) && n51.f.a(this.f391158g, yj5Var.f391158g);
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
            java.lang.String str = this.f391155d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f391156e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f391157f);
            java.lang.String str3 = this.f391158g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f391155d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f391156e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int e17 = i18 + b36.f.e(4, this.f391157f);
            java.lang.String str6 = this.f391158g;
            return str6 != null ? e17 + b36.f.j(5, str6) : e17;
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
        r45.yj5 yj5Var = (r45.yj5) objArr[1];
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
                yj5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            yj5Var.f391155d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            yj5Var.f391156e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            yj5Var.f391157f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        yj5Var.f391158g = aVar2.k(intValue);
        return 0;
    }
}
