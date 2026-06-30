package q45;

/* loaded from: classes11.dex */
public class a extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f360120d;

    /* renamed from: e, reason: collision with root package name */
    public int f360121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f360122f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f360123g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof q45.a)) {
            return false;
        }
        q45.a aVar = (q45.a) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f360120d), java.lang.Integer.valueOf(aVar.f360120d)) && n51.f.a(java.lang.Integer.valueOf(this.f360121e), java.lang.Integer.valueOf(aVar.f360121e)) && n51.f.a(this.f360122f, aVar.f360122f) && n51.f.a(this.f360123g, aVar.f360123g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f360120d);
            fVar.e(2, this.f360121e);
            java.lang.String str = this.f360122f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f360123g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f360120d) + 0 + b36.f.e(2, this.f360121e);
            java.lang.String str3 = this.f360122f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f360123g;
            return str4 != null ? e17 + b36.f.j(4, str4) : e17;
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
        q45.a aVar3 = (q45.a) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            aVar3.f360120d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            aVar3.f360121e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            aVar3.f360122f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        aVar3.f360123g = aVar2.k(intValue);
        return 0;
    }
}
