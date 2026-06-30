package r45;

/* loaded from: classes4.dex */
public class wr extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f389394d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public r45.ur f389395e;

    /* renamed from: f, reason: collision with root package name */
    public int f389396f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wr)) {
            return false;
        }
        r45.wr wrVar = (r45.wr) fVar;
        return n51.f.a(this.BaseRequest, wrVar.BaseRequest) && n51.f.a(this.f389394d, wrVar.f389394d) && n51.f.a(this.f389395e, wrVar.f389395e) && n51.f.a(java.lang.Integer.valueOf(this.f389396f), java.lang.Integer.valueOf(wrVar.f389396f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            fVar.g(2, 2, this.f389394d);
            r45.ur urVar = this.f389395e;
            if (urVar != null) {
                fVar.i(3, urVar.computeSize());
                this.f389395e.writeFields(fVar);
            }
            fVar.e(4, this.f389396f);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0) + b36.f.g(2, 2, this.f389394d);
            r45.ur urVar2 = this.f389395e;
            if (urVar2 != null) {
                i18 += b36.f.i(3, urVar2.computeSize());
            }
            return i18 + b36.f.e(4, this.f389396f);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f389394d.clear();
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
        r45.wr wrVar = (r45.wr) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.parseFrom(bArr2);
                }
                wrVar.BaseRequest = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            wrVar.f389394d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            wrVar.f389396f = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.ur urVar3 = new r45.ur();
            if (bArr3 != null && bArr3.length > 0) {
                urVar3.parseFrom(bArr3);
            }
            wrVar.f389395e = urVar3;
        }
        return 0;
    }
}
