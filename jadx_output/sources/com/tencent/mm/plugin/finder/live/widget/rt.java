package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ut f119688e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.live.widget.ut utVar) {
        super(0);
        this.f119687d = bitmap;
        this.f119688e = utVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f119687d == null) {
            com.tencent.mm.plugin.finder.live.widget.ut utVar = this.f119688e;
            utVar.c(8);
            com.tencent.mars.xlog.Log.i(utVar.f120001c, "videos hidden since load image failed");
        }
        return jz5.f0.f302826a;
    }
}
