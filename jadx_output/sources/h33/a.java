package h33;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f278450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ym3.c f278451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h33.b f278452f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f278453g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ym3.c cVar, h33.b bVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278451e = cVar;
        this.f278452f = bVar;
        this.f278453g = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h33.a(this.f278451e, this.f278452f, this.f278453g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((h33.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f278450d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ym3.c cVar = this.f278451e;
            ym3.d dVar = new ym3.d(cVar);
            int i18 = cVar.f463144b;
            int i19 = cVar.f463145c;
            h33.b bVar = this.f278452f;
            if (i18 < ((java.util.ArrayList) bVar.f278454d).size()) {
                int i27 = i19 + i18;
                if (((java.util.ArrayList) bVar.f278454d).size() > i27) {
                    dVar.f463148b = true;
                } else {
                    i27 = ((java.util.ArrayList) bVar.f278454d).size();
                }
                java.util.ArrayList<com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem> arrayList = new java.util.ArrayList();
                while (i18 < i27) {
                    arrayList.add(((java.util.ArrayList) bVar.f278454d).get(i18));
                    i18++;
                }
                for (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem : arrayList) {
                    java.lang.String str = galleryItem$MediaItem.f138430e;
                    kotlin.jvm.internal.o.f(str, "getOriginalPath(...)");
                    if (!r26.n0.N(str)) {
                        dVar.f463149c.add(new h33.c(0, galleryItem$MediaItem));
                    }
                }
            }
            this.f278450d = 1;
            if (this.f278453g.emit(dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
