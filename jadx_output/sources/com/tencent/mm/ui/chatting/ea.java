package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ea implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f200468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f200469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f200470g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x72.b f200471h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.la f200472i;

    public ea(com.tencent.mm.ui.chatting.la laVar, com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.util.HashSet hashSet, java.lang.Object obj, x72.b bVar) {
        this.f200472i = laVar;
        this.f200467d = f9Var;
        this.f200468e = str;
        this.f200469f = hashSet;
        this.f200470g = obj;
        this.f200471h = bVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        boolean z18;
        java.lang.String str2 = this.f200468e;
        com.tencent.mm.storage.f9 f9Var = this.f200467d;
        boolean z19 = true;
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadTpUrl done msgId:%d, mediaId:%s, path:%s", java.lang.Long.valueOf(f9Var.getMsgId()), str, str2);
            z18 = true;
        } else {
            z18 = false;
        }
        if (i17 == 0 && (hVar == null || hVar.field_retCode == 0)) {
            z19 = z18;
        } else {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Long.valueOf(f9Var.getMsgId());
            objArr[1] = str;
            objArr[2] = str2;
            objArr[3] = java.lang.Integer.valueOf(i17);
            objArr[4] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.field_retCode);
            com.tencent.mars.xlog.Log.e("MicroMsg.FavMsgHandle", "oreh downloadTpUrl error msgId:%d, mediaId:%s, path:%s, err:(%d,%d)", objArr);
        }
        if (!z19) {
            return 0;
        }
        java.util.HashSet hashSet = this.f200469f;
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.da(this));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
