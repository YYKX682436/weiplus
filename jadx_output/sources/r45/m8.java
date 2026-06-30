package r45;

/* loaded from: classes7.dex */
public class m8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f380222d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380223e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f380224f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f380225g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380226h;

    /* renamed from: i, reason: collision with root package name */
    public int f380227i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m8)) {
            return false;
        }
        r45.m8 m8Var = (r45.m8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f380222d), java.lang.Integer.valueOf(m8Var.f380222d)) && n51.f.a(this.f380223e, m8Var.f380223e) && n51.f.a(java.lang.Boolean.valueOf(this.f380224f), java.lang.Boolean.valueOf(m8Var.f380224f)) && n51.f.a(java.lang.Boolean.valueOf(this.f380225g), java.lang.Boolean.valueOf(m8Var.f380225g)) && n51.f.a(java.lang.Boolean.valueOf(this.f380226h), java.lang.Boolean.valueOf(m8Var.f380226h)) && n51.f.a(java.lang.Integer.valueOf(this.f380227i), java.lang.Integer.valueOf(m8Var.f380227i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f380222d);
            java.lang.String str = this.f380223e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.a(3, this.f380224f);
            fVar.a(4, this.f380225g);
            fVar.a(5, this.f380226h);
            fVar.e(6, this.f380227i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f380222d) + 0;
            java.lang.String str2 = this.f380223e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            return e17 + b36.f.a(3, this.f380224f) + b36.f.a(4, this.f380225g) + b36.f.a(5, this.f380226h) + b36.f.e(6, this.f380227i);
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
        r45.m8 m8Var = (r45.m8) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                m8Var.f380222d = aVar2.g(intValue);
                return 0;
            case 2:
                m8Var.f380223e = aVar2.k(intValue);
                return 0;
            case 3:
                m8Var.f380224f = aVar2.c(intValue);
                return 0;
            case 4:
                m8Var.f380225g = aVar2.c(intValue);
                return 0;
            case 5:
                m8Var.f380226h = aVar2.c(intValue);
                return 0;
            case 6:
                m8Var.f380227i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
