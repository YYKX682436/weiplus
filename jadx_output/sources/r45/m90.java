package r45;

/* loaded from: classes2.dex */
public class m90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380272d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f380273e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f380274f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f380275g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f380276h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380277i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m90)) {
            return false;
        }
        r45.m90 m90Var = (r45.m90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380272d), java.lang.Integer.valueOf(m90Var.f380272d)) && n51.f.a(this.f380273e, m90Var.f380273e) && n51.f.a(this.f380274f, m90Var.f380274f) && n51.f.a(this.f380275g, m90Var.f380275g) && n51.f.a(this.f380276h, m90Var.f380276h) && n51.f.a(this.f380277i, m90Var.f380277i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f380275g;
        java.util.LinkedList linkedList2 = this.f380274f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380272d);
            r45.rl6 rl6Var = this.f380273e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.computeSize());
                this.f380273e.writeFields(fVar);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            java.lang.String str = this.f380276h;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f380277i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380272d) + 0;
            r45.rl6 rl6Var2 = this.f380273e;
            if (rl6Var2 != null) {
                e17 += b36.f.i(2, rl6Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
            java.lang.String str3 = this.f380276h;
            if (str3 != null) {
                g17 += b36.f.j(5, str3);
            }
            java.lang.String str4 = this.f380277i;
            return str4 != null ? g17 + b36.f.j(6, str4) : g17;
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
        r45.m90 m90Var = (r45.m90) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m90Var.f380272d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.rl6 rl6Var3 = new r45.rl6();
                    if (bArr2 != null && bArr2.length > 0) {
                        rl6Var3.parseFrom(bArr2);
                    }
                    m90Var.f380273e = rl6Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.rl6 rl6Var4 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var4.parseFrom(bArr3);
                    }
                    m90Var.f380274f.add(rl6Var4);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var5.parseFrom(bArr4);
                    }
                    m90Var.f380275g.add(rl6Var5);
                }
                return 0;
            case 5:
                m90Var.f380276h = aVar2.k(intValue);
                return 0;
            case 6:
                m90Var.f380277i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
