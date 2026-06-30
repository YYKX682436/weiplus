package db2;

/* loaded from: classes2.dex */
public final class m3 extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public final org.json.JSONObject f228070t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ db2.n3 f228071u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x02c5, code lost:
    
        if (r30 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0778 A[LOOP:7: B:112:0x0772->B:114:0x0778, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0884  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0a46  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a6d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0bab  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0bb6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0bcd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0bef  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0c06  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c52  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c0a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0bbf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0a43  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x05cb A[LOOP:3: B:70:0x05c5->B:72:0x05cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x061a A[LOOP:4: B:75:0x0614->B:77:0x061a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0671  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m3(db2.n3 r38, r45.qt2 r39) {
        /*
            Method dump skipped, instructions count: 3219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m3.<init>(db2.n3, r45.qt2):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x03a6, code lost:
    
        if (r41 == 1) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03eb  */
    @Override // az2.o, az2.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(int r43, int r44, java.lang.String r45, com.tencent.mm.protobuf.f r46, com.tencent.mm.modelbase.m1 r47) {
        /*
            Method dump skipped, instructions count: 1031
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m3.A(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.mx2 resp = (r45.mx2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        r45.kv0 kv0Var = (r45.kv0) this.f228071u.B.getCustom(4);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225004f;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject w() {
        java.lang.String string;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        db2.n3 n3Var = this.f228071u;
        jSONObject.put("tabType", n3Var.f228079d);
        jSONObject.put("pullType", n3Var.f228080e);
        r45.qt2 qt2Var = this.f16135n;
        jSONObject.put("enterScene", (qt2Var == null || (string = qt2Var.getString(1)) == null) ? "" : r26.n0.q0(string, "-", string));
        return jSONObject;
    }

    @Override // az2.j
    public boolean y() {
        return true;
    }

    @Override // az2.j, cz2.j
    public org.json.JSONObject z() {
        return this.f228070t;
    }
}
