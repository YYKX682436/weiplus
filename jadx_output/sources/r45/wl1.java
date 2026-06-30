package r45;

/* loaded from: classes4.dex */
public class wl1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f389253d;

    /* renamed from: e, reason: collision with root package name */
    public long f389254e;

    /* renamed from: f, reason: collision with root package name */
    public r45.z54 f389255f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wl1)) {
            return false;
        }
        r45.wl1 wl1Var = (r45.wl1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f389253d), java.lang.Long.valueOf(wl1Var.f389253d)) && n51.f.a(java.lang.Long.valueOf(this.f389254e), java.lang.Long.valueOf(wl1Var.f389254e)) && n51.f.a(this.f389255f, wl1Var.f389255f);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f389253d);
            fVar.h(2, this.f389254e);
            r45.z54 z54Var = this.f389255f;
            if (z54Var != null) {
                fVar.i(3, z54Var.computeSize());
                this.f389255f.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f389253d) + 0 + b36.f.h(2, this.f389254e);
            r45.z54 z54Var2 = this.f389255f;
            return z54Var2 != null ? h17 + b36.f.i(3, z54Var2.computeSize()) : h17;
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
        r45.wl1 wl1Var = (r45.wl1) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wl1Var.f389253d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            wl1Var.f389254e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.z54 z54Var3 = new r45.z54();
            if (bArr != null && bArr.length > 0) {
                z54Var3.parseFrom(bArr);
            }
            wl1Var.f389255f = z54Var3;
        }
        return 0;
    }
}
