package xq3;

/* loaded from: classes8.dex */
public class m extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456103e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f456104f = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof xq3.m)) {
            return false;
        }
        xq3.m mVar = (xq3.m) fVar;
        return n51.f.a(this.f456102d, mVar.f456102d) && n51.f.a(this.f456103e, mVar.f456103e) && n51.f.a(this.f456104f, mVar.f456104f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456102d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456103e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f456104f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f456102d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f456103e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.g(3, 8, this.f456104f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f456104f.clear();
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
        xq3.m mVar = (xq3.m) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            mVar.f456102d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            mVar.f456103e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j18.get(i18);
            xq3.h hVar = new xq3.h();
            if (bArr2 != null && bArr2.length > 0) {
                hVar.parseFrom(bArr2);
            }
            mVar.f456104f.add(hVar);
        }
        return 0;
    }
}
