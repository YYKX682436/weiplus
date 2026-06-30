package r45;

/* loaded from: classes2.dex */
public class t extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386040e;

    /* renamed from: f, reason: collision with root package name */
    public int f386041f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f386042g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.t)) {
            return false;
        }
        r45.t tVar = (r45.t) fVar;
        return n51.f.a(this.f386039d, tVar.f386039d) && n51.f.a(this.f386040e, tVar.f386040e) && n51.f.a(java.lang.Integer.valueOf(this.f386041f), java.lang.Integer.valueOf(tVar.f386041f)) && n51.f.a(this.f386042g, tVar.f386042g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f386042g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386039d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386040e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.e(3, this.f386041f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386039d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386040e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.e(3, this.f386041f) + b36.f.g(4, 8, linkedList);
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
        r45.t tVar = (r45.t) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tVar.f386039d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tVar.f386040e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tVar.f386041f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            r45.b0 b0Var = new r45.b0();
            if (bArr2 != null && bArr2.length > 0) {
                b0Var.parseFrom(bArr2);
            }
            tVar.f386042g.add(b0Var);
        }
        return 0;
    }
}
