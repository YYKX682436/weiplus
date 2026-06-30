package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class aa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f111839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fa f111840e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.plugin.fa faVar) {
        super(0);
        this.f111839d = bitmap;
        this.f111840e = faVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.fa faVar = this.f111840e;
        android.graphics.Bitmap bitmap = this.f111839d;
        if (bitmap != null) {
            faVar.f112526q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(faVar.f365323d.getContext().getResources(), bitmap));
            ((mm2.c1) faVar.P0(mm2.c1.class)).I4 = bitmap;
        } else {
            com.tencent.mars.xlog.Log.i(faVar.f112525p, "showLiveRoomImg resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
