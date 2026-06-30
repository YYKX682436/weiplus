package r45;

/* loaded from: classes9.dex */
public class lr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f379778d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f379779e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f379780f;
    public r45.fs0 field_area_info;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lr0)) {
            return false;
        }
        r45.lr0 lr0Var = (r45.lr0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f379778d), java.lang.Integer.valueOf(lr0Var.f379778d)) && n51.f.a(this.field_area_info, lr0Var.field_area_info) && n51.f.a(this.f379779e, lr0Var.f379779e) && n51.f.a(this.f379780f, lr0Var.f379780f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f379778d);
            r45.fs0 fs0Var = this.field_area_info;
            if (fs0Var != null) {
                fVar.i(2, fs0Var.computeSize());
                this.field_area_info.writeFields(fVar);
            }
            java.lang.String str = this.f379779e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f379780f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f379778d) + 0;
            r45.fs0 fs0Var2 = this.field_area_info;
            if (fs0Var2 != null) {
                e17 += b36.f.i(2, fs0Var2.computeSize());
            }
            java.lang.String str3 = this.f379779e;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f379780f;
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
        r45.lr0 lr0Var = (r45.lr0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lr0Var.f379778d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                lr0Var.f379779e = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            lr0Var.f379780f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.fs0 fs0Var3 = new r45.fs0();
            if (bArr != null && bArr.length > 0) {
                fs0Var3.parseFrom(bArr);
            }
            lr0Var.field_area_info = fs0Var3;
        }
        return 0;
    }
}
