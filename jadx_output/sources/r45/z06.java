package r45;

/* loaded from: classes11.dex */
public class z06 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f391573e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f391574f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f391575g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.z06)) {
            return false;
        }
        r45.z06 z06Var = (r45.z06) fVar;
        return n51.f.a(this.f391572d, z06Var.f391572d) && n51.f.a(this.f391573e, z06Var.f391573e) && n51.f.a(this.f391574f, z06Var.f391574f) && n51.f.a(this.f391575g, z06Var.f391575g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f391575g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f391572d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f391573e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f391574f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f391572d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f391573e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f391574f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 8, linkedList);
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
        r45.z06 z06Var = (r45.z06) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            z06Var.f391572d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            z06Var.f391573e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            z06Var.f391574f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.y06 y06Var = new r45.y06();
            if (bArr2 != null && bArr2.length > 0) {
                y06Var.parseFrom(bArr2);
            }
            z06Var.f391575g.add(y06Var);
        }
        return 0;
    }
}
