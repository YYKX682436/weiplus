package r45;

/* loaded from: classes2.dex */
public class wp extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f389351d;

    /* renamed from: i, reason: collision with root package name */
    public r45.xp5 f389356i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f389357m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f389352e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f389353f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f389354g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f389355h = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f389358n = new java.util.LinkedList();

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wp)) {
            return false;
        }
        r45.wp wpVar = (r45.wp) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f389351d), java.lang.Integer.valueOf(wpVar.f389351d)) && n51.f.a(this.f389352e, wpVar.f389352e) && n51.f.a(this.f389353f, wpVar.f389353f) && n51.f.a(this.f389354g, wpVar.f389354g) && n51.f.a(this.f389355h, wpVar.f389355h) && n51.f.a(this.f389356i, wpVar.f389356i) && n51.f.a(this.f389357m, wpVar.f389357m) && n51.f.a(this.f389358n, wpVar.f389358n);
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f389358n;
        java.util.LinkedList linkedList2 = this.f389355h;
        java.util.LinkedList linkedList3 = this.f389354g;
        java.util.LinkedList linkedList4 = this.f389353f;
        java.util.LinkedList linkedList5 = this.f389352e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f389351d);
            fVar.g(2, 8, linkedList5);
            fVar.g(3, 8, linkedList4);
            fVar.g(4, 8, linkedList3);
            fVar.g(5, 8, linkedList2);
            r45.xp5 xp5Var = this.f389356i;
            if (xp5Var != null) {
                fVar.i(6, xp5Var.computeSize());
                this.f389356i.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f389357m;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            fVar.g(8, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f389351d) + 0 + b36.f.g(2, 8, linkedList5) + b36.f.g(3, 8, linkedList4) + b36.f.g(4, 8, linkedList3) + b36.f.g(5, 8, linkedList2);
            r45.xp5 xp5Var2 = this.f389356i;
            if (xp5Var2 != null) {
                e17 += b36.f.i(6, xp5Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f389357m;
            if (gVar2 != null) {
                e17 += b36.f.b(7, gVar2);
            }
            return e17 + b36.f.g(8, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
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
        r45.wp wpVar = (r45.wp) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                wpVar.f389351d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.dm dmVar = new r45.dm();
                    if (bArr2 != null && bArr2.length > 0) {
                        dmVar.parseFrom(bArr2);
                    }
                    wpVar.f389352e.add(dmVar);
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.a97 a97Var = new r45.a97();
                    if (bArr3 != null && bArr3.length > 0) {
                        a97Var.parseFrom(bArr3);
                    }
                    wpVar.f389353f.add(a97Var);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.hf0 hf0Var = new r45.hf0();
                    if (bArr4 != null && bArr4.length > 0) {
                        hf0Var.parseFrom(bArr4);
                    }
                    wpVar.f389354g.add(hf0Var);
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.cb7 cb7Var = new r45.cb7();
                    if (bArr5 != null && bArr5.length > 0) {
                        cb7Var.parseFrom(bArr5);
                    }
                    wpVar.f389355h.add(cb7Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.xp5 xp5Var3 = new r45.xp5();
                    if (bArr6 != null && bArr6.length > 0) {
                        xp5Var3.parseFrom(bArr6);
                    }
                    wpVar.f389356i = xp5Var3;
                }
                return 0;
            case 7:
                wpVar.f389357m = aVar2.d(intValue);
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.d55 d55Var = new r45.d55();
                    if (bArr7 != null && bArr7.length > 0) {
                        d55Var.parseFrom(bArr7);
                    }
                    wpVar.f389358n.add(d55Var);
                }
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public java.lang.Object toJSON() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f389351d);
            n51.e eVar = n51.f.f335114a;
            eVar.d(jSONObject, "Type", valueOf, false);
            eVar.d(jSONObject, "BizResults", this.f389352e, false);
            eVar.d(jSONObject, "WeappResults", this.f389353f, false);
            eVar.d(jSONObject, "DocResults", this.f389354g, false);
            eVar.d(jSONObject, "WidgetResults", this.f389355h, false);
            eVar.d(jSONObject, "ReportInfo", this.f389356i, false);
            eVar.d(jSONObject, "DebugInfo", this.f389357m, false);
            eVar.d(jSONObject, "PardusResults", this.f389358n, false);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }
}
