package r45;

/* loaded from: classes9.dex */
public class g6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f374909d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f374910e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f374911f = new java.util.LinkedList();

    static {
        new r45.g6();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.g6 parseFrom(byte[] bArr) {
        return (r45.g6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g6)) {
            return false;
        }
        r45.g6 g6Var = (r45.g6) fVar;
        return n51.f.a(this.f374909d, g6Var.f374909d) && n51.f.a(this.f374910e, g6Var.f374910e) && n51.f.a(this.f374911f, g6Var.f374911f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.g6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f374911f;
        java.util.LinkedList linkedList2 = this.f374910e;
        java.util.LinkedList linkedList3 = this.f374909d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.g(2, 1, linkedList2);
            fVar.g(3, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.g(2, 1, linkedList2) + b36.f.g(3, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
            linkedList2.clear();
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
        if (intValue != 1) {
            if (intValue == 2) {
                linkedList2.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.t5 t5Var = new r45.t5();
            if (bArr != null && bArr.length > 0) {
                t5Var.parseFrom(bArr);
            }
            linkedList3.add(t5Var);
        }
        return 0;
    }
}
