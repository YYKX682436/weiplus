package xi0;

/* loaded from: classes4.dex */
public final class f implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f454682d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f454683e;

    /* renamed from: f, reason: collision with root package name */
    public long f454684f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f454685g;

    public f(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f454682d = username;
        this.f454683e = kotlin.jvm.internal.o.b(username, c01.z1.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.flutter.plugin.proto.q0 a(com.tencent.mm.plugin.sns.storage.SnsInfo r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xi0.f.a(com.tencent.mm.plugin.sns.storage.SnsInfo):com.tencent.mm.flutter.plugin.proto.q0");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var != null && m1Var.getType() == 212) {
            gm0.j1.n().f273288b.q(212, this);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "on snsUserPage sceneEnd, errType:" + i17 + ", errCode:" + i18);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.storage.f2 Fj = com.tencent.mm.plugin.sns.model.l4.Fj();
            java.lang.String str2 = this.f454682d;
            boolean z17 = this.f454683e;
            Fj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            android.database.Cursor K1 = Fj.K1(true, str2, 0, z17, "", (int) ((currentTimeMillis - this.f454684f) / 1000.0d), (int) (currentTimeMillis / 1000));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.tencent.mm.flutter.plugin.proto.e eVar = new com.tencent.mm.flutter.plugin.proto.e();
            eVar.f67959e = new java.util.LinkedList();
            try {
                if (!K1.moveToFirst()) {
                    yz5.l lVar = this.f454685g;
                    if (lVar != null) {
                        lVar.invoke(eVar);
                    }
                    vz5.b.a(K1, null);
                }
                do {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = new com.tencent.mm.plugin.sns.storage.SnsInfo();
                    snsInfo.convertFrom(K1);
                    com.tencent.mm.flutter.plugin.proto.q0 a17 = a(snsInfo);
                    if (a17 != null) {
                        eVar.f67959e.add(a17);
                    }
                } while (K1.moveToNext());
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "final dataList size:" + eVar.f67959e.size());
                yz5.l lVar2 = this.f454685g;
                if (lVar2 != null) {
                    lVar2.invoke(eVar);
                }
                vz5.b.a(K1, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(K1, th6);
                    throw th7;
                }
            }
        }
    }
}
