package r45;

/* loaded from: classes8.dex */
public class is extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f377297d;

    /* renamed from: e, reason: collision with root package name */
    public long f377298e;

    /* renamed from: f, reason: collision with root package name */
    public long f377299f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f377300g;

    /* renamed from: h, reason: collision with root package name */
    public long f377301h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.is)) {
            return false;
        }
        r45.is isVar = (r45.is) fVar;
        return n51.f.a(this.f377297d, isVar.f377297d) && n51.f.a(java.lang.Long.valueOf(this.f377298e), java.lang.Long.valueOf(isVar.f377298e)) && n51.f.a(java.lang.Long.valueOf(this.f377299f), java.lang.Long.valueOf(isVar.f377299f)) && n51.f.a(java.lang.Boolean.valueOf(this.f377300g), java.lang.Boolean.valueOf(isVar.f377300g)) && n51.f.a(java.lang.Long.valueOf(this.f377301h), java.lang.Long.valueOf(isVar.f377301h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mm.protobuf.g gVar = this.f377297d;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.h(2, this.f377298e);
            fVar.h(3, this.f377299f);
            fVar.a(4, this.f377300g);
            fVar.h(5, this.f377301h);
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mm.protobuf.g gVar2 = this.f377297d;
            return (gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0) + b36.f.h(2, this.f377298e) + b36.f.h(3, this.f377299f) + b36.f.a(4, this.f377300g) + b36.f.h(5, this.f377301h);
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
        r45.is isVar = (r45.is) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            isVar.f377297d = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 2) {
            isVar.f377298e = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            isVar.f377299f = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            isVar.f377300g = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        isVar.f377301h = aVar2.i(intValue);
        return 0;
    }
}
