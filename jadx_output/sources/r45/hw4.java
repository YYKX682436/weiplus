package r45;

/* loaded from: classes8.dex */
public class hw4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f376511d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public int f376512e;

    /* renamed from: f, reason: collision with root package name */
    public int f376513f;

    /* renamed from: g, reason: collision with root package name */
    public int f376514g;

    /* renamed from: h, reason: collision with root package name */
    public long f376515h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hw4)) {
            return false;
        }
        r45.hw4 hw4Var = (r45.hw4) fVar;
        return n51.f.a(this.f376511d, hw4Var.f376511d) && n51.f.a(java.lang.Integer.valueOf(this.f376512e), java.lang.Integer.valueOf(hw4Var.f376512e)) && n51.f.a(java.lang.Integer.valueOf(this.f376513f), java.lang.Integer.valueOf(hw4Var.f376513f)) && n51.f.a(java.lang.Integer.valueOf(this.f376514g), java.lang.Integer.valueOf(hw4Var.f376514g)) && n51.f.a(java.lang.Long.valueOf(this.f376515h), java.lang.Long.valueOf(hw4Var.f376515h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f376511d);
            fVar.e(2, this.f376512e);
            fVar.e(3, this.f376513f);
            fVar.e(4, this.f376514g);
            fVar.h(5, this.f376515h);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f376511d) + 0 + b36.f.e(2, this.f376512e) + b36.f.e(3, this.f376513f) + b36.f.e(4, this.f376514g) + b36.f.h(5, this.f376515h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f376511d.clear();
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
        r45.hw4 hw4Var = (r45.hw4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.qt qtVar = new r45.qt();
                if (bArr2 != null && bArr2.length > 0) {
                    qtVar.parseFrom(bArr2);
                }
                hw4Var.f376511d.add(qtVar);
            }
            return 0;
        }
        if (intValue == 2) {
            hw4Var.f376512e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            hw4Var.f376513f = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            hw4Var.f376514g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        hw4Var.f376515h = aVar2.i(intValue);
        return 0;
    }
}
