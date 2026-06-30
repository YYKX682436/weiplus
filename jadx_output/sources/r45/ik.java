package r45;

/* loaded from: classes9.dex */
public class ik extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f377102d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f377103e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f377104f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377105g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ik)) {
            return false;
        }
        r45.ik ikVar = (r45.ik) fVar;
        return n51.f.a(this.f377102d, ikVar.f377102d) && n51.f.a(this.f377103e, ikVar.f377103e) && n51.f.a(this.f377104f, ikVar.f377104f) && n51.f.a(this.f377105g, ikVar.f377105g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(15, 8, this.f377102d);
            fVar.g(17, 1, this.f377103e);
            java.lang.String str = this.f377104f;
            if (str != null) {
                fVar.j(18, str);
            }
            java.lang.String str2 = this.f377105g;
            if (str2 != null) {
                fVar.j(19, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(15, 8, this.f377102d) + 0 + b36.f.g(17, 1, this.f377103e);
            java.lang.String str3 = this.f377104f;
            if (str3 != null) {
                g17 += b36.f.j(18, str3);
            }
            java.lang.String str4 = this.f377105g;
            return str4 != null ? g17 + b36.f.j(19, str4) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377102d.clear();
            this.f377103e.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.ik ikVar = (r45.ik) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 15:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.d67 d67Var = new r45.d67();
                    if (bArr2 != null && bArr2.length > 0) {
                        d67Var.parseFrom(bArr2);
                    }
                    ikVar.f377102d.add(d67Var);
                }
                return 0;
            case 16:
            default:
                return -1;
            case 17:
                ikVar.f377103e.add(aVar2.k(intValue));
                return 0;
            case 18:
                ikVar.f377104f = aVar2.k(intValue);
                return 0;
            case 19:
                ikVar.f377105g = aVar2.k(intValue);
                return 0;
        }
    }
}
