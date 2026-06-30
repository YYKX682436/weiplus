package fb3;

/* loaded from: classes.dex */
public final class h implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fb3.j f260864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260865b;

    public h(fb3.j jVar, java.lang.String str) {
        this.f260864a = jVar;
        this.f260865b = str;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        java.lang.String str2 = this.f260865b;
        fb3.j jVar = this.f260864a;
        if (!z17) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29977, 3, jVar.f260869f, str2, jVar.f260868e);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(29977, 4, jVar.f260869f, str2, jVar.f260868e);
        r45.oz5 oz5Var = new r45.oz5();
        oz5Var.f382630d = jVar.f260867d;
        oz5Var.f382631e = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6446;
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendsharecovermsg";
        lVar.f70664a = oz5Var;
        lVar.f70665b = new r45.pz5();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new fb3.g(jVar, str2));
    }
}
