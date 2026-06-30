package r45;

/* loaded from: classes9.dex */
public class wl6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389261d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f389262e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm6 f389263f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q74 f389264g;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wl6)) {
            return false;
        }
        r45.wl6 wl6Var = (r45.wl6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389261d), java.lang.Integer.valueOf(wl6Var.f389261d)) && n51.f.a(this.f389262e, wl6Var.f389262e) && n51.f.a(this.f389263f, wl6Var.f389263f) && n51.f.a(this.f389264g, wl6Var.f389264g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389261d);
            java.lang.String str = this.f389262e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.nm6 nm6Var = this.f389263f;
            if (nm6Var != null) {
                fVar.i(3, nm6Var.computeSize());
                this.f389263f.writeFields(fVar);
            }
            r45.q74 q74Var = this.f389264g;
            if (q74Var != null) {
                fVar.i(4, q74Var.computeSize());
                this.f389264g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389261d) + 0;
            java.lang.String str2 = this.f389262e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.nm6 nm6Var2 = this.f389263f;
            if (nm6Var2 != null) {
                e17 += b36.f.i(3, nm6Var2.computeSize());
            }
            r45.q74 q74Var2 = this.f389264g;
            return q74Var2 != null ? e17 + b36.f.i(4, q74Var2.computeSize()) : e17;
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
        r45.wl6 wl6Var = (r45.wl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wl6Var.f389261d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wl6Var.f389262e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.nm6 nm6Var3 = new r45.nm6();
                if (bArr != null && bArr.length > 0) {
                    nm6Var3.parseFrom(bArr);
                }
                wl6Var.f389263f = nm6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.q74 q74Var3 = new r45.q74();
            if (bArr2 != null && bArr2.length > 0) {
                q74Var3.parseFrom(bArr2);
            }
            wl6Var.f389264g = q74Var3;
        }
        return 0;
    }
}
