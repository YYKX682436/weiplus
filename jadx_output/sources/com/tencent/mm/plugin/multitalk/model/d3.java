package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class d3 implements c01.jd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.e3 f149912a;

    public d3(com.tencent.mm.plugin.multitalk.model.e3 e3Var) {
        this.f149912a = e3Var;
    }

    @Override // c01.jd
    public boolean a() {
        com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreMultiTalk", "HERE UninitForUEH is called! multitalk");
        if (this.f149912a.f149936e != null) {
            this.f149912a.f149936e.d(true);
            if (this.f149912a.f149936e.f150177t != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMultiTalk", "dump multiTalkGroup: %s", com.tencent.mm.plugin.multitalk.model.o2.b(this.f149912a.f149936e.f150177t));
            }
        }
        return true;
    }
}
