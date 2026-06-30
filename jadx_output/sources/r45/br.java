package r45;

/* loaded from: classes8.dex */
public class br extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f370998d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f370999e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f371000f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f371001g;

    /* renamed from: h, reason: collision with root package name */
    public int f371002h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.br)) {
            return false;
        }
        r45.br brVar = (r45.br) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f370998d), java.lang.Long.valueOf(brVar.f370998d)) && n51.f.a(java.lang.Boolean.valueOf(this.f370999e), java.lang.Boolean.valueOf(brVar.f370999e)) && n51.f.a(java.lang.Boolean.valueOf(this.f371000f), java.lang.Boolean.valueOf(brVar.f371000f)) && n51.f.a(this.f371001g, brVar.f371001g) && n51.f.a(java.lang.Integer.valueOf(this.f371002h), java.lang.Integer.valueOf(brVar.f371002h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f370998d);
            fVar.a(2, this.f370999e);
            fVar.a(3, this.f371000f);
            java.lang.String str = this.f371001g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f371002h);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f370998d) + 0 + b36.f.a(2, this.f370999e) + b36.f.a(3, this.f371000f);
            java.lang.String str2 = this.f371001g;
            if (str2 != null) {
                h17 += b36.f.j(4, str2);
            }
            return h17 + b36.f.e(5, this.f371002h);
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
        r45.br brVar = (r45.br) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            brVar.f370998d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            brVar.f370999e = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            brVar.f371000f = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            brVar.f371001g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        brVar.f371002h = aVar2.g(intValue);
        return 0;
    }
}
