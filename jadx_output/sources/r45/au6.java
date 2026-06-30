package r45;

/* loaded from: classes4.dex */
public class au6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f370268d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f370269e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f370270f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.au6)) {
            return false;
        }
        r45.au6 au6Var = (r45.au6) fVar;
        return n51.f.a(this.BaseResponse, au6Var.BaseResponse) && n51.f.a(java.lang.Integer.valueOf(this.f370268d), java.lang.Integer.valueOf(au6Var.f370268d)) && n51.f.a(this.f370269e, au6Var.f370269e) && n51.f.a(java.lang.Integer.valueOf(this.f370270f), java.lang.Integer.valueOf(au6Var.f370270f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f370269e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.BaseResponse;
            if (ieVar != null) {
                fVar.i(1, ieVar.computeSize());
                this.BaseResponse.writeFields(fVar);
            }
            fVar.e(2, this.f370268d);
            fVar.g(3, 8, linkedList);
            fVar.e(4, this.f370270f);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.BaseResponse;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.computeSize()) : 0) + b36.f.e(2, this.f370268d) + b36.f.g(3, 8, linkedList) + b36.f.e(4, this.f370270f);
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
        r45.au6 au6Var = (r45.au6) objArr[1];
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
                au6Var.BaseResponse = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            au6Var.f370268d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            au6Var.f370270f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr3 = (byte[]) j18.get(i19);
            r45.dj0 dj0Var = new r45.dj0();
            if (bArr3 != null && bArr3.length > 0) {
                dj0Var.parseFrom(bArr3);
            }
            au6Var.f370269e.add(dj0Var);
        }
        return 0;
    }
}
