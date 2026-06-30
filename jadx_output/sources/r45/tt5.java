package r45;

/* loaded from: classes8.dex */
public class tt5 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386787d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386788e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f386789f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vt5 f386790g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tt5)) {
            return false;
        }
        r45.tt5 tt5Var = (r45.tt5) fVar;
        return n51.f.a(this.BaseRequest, tt5Var.BaseRequest) && n51.f.a(this.f386787d, tt5Var.f386787d) && n51.f.a(this.f386788e, tt5Var.f386788e) && n51.f.a(this.f386789f, tt5Var.f386789f) && n51.f.a(this.f386790g, tt5Var.f386790g);
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
            java.lang.String str = this.f386787d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f386788e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f386789f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.vt5 vt5Var = this.f386790g;
            if (vt5Var != null) {
                fVar.i(5, vt5Var.computeSize());
                this.f386790g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str4 = this.f386787d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f386788e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f386789f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            r45.vt5 vt5Var2 = this.f386790g;
            return vt5Var2 != null ? i18 + b36.f.i(5, vt5Var2.computeSize()) : i18;
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
        r45.tt5 tt5Var = (r45.tt5) objArr[1];
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
                tt5Var.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            tt5Var.f386787d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tt5Var.f386788e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            tt5Var.f386789f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.vt5 vt5Var3 = new r45.vt5();
            if (bArr2 != null && bArr2.length > 0) {
                vt5Var3.parseFrom(bArr2);
            }
            tt5Var.f386790g = vt5Var3;
        }
        return 0;
    }
}
