package r45;

/* loaded from: classes4.dex */
public class a86 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.z76 f369826d;

    /* renamed from: e, reason: collision with root package name */
    public int f369827e;

    /* renamed from: f, reason: collision with root package name */
    public int f369828f;

    /* renamed from: h, reason: collision with root package name */
    public int f369830h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f369829g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f369831i = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a86)) {
            return false;
        }
        r45.a86 a86Var = (r45.a86) fVar;
        return n51.f.a(this.f369826d, a86Var.f369826d) && n51.f.a(java.lang.Integer.valueOf(this.f369827e), java.lang.Integer.valueOf(a86Var.f369827e)) && n51.f.a(java.lang.Integer.valueOf(this.f369828f), java.lang.Integer.valueOf(a86Var.f369828f)) && n51.f.a(this.f369829g, a86Var.f369829g) && n51.f.a(java.lang.Integer.valueOf(this.f369830h), java.lang.Integer.valueOf(a86Var.f369830h)) && n51.f.a(this.f369831i, a86Var.f369831i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f369831i;
        java.util.LinkedList linkedList2 = this.f369829g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.z76 z76Var = this.f369826d;
            if (z76Var != null) {
                fVar.i(1, z76Var.computeSize());
                this.f369826d.writeFields(fVar);
            }
            fVar.e(2, this.f369827e);
            fVar.e(3, this.f369828f);
            fVar.g(4, 8, linkedList2);
            fVar.e(5, this.f369830h);
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.z76 z76Var2 = this.f369826d;
            return (z76Var2 != null ? 0 + b36.f.i(1, z76Var2.computeSize()) : 0) + b36.f.e(2, this.f369827e) + b36.f.e(3, this.f369828f) + b36.f.g(4, 8, linkedList2) + b36.f.e(5, this.f369830h) + b36.f.g(6, 8, linkedList);
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
        r45.a86 a86Var = (r45.a86) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.z76 z76Var3 = new r45.z76();
                    if (bArr2 != null && bArr2.length > 0) {
                        z76Var3.parseFrom(bArr2);
                    }
                    a86Var.f369826d = z76Var3;
                }
                return 0;
            case 2:
                a86Var.f369827e = aVar2.g(intValue);
                return 0;
            case 3:
                a86Var.f369828f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.l86 l86Var = new r45.l86();
                    if (bArr3 != null && bArr3.length > 0) {
                        l86Var.parseFrom(bArr3);
                    }
                    a86Var.f369829g.add(l86Var);
                }
                return 0;
            case 5:
                a86Var.f369830h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.d86 d86Var = new r45.d86();
                    if (bArr4 != null && bArr4.length > 0) {
                        d86Var.parseFrom(bArr4);
                    }
                    a86Var.f369831i.add(d86Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
