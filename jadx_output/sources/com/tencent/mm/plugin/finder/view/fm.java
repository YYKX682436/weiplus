package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class fm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f132112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.km f132113e;

    public fm(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.view.km kmVar) {
        this.f132112d = bitmap;
        this.f132113e = kmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.d dVar = new um5.d();
        android.graphics.Bitmap resource = this.f132112d;
        kotlin.jvm.internal.o.f(resource, "$resource");
        dVar.b(resource);
        com.tencent.mm.plugin.finder.view.km kmVar = this.f132113e;
        int width = kmVar.f132511s.getWidth();
        int height = kmVar.f132511s.getHeight();
        dVar.f429141b = width;
        dVar.f429142c = height;
        dVar.f429144e.f429193b.d();
        dVar.a(new com.tencent.mm.plugin.finder.view.em(kmVar));
    }
}
