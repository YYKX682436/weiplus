package m53;

/* loaded from: classes8.dex */
public class o4 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f323941d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f323942e;

    /* renamed from: f, reason: collision with root package name */
    public m53.g f323943f;

    /* renamed from: g, reason: collision with root package name */
    public int f323944g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f323945h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof m53.o4)) {
            return false;
        }
        m53.o4 o4Var = (m53.o4) fVar;
        return n51.f.a(this.BaseRequest, o4Var.BaseRequest) && n51.f.a(this.f323941d, o4Var.f323941d) && n51.f.a(this.f323942e, o4Var.f323942e) && n51.f.a(this.f323943f, o4Var.f323943f) && n51.f.a(java.lang.Integer.valueOf(this.f323944g), java.lang.Integer.valueOf(o4Var.f323944g)) && n51.f.a(this.f323945h, o4Var.f323945h);
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
            java.lang.String str = this.f323941d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f323942e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            m53.g gVar = this.f323943f;
            if (gVar != null) {
                fVar.i(4, gVar.computeSize());
                this.f323943f.writeFields(fVar);
            }
            fVar.e(6, this.f323944g);
            java.lang.String str3 = this.f323945h;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f323941d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f323942e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            m53.g gVar2 = this.f323943f;
            if (gVar2 != null) {
                i18 += b36.f.i(4, gVar2.computeSize());
            }
            int e17 = i18 + b36.f.e(6, this.f323944g);
            java.lang.String str6 = this.f323945h;
            return str6 != null ? e17 + b36.f.j(7, str6) : e17;
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
        m53.o4 o4Var = (m53.o4) objArr[1];
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
                o4Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            o4Var.f323941d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            o4Var.f323942e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue == 6) {
                o4Var.f323944g = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 7) {
                return -1;
            }
            o4Var.f323945h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            m53.g gVar3 = new m53.g();
            if (bArr2 != null && bArr2.length > 0) {
                gVar3.parseFrom(bArr2);
            }
            o4Var.f323943f = gVar3;
        }
        return 0;
    }
}
