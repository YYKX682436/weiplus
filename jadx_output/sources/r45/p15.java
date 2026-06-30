package r45;

/* loaded from: classes4.dex */
public class p15 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f382661d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f382662e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ce4 f382663f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f382664g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p15)) {
            return false;
        }
        r45.p15 p15Var = (r45.p15) fVar;
        return n51.f.a(this.BaseResponse, p15Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f382661d), java.lang.Integer.valueOf(p15Var.f382661d)) && n51.f.a(this.f382662e, p15Var.f382662e) && n51.f.a(this.f382663f, p15Var.f382663f) && n51.f.a(this.f382664g, p15Var.f382664g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f382661d);
            java.lang.String str = this.f382662e;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ce4 ce4Var = this.f382663f;
            if (ce4Var != null) {
                fVar.i(99, ce4Var.computeSize());
                this.f382663f.writeFields(fVar);
            }
            java.lang.String str2 = this.f382664g;
            if (str2 != null) {
                fVar.j(100, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f382661d);
            java.lang.String str3 = this.f382662e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            r45.ce4 ce4Var2 = this.f382663f;
            if (ce4Var2 != null) {
                i18 += b36.f.i(99, ce4Var2.computeSize());
            }
            java.lang.String str4 = this.f382664g;
            return str4 != null ? i18 + b36.f.j(100, str4) : i18;
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
        r45.p15 p15Var = (r45.p15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.parseFrom(bArr);
                }
                p15Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            p15Var.f382661d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            p15Var.f382662e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 99) {
            if (intValue != 100) {
                return -1;
            }
            p15Var.f382664g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.ce4 ce4Var3 = new r45.ce4();
            if (bArr2 != null && bArr2.length > 0) {
                ce4Var3.parseFrom(bArr2);
            }
            p15Var.f382663f = ce4Var3;
        }
        return 0;
    }
}
