package r45;

/* loaded from: classes4.dex */
public class pi extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f383065d;

    /* renamed from: e, reason: collision with root package name */
    public int f383066e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f383067f;

    /* renamed from: g, reason: collision with root package name */
    public int f383068g;

    /* renamed from: h, reason: collision with root package name */
    public int f383069h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pi)) {
            return false;
        }
        r45.pi piVar = (r45.pi) fVar;
        return n51.f.a(this.f383065d, piVar.f383065d) && n51.f.a(java.lang.Integer.valueOf(this.f383066e), java.lang.Integer.valueOf(piVar.f383066e)) && n51.f.a(this.f383067f, piVar.f383067f) && n51.f.a(java.lang.Integer.valueOf(this.f383068g), java.lang.Integer.valueOf(piVar.f383068g)) && n51.f.a(java.lang.Integer.valueOf(this.f383069h), java.lang.Integer.valueOf(piVar.f383069h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f383065d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f383066e);
            java.lang.String str2 = this.f383067f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f383068g);
            fVar.e(5, this.f383069h);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f383065d;
            int j17 = (str3 != null ? 0 + b36.f.j(1, str3) : 0) + b36.f.e(2, this.f383066e);
            java.lang.String str4 = this.f383067f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            return j17 + b36.f.e(4, this.f383068g) + b36.f.e(5, this.f383069h);
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
        r45.pi piVar = (r45.pi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            piVar.f383065d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            piVar.f383066e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            piVar.f383067f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            piVar.f383068g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        piVar.f383069h = aVar2.g(intValue);
        return 0;
    }
}
