package r45;

/* loaded from: classes7.dex */
public class a57 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.w47 f369742d;

    /* renamed from: e, reason: collision with root package name */
    public r45.m47 f369743e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369744f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f369745g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f369746h;

    /* renamed from: i, reason: collision with root package name */
    public int f369747i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a57)) {
            return false;
        }
        r45.a57 a57Var = (r45.a57) fVar;
        return n51.f.a(this.f369742d, a57Var.f369742d) && n51.f.a(this.f369743e, a57Var.f369743e) && n51.f.a(this.f369744f, a57Var.f369744f) && n51.f.a(this.f369745g, a57Var.f369745g) && n51.f.a(this.f369746h, a57Var.f369746h) && n51.f.a(java.lang.Integer.valueOf(this.f369747i), java.lang.Integer.valueOf(a57Var.f369747i));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.w47 w47Var = this.f369742d;
            if (w47Var != null) {
                fVar.i(1, w47Var.computeSize());
                this.f369742d.writeFields(fVar);
            }
            r45.m47 m47Var = this.f369743e;
            if (m47Var != null) {
                fVar.i(2, m47Var.computeSize());
                this.f369743e.writeFields(fVar);
            }
            java.lang.String str = this.f369744f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f369745g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f369746h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f369747i);
            return 0;
        }
        if (i17 == 1) {
            r45.w47 w47Var2 = this.f369742d;
            int i18 = w47Var2 != null ? 0 + b36.f.i(1, w47Var2.computeSize()) : 0;
            r45.m47 m47Var2 = this.f369743e;
            if (m47Var2 != null) {
                i18 += b36.f.i(2, m47Var2.computeSize());
            }
            java.lang.String str4 = this.f369744f;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f369745g;
            if (str5 != null) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f369746h;
            if (str6 != null) {
                i18 += b36.f.j(5, str6);
            }
            return i18 + b36.f.e(6, this.f369747i);
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
        r45.a57 a57Var = (r45.a57) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.w47 w47Var3 = new r45.w47();
                    if (bArr != null && bArr.length > 0) {
                        w47Var3.parseFrom(bArr);
                    }
                    a57Var.f369742d = w47Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.m47 m47Var3 = new r45.m47();
                    if (bArr2 != null && bArr2.length > 0) {
                        m47Var3.parseFrom(bArr2);
                    }
                    a57Var.f369743e = m47Var3;
                }
                return 0;
            case 3:
                a57Var.f369744f = aVar2.k(intValue);
                return 0;
            case 4:
                a57Var.f369745g = aVar2.k(intValue);
                return 0;
            case 5:
                a57Var.f369746h = aVar2.k(intValue);
                return 0;
            case 6:
                a57Var.f369747i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
