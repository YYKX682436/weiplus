package r45;

/* loaded from: classes2.dex */
public class zi6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f392121d;

    /* renamed from: e, reason: collision with root package name */
    public int f392122e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f392123f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ne0 f392124g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ne0 f392125h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi6)) {
            return false;
        }
        r45.zi6 zi6Var = (r45.zi6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f392121d), java.lang.Integer.valueOf(zi6Var.f392121d)) && n51.f.a(java.lang.Integer.valueOf(this.f392122e), java.lang.Integer.valueOf(zi6Var.f392122e)) && n51.f.a(this.f392123f, zi6Var.f392123f) && n51.f.a(this.f392124g, zi6Var.f392124g) && n51.f.a(this.f392125h, zi6Var.f392125h);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f392121d);
            fVar.e(2, this.f392122e);
            java.lang.String str = this.f392123f;
            if (str != null) {
                fVar.j(3, str);
            }
            r45.ne0 ne0Var = this.f392124g;
            if (ne0Var != null) {
                fVar.i(4, ne0Var.computeSize());
                this.f392124g.writeFields(fVar);
            }
            r45.ne0 ne0Var2 = this.f392125h;
            if (ne0Var2 != null) {
                fVar.i(5, ne0Var2.computeSize());
                this.f392125h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f392121d) + 0 + b36.f.e(2, this.f392122e);
            java.lang.String str2 = this.f392123f;
            if (str2 != null) {
                e17 += b36.f.j(3, str2);
            }
            r45.ne0 ne0Var3 = this.f392124g;
            if (ne0Var3 != null) {
                e17 += b36.f.i(4, ne0Var3.computeSize());
            }
            r45.ne0 ne0Var4 = this.f392125h;
            return ne0Var4 != null ? e17 + b36.f.i(5, ne0Var4.computeSize()) : e17;
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
        r45.zi6 zi6Var = (r45.zi6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            zi6Var.f392121d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            zi6Var.f392122e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            zi6Var.f392123f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.ne0 ne0Var5 = new r45.ne0();
                if (bArr != null && bArr.length > 0) {
                    ne0Var5.parseFrom(bArr);
                }
                zi6Var.f392124g = ne0Var5;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ne0 ne0Var6 = new r45.ne0();
            if (bArr2 != null && bArr2.length > 0) {
                ne0Var6.parseFrom(bArr2);
            }
            zi6Var.f392125h = ne0Var6;
        }
        return 0;
    }
}
