package r45;

/* loaded from: classes9.dex */
public class ul5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f387463d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f387464e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f387465f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f387466g;

    /* renamed from: h, reason: collision with root package name */
    public r45.sp0 f387467h;

    /* renamed from: i, reason: collision with root package name */
    public long f387468i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ul5)) {
            return false;
        }
        r45.ul5 ul5Var = (r45.ul5) fVar;
        return n51.f.a(this.f387463d, ul5Var.f387463d) && n51.f.a(this.f387464e, ul5Var.f387464e) && n51.f.a(this.f387465f, ul5Var.f387465f) && n51.f.a(this.f387466g, ul5Var.f387466g) && n51.f.a(this.f387467h, ul5Var.f387467h) && n51.f.a(java.lang.Long.valueOf(this.f387468i), java.lang.Long.valueOf(ul5Var.f387468i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f387465f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f387463d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f387464e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str3 = this.f387466g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            r45.sp0 sp0Var = this.f387467h;
            if (sp0Var != null) {
                fVar.i(5, sp0Var.computeSize());
                this.f387467h.writeFields(fVar);
            }
            fVar.h(6, this.f387468i);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f387463d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f387464e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            int g17 = j17 + b36.f.g(3, 8, linkedList);
            java.lang.String str6 = this.f387466g;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            r45.sp0 sp0Var2 = this.f387467h;
            if (sp0Var2 != null) {
                g17 += b36.f.i(5, sp0Var2.computeSize());
            }
            return g17 + b36.f.h(6, this.f387468i);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
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
        r45.ul5 ul5Var = (r45.ul5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ul5Var.f387463d = aVar2.k(intValue);
                return 0;
            case 2:
                ul5Var.f387464e = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.gp0 gp0Var = new r45.gp0();
                    if (bArr2 != null && bArr2.length > 0) {
                        gp0Var.parseFrom(bArr2);
                    }
                    ul5Var.f387465f.add(gp0Var);
                }
                return 0;
            case 4:
                ul5Var.f387466g = aVar2.k(intValue);
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j19.get(i19);
                    r45.sp0 sp0Var3 = new r45.sp0();
                    if (bArr3 != null && bArr3.length > 0) {
                        sp0Var3.parseFrom(bArr3);
                    }
                    ul5Var.f387467h = sp0Var3;
                }
                return 0;
            case 6:
                ul5Var.f387468i = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
