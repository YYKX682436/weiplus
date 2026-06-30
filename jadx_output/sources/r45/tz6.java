package r45;

/* loaded from: classes9.dex */
public class tz6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f386890d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f386891e;

    /* renamed from: f, reason: collision with root package name */
    public long f386892f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f386893g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tz6)) {
            return false;
        }
        r45.tz6 tz6Var = (r45.tz6) fVar;
        return n51.f.a(this.f386890d, tz6Var.f386890d) && n51.f.a(this.f386891e, tz6Var.f386891e) && n51.f.a(java.lang.Long.valueOf(this.f386892f), java.lang.Long.valueOf(tz6Var.f386892f)) && n51.f.a(java.lang.Boolean.valueOf(this.f386893g), java.lang.Boolean.valueOf(tz6Var.f386893g));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f386890d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f386891e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            fVar.h(3, this.f386892f);
            fVar.a(4, this.f386893g);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f386890d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f386891e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            return j17 + b36.f.h(3, this.f386892f) + b36.f.a(4, this.f386893g);
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
        r45.tz6 tz6Var = (r45.tz6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            tz6Var.f386890d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            tz6Var.f386891e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            tz6Var.f386892f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        tz6Var.f386893g = aVar2.c(intValue);
        return 0;
    }
}
