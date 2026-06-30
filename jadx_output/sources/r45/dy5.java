package r45;

/* loaded from: classes10.dex */
public class dy5 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f372855d;

    /* renamed from: e, reason: collision with root package name */
    public int f372856e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f372857f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f372858g;

    /* renamed from: h, reason: collision with root package name */
    public int f372859h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dy5)) {
            return false;
        }
        r45.dy5 dy5Var = (r45.dy5) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f372855d), java.lang.Integer.valueOf(dy5Var.f372855d)) && n51.f.a(java.lang.Integer.valueOf(this.f372856e), java.lang.Integer.valueOf(dy5Var.f372856e)) && n51.f.a(this.f372857f, dy5Var.f372857f) && n51.f.a(this.f372858g, dy5Var.f372858g) && n51.f.a(java.lang.Integer.valueOf(this.f372859h), java.lang.Integer.valueOf(dy5Var.f372859h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f372855d);
            fVar.e(2, this.f372856e);
            java.lang.String str = this.f372857f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f372858g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f372859h);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f372855d) + 0 + b36.f.e(2, this.f372856e);
            java.lang.String str3 = this.f372857f;
            if (str3 != null) {
                e17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f372858g;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.e(5, this.f372859h);
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
        r45.dy5 dy5Var = (r45.dy5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dy5Var.f372855d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            dy5Var.f372856e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            dy5Var.f372857f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            dy5Var.f372858g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        dy5Var.f372859h = aVar2.g(intValue);
        return 0;
    }
}
