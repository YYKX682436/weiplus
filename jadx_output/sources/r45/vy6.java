package r45;

/* loaded from: classes4.dex */
public class vy6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f388677d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f388678e;

    /* renamed from: f, reason: collision with root package name */
    public long f388679f;

    /* renamed from: g, reason: collision with root package name */
    public long f388680g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vy6)) {
            return false;
        }
        r45.vy6 vy6Var = (r45.vy6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f388677d), java.lang.Integer.valueOf(vy6Var.f388677d)) && n51.f.a(this.f388678e, vy6Var.f388678e) && n51.f.a(java.lang.Long.valueOf(this.f388679f), java.lang.Long.valueOf(vy6Var.f388679f)) && n51.f.a(java.lang.Long.valueOf(this.f388680g), java.lang.Long.valueOf(vy6Var.f388680g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f388677d);
            java.lang.String str = this.f388678e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.h(3, this.f388679f);
            fVar.h(4, this.f388680g);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f388677d) + 0;
            java.lang.String str2 = this.f388678e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.h(3, this.f388679f) + b36.f.h(4, this.f388680g);
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
        r45.vy6 vy6Var = (r45.vy6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            vy6Var.f388677d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            vy6Var.f388678e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            vy6Var.f388679f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        vy6Var.f388680g = aVar2.i(intValue);
        return 0;
    }
}
