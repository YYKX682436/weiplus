package db2;

/* loaded from: classes.dex */
public final class a2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i17, java.lang.String finderUsername, java.util.LinkedList sensitiveWords) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(sensitiveWords, "sensitiveWords");
        r45.a92 a92Var = new r45.a92();
        a92Var.set(1, db2.t4.f228171a.a(11726));
        a92Var.set(2, java.lang.Integer.valueOf(i17));
        a92Var.set(4, finderUsername);
        a92Var.set(3, sensitiveWords);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = a92Var;
        r45.b92 b92Var = new r45.b92();
        b92Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) b92Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = b92Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivesensitivewordmanage";
        lVar.f70667d = 11726;
        p(lVar.a());
    }
}
