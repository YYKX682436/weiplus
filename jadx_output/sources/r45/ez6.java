package r45;

/* loaded from: classes2.dex */
public class ez6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f373852d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f373853e;

    /* renamed from: f, reason: collision with root package name */
    public int f373854f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f373855g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f373856h;

    /* renamed from: i, reason: collision with root package name */
    public int f373857i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ez6)) {
            return false;
        }
        r45.ez6 ez6Var = (r45.ez6) fVar;
        return n51.f.a(this.f373852d, ez6Var.f373852d) && n51.f.a(this.f373853e, ez6Var.f373853e) && n51.f.a(java.lang.Integer.valueOf(this.f373854f), java.lang.Integer.valueOf(ez6Var.f373854f)) && n51.f.a(this.f373855g, ez6Var.f373855g) && n51.f.a(this.f373856h, ez6Var.f373856h) && n51.f.a(java.lang.Integer.valueOf(this.f373857i), java.lang.Integer.valueOf(ez6Var.f373857i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f373852d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f373853e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f373854f);
            java.lang.String str2 = this.f373855g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f373856h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f373857i);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str4 = this.f373853e;
            if (str4 != null) {
                g17 += b36.f.j(2, str4);
            }
            int e17 = g17 + b36.f.e(3, this.f373854f);
            java.lang.String str5 = this.f373855g;
            if (str5 != null) {
                e17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f373856h;
            if (str6 != null) {
                e17 += b36.f.j(5, str6);
            }
            return e17 + b36.f.e(6, this.f373857i);
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
        r45.ez6 ez6Var = (r45.ez6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.fz6 fz6Var = new r45.fz6();
                    if (bArr2 != null && bArr2.length > 0) {
                        fz6Var.parseFrom(bArr2);
                    }
                    ez6Var.f373852d.add(fz6Var);
                }
                return 0;
            case 2:
                ez6Var.f373853e = aVar2.k(intValue);
                return 0;
            case 3:
                ez6Var.f373854f = aVar2.g(intValue);
                return 0;
            case 4:
                ez6Var.f373855g = aVar2.k(intValue);
                return 0;
            case 5:
                ez6Var.f373856h = aVar2.k(intValue);
                return 0;
            case 6:
                ez6Var.f373857i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
