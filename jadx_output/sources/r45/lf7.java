package r45;

/* loaded from: classes4.dex */
public class lf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f379437d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379438e;

    /* renamed from: f, reason: collision with root package name */
    public int f379439f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f379440g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lf7)) {
            return false;
        }
        r45.lf7 lf7Var = (r45.lf7) fVar;
        return n51.f.a(this.f379437d, lf7Var.f379437d) && n51.f.a(this.f379438e, lf7Var.f379438e) && n51.f.a(java.lang.Integer.valueOf(this.f379439f), java.lang.Integer.valueOf(lf7Var.f379439f)) && n51.f.a(this.f379440g, lf7Var.f379440g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f379437d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f379437d.writeFields(fVar);
            }
            java.lang.String str = this.f379438e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f379439f);
            java.lang.String str2 = this.f379440g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f379437d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0;
            java.lang.String str3 = this.f379438e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f379439f);
            java.lang.String str4 = this.f379440g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        r45.lf7 lf7Var = (r45.lf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                lf7Var.f379438e = aVar2.k(intValue);
                return 0;
            }
            if (intValue == 3) {
                lf7Var.f379439f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lf7Var.f379440g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.cf7 cf7Var3 = new r45.cf7();
            if (bArr != null && bArr.length > 0) {
                cf7Var3.parseFrom(bArr);
            }
            lf7Var.f379437d = cf7Var3;
        }
        return 0;
    }
}
