package r45;

/* loaded from: classes4.dex */
public class m33 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.jj4 f380109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f380110e;

    /* renamed from: f, reason: collision with root package name */
    public int f380111f;

    /* renamed from: g, reason: collision with root package name */
    public int f380112g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f380113h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380114i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.m33)) {
            return false;
        }
        r45.m33 m33Var = (r45.m33) fVar;
        return n51.f.a(this.f380109d, m33Var.f380109d) && n51.f.a(this.f380110e, m33Var.f380110e) && n51.f.a(java.lang.Integer.valueOf(this.f380111f), java.lang.Integer.valueOf(m33Var.f380111f)) && n51.f.a(java.lang.Integer.valueOf(this.f380112g), java.lang.Integer.valueOf(m33Var.f380112g)) && n51.f.a(java.lang.Boolean.valueOf(this.f380113h), java.lang.Boolean.valueOf(m33Var.f380113h)) && n51.f.a(this.f380114i, m33Var.f380114i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.jj4 jj4Var = this.f380109d;
            if (jj4Var != null) {
                fVar.i(1, jj4Var.computeSize());
                this.f380109d.writeFields(fVar);
            }
            java.lang.String str = this.f380110e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f380111f);
            fVar.e(4, this.f380112g);
            fVar.a(5, this.f380113h);
            java.lang.String str2 = this.f380114i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.jj4 jj4Var2 = this.f380109d;
            int i18 = jj4Var2 != null ? 0 + b36.f.i(1, jj4Var2.computeSize()) : 0;
            java.lang.String str3 = this.f380110e;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f380111f) + b36.f.e(4, this.f380112g) + b36.f.a(5, this.f380113h);
            java.lang.String str4 = this.f380114i;
            return str4 != null ? e17 + b36.f.j(6, str4) : e17;
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
        r45.m33 m33Var = (r45.m33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.jj4 jj4Var3 = new r45.jj4();
                    if (bArr != null && bArr.length > 0) {
                        jj4Var3.parseFrom(bArr);
                    }
                    m33Var.f380109d = jj4Var3;
                }
                return 0;
            case 2:
                m33Var.f380110e = aVar2.k(intValue);
                return 0;
            case 3:
                m33Var.f380111f = aVar2.g(intValue);
                return 0;
            case 4:
                m33Var.f380112g = aVar2.g(intValue);
                return 0;
            case 5:
                m33Var.f380113h = aVar2.c(intValue);
                return 0;
            case 6:
                m33Var.f380114i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
