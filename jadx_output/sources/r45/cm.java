package r45;

/* loaded from: classes4.dex */
public class cm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f371660d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f371661e;

    /* renamed from: f, reason: collision with root package name */
    public long f371662f;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.cm)) {
            return false;
        }
        r45.cm cmVar = (r45.cm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f371660d), java.lang.Integer.valueOf(cmVar.f371660d)) && n51.f.a(this.f371661e, cmVar.f371661e) && n51.f.a(java.lang.Long.valueOf(this.f371662f), java.lang.Long.valueOf(cmVar.f371662f));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f371660d);
            com.tencent.mm.protobuf.g gVar = this.f371661e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f371662f);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f371660d) + 0;
            com.tencent.mm.protobuf.g gVar2 = this.f371661e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            return e17 + b36.f.h(3, this.f371662f);
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
        r45.cm cmVar = (r45.cm) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cmVar.f371660d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            cmVar.f371661e = aVar2.d(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        cmVar.f371662f = aVar2.i(intValue);
        return 0;
    }
}
