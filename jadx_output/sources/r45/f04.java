package r45;

/* loaded from: classes8.dex */
public class f04 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f373907d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ma5 f373908e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ma5 f373909f;

    /* renamed from: g, reason: collision with root package name */
    public int f373910g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.f04)) {
            return false;
        }
        r45.f04 f04Var = (r45.f04) fVar;
        return n51.f.a(this.f373907d, f04Var.f373907d) && n51.f.a(this.f373908e, f04Var.f373908e) && n51.f.a(this.f373909f, f04Var.f373909f) && n51.f.a(java.lang.Integer.valueOf(this.f373910g), java.lang.Integer.valueOf(f04Var.f373910g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f373907d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.ma5 ma5Var = this.f373908e;
            if (ma5Var != null) {
                fVar.i(2, ma5Var.computeSize());
                this.f373908e.writeFields(fVar);
            }
            r45.ma5 ma5Var2 = this.f373909f;
            if (ma5Var2 != null) {
                fVar.i(3, ma5Var2.computeSize());
                this.f373909f.writeFields(fVar);
            }
            fVar.e(4, this.f373910g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f373907d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.ma5 ma5Var3 = this.f373908e;
            if (ma5Var3 != null) {
                j17 += b36.f.i(2, ma5Var3.computeSize());
            }
            r45.ma5 ma5Var4 = this.f373909f;
            if (ma5Var4 != null) {
                j17 += b36.f.i(3, ma5Var4.computeSize());
            }
            return j17 + b36.f.e(4, this.f373910g);
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
        r45.f04 f04Var = (r45.f04) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            f04Var.f373907d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.ma5 ma5Var5 = new r45.ma5();
                if (bArr != null && bArr.length > 0) {
                    ma5Var5.parseFrom(bArr);
                }
                f04Var.f373908e = ma5Var5;
            }
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            f04Var.f373910g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size2 = j19.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j19.get(i19);
            r45.ma5 ma5Var6 = new r45.ma5();
            if (bArr2 != null && bArr2.length > 0) {
                ma5Var6.parseFrom(bArr2);
            }
            f04Var.f373909f = ma5Var6;
        }
        return 0;
    }
}
