package r45;

/* loaded from: classes9.dex */
public class vi1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388278d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f388279e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f388280f;

    /* renamed from: g, reason: collision with root package name */
    public r45.qx1 f388281g;

    /* renamed from: h, reason: collision with root package name */
    public long f388282h;

    /* renamed from: i, reason: collision with root package name */
    public r45.yx1 f388283i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi1)) {
            return false;
        }
        r45.vi1 vi1Var = (r45.vi1) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388278d), java.lang.Integer.valueOf(vi1Var.f388278d)) && n51.f.a(this.f388279e, vi1Var.f388279e) && n51.f.a(java.lang.Integer.valueOf(this.f388280f), java.lang.Integer.valueOf(vi1Var.f388280f)) && n51.f.a(this.f388281g, vi1Var.f388281g) && n51.f.a(java.lang.Long.valueOf(this.f388282h), java.lang.Long.valueOf(vi1Var.f388282h)) && n51.f.a(this.f388283i, vi1Var.f388283i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f388279e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388278d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f388280f);
            r45.qx1 qx1Var = this.f388281g;
            if (qx1Var != null) {
                fVar.i(4, qx1Var.computeSize());
                this.f388281g.writeFields(fVar);
            }
            fVar.h(5, this.f388282h);
            r45.yx1 yx1Var = this.f388283i;
            if (yx1Var != null) {
                fVar.i(6, yx1Var.computeSize());
                this.f388283i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388278d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f388280f);
            r45.qx1 qx1Var2 = this.f388281g;
            if (qx1Var2 != null) {
                e17 += b36.f.i(4, qx1Var2.computeSize());
            }
            int h17 = e17 + b36.f.h(5, this.f388282h);
            r45.yx1 yx1Var2 = this.f388283i;
            return yx1Var2 != null ? h17 + b36.f.i(6, yx1Var2.computeSize()) : h17;
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
        r45.vi1 vi1Var = (r45.vi1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                vi1Var.f388278d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.yx1 yx1Var3 = new r45.yx1();
                    if (bArr2 != null && bArr2.length > 0) {
                        yx1Var3.parseFrom(bArr2);
                    }
                    vi1Var.f388279e.add(yx1Var3);
                }
                return 0;
            case 3:
                vi1Var.f388280f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.qx1 qx1Var3 = new r45.qx1();
                    if (bArr3 != null && bArr3.length > 0) {
                        qx1Var3.parseFrom(bArr3);
                    }
                    vi1Var.f388281g = qx1Var3;
                }
                return 0;
            case 5:
                vi1Var.f388282h = aVar2.i(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.yx1 yx1Var4 = new r45.yx1();
                    if (bArr4 != null && bArr4.length > 0) {
                        yx1Var4.parseFrom(bArr4);
                    }
                    vi1Var.f388283i = yx1Var4;
                }
                return 0;
            default:
                return -1;
        }
    }
}
