package r45;

/* loaded from: classes4.dex */
public class fs4 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f374587d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f374588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f374589f;

    /* renamed from: g, reason: collision with root package name */
    public r45.hf2 f374590g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fs4)) {
            return false;
        }
        r45.fs4 fs4Var = (r45.fs4) fVar;
        return n51.f.a(this.f374587d, fs4Var.f374587d) && n51.f.a(this.f374588e, fs4Var.f374588e) && n51.f.a(this.f374589f, fs4Var.f374589f) && n51.f.a(this.f374590g, fs4Var.f374590g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f374587d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f374588e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f374589f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.hf2 hf2Var = this.f374590g;
            if (hf2Var != null) {
                fVar.i(4, hf2Var.computeSize());
                this.f374590g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f374587d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f374588e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f374589f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.hf2 hf2Var2 = this.f374590g;
            return hf2Var2 != null ? j17 + b36.f.i(4, hf2Var2.computeSize()) : j17;
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
        r45.fs4 fs4Var = (r45.fs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fs4Var.f374587d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            fs4Var.f374588e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fs4Var.f374589f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.hf2 hf2Var3 = new r45.hf2();
            if (bArr != null && bArr.length > 0) {
                hf2Var3.parseFrom(bArr);
            }
            fs4Var.f374590g = hf2Var3;
        }
        return 0;
    }
}
