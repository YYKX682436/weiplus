package r45;

/* loaded from: classes4.dex */
public class qn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qm1 f384101d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f384102e;

    /* renamed from: f, reason: collision with root package name */
    public long f384103f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f384104g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public long f384105h;

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.qn)) {
            return false;
        }
        r45.qn qnVar = (r45.qn) fVar;
        return n51.f.a(this.f384101d, qnVar.f384101d) && n51.f.a(this.f384102e, qnVar.f384102e) && n51.f.a(java.lang.Long.valueOf(this.f384103f), java.lang.Long.valueOf(qnVar.f384103f)) && n51.f.a(this.f384104g, qnVar.f384104g) && n51.f.a(java.lang.Long.valueOf(this.f384105h), java.lang.Long.valueOf(qnVar.f384105h));
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f384104g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qm1 qm1Var = this.f384101d;
            if (qm1Var != null) {
                fVar.i(1, qm1Var.computeSize());
                this.f384101d.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f384102e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            fVar.h(3, this.f384103f);
            fVar.g(4, 8, linkedList);
            fVar.h(5, this.f384105h);
            return 0;
        }
        if (i17 == 1) {
            r45.qm1 qm1Var2 = this.f384101d;
            int i18 = qm1Var2 != null ? 0 + b36.f.i(1, qm1Var2.computeSize()) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f384102e;
            if (gVar2 != null) {
                i18 += b36.f.b(2, gVar2);
            }
            return i18 + b36.f.h(3, this.f384103f) + b36.f.g(4, 8, linkedList) + b36.f.h(5, this.f384105h);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.tencent.mm.protobuf.f.unknownTagHandler);
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
        r45.qn qnVar = (r45.qn) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.qm1 qm1Var3 = new r45.qm1();
                if (bArr2 != null && bArr2.length > 0) {
                    qm1Var3.parseFrom(bArr2);
                }
                qnVar.f384101d = qm1Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            qnVar.f384102e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 3) {
            qnVar.f384103f = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            qnVar.f384105h = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.wn wnVar = new r45.wn();
            if (bArr3 != null && bArr3.length > 0) {
                wnVar.parseFrom(bArr3);
            }
            qnVar.f384104g.add(wnVar);
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            r45.qm1 qm1Var = this.f384101d;
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "boxId", qm1Var, false);
            eVar.d(jSONObject, "last_buffer", this.f384102e, false);
            eVar.d(jSONObject, "live_id", java.lang.Long.valueOf(this.f384103f), false);
            eVar.d(jSONObject, "boxMsgs", this.f384104g, false);
            eVar.d(jSONObject, "lastEnterTimeStamp", java.lang.Long.valueOf(this.f384105h), false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
