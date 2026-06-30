package pj4;

/* loaded from: classes2.dex */
public class r extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f355268d;

    /* renamed from: e, reason: collision with root package name */
    public pj4.l f355269e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f355270f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f355271g = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof pj4.r)) {
            return false;
        }
        pj4.r rVar = (pj4.r) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f355268d), java.lang.Long.valueOf(rVar.f355268d)) && n51.f.a(this.f355269e, rVar.f355269e) && n51.f.a(this.f355270f, rVar.f355270f) && n51.f.a(this.f355271g, rVar.f355271g);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f355271g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f355268d);
            pj4.l lVar = this.f355269e;
            if (lVar != null) {
                fVar.i(2, lVar.computeSize());
                this.f355269e.writeFields(fVar);
            }
            fVar.g(3, 1, this.f355270f);
            fVar.g(4, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f355268d) + 0;
            pj4.l lVar2 = this.f355269e;
            if (lVar2 != null) {
                h17 += b36.f.i(2, lVar2.computeSize());
            }
            return h17 + b36.f.g(3, 1, this.f355270f) + b36.f.g(4, 2, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f355270f.clear();
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
        pj4.r rVar = (pj4.r) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            rVar.f355268d = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                rVar.f355270f.add(aVar2.k(intValue));
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            rVar.f355271g.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            pj4.l lVar3 = new pj4.l();
            if (bArr2 != null && bArr2.length > 0) {
                lVar3.parseFrom(bArr2);
            }
            rVar.f355269e = lVar3;
        }
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Long valueOf = java.lang.Long.valueOf(this.f355268d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "version", valueOf, false);
            eVar.d(jSONObject, "hb_status", this.f355269e, false);
            eVar.d(jSONObject, "whitelist_usernames", this.f355270f, false);
            eVar.d(jSONObject, "whitelist_labels", this.f355271g, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
