package db2;

/* loaded from: classes2.dex */
public final class a4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f227890t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String wxUsername, int i17, java.lang.String posterFinderusername, int i18, java.lang.String str, r45.gz0 gz0Var) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(wxUsername, "wxUsername");
        kotlin.jvm.internal.o.g(posterFinderusername, "posterFinderusername");
        this.f227890t = "Finder.CgiFinderUserPagePreview";
        r45.v13 v13Var = new r45.v13();
        v13Var.set(1, db2.t4.f228171a.b(6611, this.f16135n));
        v13Var.set(2, wxUsername);
        v13Var.set(3, java.lang.Integer.valueOf(i17));
        v13Var.set(6, posterFinderusername);
        v13Var.set(5, java.lang.Integer.valueOf(i18));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        v13Var.set(4, xy2.c.e(context));
        v13Var.set(7, str);
        v13Var.set(8, gz0Var);
        B(v13Var);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderUserPagePreview", "init wxUsername " + wxUsername + "， " + posterFinderusername + ", scene: " + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.w13 resp = (r45.w13) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f227890t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    public final void B(com.tencent.mm.protobuf.f fVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = fVar;
        r45.w13 w13Var = new r45.w13();
        w13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) w13Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = w13Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderuserpagepreview";
        lVar.f70667d = 6611;
        p(lVar.a());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f225004f;
    }

    public /* synthetic */ a4(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, r45.gz0 gz0Var, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, str2, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : str3, (i19 & 32) != 0 ? null : gz0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String username, int i17) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(username, "username");
        this.f227890t = "Finder.CgiFinderUserPagePreview";
        r45.v13 v13Var = new r45.v13();
        v13Var.set(1, db2.t4.f228171a.b(6611, this.f16135n));
        v13Var.set(5, java.lang.Integer.valueOf(i17));
        v13Var.set(4, username);
        B(v13Var);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderUserPagePreview", "scene: " + i17);
    }
}
