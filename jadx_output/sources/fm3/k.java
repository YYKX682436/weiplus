package fm3;

/* loaded from: classes10.dex */
public final class k implements fm3.n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f264081a;

    public k(com.tencent.mm.protocal.protobuf.FinderObject finderObj) {
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        this.f264081a = finderObj;
    }

    @Override // fm3.n
    public void a(android.widget.ImageView thumbView, f60.a aVar) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia;
        kotlin.jvm.internal.o.g(thumbView, "thumbView");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f264081a;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc == null || (media = objectDesc.getMedia()) == null || (finderMedia = (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media)) == null) {
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f342082f = ll3.i1.f319182a.b("thumb_" + finderObject.getId());
        fVar.f342078b = true;
        fVar.f342077a = true;
        n11.a.b().i(finderMedia.getThumbUrl() + finderMedia.getThumb_url_token(), thumbView, fVar.a(), new fm3.j(aVar));
    }
}
