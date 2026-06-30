package r45;

/* loaded from: classes2.dex */
public class q13 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383562d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f383563e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f383564f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public r45.fg6 f383565g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q13)) {
            return false;
        }
        r45.q13 q13Var = (r45.q13) fVar;
        return n51.f.a(this.f383562d, q13Var.f383562d) && n51.f.a(this.f383563e, q13Var.f383563e) && n51.f.a(this.f383564f, q13Var.f383564f) && n51.f.a(this.f383565g, q13Var.f383565g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383564f;
        java.util.LinkedList linkedList2 = this.f383563e;
        java.util.LinkedList linkedList3 = this.f383562d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList3);
            fVar.g(2, 2, linkedList2);
            fVar.g(3, 2, linkedList);
            r45.fg6 fg6Var = this.f383565g;
            if (fg6Var != null) {
                fVar.i(4, fg6Var.computeSize());
                this.f383565g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList3) + 0 + b36.f.g(2, 2, linkedList2) + b36.f.g(3, 2, linkedList);
            r45.fg6 fg6Var2 = this.f383565g;
            return fg6Var2 != null ? g17 + b36.f.i(4, fg6Var2.computeSize()) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.q13 q13Var = (r45.q13) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            q13Var.f383562d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 2) {
            q13Var.f383563e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            q13Var.f383564f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.fg6 fg6Var3 = new r45.fg6();
            if (bArr2 != null && bArr2.length > 0) {
                fg6Var3.parseFrom(bArr2);
            }
            q13Var.f383565g = fg6Var3;
        }
        return 0;
    }
}
