package r45;

/* loaded from: classes8.dex */
public class ec extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bc f373258d;

    /* renamed from: e, reason: collision with root package name */
    public r45.p93 f373259e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f373260f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373261g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373262h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ov5 f373263i;

    /* renamed from: m, reason: collision with root package name */
    public r45.lc f373264m;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ec)) {
            return false;
        }
        r45.ec ecVar = (r45.ec) fVar;
        return n51.f.a(this.f373258d, ecVar.f373258d) && n51.f.a(this.f373259e, ecVar.f373259e) && n51.f.a(this.f373260f, ecVar.f373260f) && n51.f.a(this.f373261g, ecVar.f373261g) && n51.f.a(this.f373262h, ecVar.f373262h) && n51.f.a(this.f373263i, ecVar.f373263i) && n51.f.a(this.f373264m, ecVar.f373264m);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bc bcVar = this.f373258d;
            if (bcVar != null) {
                fVar.i(1, bcVar.computeSize());
                this.f373258d.writeFields(fVar);
            }
            r45.p93 p93Var = this.f373259e;
            if (p93Var != null) {
                fVar.i(2, p93Var.computeSize());
                this.f373259e.writeFields(fVar);
            }
            java.lang.String str = this.f373260f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f373261g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373262h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.ov5 ov5Var = this.f373263i;
            if (ov5Var != null) {
                fVar.i(6, ov5Var.computeSize());
                this.f373263i.writeFields(fVar);
            }
            r45.lc lcVar = this.f373264m;
            if (lcVar != null) {
                fVar.i(7, lcVar.computeSize());
                this.f373264m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bc bcVar2 = this.f373258d;
            int i18 = bcVar2 != null ? 0 + b36.f.i(1, bcVar2.computeSize()) : 0;
            r45.p93 p93Var2 = this.f373259e;
            if (p93Var2 != null) {
                i18 += b36.f.i(2, p93Var2.computeSize());
            }
            java.lang.String str4 = this.f373260f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f373261g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f373262h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            r45.ov5 ov5Var2 = this.f373263i;
            if (ov5Var2 != null) {
                i18 += b36.f.i(6, ov5Var2.computeSize());
            }
            r45.lc lcVar2 = this.f373264m;
            return lcVar2 != null ? i18 + b36.f.i(7, lcVar2.computeSize()) : i18;
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
        r45.ec ecVar = (r45.ec) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bc bcVar3 = new r45.bc();
                    if (bArr != null && bArr.length > 0) {
                        bcVar3.parseFrom(bArr);
                    }
                    ecVar.f373258d = bcVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.p93 p93Var3 = new r45.p93();
                    if (bArr2 != null && bArr2.length > 0) {
                        p93Var3.parseFrom(bArr2);
                    }
                    ecVar.f373259e = p93Var3;
                }
                return 0;
            case 3:
                ecVar.f373260f = aVar2.k(intValue);
                return 0;
            case 4:
                ecVar.f373261g = aVar2.k(intValue);
                return 0;
            case 5:
                ecVar.f373262h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ov5 ov5Var3 = new r45.ov5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ov5Var3.parseFrom(bArr3);
                    }
                    ecVar.f373263i = ov5Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.lc lcVar3 = new r45.lc();
                    if (bArr4 != null && bArr4.length > 0) {
                        lcVar3.parseFrom(bArr4);
                    }
                    ecVar.f373264m = lcVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
