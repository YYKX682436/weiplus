package r45;

/* loaded from: classes4.dex */
public class as6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f370245d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f370246e;

    /* renamed from: f, reason: collision with root package name */
    public r45.tj f370247f;

    /* renamed from: g, reason: collision with root package name */
    public r45.tj f370248g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.as6)) {
            return false;
        }
        r45.as6 as6Var = (r45.as6) fVar;
        return n51.f.a(this.BaseRequest, as6Var.BaseRequest) && n51.f.a(this.f370245d, as6Var.f370245d) && n51.f.a(this.f370246e, as6Var.f370246e) && n51.f.a(this.f370247f, as6Var.f370247f) && n51.f.a(this.f370248g, as6Var.f370248g);
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
            java.lang.String str = this.f370245d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f370246e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.tj tjVar = this.f370247f;
            if (tjVar != null) {
                fVar.i(4, tjVar.computeSize());
                this.f370247f.writeFields(fVar);
            }
            r45.tj tjVar2 = this.f370248g;
            if (tjVar2 != null) {
                fVar.i(5, tjVar2.computeSize());
                this.f370248g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f370245d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f370246e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.tj tjVar3 = this.f370247f;
            if (tjVar3 != null) {
                i18 += b36.f.i(4, tjVar3.computeSize());
            }
            r45.tj tjVar4 = this.f370248g;
            return tjVar4 != null ? i18 + b36.f.i(5, tjVar4.computeSize()) : i18;
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
        r45.as6 as6Var = (r45.as6) objArr[1];
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
                as6Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            as6Var.f370245d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            as6Var.f370246e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.tj tjVar5 = new r45.tj();
                if (bArr2 != null && bArr2.length > 0) {
                    tjVar5.parseFrom(bArr2);
                }
                as6Var.f370247f = tjVar5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.tj tjVar6 = new r45.tj();
            if (bArr3 != null && bArr3.length > 0) {
                tjVar6.parseFrom(bArr3);
            }
            as6Var.f370248g = tjVar6;
        }
        return 0;
    }
}
