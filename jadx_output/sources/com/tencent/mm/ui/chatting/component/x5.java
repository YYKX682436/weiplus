package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class x5 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.d f200216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f200218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c6 f200219g;

    public x5(com.tencent.mm.ui.chatting.component.c6 c6Var, com.tencent.mm.pluginsdk.model.app.d dVar, com.tencent.mm.storage.f9 f9Var, java.util.HashSet hashSet) {
        this.f200219g = c6Var;
        this.f200216d = dVar;
        this.f200217e = f9Var;
        this.f200218f = hashSet;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        com.tencent.mm.pluginsdk.model.app.d dVar = this.f200216d;
        if (i17 == 0 && gVar != null) {
            dVar.field_offset = gVar.field_finishedLength;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
        }
        com.tencent.mm.ui.chatting.component.c6 c6Var = this.f200219g;
        java.util.HashSet hashSet = this.f200218f;
        com.tencent.mm.storage.f9 f9Var = this.f200217e;
        if (i17 == 0 && hVar != null && hVar.field_retCode == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d", java.lang.Long.valueOf(f9Var.getMsgId()));
            dVar.field_status = 199L;
            dVar.field_offset = dVar.field_totalLen;
            com.tencent.mm.pluginsdk.model.app.u5.wi().update(dVar, new java.lang.String[0]);
            f9Var.r1(3);
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
            hashSet.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
            c6Var.a(hashSet);
        }
        if (i17 != 0 || (hVar != null && hVar.field_retCode != 0)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(f9Var.getMsgId());
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Integer.valueOf(hVar == null ? 0 : hVar.field_retCode);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingMoreBtnBarHelper", "oreh downloadTpFileAndFav success msgID:%d, error(%d,%d)", objArr);
            hashSet.remove(java.lang.Long.valueOf(f9Var.getMsgId()));
            c6Var.a(hashSet);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
