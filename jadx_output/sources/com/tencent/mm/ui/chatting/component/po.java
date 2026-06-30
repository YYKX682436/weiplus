package com.tencent.mm.ui.chatting.component;

/* loaded from: classes10.dex */
public class po implements t21.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.jo f199729c;

    public po(com.tencent.mm.ui.chatting.component.jo joVar, java.lang.String str, java.lang.String str2) {
        this.f199729c = joVar;
        this.f199727a = str;
        this.f199728b = str2;
    }

    @Override // t21.k0
    public void a(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        com.tencent.mm.ui.chatting.component.jo joVar = this.f199729c;
        if (i17 == -50002) {
            dp.a.makeText(joVar.f198580d.g(), joVar.f198580d.g().getString(com.tencent.mm.R.string.k76), 0).show();
        } else if (i17 < 0) {
            dp.a.makeText(joVar.f198580d.g(), joVar.f198580d.g().getString(com.tencent.mm.R.string.f493445k75), 0).show();
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                t21.d3.q(str2, null, i18, this.f199727a, str3, 0, "", 43, null, "", com.tencent.mm.plugin.msg.MsgIdTalker.f149479g, null, null, true, -1L, null, "", this.f199728b);
            }
            t21.d3.q(str, str2, i18, this.f199727a, str3, 0, "", 43, null, "", null, null, null, false, -1L, null, "", this.f199728b);
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.d3.M(str);
        }
        joVar.f198580d.b();
    }
}
