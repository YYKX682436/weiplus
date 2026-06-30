package r45;

/* loaded from: classes2.dex */
public class qd5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f383859d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f383860e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383861f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f383862g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f383863h;

    /* renamed from: i, reason: collision with root package name */
    public int f383864i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qd5)) {
            return false;
        }
        r45.qd5 qd5Var = (r45.qd5) fVar;
        return n51.f.a(this.f383859d, qd5Var.f383859d) && n51.f.a(this.f383860e, qd5Var.f383860e) && n51.f.a(this.f383861f, qd5Var.f383861f) && n51.f.a(this.f383862g, qd5Var.f383862g) && n51.f.a(java.lang.Boolean.valueOf(this.f383863h), java.lang.Boolean.valueOf(qd5Var.f383863h)) && n51.f.a(java.lang.Integer.valueOf(this.f383864i), java.lang.Integer.valueOf(qd5Var.f383864i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f383859d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f383860e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f383861f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f383862g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.a(5, this.f383863h);
            fVar.e(6, this.f383864i);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f383860e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f383861f;
            if (str5 != null) {
                g17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f383862g;
            if (str6 != null) {
                g17 += b36.f.j(4, str6);
            }
            return g17 + b36.f.a(5, this.f383863h) + b36.f.e(6, this.f383864i);
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
        r45.qd5 qd5Var = (r45.qd5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fx4 fx4Var = new r45.fx4();
                    if (bArr2 != null && bArr2.length > 0) {
                        fx4Var.parseFrom(bArr2);
                    }
                    qd5Var.f383859d.add(fx4Var);
                }
                return 0;
            case 2:
                qd5Var.f383860e = aVar2.k(intValue);
                return 0;
            case 3:
                qd5Var.f383861f = aVar2.k(intValue);
                return 0;
            case 4:
                qd5Var.f383862g = aVar2.k(intValue);
                return 0;
            case 5:
                qd5Var.f383863h = aVar2.c(intValue);
                return 0;
            case 6:
                qd5Var.f383864i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
