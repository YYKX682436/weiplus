package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f115060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fa f115061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x9(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.plugin.fa faVar) {
        super(0);
        this.f115060d = bitmap;
        this.f115061e = faVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f115060d;
        if (bitmap != null) {
            com.tencent.mm.plugin.finder.live.plugin.fa faVar = this.f115061e;
            faVar.f112526q.setImageDrawable(new android.graphics.drawable.BitmapDrawable(faVar.f365323d.getContext().getResources(), bitmap));
            ((mm2.c1) faVar.P0(mm2.c1.class)).I4 = bitmap;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "fillAudioModeView resource is null!");
        }
        return jz5.f0.f302826a;
    }
}
