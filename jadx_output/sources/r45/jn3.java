package r45;

/* loaded from: classes4.dex */
public class jn3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377966d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f377967e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f377968f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f377969g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.jn3)) {
            return false;
        }
        r45.jn3 jn3Var = (r45.jn3) fVar;
        return n51.f.a(this.f377966d, jn3Var.f377966d) && n51.f.a(this.f377967e, jn3Var.f377967e) && n51.f.a(this.f377968f, jn3Var.f377968f) && n51.f.a(this.f377969g, jn3Var.f377969g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377966d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f377967e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f377968f);
            fVar.g(4, 8, this.f377969g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f377966d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f377967e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, this.f377968f) + b36.f.g(4, 8, this.f377969g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f377968f.clear();
            this.f377969g.clear();
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
        r45.jn3 jn3Var = (r45.jn3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            jn3Var.f377966d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            jn3Var.f377967e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j18.get(i18);
                r45.vc4 vc4Var = new r45.vc4();
                if (bArr2 != null && bArr2.length > 0) {
                    vc4Var.parseFrom(bArr2);
                }
                jn3Var.f377968f.add(vc4Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j19.get(i19);
            r45.a55 a55Var = new r45.a55();
            if (bArr3 != null && bArr3.length > 0) {
                a55Var.parseFrom(bArr3);
            }
            jn3Var.f377969g.add(a55Var);
        }
        return 0;
    }
}
