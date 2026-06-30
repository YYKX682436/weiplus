package t45;

/* loaded from: classes2.dex */
public class p0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f415628d;

    /* renamed from: e, reason: collision with root package name */
    public t45.q0 f415629e;

    /* renamed from: f, reason: collision with root package name */
    public long f415630f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f415631g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof t45.p0)) {
            return false;
        }
        t45.p0 p0Var = (t45.p0) fVar;
        return n51.f.a(this.f415628d, p0Var.f415628d) && n51.f.a(this.f415629e, p0Var.f415629e) && n51.f.a(java.lang.Long.valueOf(this.f415630f), java.lang.Long.valueOf(p0Var.f415630f)) && n51.f.a(this.f415631g, p0Var.f415631g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f415628d;
            if (str != null) {
                fVar.j(1, str);
            }
            t45.q0 q0Var = this.f415629e;
            if (q0Var != null) {
                fVar.i(2, q0Var.computeSize());
                this.f415629e.writeFields(fVar);
            }
            fVar.h(3, this.f415630f);
            java.lang.String str2 = this.f415631g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f415628d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            t45.q0 q0Var2 = this.f415629e;
            if (q0Var2 != null) {
                j17 += b36.f.i(2, q0Var2.computeSize());
            }
            int h17 = j17 + b36.f.h(3, this.f415630f);
            java.lang.String str4 = this.f415631g;
            return str4 != null ? h17 + b36.f.j(4, str4) : h17;
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
        t45.p0 p0Var = (t45.p0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            p0Var.f415628d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                p0Var.f415630f = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            p0Var.f415631g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            t45.q0 q0Var3 = new t45.q0();
            if (bArr != null && bArr.length > 0) {
                q0Var3.parseFrom(bArr);
            }
            p0Var.f415629e = q0Var3;
        }
        return 0;
    }
}
