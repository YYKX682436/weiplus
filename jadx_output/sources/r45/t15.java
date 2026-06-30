package r45;

/* loaded from: classes8.dex */
public class t15 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f386064d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386065e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oo0 f386066f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t15)) {
            return false;
        }
        r45.t15 t15Var = (r45.t15) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f386064d), java.lang.Boolean.valueOf(t15Var.f386064d)) && n51.f.a(this.f386065e, t15Var.f386065e) && n51.f.a(this.f386066f, t15Var.f386066f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f386064d);
            java.lang.String str = this.f386065e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.oo0 oo0Var = this.f386066f;
            if (oo0Var != null) {
                fVar.i(3, oo0Var.computeSize());
                this.f386066f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f386064d) + 0;
            java.lang.String str2 = this.f386065e;
            if (str2 != null) {
                a17 += b36.f.j(2, str2);
            }
            r45.oo0 oo0Var2 = this.f386066f;
            return oo0Var2 != null ? a17 + b36.f.i(3, oo0Var2.computeSize()) : a17;
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
        r45.t15 t15Var = (r45.t15) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            t15Var.f386064d = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 2) {
            t15Var.f386065e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.oo0 oo0Var3 = new r45.oo0();
            if (bArr != null && bArr.length > 0) {
                oo0Var3.parseFrom(bArr);
            }
            t15Var.f386066f = oo0Var3;
        }
        return 0;
    }
}
