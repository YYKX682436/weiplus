package wr;

/* loaded from: classes4.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr.j f448744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.emoji.api.a f448745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(wr.j jVar, com.tencent.mm.feature.emoji.api.a aVar) {
        super(0);
        this.f448744d = jVar;
        this.f448745e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wr.c cVar;
        wr.j jVar = this.f448744d;
        java.util.ArrayList arrayList = jVar.f448750a;
        com.tencent.mm.feature.emoji.api.a aVar = this.f448745e;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = aVar.f66043b;
        if (iEmojiInfo != null) {
            cVar = new wr.c(aVar.f66042a, iEmojiInfo);
            cVar.f448736d = aVar.f66045d;
            cVar.f448735c = aVar.f66044c;
        } else {
            com.tencent.mm.feature.emoji.api.t6 t6Var = (com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class);
            java.lang.String md52 = aVar.f66042a;
            com.tencent.mm.feature.emoji.r4 r4Var = (com.tencent.mm.feature.emoji.r4) t6Var;
            r4Var.getClass();
            kotlin.jvm.internal.o.g(md52, "md5");
            cVar = new wr.c(aVar.f66042a, r4Var.Bi(md52, null));
            cVar.f448736d = aVar.f66045d;
            cVar.f448735c = aVar.f66044c;
        }
        arrayList.add(cVar);
        wr.j.a(jVar);
        return jz5.f0.f302826a;
    }
}
