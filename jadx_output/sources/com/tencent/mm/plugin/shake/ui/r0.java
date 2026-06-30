package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes11.dex */
public class r0 implements db5.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI f162329a;

    public r0(com.tencent.mm.plugin.shake.ui.ShakeSayHiListUI shakeSayHiListUI) {
        this.f162329a = shakeSayHiListUI;
    }

    @Override // db5.e6
    public void a(java.lang.Object obj) {
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SayHiListUI", "onItemDel object null");
        } else {
            r21.w.Di().y0(obj.toString());
            this.f162329a.f162213e.f();
        }
    }
}
