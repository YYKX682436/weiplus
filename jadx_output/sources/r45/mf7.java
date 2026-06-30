package r45;

/* loaded from: classes4.dex */
public class mf7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f380461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380462e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f380463f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f380464g;

    /* renamed from: h, reason: collision with root package name */
    public int f380465h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf7)) {
            return false;
        }
        r45.mf7 mf7Var = (r45.mf7) fVar;
        return n51.f.a(this.f380461d, mf7Var.f380461d) && n51.f.a(this.f380462e, mf7Var.f380462e) && n51.f.a(this.f380463f, mf7Var.f380463f) && n51.f.a(java.lang.Integer.valueOf(this.f380464g), java.lang.Integer.valueOf(mf7Var.f380464g)) && n51.f.a(java.lang.Integer.valueOf(this.f380465h), java.lang.Integer.valueOf(mf7Var.f380465h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380463f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f380461d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f380461d.writeFields(fVar);
            }
            java.lang.String str = this.f380462e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 2, linkedList);
            fVar.e(4, this.f380464g);
            fVar.e(5, this.f380465h);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f380461d;
            int i18 = cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0;
            java.lang.String str2 = this.f380462e;
            if (str2 != null) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 2, linkedList) + b36.f.e(4, this.f380464g) + b36.f.e(5, this.f380465h);
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
        r45.mf7 mf7Var = (r45.mf7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.cf7 cf7Var3 = new r45.cf7();
                if (bArr2 != null && bArr2.length > 0) {
                    cf7Var3.parseFrom(bArr2);
                }
                mf7Var.f380461d = cf7Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            mf7Var.f380462e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            mf7Var.f380463f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 4) {
            mf7Var.f380464g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        mf7Var.f380465h = aVar2.g(intValue);
        return 0;
    }
}
