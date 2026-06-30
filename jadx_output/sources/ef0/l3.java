package ef0;

/* loaded from: classes11.dex */
public final class l3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ef0.m3 f252268a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qk.v8 f252269b;

    public l3(ef0.m3 m3Var, qk.v8 v8Var) {
        this.f252268a = m3Var;
        this.f252269b = v8Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TingListenSyncFeatureService", "doListenSync callback errType: " + fVar.f70615a + ", errCode: " + fVar.f70616b);
        ef0.m3 m3Var = this.f252268a;
        m3Var.f252279i = false;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protobuf.f resp = fVar.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            bw5.ac0 ac0Var = (bw5.ac0) resp;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSyncSuccess synGap: ");
            sb6.append(ac0Var.f25127e);
            sb6.append(", syncId: ");
            bw5.xb0 b17 = ac0Var.b();
            sb6.append(b17 != null ? b17.b() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TingListenSyncFeatureService", sb6.toString());
            com.tencent.mm.protobuf.g gVar = ac0Var.f25135p[4] ? ac0Var.f25128f : com.tencent.mm.protobuf.g.f192155b;
            if (gVar != null) {
                java.lang.String encodeToString = android.util.Base64.encodeToString(gVar.g(), 2);
                m3Var.f252276f = encodeToString;
                gm4.a.f273557a.j("ting_listen_sync_session_buffer", encodeToString);
                com.tencent.mars.xlog.Log.i("MicroMsg.TingListenSyncFeatureService", "onSyncSuccess sessionBuffer: " + encodeToString);
            } else {
                m3Var.f252276f = "";
                gm4.a.f273557a.j("ting_listen_sync_session_buffer", "");
            }
            bw5.xb0 b18 = ac0Var.b();
            if (b18 != null) {
                m3Var.f252275e = b18;
                gm4.a.f273557a.h("ting_listen_sync_item", b18.toByteArray());
            }
            gm4.a aVar = gm4.a.f273557a;
            bw5.xb0 b19 = ac0Var.b();
            java.lang.String b27 = b19 != null ? b19.b() : null;
            aVar.j("key_ting_listen_sync_id", b27 != null ? b27 : "");
            int i17 = ac0Var.f25127e;
            if (i17 >= 7200) {
                m3Var.f252278h = i17;
                aVar.i("key_ting_listen_sync_gap", i17);
            }
            qk.v8 v8Var = this.f252269b;
            if (v8Var != null) {
                ((kp1.j0) v8Var).a((bw5.ac0) fVar.f70618d);
            }
        } else {
            qk.v8 v8Var2 = this.f252269b;
            if (v8Var2 != null) {
                ((kp1.j0) v8Var2).a(null);
            }
        }
        ef0.m3 m3Var2 = this.f252268a;
        bw5.ac0 ac0Var2 = (bw5.ac0) fVar.f70618d;
        synchronized (m3Var2.f252274d) {
            java.util.Iterator it = m3Var2.f252274d.iterator();
            while (it.hasNext()) {
                ((kp1.j0) ((qk.v8) it.next())).a(ac0Var2);
            }
        }
        return jz5.f0.f302826a;
    }
}
