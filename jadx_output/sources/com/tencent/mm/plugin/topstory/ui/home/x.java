package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public class x implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.j f175100d;

    public x(com.tencent.mm.plugin.topstory.ui.home.j jVar) {
        this.f175100d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryHomeUIComponentImpl", "goodLookTab2Observer invoke() called with: result = [" + aVar + "]");
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (aVar != null) {
            com.tencent.mm.plugin.topstory.ui.home.j.d(this.f175100d, aVar, "K1k.Tab2");
        }
        return f0Var;
    }
}
