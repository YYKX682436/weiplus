package r45;

/* loaded from: classes9.dex */
public class bn4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ae f370890d;

    /* renamed from: e, reason: collision with root package name */
    public long f370891e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f370892f;

    /* renamed from: g, reason: collision with root package name */
    public long f370893g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f370894h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f370895i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.bn4)) {
            return false;
        }
        r45.bn4 bn4Var = (r45.bn4) fVar;
        return n51.f.a(this.BaseRequest, bn4Var.BaseRequest) && n51.f.a(this.f370890d, bn4Var.f370890d) && n51.f.a(java.lang.Long.valueOf(this.f370891e), java.lang.Long.valueOf(bn4Var.f370891e)) && n51.f.a(this.f370892f, bn4Var.f370892f) && n51.f.a(java.lang.Long.valueOf(this.f370893g), java.lang.Long.valueOf(bn4Var.f370893g)) && n51.f.a(this.f370894h, bn4Var.f370894h) && n51.f.a(this.f370895i, bn4Var.f370895i);
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
            r45.ae aeVar = this.f370890d;
            if (aeVar != null) {
                fVar.i(2, aeVar.computeSize());
                this.f370890d.writeFields(fVar);
            }
            fVar.h(3, this.f370891e);
            java.lang.String str = this.f370892f;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f370893g);
            java.lang.String str2 = this.f370894h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f370895i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            r45.ae aeVar2 = this.f370890d;
            if (aeVar2 != null) {
                i18 += b36.f.i(2, aeVar2.computeSize());
            }
            int h17 = i18 + b36.f.h(3, this.f370891e);
            java.lang.String str4 = this.f370892f;
            if (str4 != null) {
                h17 += b36.f.j(4, str4);
            }
            int h18 = h17 + b36.f.h(5, this.f370893g);
            java.lang.String str5 = this.f370894h;
            if (str5 != null) {
                h18 += b36.f.j(6, str5);
            }
            java.lang.String str6 = this.f370895i;
            return str6 != null ? h18 + b36.f.j(7, str6) : h18;
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
        r45.bn4 bn4Var = (r45.bn4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    bn4Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ae aeVar3 = new r45.ae();
                    if (bArr2 != null && bArr2.length > 0) {
                        aeVar3.parseFrom(bArr2);
                    }
                    bn4Var.f370890d = aeVar3;
                }
                return 0;
            case 3:
                bn4Var.f370891e = aVar2.i(intValue);
                return 0;
            case 4:
                bn4Var.f370892f = aVar2.k(intValue);
                return 0;
            case 5:
                bn4Var.f370893g = aVar2.i(intValue);
                return 0;
            case 6:
                bn4Var.f370894h = aVar2.k(intValue);
                return 0;
            case 7:
                bn4Var.f370895i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
