package r45;

/* loaded from: classes4.dex */
public class zm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f392201d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f392202e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f392203f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f392204g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f392205h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f392206i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zm)) {
            return false;
        }
        r45.zm zmVar = (r45.zm) fVar;
        return n51.f.a(this.f392201d, zmVar.f392201d) && n51.f.a(this.f392202e, zmVar.f392202e) && n51.f.a(java.lang.Integer.valueOf(this.f392203f), java.lang.Integer.valueOf(zmVar.f392203f)) && n51.f.a(this.f392204g, zmVar.f392204g) && n51.f.a(this.f392205h, zmVar.f392205h) && n51.f.a(this.f392206i, zmVar.f392206i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f392202e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f392201d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f392203f);
            java.lang.String str2 = this.f392204g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f392205h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f392206i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f392201d;
            int j17 = (str5 != null ? 0 + b36.f.j(1, str5) : 0) + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f392203f);
            java.lang.String str6 = this.f392204g;
            if (str6 != null) {
                j17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f392205h;
            if (str7 != null) {
                j17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f392206i;
            return str8 != null ? j17 + b36.f.j(6, str8) : j17;
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
        r45.zm zmVar = (r45.zm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zmVar.f392201d = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j18.get(i18);
                    r45.fl flVar = new r45.fl();
                    if (bArr2 != null && bArr2.length > 0) {
                        flVar.parseFrom(bArr2);
                    }
                    zmVar.f392202e.add(flVar);
                }
                return 0;
            case 3:
                zmVar.f392203f = aVar2.g(intValue);
                return 0;
            case 4:
                zmVar.f392204g = aVar2.k(intValue);
                return 0;
            case 5:
                zmVar.f392205h = aVar2.k(intValue);
                return 0;
            case 6:
                zmVar.f392206i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
