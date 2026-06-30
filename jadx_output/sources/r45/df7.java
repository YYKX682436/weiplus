package r45;

/* loaded from: classes4.dex */
public class df7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.cf7 f372403d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f372404e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f372405f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public int f372406g;

    /* renamed from: h, reason: collision with root package name */
    public int f372407h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.df7)) {
            return false;
        }
        r45.df7 df7Var = (r45.df7) fVar;
        return n51.f.a(this.f372403d, df7Var.f372403d) && n51.f.a(this.f372404e, df7Var.f372404e) && n51.f.a(this.f372405f, df7Var.f372405f) && n51.f.a(java.lang.Integer.valueOf(this.f372406g), java.lang.Integer.valueOf(df7Var.f372406g)) && n51.f.a(java.lang.Integer.valueOf(this.f372407h), java.lang.Integer.valueOf(df7Var.f372407h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f372405f;
        java.util.LinkedList linkedList2 = this.f372404e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.cf7 cf7Var = this.f372403d;
            if (cf7Var != null) {
                fVar.i(1, cf7Var.computeSize());
                this.f372403d.writeFields(fVar);
            }
            fVar.g(2, 2, linkedList2);
            fVar.g(3, 2, linkedList);
            fVar.e(4, this.f372406g);
            fVar.e(5, this.f372407h);
            return 0;
        }
        if (i17 == 1) {
            r45.cf7 cf7Var2 = this.f372403d;
            return (cf7Var2 != null ? 0 + b36.f.i(1, cf7Var2.computeSize()) : 0) + b36.f.g(2, 2, linkedList2) + b36.f.g(3, 2, linkedList) + b36.f.e(4, this.f372406g) + b36.f.e(5, this.f372407h);
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
        r45.df7 df7Var = (r45.df7) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.cf7 cf7Var3 = new r45.cf7();
                if (bArr2 != null && bArr2.length > 0) {
                    cf7Var3.parseFrom(bArr2);
                }
                df7Var.f372403d = cf7Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            df7Var.f372404e.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 3) {
            df7Var.f372405f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 4) {
            df7Var.f372406g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        df7Var.f372407h = aVar2.g(intValue);
        return 0;
    }
}
