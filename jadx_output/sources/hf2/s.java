package hf2;

/* loaded from: classes3.dex */
public final class s extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281162b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hf2.x xVar, java.lang.Class cls) {
        super(cls);
        this.f281162b = xVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.yc2 result = (r45.yc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        if ((result.getInteger(0) & 2) > 0) {
            hf2.x xVar = this.f281162b;
            com.tencent.mars.xlog.Log.i(xVar.f281181m, "#polling success MMFinderLiveesourceLoadFlag_Sticker,resource_load_flag:" + result.getInteger(0));
            je2.g gVar = (je2.g) xVar.business(je2.g.class);
            r45.ca2 ca2Var = (r45.ca2) result.getCustom(2);
            synchronized (gVar) {
                if (ca2Var != null) {
                    gVar.U6();
                }
                gVar.W6(ca2Var);
            }
            je2.g gVar2 = (je2.g) xVar.business(je2.g.class);
            r45.da2 da2Var = (r45.da2) result.getCustom(3);
            synchronized (gVar2) {
                if (da2Var != null) {
                    gVar2.U6();
                }
                gVar2.X6(da2Var);
            }
        }
    }
}
