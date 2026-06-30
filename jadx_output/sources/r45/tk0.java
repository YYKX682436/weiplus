package r45;

/* loaded from: classes2.dex */
public class tk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f386514d;

    /* renamed from: e, reason: collision with root package name */
    public int f386515e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f386516f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tk0)) {
            return false;
        }
        r45.tk0 tk0Var = (r45.tk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f386514d), java.lang.Long.valueOf(tk0Var.f386514d)) && n51.f.a(java.lang.Integer.valueOf(this.f386515e), java.lang.Integer.valueOf(tk0Var.f386515e)) && n51.f.a(this.f386516f, tk0Var.f386516f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f386514d);
            fVar.e(2, this.f386515e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f386516f;
            if (finderObject != null) {
                fVar.i(3, finderObject.computeSize());
                this.f386516f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f386514d) + 0 + b36.f.e(2, this.f386515e);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = this.f386516f;
            return finderObject2 != null ? h17 + b36.f.i(3, finderObject2.computeSize()) : h17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.tk0 tk0Var = (r45.tk0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tk0Var.f386514d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            tk0Var.f386515e = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = new com.tencent.mm.protocal.protobuf.FinderObject();
            if (bArr != null && bArr.length > 0) {
                finderObject3.parseFrom(bArr);
            }
            tk0Var.f386516f = finderObject3;
        }
        return 0;
    }
}
