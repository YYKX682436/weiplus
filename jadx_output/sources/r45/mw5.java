package r45;

/* loaded from: classes4.dex */
public class mw5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380868d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380869e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f380870f;

    /* renamed from: g, reason: collision with root package name */
    public long f380871g;

    static {
        new r45.mw5();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mw5)) {
            return false;
        }
        r45.mw5 mw5Var = (r45.mw5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380868d), java.lang.Integer.valueOf(mw5Var.f380868d)) && n51.f.a(this.f380869e, mw5Var.f380869e) && n51.f.a(this.f380870f, mw5Var.f380870f) && n51.f.a(java.lang.Long.valueOf(this.f380871g), java.lang.Long.valueOf(mw5Var.f380871g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.mw5();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380868d);
            java.lang.String str = this.f380869e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f380870f;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.computeSize());
                this.f380870f.writeFields(fVar);
            }
            fVar.h(4, this.f380871g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380868d) + 0;
            java.lang.String str2 = this.f380869e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.cu5 cu5Var2 = this.f380870f;
            if (cu5Var2 != null) {
                e17 += b36.f.i(3, cu5Var2.computeSize());
            }
            return e17 + b36.f.h(4, this.f380871g);
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f380868d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f380869e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f380871g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr != null && bArr.length > 0) {
                cu5Var3.b(bArr);
            }
            this.f380870f = cu5Var3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (r45.mw5) super.parseFrom(bArr);
    }
}
