package r45;

/* loaded from: classes8.dex */
public class el5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ak5 f373593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373594e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373595f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.el5)) {
            return false;
        }
        r45.el5 el5Var = (r45.el5) fVar;
        return n51.f.a(this.f373593d, el5Var.f373593d) && n51.f.a(this.f373594e, el5Var.f373594e) && n51.f.a(this.f373595f, el5Var.f373595f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ak5 ak5Var = this.f373593d;
            if (ak5Var != null) {
                fVar.i(1, ak5Var.computeSize());
                this.f373593d.writeFields(fVar);
            }
            java.lang.String str = this.f373594e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f373595f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ak5 ak5Var2 = this.f373593d;
            int i18 = ak5Var2 != null ? 0 + b36.f.i(1, ak5Var2.computeSize()) : 0;
            java.lang.String str3 = this.f373594e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f373595f;
            return str4 != null ? i18 + b36.f.j(3, str4) : i18;
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
        r45.el5 el5Var = (r45.el5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                el5Var.f373594e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            el5Var.f373595f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ak5 ak5Var3 = new r45.ak5();
            if (bArr != null && bArr.length > 0) {
                ak5Var3.parseFrom(bArr);
            }
            el5Var.f373593d = ak5Var3;
        }
        return 0;
    }
}
