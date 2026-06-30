package com.tencent.mm.ui.chatting.component;

/* loaded from: classes2.dex */
public final class ci extends com.tencent.mm.modelbase.i {
    public ci(java.lang.String userName, java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(url, "url");
        jz5.g b17 = jz5.h.b(new com.tencent.mm.ui.chatting.component.bi(i17, userName, url));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (r45.ls6) ((jz5.n) b17).getValue();
        lVar.f70665b = new r45.ms6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/updateopenimarchivestatus";
        lVar.f70667d = 6924;
        p(lVar.a());
    }
}
