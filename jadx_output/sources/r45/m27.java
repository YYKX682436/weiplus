package r45;

/* loaded from: classes4.dex */
public class m27 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380105d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f380106e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f380107f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m27)) {
            return false;
        }
        r45.m27 m27Var = (r45.m27) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380105d), java.lang.Integer.valueOf(m27Var.f380105d)) && n51.f.a(this.f380106e, m27Var.f380106e) && n51.f.a(java.lang.Integer.valueOf(this.f380107f), java.lang.Integer.valueOf(m27Var.f380107f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380106e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380105d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f380107f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f380105d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f380107f);
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
        r45.m27 m27Var = (r45.m27) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            m27Var.f380105d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            m27Var.f380107f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.l27 l27Var = new r45.l27();
            if (bArr2 != null && bArr2.length > 0) {
                l27Var.parseFrom(bArr2);
            }
            m27Var.f380106e.add(l27Var);
        }
        return 0;
    }
}
