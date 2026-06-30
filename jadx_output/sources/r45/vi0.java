package r45;

/* loaded from: classes4.dex */
public class vi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.kj0 f388275d;

    /* renamed from: e, reason: collision with root package name */
    public int f388276e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f388277f = new java.util.LinkedList();

    static {
        new r45.vi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vi0 parseFrom(byte[] bArr) {
        return (r45.vi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi0)) {
            return false;
        }
        r45.vi0 vi0Var = (r45.vi0) fVar;
        return n51.f.a(this.f388275d, vi0Var.f388275d) && n51.f.a(java.lang.Integer.valueOf(this.f388276e), java.lang.Integer.valueOf(vi0Var.f388276e)) && n51.f.a(this.f388277f, vi0Var.f388277f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.vi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388277f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.kj0 kj0Var = this.f388275d;
            if (kj0Var != null) {
                fVar.i(1, kj0Var.computeSize());
                this.f388275d.writeFields(fVar);
            }
            fVar.e(2, this.f388276e);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.kj0 kj0Var2 = this.f388275d;
            return (kj0Var2 != null ? 0 + b36.f.i(1, kj0Var2.computeSize()) : 0) + b36.f.e(2, this.f388276e) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.kj0 kj0Var3 = new r45.kj0();
                if (bArr != null && bArr.length > 0) {
                    kj0Var3.parseFrom(bArr);
                }
                this.f388275d = kj0Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f388276e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.ri0 ri0Var = new r45.ri0();
            if (bArr2 != null && bArr2.length > 0) {
                ri0Var.parseFrom(bArr2);
            }
            linkedList.add(ri0Var);
        }
        return 0;
    }
}
