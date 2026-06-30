package r45;

/* loaded from: classes8.dex */
public class t4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386126d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s4 f386127e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f386128f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f386129g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t4)) {
            return false;
        }
        r45.t4 t4Var = (r45.t4) fVar;
        return n51.f.a(this.f386126d, t4Var.f386126d) && n51.f.a(this.f386127e, t4Var.f386127e) && n51.f.a(this.f386128f, t4Var.f386128f) && n51.f.a(this.f386129g, t4Var.f386129g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386126d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.s4 s4Var = this.f386127e;
            if (s4Var != null) {
                fVar.i(2, s4Var.computeSize());
                this.f386127e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f386128f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f386129g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386126d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.s4 s4Var2 = this.f386127e;
            if (s4Var2 != null) {
                j17 += b36.f.i(2, s4Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f386128f;
            if (gVar2 != null) {
                j17 += b36.f.b(3, gVar2);
            }
            java.lang.String str4 = this.f386129g;
            return str4 != null ? j17 + b36.f.j(4, str4) : j17;
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
        r45.t4 t4Var = (r45.t4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t4Var.f386126d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                t4Var.f386128f = aVar2.d(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            t4Var.f386129g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.s4 s4Var3 = new r45.s4();
            if (bArr != null && bArr.length > 0) {
                s4Var3.parseFrom(bArr);
            }
            t4Var.f386127e = s4Var3;
        }
        return 0;
    }
}
