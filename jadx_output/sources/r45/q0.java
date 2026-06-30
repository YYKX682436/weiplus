package r45;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f383526d;

    /* renamed from: e, reason: collision with root package name */
    public int f383527e;

    /* renamed from: g, reason: collision with root package name */
    public int f383529g;

    /* renamed from: h, reason: collision with root package name */
    public int f383530h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f383528f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f383531i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q0)) {
            return false;
        }
        r45.q0 q0Var = (r45.q0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f383526d), java.lang.Integer.valueOf(q0Var.f383526d)) && n51.f.a(java.lang.Integer.valueOf(this.f383527e), java.lang.Integer.valueOf(q0Var.f383527e)) && n51.f.a(this.f383528f, q0Var.f383528f) && n51.f.a(java.lang.Integer.valueOf(this.f383529g), java.lang.Integer.valueOf(q0Var.f383529g)) && n51.f.a(java.lang.Integer.valueOf(this.f383530h), java.lang.Integer.valueOf(q0Var.f383530h)) && n51.f.a(this.f383531i, q0Var.f383531i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383531i;
        java.util.LinkedList linkedList2 = this.f383528f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f383526d);
            fVar.e(2, this.f383527e);
            fVar.g(3, 8, linkedList2);
            fVar.e(4, this.f383529g);
            fVar.e(5, this.f383530h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f383526d) + 0 + b36.f.e(2, this.f383527e) + b36.f.g(3, 8, linkedList2) + b36.f.e(4, this.f383529g) + b36.f.e(5, this.f383530h) + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.q0 q0Var = (r45.q0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                q0Var.f383526d = aVar2.g(intValue);
                return 0;
            case 2:
                q0Var.f383527e = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.o0 o0Var = new r45.o0();
                    if (bArr2 != null && bArr2.length > 0) {
                        o0Var.parseFrom(bArr2);
                    }
                    q0Var.f383528f.add(o0Var);
                }
                return 0;
            case 4:
                q0Var.f383529g = aVar2.g(intValue);
                return 0;
            case 5:
                q0Var.f383530h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.o0 o0Var2 = new r45.o0();
                    if (bArr3 != null && bArr3.length > 0) {
                        o0Var2.parseFrom(bArr3);
                    }
                    q0Var.f383531i.add(o0Var2);
                }
                return 0;
            default:
                return -1;
        }
    }
}
