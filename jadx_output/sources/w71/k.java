package w71;

/* loaded from: classes11.dex */
public final class k extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final long f443413m;

    public k(bw5.z request) {
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        if (request.f35751o > 0) {
            lVar.f70664a = new w71.o1(request.getData_().g(), request.b().f34882d, request.f35751o);
        } else {
            lVar.f70664a = new w71.c1(request.getData_().g(), request.b().f34882d);
        }
        lVar.f70665b = new w71.p1();
        lVar.f70667d = request.b().f34882d;
        bw5.x b17 = request.b();
        lVar.f70666c = b17.f34884f[2] ? b17.f34883e : "";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70673j = request.f35744e;
        lVar.f70674k = request.f35745f;
        int i17 = request.f35749m;
        if (i17 > 0) {
            lVar.f70672i = i17;
        }
        p(lVar.a());
        this.f443413m = request.f35750n;
    }
}
