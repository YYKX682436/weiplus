package r45;

/* loaded from: classes8.dex */
public class n67 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f381110d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f381111e;

    /* renamed from: f, reason: collision with root package name */
    public r45.c77 f381112f;

    /* renamed from: g, reason: collision with root package name */
    public int f381113g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.n67)) {
            return false;
        }
        r45.n67 n67Var = (r45.n67) fVar;
        return n51.f.a(this.f381110d, n67Var.f381110d) && n51.f.a(this.f381111e, n67Var.f381111e) && n51.f.a(this.f381112f, n67Var.f381112f) && n51.f.a(java.lang.Integer.valueOf(this.f381113g), java.lang.Integer.valueOf(n67Var.f381113g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f381110d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f381111e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.c77 c77Var = this.f381112f;
            if (c77Var != null) {
                fVar.i(3, c77Var.computeSize());
                this.f381112f.writeFields(fVar);
            }
            fVar.e(4, this.f381113g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f381110d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f381111e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.c77 c77Var2 = this.f381112f;
            if (c77Var2 != null) {
                j17 += b36.f.i(3, c77Var2.computeSize());
            }
            return j17 + b36.f.e(4, this.f381113g);
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
        r45.n67 n67Var = (r45.n67) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            n67Var.f381110d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            n67Var.f381111e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            n67Var.f381113g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.c77 c77Var3 = new r45.c77();
            if (bArr != null && bArr.length > 0) {
                c77Var3.parseFrom(bArr);
            }
            n67Var.f381112f = c77Var3;
        }
        return 0;
    }
}
