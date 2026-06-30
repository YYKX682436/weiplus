package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class d9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200870d;

    /* renamed from: e, reason: collision with root package name */
    public int f200871e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200872f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200873g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ta f200874h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.gallery.ja jaVar, com.tencent.mm.ui.chatting.gallery.ta taVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200872f = f9Var;
        this.f200873g = jaVar;
        this.f200874h = taVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.d9(this.f200872f, this.f200873g, this.f200874h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.d9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.widget.ImageView imageView;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f200871e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.ui.chatting.gallery.ta taVar = this.f200874h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.storage.f9 f9Var = this.f200872f;
            com.tencent.mm.ui.chatting.gallery.j1.t(f9Var);
            boolean Zi = ((fo.e) ((le5.e) i95.n0.c(le5.e.class))).Zi(f9Var.G, null);
            com.tencent.mm.ui.chatting.gallery.ja jaVar = this.f200873g;
            if (Zi) {
                jaVar.x(taVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mdr));
                return f0Var;
            }
            if (tg3.s1.a(f9Var)) {
                jaVar.x(taVar, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490894n85));
                return f0Var;
            }
            jaVar.u(taVar);
            if (f9Var.M2()) {
                ot0.m1 r17 = com.tencent.mm.ui.chatting.gallery.j1.r(f9Var);
                if (r17 == null) {
                    return f0Var;
                }
                java.lang.String b17 = tv.a.b(r17.f373343h);
                n11.a b18 = n11.a.b();
                java.lang.String str = r17.f373343h;
                taVar.d();
                android.widget.ImageView imageView2 = taVar.f201436n;
                o11.f fVar = new o11.f();
                fVar.f342082f = b17;
                fVar.f342078b = true;
                b18.h(str, imageView2, fVar.a());
                com.tencent.mm.ui.chatting.gallery.eb ebVar = com.tencent.mm.ui.chatting.gallery.eb.f200902a;
                java.lang.String c17 = r17.c(f9Var.z0());
                kotlin.jvm.internal.o.f(c17, "getPlayKey(...)");
                r45.kq4 b19 = ebVar.b(c17);
                if (b19.f378903e == 1) {
                    jaVar.x(taVar, b19.f378904f);
                } else {
                    jaVar.u(taVar);
                }
                return f0Var;
            }
            taVar.d();
            android.widget.ImageView imageView3 = taVar.f201436n;
            int width = imageView3.getWidth();
            int height = imageView3.getHeight();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.ui.chatting.gallery.c9 c9Var = new com.tencent.mm.ui.chatting.gallery.c9(this.f200874h, this.f200872f, width, height, null);
            this.f200870d = imageView3;
            this.f200871e = 1;
            java.lang.Object g17 = kotlinx.coroutines.l.g(p0Var, c9Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            imageView = imageView3;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageView = (android.widget.ImageView) this.f200870d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        imageView.setImageBitmap(bitmap);
        taVar.d();
        taVar.f201438p.setThumb(bitmap);
        return f0Var;
    }
}
