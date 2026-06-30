package r45;

/* loaded from: classes4.dex */
public class nb6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f381232d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public long f381233e;

    /* renamed from: f, reason: collision with root package name */
    public long f381234f;

    /* renamed from: g, reason: collision with root package name */
    public int f381235g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.nb6)) {
            return false;
        }
        r45.nb6 nb6Var = (r45.nb6) fVar;
        return n51.f.a(this.BaseResponse, nb6Var.BaseResponse) && n51.f.a(this.f381232d, nb6Var.f381232d) && n51.f.a(java.lang.Long.valueOf(this.f381233e), java.lang.Long.valueOf(nb6Var.f381233e)) && n51.f.a(java.lang.Long.valueOf(this.f381234f), java.lang.Long.valueOf(nb6Var.f381234f)) && n51.f.a(java.lang.Integer.valueOf(this.f381235g), java.lang.Integer.valueOf(nb6Var.f381235g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f381232d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            fVar.h(3, this.f381233e);
            fVar.h(4, this.f381234f);
            fVar.e(5, this.f381235g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.g(2, 8, linkedList) + b36.f.h(3, this.f381233e) + b36.f.h(4, this.f381234f) + b36.f.e(5, this.f381235g);
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
        r45.nb6 nb6Var = (r45.nb6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.parseFrom(bArr2);
                }
                nb6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                nb6Var.f381233e = aVar2.i(intValue);
                return 0;
            }
            if (intValue == 4) {
                nb6Var.f381234f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            nb6Var.f381235g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            com.tencent.mm.protocal.protobuf.SnsObject snsObject = new com.tencent.mm.protocal.protobuf.SnsObject();
            if (bArr3 != null && bArr3.length > 0) {
                snsObject.parseFrom(bArr3);
            }
            nb6Var.f381232d.add(snsObject);
        }
        return 0;
    }
}
