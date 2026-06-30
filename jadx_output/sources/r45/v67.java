package r45;

/* loaded from: classes9.dex */
public class v67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387953d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ws f387954e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f387955f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387956g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v67)) {
            return false;
        }
        r45.v67 v67Var = (r45.v67) fVar;
        return n51.f.a(this.f387953d, v67Var.f387953d) && n51.f.a(this.f387954e, v67Var.f387954e) && n51.f.a(java.lang.Boolean.valueOf(this.f387955f), java.lang.Boolean.valueOf(v67Var.f387955f)) && n51.f.a(this.f387956g, v67Var.f387956g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387953d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ws wsVar = this.f387954e;
            if (wsVar != null) {
                fVar.i(2, wsVar.computeSize());
                this.f387954e.writeFields(fVar);
            }
            fVar.a(3, this.f387955f);
            java.lang.String str2 = this.f387956g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f387953d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.ws wsVar2 = this.f387954e;
            if (wsVar2 != null) {
                j17 += b36.f.i(2, wsVar2.computeSize());
            }
            int a17 = j17 + b36.f.a(3, this.f387955f);
            java.lang.String str4 = this.f387956g;
            return str4 != null ? a17 + b36.f.j(4, str4) : a17;
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
        r45.v67 v67Var = (r45.v67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            v67Var.f387953d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                v67Var.f387955f = aVar2.c(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            v67Var.f387956g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.ws wsVar3 = new r45.ws();
            if (bArr != null && bArr.length > 0) {
                wsVar3.parseFrom(bArr);
            }
            v67Var.f387954e = wsVar3;
        }
        return 0;
    }
}
