package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class w1 extends com.tencent.mm.sdk.platformtools.y6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f201529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f201530b;

    public w1(boolean z17, com.tencent.mm.storage.f9 f9Var) {
        this.f201529a = z17;
        this.f201530b = f9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.y6
    public void b(com.tencent.mm.sdk.platformtools.a7 a7Var) {
        java.lang.String str = a7Var.f192462c;
        boolean z17 = this.f201529a;
        com.tencent.mm.storage.f9 f9Var = this.f201530b;
        if (!z17) {
            h90.w wVar = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr = h90.a.f279671d;
            ((g90.u) wVar).Ui(f9Var, 5, str, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.getMsgId(), 5);
            return;
        }
        int intValue = ((java.lang.Integer) ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Di(f9Var).f302833d).intValue();
        if (intValue != 3 && intValue != 2) {
            h90.w wVar2 = (h90.w) i95.n0.c(h90.w.class);
            h90.a[] aVarArr2 = h90.a.f279671d;
            ((g90.u) wVar2).Ui(f9Var, 5, str, null);
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.getMsgId(), 5);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageGalleryAdapter", "insert DeviceFileExtInfo, %s, %s, %s", java.lang.Long.valueOf(f9Var.getMsgId()), f9Var.Q0(), str);
        h90.w wVar3 = (h90.w) i95.n0.c(h90.w.class);
        h90.a[] aVarArr3 = h90.a.f279671d;
        ((g90.u) wVar3).Ui(f9Var, 2, str, null);
        ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).Zi(f9Var.Q0(), f9Var.getMsgId(), 2);
        android.net.Uri uri = a7Var.f192461b;
        if (uri != null) {
            ((g90.u) ((h90.w) i95.n0.c(h90.w.class))).aj(f9Var.Q0(), f9Var.getMsgId(), android.content.ContentUris.parseId(uri), 2);
        }
    }
}
