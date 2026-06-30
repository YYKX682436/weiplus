package u62;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.database.Cursor f424962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v25.b f424963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact f424964f;

    public m(com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact extControlProviderSearchContact, android.database.Cursor cursor, v25.b bVar) {
        this.f424964f = extControlProviderSearchContact;
        this.f424962d = cursor;
        this.f424963e = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r12v7 */
    @Override // java.lang.Runnable
    public void run() {
        ?? r122;
        android.database.Cursor cursor = this.f424962d;
        com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact extControlProviderSearchContact = this.f424964f;
        extControlProviderSearchContact.getClass();
        d95.e eVar = new d95.e(com.tencent.mm.plugin.ext.provider.ExtControlProviderSearchContact.f99915p);
        com.tencent.mm.modelavatar.e eVar2 = null;
        try {
            if (cursor.moveToFirst()) {
                int i17 = 0;
                while (true) {
                    int i18 = 1;
                    i17++;
                    com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                    z3Var.convertFrom(cursor);
                    if (!com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                        android.graphics.Bitmap f17 = com.tencent.mm.modelavatar.d1.wi().f(z3Var.d1(), true, 0, eVar2);
                        if (f17 != null) {
                            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                            f17.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            r122 = byteArrayOutputStream;
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderSearchContact", "get useravatar is null");
                            r122 = eVar2;
                        }
                        com.tencent.mm.storage.f9[] Q5 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).Q5(z3Var.d1(), 1);
                        if (Q5 == null || Q5.length != 1) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.ExtControlProviderSearchContact", "get msginfo failed");
                            java.lang.Object[] objArr = new java.lang.Object[6];
                            objArr[0] = com.tencent.mm.plugin.ext.key.AESUtil.b((int) z3Var.E2);
                            objArr[1] = z3Var.g2();
                            objArr[2] = r122 == 0 ? null : r122.toByteArray();
                            objArr[3] = "";
                            objArr[4] = "0";
                            objArr[5] = 0;
                            eVar.a(objArr);
                        } else {
                            java.lang.Object[] objArr2 = new java.lang.Object[6];
                            objArr2[0] = com.tencent.mm.plugin.ext.key.AESUtil.b((int) z3Var.E2);
                            objArr2[1] = z3Var.g2();
                            objArr2[2] = r122 == 0 ? null : r122.toByteArray();
                            objArr2[3] = Q5[0].getType() == 1 ? Q5[0].j() : "";
                            objArr2[4] = com.tencent.mm.plugin.ext.key.AESUtil.b(Q5[0].getMsgId());
                            com.tencent.mm.storage.f9 f9Var = Q5[0];
                            if (f9Var.getType() == 34) {
                                i18 = 2;
                            } else if (f9Var.getType() != 1) {
                                i18 = 3;
                            }
                            objArr2[5] = java.lang.Integer.valueOf(i18);
                            eVar.a(objArr2);
                        }
                    }
                    if (!cursor.moveToNext() || i17 >= 15) {
                        break;
                    } else {
                        eVar2 = null;
                    }
                }
            }
            cursor.close();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExtControlProviderSearchContact", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtControlProviderSearchContact", e17, "", new java.lang.Object[0]);
            if (cursor != null) {
                cursor.close();
            }
            eVar.close();
            eVar = null;
        }
        extControlProviderSearchContact.f99917o = eVar;
        this.f424963e.a();
    }
}
