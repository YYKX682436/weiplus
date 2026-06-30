package r45;

/* loaded from: classes4.dex */
public class me6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f380426d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ke6 f380427e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ke6 f380428f;

    /* renamed from: g, reason: collision with root package name */
    public int f380429g;

    /* renamed from: h, reason: collision with root package name */
    public int f380430h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f380431i;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me6)) {
            return false;
        }
        r45.me6 me6Var = (r45.me6) fVar;
        return n51.f.a(this.BaseRequest, me6Var.BaseRequest) && n51.f.a(this.f380426d, me6Var.f380426d) && n51.f.a(this.f380427e, me6Var.f380427e) && n51.f.a(this.f380428f, me6Var.f380428f) && n51.f.a(java.lang.Integer.valueOf(this.f380429g), java.lang.Integer.valueOf(me6Var.f380429g)) && n51.f.a(java.lang.Integer.valueOf(this.f380430h), java.lang.Integer.valueOf(me6Var.f380430h)) && n51.f.a(this.f380431i, me6Var.f380431i);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.BaseRequest;
            if (heVar != null) {
                fVar.i(1, heVar.computeSize());
                this.BaseRequest.writeFields(fVar);
            }
            java.lang.String str = this.f380426d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.ke6 ke6Var = this.f380427e;
            if (ke6Var != null) {
                fVar.i(3, ke6Var.computeSize());
                this.f380427e.writeFields(fVar);
            }
            r45.ke6 ke6Var2 = this.f380428f;
            if (ke6Var2 != null) {
                fVar.i(6, ke6Var2.computeSize());
                this.f380428f.writeFields(fVar);
            }
            fVar.e(4, this.f380429g);
            fVar.e(5, this.f380430h);
            java.lang.String str2 = this.f380431i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.BaseRequest;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.computeSize()) : 0;
            java.lang.String str3 = this.f380426d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            r45.ke6 ke6Var3 = this.f380427e;
            if (ke6Var3 != null) {
                i18 += b36.f.i(3, ke6Var3.computeSize());
            }
            r45.ke6 ke6Var4 = this.f380428f;
            if (ke6Var4 != null) {
                i18 += b36.f.i(6, ke6Var4.computeSize());
            }
            int e17 = i18 + b36.f.e(4, this.f380429g) + b36.f.e(5, this.f380430h);
            java.lang.String str4 = this.f380431i;
            return str4 != null ? e17 + b36.f.j(7, str4) : e17;
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
        r45.me6 me6Var = (r45.me6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.parseFrom(bArr);
                    }
                    me6Var.BaseRequest = heVar3;
                }
                return 0;
            case 2:
                me6Var.f380426d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ke6 ke6Var5 = new r45.ke6();
                    if (bArr2 != null && bArr2.length > 0) {
                        ke6Var5.parseFrom(bArr2);
                    }
                    me6Var.f380427e = ke6Var5;
                }
                return 0;
            case 4:
                me6Var.f380429g = aVar2.g(intValue);
                return 0;
            case 5:
                me6Var.f380430h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.ke6 ke6Var6 = new r45.ke6();
                    if (bArr3 != null && bArr3.length > 0) {
                        ke6Var6.parseFrom(bArr3);
                    }
                    me6Var.f380428f = ke6Var6;
                }
                return 0;
            case 7:
                me6Var.f380431i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
