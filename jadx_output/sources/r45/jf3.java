package r45;

/* loaded from: classes9.dex */
public class jf3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f377780d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377781e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377782f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377783g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ae f377784h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jf3)) {
            return false;
        }
        r45.jf3 jf3Var = (r45.jf3) fVar;
        return n51.f.a(this.BaseRequest, jf3Var.BaseRequest) && n51.f.a(java.lang.Integer.valueOf(this.f377780d), java.lang.Integer.valueOf(jf3Var.f377780d)) && n51.f.a(this.f377781e, jf3Var.f377781e) && n51.f.a(this.f377782f, jf3Var.f377782f) && n51.f.a(this.f377783g, jf3Var.f377783g) && n51.f.a(this.f377784h, jf3Var.f377784h);
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
            fVar.e(2, this.f377780d);
            java.lang.String str = this.f377781e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f377782f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377783g;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            r45.ae aeVar = this.f377784h;
            if (aeVar != null) {
                fVar.i(10, aeVar.computeSize());
                this.f377784h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.e(2, this.f377780d);
            java.lang.String str4 = this.f377781e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f377782f;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f377783g;
            if (str6 != null) {
                i18 += b36.f.j(7, str6);
            }
            r45.ae aeVar2 = this.f377784h;
            return aeVar2 != null ? i18 + b36.f.i(10, aeVar2.computeSize()) : i18;
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
        r45.jf3 jf3Var = (r45.jf3) objArr[1];
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
                jf3Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            jf3Var.f377780d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            jf3Var.f377781e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            jf3Var.f377782f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 7) {
            jf3Var.f377783g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 10) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ae aeVar3 = new r45.ae();
            if (bArr2 != null && bArr2.length > 0) {
                aeVar3.parseFrom(bArr2);
            }
            jf3Var.f377784h = aeVar3;
        }
        return 0;
    }
}
