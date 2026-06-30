package r45;

/* loaded from: classes9.dex */
public class ij0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f377091d;

    /* renamed from: e, reason: collision with root package name */
    public int f377092e;

    /* renamed from: f, reason: collision with root package name */
    public int f377093f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f377094g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f377095h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jj0 f377096i;

    static {
        new r45.ij0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.ij0 parseFrom(byte[] bArr) {
        return (r45.ij0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ij0)) {
            return false;
        }
        r45.ij0 ij0Var = (r45.ij0) fVar;
        return n51.f.a(this.f377091d, ij0Var.f377091d) && n51.f.a(java.lang.Integer.valueOf(this.f377092e), java.lang.Integer.valueOf(ij0Var.f377092e)) && n51.f.a(java.lang.Integer.valueOf(this.f377093f), java.lang.Integer.valueOf(ij0Var.f377093f)) && n51.f.a(this.f377094g, ij0Var.f377094g) && n51.f.a(this.f377095h, ij0Var.f377095h) && n51.f.a(this.f377096i, ij0Var.f377096i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new r45.ij0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f377091d;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.e(2, this.f377092e);
            fVar.e(3, this.f377093f);
            java.lang.String str2 = this.f377094g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f377095h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            r45.jj0 jj0Var = this.f377096i;
            if (jj0Var != null) {
                fVar.i(6, jj0Var.computeSize());
                this.f377096i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f377091d;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.e(2, this.f377092e) + b36.f.e(3, this.f377093f);
            java.lang.String str5 = this.f377094g;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f377095h;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            r45.jj0 jj0Var2 = this.f377096i;
            return jj0Var2 != null ? j17 + b36.f.i(6, jj0Var2.computeSize()) : j17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                this.f377091d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f377092e = aVar2.g(intValue);
                return 0;
            case 3:
                this.f377093f = aVar2.g(intValue);
                return 0;
            case 4:
                this.f377094g = aVar2.k(intValue);
                return 0;
            case 5:
                this.f377095h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    r45.jj0 jj0Var3 = new r45.jj0();
                    if (bArr != null && bArr.length > 0) {
                        jj0Var3.parseFrom(bArr);
                    }
                    this.f377096i = jj0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
