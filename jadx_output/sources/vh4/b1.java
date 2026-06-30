package vh4;

/* loaded from: classes.dex */
public final class b1 extends com.tencent.mm.modelbase.i {
    public b1(java.lang.String wardUserName, java.lang.String ticket, int i17) {
        kotlin.jvm.internal.o.g(wardUserName, "wardUserName");
        kotlin.jvm.internal.o.g(ticket, "ticket");
        jz5.g b17 = jz5.h.b(new vh4.a1(wardUserName, ticket, i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = (r45.ii) ((jz5.n) b17).getValue();
        lVar.f70665b = new r45.ji();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindteenagermodeguardian";
        lVar.f70667d = 4225;
        p(lVar.a());
    }
}
