package ef3;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.wallet_core.model.h1 {

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f252404q;

    public a(java.util.LinkedList linkedList, int i17, int i18) {
        r45.ze zeVar = new r45.ze();
        zeVar.f391947d = linkedList;
        zeVar.f391948e = i17;
        zeVar.f391949f = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = zeVar;
        lVar.f70665b = new r45.af();
        lVar.f70667d = 2938;
        lVar.f70666c = "/cgi-bin/micromsg-bin/batchfunctionoperate";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        p(lVar.a());
        this.f252404q = linkedList;
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiBatchFunctionOperate", "TpaCountry: %s", java.lang.Integer.valueOf(i17));
    }
}
