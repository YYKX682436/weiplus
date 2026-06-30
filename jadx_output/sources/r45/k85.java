package r45;

/* loaded from: classes8.dex */
public class k85 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f378490d;

    /* renamed from: e, reason: collision with root package name */
    public r45.va7 f378491e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ya7 f378492f;

    /* renamed from: g, reason: collision with root package name */
    public r45.ra7 f378493g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.k85)) {
            return false;
        }
        r45.k85 k85Var = (r45.k85) fVar;
        return n51.f.a(this.f378490d, k85Var.f378490d) && n51.f.a(this.f378491e, k85Var.f378491e) && n51.f.a(this.f378492f, k85Var.f378492f) && n51.f.a(this.f378493g, k85Var.f378493g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f378490d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.va7 va7Var = this.f378491e;
            if (va7Var != null) {
                fVar.i(2, va7Var.computeSize());
                this.f378491e.writeFields(fVar);
            }
            r45.ya7 ya7Var = this.f378492f;
            if (ya7Var != null) {
                fVar.i(3, ya7Var.computeSize());
                this.f378492f.writeFields(fVar);
            }
            r45.ra7 ra7Var = this.f378493g;
            if (ra7Var != null) {
                fVar.i(4, ra7Var.computeSize());
                this.f378493g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f378490d;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            r45.va7 va7Var2 = this.f378491e;
            if (va7Var2 != null) {
                j17 += b36.f.i(2, va7Var2.computeSize());
            }
            r45.ya7 ya7Var2 = this.f378492f;
            if (ya7Var2 != null) {
                j17 += b36.f.i(3, ya7Var2.computeSize());
            }
            r45.ra7 ra7Var2 = this.f378493g;
            return ra7Var2 != null ? j17 + b36.f.i(4, ra7Var2.computeSize()) : j17;
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
        r45.k85 k85Var = (r45.k85) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            k85Var.f378490d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.va7 va7Var3 = new r45.va7();
                if (bArr != null && bArr.length > 0) {
                    va7Var3.parseFrom(bArr);
                }
                k85Var.f378491e = va7Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.ya7 ya7Var3 = new r45.ya7();
                if (bArr2 != null && bArr2.length > 0) {
                    ya7Var3.parseFrom(bArr2);
                }
                k85Var.f378492f = ya7Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.ra7 ra7Var3 = new r45.ra7();
            if (bArr3 != null && bArr3.length > 0) {
                ra7Var3.parseFrom(bArr3);
            }
            k85Var.f378493g = ra7Var3;
        }
        return 0;
    }
}
